package com.epam.dao;

import com.epam.model.goods.Drink;
import com.epam.model.goods.Goods;
import com.epam.model.goods.NutritionFacts;
import com.epam.model.goods.Pizza;

import java.util.ArrayList;

public class Repository {

    private ArrayList<Goods> goodsList;

    public Repository() {
        this.goodsList = new ArrayList<>();
        goodsList.add(new Pizza("Пеперони", new NutritionFacts(1, 1, 1, 1), 1, 0, 0, 0, "Список ингридиентов"));
        goodsList.add(new Pizza("Маргарита", new NutritionFacts(1, 1, 1, 1), 1, 0, 0, 0, "Список два"));
        goodsList.add(new Pizza("Асорти", new NutritionFacts(1, 1, 1, 1), 1, 0, 0, 0, "Список два"));
        goodsList.add(new Drink("Кола", new NutritionFacts(1,1,1,1),1,1,1));
        goodsList.add(new Drink("Пепси", new NutritionFacts(1,1,1,1),1,1,1));
    }

    public ArrayList<Goods> findAllGoods() {
        return this.goodsList;
    }

    public Goods findByName(String s) {
        return this.goodsList.stream().filter(goods -> goods.getName().equals(s)).findFirst().get();
    }
}
