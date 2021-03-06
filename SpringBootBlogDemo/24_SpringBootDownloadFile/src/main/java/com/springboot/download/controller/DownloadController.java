package com.springboot.download.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;

/**
 * @Description:
 * @Auther: zrblog
 * @CreateTime: 2018-10-21 10:47
 * @Version:v1.0
 */

@Controller
@RequestMapping("/")
public class DownloadController {

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public String Download() {
        return "fileDownload"; //访问fileDownload.html
    }

    @RequestMapping("/downloadFile")
    public void downloadFile(HttpServletRequest request, HttpServletResponse response) {
        String fileName = "SpringBoot文件下载测试.txt";

        String path = "D:\\";

        File file = new File(path, fileName);

        if (file.exists()) {
            try {
                fileName = URLEncoder.encode(fileName, "UTF-8");//防止文件名称包含中文，中文不显示问题
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            response.setContentType("text/plain"); // 设置强制下载不打开
            response.setContentType("appliaction/force-download");
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName); // 设置文件名


            FileInputStream fileInputStream = null;

            BufferedInputStream bufferedInputStream = null;

            try {
                fileInputStream = new FileInputStream(file);

                bufferedInputStream = new BufferedInputStream(fileInputStream);

                OutputStream outputStream = response.getOutputStream();

                byte[] buff = new byte[1024];

                int i = bufferedInputStream.read(buff);

                while (i != -1) {
                    outputStream.write(buff, 0, i);
                    outputStream.flush();
                    i = bufferedInputStream.read(buff);
                }

                System.out.println("下载成功");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }


        }
    }
}
