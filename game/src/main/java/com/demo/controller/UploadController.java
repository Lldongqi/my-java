package com.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
@RequestMapping("/upload")
public class UploadController {

    @PostMapping
    public String uploadFile(@RequestParam("files") MultipartFile[] multiparts){
        System.out.println(multiparts);
        return "上传成功";
    }
}
