package cn.itrip.controller;

import cn.itrip.dao.itripUser.ItripUserMapper;
import com.alibaba.fastjson.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    ItripUserMapper dao;

    @RequestMapping(value="/json",method= RequestMethod.GET,produces="application/json; charset=utf-8")
    @ResponseBody
    public Object getlist(int pid) throws Exception {
        return JSONArray.toJSONString(dao.getItripUserById(new Long(pid)));
    }

    public static void main(String[] args) {
        int a = 3;
        if(a >= 2){
            System.out.println("没错");
        }else if(a >= 3){
            System.out.println("错");
        }
    }

}
