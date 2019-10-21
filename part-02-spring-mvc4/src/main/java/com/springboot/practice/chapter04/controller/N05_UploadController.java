package com.springboot.practice.chapter04.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * 请填写类的描述
 *
 * @author GuofanLee
 * @date 2019-10-18 11:25
 */
@Controller
public class N05_UploadController {

    @ResponseBody
    @RequestMapping(value = "upload", method = RequestMethod.POST)
    public String upload(MultipartFile file) {
        try {
            FileUtils.writeByteArrayToFile(new File("D:/upload-file/" + file.getOriginalFilename()), file.getBytes());
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }
    }

}
