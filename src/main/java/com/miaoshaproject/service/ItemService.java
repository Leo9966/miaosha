package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.ItemModel;

import java.util.List;

/**
 * @author Leo
 * @version 1.0
 * @date 2020/1/28 下午3:55
 */
public interface ItemService {
    //创建产品
    ItemModel creatItem(ItemModel itemmodel) throws BusinessException;

    //商品列表浏览
    List<ItemModel> listItem();

    //商品详情浏览
    ItemModel getItemById(Integer id);
}
