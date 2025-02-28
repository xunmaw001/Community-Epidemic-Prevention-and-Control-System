package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LaifangEntity;
import java.util.Map;

/**
 * 来访登记 服务类
 */
public interface LaifangService extends IService<LaifangEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}