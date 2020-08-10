package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExceptionController {
    @RequestMapping(value = "/exception",method = RequestMethod.GET)
    public String displayForm(@RequestParam(value="arg") int arg)
    {
        if(arg == 1){
            throw new MyException();
        }

        return "result";
    }

    @RequestMapping(value = "save", method = RequestMethod.GET)
    public String save(@RequestParam(value = "arg", defaultValue = "0") int arg){
        mockSave(arg);
        return "result";
    }

    private void mockSave(int arg){
        if(arg == 0){
            throw new MyException();
        }
        // save action
    }

    @ExceptionHandler(MyException.class)
    public String handleMyException(){
        return "error";
    }

}
