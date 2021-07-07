package com.lzm.service.impl;

import com.lzm.pojo.Dept;
import com.lzm.mapper.DeptMapper;
import com.lzm.service.DeptService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门表 服务实现类
 * </p>
 *
 * @author lzm
 * @since 2021-07-07
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

}
