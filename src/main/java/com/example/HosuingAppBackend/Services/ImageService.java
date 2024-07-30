package com.example.HosuingAppBackend.Services;

import com.example.HosuingAppBackend.Models.Image;
import com.example.HosuingAppBackend.Repository.FileUploadRepo;
import org.apache.tomcat.util.http.fileupload.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService {

    @Autowired
    private FileUploadRepo fileUploadRepo;

    public void saveImage(Image image){
         fileUploadRepo.save(image);
    }
}
