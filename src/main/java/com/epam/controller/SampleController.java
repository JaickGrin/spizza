package com.epam.controller;

import com.epam.dao.Repository;
import com.epam.dto.OrderDTO;
import com.epam.model.Cart;
import com.epam.model.Order;
import com.epam.model.goods.Goods;
import com.epam.model.goods.Pizza;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
public class SampleController {

    Repository repository = new Repository();

    @GetMapping("/sample")
    public String fooBar(){
        return "hello world!";
    }

    @GetMapping("/getGoodsInfo")
    public Goods getGoodsInfo(@RequestParam(value = "name") String name) {
        return repository.findByName(name);
    }

    @GetMapping("/getMenu")
    public ArrayList<Goods> getMenu() {
        return repository.findAllGoods();
    }

    @PostMapping("/createOrder")
    public long createOrder(@RequestBody OrderDTO orderDTO) {
        Goods goods = repository.findByName(orderDTO.getName());
        Order order = new Order(new Cart(goods), null, null);
        return 0;
    }
}
