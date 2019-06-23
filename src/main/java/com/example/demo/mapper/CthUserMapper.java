package com.example.demo.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.model.CthUserBean;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author cth
 * @date 2019/06/03
 */
public interface CthUserMapper extends BaseMapper<CthUserBean> {
    /**
     *  新增用户
     * @param user 用户
     * @return int
     */
    int insertUser(CthUserBean user);

    /**
     * 查询所有用户
     * @return list
     */
    @Select("select * from cth_user")
    List<CthUserBean> findAllUser();
}
