package com.example.HosuingAppBackend.Repository;

import com.example.HosuingAppBackend.Models.Image;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileUploadRepo extends MongoRepository<Image,String> {
}
