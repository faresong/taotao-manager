package com.taotao.mapper;

import com.taotao.bean.TbItem;

public interface TbItemMapper {
    /**
     * 根据商品id 查询数据库中商品表的信息
     * @param id 商品id
     * @return
     */
    TbItem findTbItemById(Long id);
}
