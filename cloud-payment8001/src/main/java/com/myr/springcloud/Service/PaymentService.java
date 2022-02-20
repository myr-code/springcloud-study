package com.myr.springcloud.Service;

import com.myr.springcloud.entities.Payment;
import org.springframework.stereotype.Service;


public interface PaymentService {
    //添加
    int crete(Payment payment);

    //查询一个
    Payment getPaymentById(int id);
}
