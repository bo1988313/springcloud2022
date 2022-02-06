package com.zhl.storage.service.impl;

import com.zhl.springcloud2020.common.entities.Order;
import com.zhl.springcloud2020.common.entities.Storage;
import com.zhl.storage.mapper.StorageMapper;
import com.zhl.storage.service.IStorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@Service
public class StorageServiceImpl implements IStorageService {
    @Resource
    private StorageMapper storageMapper;

    @Override
    public boolean updateStorage(Order order) throws Exception {
        final Storage storage = storageMapper.selectStorageByProductid(order.getProductid());
        if(null == storage){
            throw new Exception("没有找到对应产品的库存信息");
        }
        storage.setUsed(storage.getUsed() + order.getCount());
        storage.setResidue(storage.getTotal() - storage.getUsed());
        if(storage.getResidue() < 0){
            throw new Exception("库存不足");
        }
        int line = storageMapper.updateStorage(storage);
        if(line > 0 ){
            return true;
        }
        return false;
    }
}
