package com.mehmetberkan.SpringMongoDBGridFSExample.service;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class FileUploadService {

    @Autowired
    GridFsTemplate gridFsTemplate;

    public void fileUpload(MultipartFile file) throws IOException {
        DBObject dbObject = new BasicDBObject();
        dbObject.put("fileName", file.getOriginalFilename());
        dbObject.put("contentType", file.getContentType());
        dbObject.put("size", file.getSize());
        dbObject.put("userId", "123");

        ObjectId objectId = gridFsTemplate
                .store(file.getInputStream(), file.getOriginalFilename(), dbObject);

        System.out.println("ObjectId : " + objectId);
    }

}
