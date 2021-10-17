package com.bdqn.text;

import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class mak {

    public static void main(String[] args) throws  Exception{
        t2();
        System.out.println("----处理完成----");
    }
    public static void t2() throws Exception{
        List<UserEntity> list = new ArrayList<UserEntity>();
        for(int i = 1; i<=10 ; i++){
            UserEntity u = new UserEntity();
            u.setId(i);
            u.setName("名字"+i);
            list.add(u);
        }
        Map obj = new HashMap<>();
        obj.put("li",list);
        Configuration conf = new Configuration();
        conf.setDefaultEncoding("utf-8");
        conf.setDirectoryForTemplateLoading(new File("D:\\project\\j354\\IDEA\\itripbackend\\itripauth\\src\\main\\resources"));
        Template template=conf.getTemplate("b.flt");
        template.process(obj,new FileWriter("D://a.html"));
    }
    public static void t1() throws Exception{
        Map obj = new HashMap<>();
        obj.put("name","自定义名字");
        Configuration conf = new Configuration();
        conf.setDefaultEncoding("utf-8");
        conf.setDirectoryForTemplateLoading(new File("D:\\project\\j354\\IDEA\\itripbackend\\itripauth\\src\\main\\resources"));
        Template template=conf.getTemplate("a.flt");
        template.process(obj,new FileWriter("D://a.txt"));
    }
}
