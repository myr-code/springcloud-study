package com.myr.springcloud.Ctroller;

import com.myr.springcloud.Service.PaymentService;
import com.myr.springcloud.entities.CommonResult;
import com.myr.springcloud.entities.Payment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


@RestController
@RequestMapping("payment")
public class PaymentCtroller {
    @Resource
    PaymentService paymentService;

    @PostMapping("create")
    public CommonResult create(@RequestBody Payment payment) {
        int crete = paymentService.crete(payment);
        return new CommonResult(200,"insert success" ,crete);
    }

    @GetMapping("get/{id}")
    public CommonResult<Payment> selectOne(@PathVariable("id") int id) {
        Payment payment = paymentService.getPaymentById(id);

        return new CommonResult<Payment>(200,"select success 8001!",payment);
    }

}
