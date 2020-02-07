package com.kkc.daggertest.model

class CoffeeMaker {
    private var bean: Bean
    private var water: Water
    private var milk: Milk

    constructor(bean: Bean, water: Water, milk: Milk) {
        this.bean = bean
        this.water = water
        this.milk = milk
    }

    fun dropCoffee(): String {
        var coffee = ""

        coffee = if (!water.isExist)
            "${bean.region} Espresso"
        else {
            if (water.isHot) {
                if(milk.isExist)
                    "${bean.region} Hot Latte"
                else
                    "${bean.region} Hot Americano"
            }else {
                if(milk.isExist)
                    "${bean.region} Ice Latte"
                else
                    "${bean.region} Ice Americano"
            }
        }

        return coffee
    }
}