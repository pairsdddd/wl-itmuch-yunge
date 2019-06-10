package com.osyunge.service;

import com.github.pagehelper.PageInfo;
import com.osyunge.EasyUIDateGridResult;
import com.osyunge.EasyUITreeNode;
import com.osyunge.pojo.TbItemCat;

import java.util.List;

public interface EasyUIService {

    EasyUIDateGridResult getData(int page, int num);
    List<EasyUITreeNode> getItemList(long parentId);
}
