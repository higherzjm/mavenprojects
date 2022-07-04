package com.zjm.service;

import com.zjm.dao.Mydao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
   @Autowired
    private Mydao mydao;
    public String MyService() {
        return "service返回结果:"+mydao.myDao();
    }


}
