package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
public class FormController {
    @RequestMapping(value = "/form",method = RequestMethod.GET)
    public String displayForm()
    {
//        if (true){
//            throw new MyException();
//        }
        return "redirect:/exception?arg=0";
    }

    @RequestMapping(value = "/form",method = RequestMethod.POST)
    public String processFrom(@RequestPart("picture") MultipartFile picture) throws IOException {
        String name = picture.getName();
        byte[] bytes = picture.getBytes();
        picture.transferTo(new File("/"+picture.getOriginalFilename()));
        //这里保存到文件系统的时候要用相对路径，比如这里配置的是 /。以配置的上传目录为基准。即文件路径 E:/upload_ftp/ 是保存的目录
        return "result";
    }
}