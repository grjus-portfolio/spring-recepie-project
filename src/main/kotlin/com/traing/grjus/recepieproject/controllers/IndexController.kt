package com.traing.grjus.recepieproject.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController {

    @RequestMapping("","/","/index","index.html")
    fun getIndexPage():String{
        return "index"
    }
}