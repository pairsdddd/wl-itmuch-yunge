package com.osyunge.controller;

import com.osyunge.EasyUIDateGridResult;
import com.osyunge.EasyUITreeNode;
import com.osyunge.pojo.TbItem;
import com.osyunge.service.ItemService;
import com.osyunge.service.EasyUIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemController {
    @Autowired
    private ItemService itemService;
    @Autowired
    private EasyUIService easyUIService;

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

    @RequestMapping("/{page}")
    public String page(@PathVariable String page){
        return page;
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/item/cat/list")
    @ResponseBody
    public List<EasyUITreeNode> itemcat(@RequestParam(value="id", defaultValue="0")Long parentId){
        List<EasyUITreeNode> list = easyUIService.getItemList(parentId);
        return list;

    }

    @RequestMapping("/item/list")
    @ResponseBody
    public EasyUIDateGridResult getItemList(Integer page, Integer rows) {
        EasyUIDateGridResult result = easyUIService.getData(page,rows);
        return result;
    }

}
