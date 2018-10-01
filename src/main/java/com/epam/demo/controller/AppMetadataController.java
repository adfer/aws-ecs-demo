package com.epam.demo.controller;

import com.epam.demo.model.AppMetadata;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppMetadataController {

    private final AppMetadata metadata;

    public AppMetadataController() {
        String applicationId = RandomStringUtils.randomAlphabetic(10);
        metadata = new AppMetadata(applicationId);

    }

    @GetMapping("/metadata")
    public ResponseEntity<AppMetadata> getAppMetadata() {
        return ResponseEntity.ok(metadata);
    }
}
