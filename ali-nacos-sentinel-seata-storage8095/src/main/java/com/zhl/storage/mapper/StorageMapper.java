package com.zhl.storage.mapper;

import com.zhl.springcloud2020.common.entities.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Administrator
 */
@Mapper
public interface StorageMapper {
    /**
     * 修改库存信息
     * @param storage storage
     * @return int
     */
    int updateStorage(Storage storage);

    /**
     * 通过产品id查询库存信息
     * @param productid 产品id
     * @return Storage
     */
    Storage selectStorageByProductid(@Param("productid") int productid);
}
