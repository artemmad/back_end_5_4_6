package com.myitacademy.back_end_5_4_6;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class VK_UserController {
    @RequestMapping (path = "/VK", method = RequestMethod.POST)
    public @ResponseBody String VK(@RequestBody VK_User vk_user){
        System.out.println(vk_user.first_name + " " + vk_user.last_name);
        return  vk_user.first_name + "  " + vk_user.last_name;
    }
    //deployment test
}
