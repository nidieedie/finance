package com.example.finance.mapper;

import com.example.finance.entity.UserPayMoney;
import com.example.finance.entity.UserPayMoneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPayMoneyMapper {
    int countByExample(UserPayMoneyExample example);

    int deleteByExample(UserPayMoneyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserPayMoney record);

    int insertSelective(UserPayMoney record);

    List<UserPayMoney> selectByExample(UserPayMoneyExample example);

    UserPayMoney selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserPayMoney record, @Param("example") UserPayMoneyExample example);

    int updateByExample(@Param("record") UserPayMoney record, @Param("example") UserPayMoneyExample example);

    int updateByPrimaryKeySelective(UserPayMoney record);

    int updateByPrimaryKey(UserPayMoney record);
}