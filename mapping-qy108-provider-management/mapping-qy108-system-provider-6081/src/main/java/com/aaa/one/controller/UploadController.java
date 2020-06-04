package com.aaa.one.controller;

import com.aaa.one.service.UploadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Company AAA软件教育
 * @Author Seven Lee
 * @Date Create in 2020/5/29 14:52
 * @Description
 **/
@RestController
public class UploadController {

    @Autowired
    private UploadService uploadService;

    /**
     * @author Seven Lee
     * @description
     *      ftp文件上传
     * @param [file]
     * @date 2020/5/29
     * @return java.lang.Boolean
     * @throws
    **/
    @PostMapping(value = "/upload",
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Boolean uploadFile(@RequestBody MultipartFile file) {
        return uploadService.upload(file);
    }

}
