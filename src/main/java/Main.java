public class Main {
    public static void main(String[] args) {
        Burger chefburger = new Burger();
        chefburger.name = "Шефбургер";
        chefburger.weight = 213;
        chefburger.description = "Попробуйте новый уникальный бургер от шефа! Нежный сливочный соус, сочное филе в оригинальной панировке, салат айcберг и помидоры на пшеничной булочке с черно-белым кунжутом.";
        chefburger.nutritionalValue = 236;
        chefburger.protein = 13;
        chefburger.fat = 10.7;
        chefburger.carbohydrate = 22;
        chefburger.additionalInformation = "* Данные по пищевой и энергетической ценности блюд, представленные в таблице, основаны на данных лабораторных исследований, технико-технологических карт и данных по пищевой ценности, полученных от поставщиков. Различия в размерах порций, так же как региональные и сезонные различия могут влиять на пищевую ценность каждого продукта меню.<br/>Рецептура блюд периодически может меняться. Информация предоставлена на основе текущего меню и может изменяться без предварительного уведомления.\n" +
                "** В некоторых ресторанах KFC продукты и цены могут отличаться";
        chefburger.picture = "https://www.kfc.ru/foodorder/product/2384";
        chefburger.price = 129;
        chefburger.quantityCounter = 1;

        System.out.println(chefburger.name);
        System.out.println(chefburger.weight);
        System.out.println(chefburger.description);
        System.out.println(chefburger.nutritionalValue);
        System.out.println(chefburger.protein);
        System.out.println(chefburger.fat);
        System.out.println(chefburger.carbohydrate);
        System.out.println(chefburger.additionalInformation);
        System.out.println(chefburger.picture);
        System.out.println(chefburger.price);
        System.out.println(chefburger.quantityCounter);

    }
}
