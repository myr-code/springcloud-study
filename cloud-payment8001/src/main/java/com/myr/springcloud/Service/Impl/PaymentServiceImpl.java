package com.myr.springcloud.Service.Impl;

import com.myr.springcloud.Service.PaymentService;
import com.myr.springcloud.dao.PaymentDao;
import com.myr.springcloud.entities.Payment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentDao paymentDao;

    @Override
    public int crete(Payment payment) {
        return paymentDao.crete(payment);
    }

    @Override
    public Payment getPaymentById(int id) {
        return paymentDao.getPaymentById(id);
    }
}
