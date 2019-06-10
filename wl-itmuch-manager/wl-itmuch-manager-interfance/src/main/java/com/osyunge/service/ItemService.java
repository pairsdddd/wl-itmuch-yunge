package com.osyunge.service;

import com.osyunge.pojo.TbItem;
import com.osyunge.pojo.TbItemCat;

import java.util.List;

public interface ItemService {
    public TbItem getItem(long id);
    public List<TbItem> getItems();
}
