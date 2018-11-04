package com.springboot.uploadfile.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.URL;

/**
 * @Description:
 * @Author: zrblog
 * @CreateTime: 2018-10-20 20:49
 * @Version:v1.0
 */
@Controller
public class FileUploadController {

    private final static Logger logger = LoggerFactory.getLogger(FileUploadController.class);


    /**
     * @param
     * @Description: 跳转到上传文件页面
     * @Return
     * @Author: zrblog
     * @Date: 2018/10/20 21:59
     */
    @RequestMapping("/")
    public String toUploadFile() {
        return "demo";
    }


    /**
     * @Description: 上传文件
     * @Param [file, request]
     * @Return java.lang.String
     * @Author: zrblog
     * @Date: 2018/10/20 22:02
     */
    @RequestMapping("fileUpload")
    @ResponseBody
    public String uploadFile(@RequestParam("file") MultipartFile file, HttpServletRequest request) {

        String contentType = file.getContentType();
        logger.info("ContentType:" + contentType);

        String originalFilename = file.getOriginalFilename();
        logger.info("OriginalFilename:" + originalFilename);

        try {
            //获取跟目录
            File path = new File(ResourceUtils.getURL("classpath:").getPath());
            if(!path.exists()) {
                path = new File("");
                System.out.println("项目根目录:"+path.getAbsolutePath());
            }

            //如果上传目录为/static/images，则可以如下获取：
            File uploadDirPath = new File(path.getAbsolutePath(),"23_SpringBootUploadFile/src/main/resources/images");
            if(!uploadDirPath.exists()){
                uploadDirPath.mkdirs();
            }
            System.out.println("文件存放目录:"+uploadDirPath.getAbsolutePath());

            String imgFilePath = uploadDirPath + File.separator + originalFilename;

            System.out.println("文件完整路径:" + imgFilePath);

            InputStream is = null;
            FileOutputStream fos = null;
            try {

                is = file.getInputStream();

                fos = new FileOutputStream(imgFilePath);

                byte[] bytes = new byte[1024];

                int len = 0;

                while ((len = is.read(bytes)) != -1) {
                    fos.write(bytes, 0, len);
                }

                fos.flush();

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                if (is != null) {
                    try {
                        is.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return "{\"data\":\"上传成功\"}";
    }

}
