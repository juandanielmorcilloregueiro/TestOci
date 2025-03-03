package com.simfonics.bss.wiremock.transformations;

import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.common.FileSource;
import com.github.tomakehurst.wiremock.extension.Parameters;
import com.github.tomakehurst.wiremock.extension.ResponseDefinitionTransformer;
import com.github.tomakehurst.wiremock.http.Request;
import com.github.tomakehurst.wiremock.http.ResponseDefinition;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetUserTransformation extends ResponseDefinitionTransformer {
    @Override
    public ResponseDefinition transform(Request request, ResponseDefinition responseDefinition, FileSource files,
                                        Parameters parameters) {

        Path resourceDirectory = Paths.get("src","test","resources","__files", "UserManagement");
        String absolutePath = resourceDirectory.toFile().getAbsolutePath();
        File file = new File(absolutePath+"/getUserList.json");
        FileInputStream inputStream;
        try {
            inputStream = new FileInputStream(file);
            String template = IOUtils.toString(inputStream, StandardCharsets.UTF_8.name());
            if(request.queryParameter("brand").isPresent()) {
                template = template.replaceAll("\\{\\{BRAND}}", request.queryParameter("brand").firstValue());
            }

            return new ResponseDefinitionBuilder()
                    .withStatus(200)
                    .withHeader("Access-Control-Allow-Origin", "*")
                    .withBody(template)
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseDefinitionBuilder()
                    .withStatus(500).build();
        }

    }

    @Override
    public String getName() {
        return "getUserList";
    }

    @Override
    public boolean applyGlobally() {
        return false;
    }
}
