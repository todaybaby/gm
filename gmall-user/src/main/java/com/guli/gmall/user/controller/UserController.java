package com.guli.gmall.user.controller;

import com.guli.gmall.user.bean.UserInfo;
import com.guli.gmall.user.service.UserService;
import jdk.nashorn.internal.runtime.linker.LinkerCallSite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping("userInfo")
    @ResponseBody
    public ResponseEntity<List<UserInfo>> userInfoList(){
        List<UserInfo> userInfoList=userService.userInfolist();
        return ResponseEntity.ok(userInfoList);
    }

}
