package com.myr.springcloud.dao;

import com.myr.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PaymentDao {
    //添加
    int crete(Payment payment);

    //查询一个
    Payment getPaymentById(int id);
}
