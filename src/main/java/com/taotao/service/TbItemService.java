package com.taotao.service;

import com.taotao.bean.TbItem;

public interface TbItemService {
    /**
     * 根据商品id查询商品信息
     * @param id 商品id
     * @return 指定商品的id的商品信息
     */
    TbItem findTbItemById(Long id);
}
