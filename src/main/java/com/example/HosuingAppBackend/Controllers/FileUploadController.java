package com.example.HosuingAppBackend.Controllers;

import com.example.HosuingAppBackend.Models.Image;
import com.example.HosuingAppBackend.Services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/upload")
public class FileUploadController {

    @Autowired
    private ImageService imageService;

    @PostMapping
    public ResponseEntity<String> uploadImage(@RequestBody Image image)
    {
        try
        {
            imageService.saveImage(image);
            return ResponseEntity.status(HttpStatus.CREATED).body("Image Uploaded Succesfully");
        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Upload Failed");
        }
    }


}
