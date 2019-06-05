package com.osyunge.controller;

import com.osyunge.pojo.TbItem;
import com.osyunge.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "getItem.action",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getItem(int id) {
        System.out.println(id);
        TbItem item = itemService.getItem(id);
        System.out.println(item.toString());
        return item.toString();
    }

    @RequestMapping(value = "getItems.action",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getItems(){
        List<TbItem> items=new ArrayList<>();
        items=itemService.getItems();
        return items.toString();
    }
}
