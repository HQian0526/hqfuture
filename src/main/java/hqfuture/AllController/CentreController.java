package hqfuture.AllController;

import hqfuture.Domain.User;
import hqfuture.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class CentreController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "")
    public String hqfuture(){
        return "index";
    }

    @RequestMapping(value = "index")
    public String tofirst(){
        return "index";
    }

    @RequestMapping(value = "login")
    public String login(User user,Model model){
        List<User> list = this.userService.loginfunction(user);
        if(list.size() == 0){
            return "fail";
        }else {
            model.addAttribute("username",list.get(0).getName());
            return "centre";
        }
    }

    @RequestMapping(value = "loginfail")
    public String loginfail(){
        return "longinfail";
    }

    @RequestMapping(value = "regist")
    public String regist(){
        return "regist";
    }

    @RequestMapping(value = "registjudge")
    public String registjudge2(User user){
        int i = this.userService.regist(user);
        if(i==1){
            return "index";
        }else {
            return "regist";
        }

    }

    @RequestMapping(value = "exit")
    public String exit(){
        return "index";
    }
}
