package com.taotao.controller;

import com.taotao.bean.TbItem;
import com.taotao.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class TbItemController {
    @Autowired
    private TbItemService tbItemService;
    @RequestMapping("/{id}")
    public TbItem findTbItemById(@PathVariable Long id){
        TbItem tbItem = tbItemService.findTbItemById(id);
        return tbItem;
    }
}
