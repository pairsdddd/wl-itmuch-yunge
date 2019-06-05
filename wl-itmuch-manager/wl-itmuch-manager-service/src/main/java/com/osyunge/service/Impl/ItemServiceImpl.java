package com.osyunge.service.Impl;

import com.osyunge.mapper.TbItemMapper;
import com.osyunge.pojo.TbItem;
import com.osyunge.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper tbItemMapper;

    @Override
    public TbItem getItem(long id) {
        TbItem item=tbItemMapper.selectByPrimaryKey(id);
        return item;
    }

    @Override
    public List<TbItem> getItems() {
        List<TbItem> items=tbItemMapper.selectAllItem();
        return items;
    }
}
