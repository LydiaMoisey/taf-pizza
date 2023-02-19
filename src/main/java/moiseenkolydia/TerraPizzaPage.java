package moiseenkolydia;

public class TerraPizzaPage {
    public static final String URL = "https://terrapizza.by/";
    public static final String COOKIES =  "//button[@class='close-icon']";
    public static final String MENU = "//li[@class='main-menu__item']/a[@href='https://terrapizza.by/menu']";
    public static final String PIZZA ="//div/a[@href='/catalog/picca']";
    public static final String DRINKS = "//li[@class='menu-navigation__item']/a[@href='/catalog/bar']";
    public static final String ADD_TO_CART_PIZZA = "//button[@data-hrf='/cart/add-basket?id=364']";
    public static final String ADD_TO_CART_DRINK = "//button[@data-hrf='/cart/add-basket?id=520']";
    public static final String DRINK_NAME = ADD_TO_CART_DRINK + "/../../../preceding-sibling::*[@class='menu-card__title']";
    public static final String CART = "//div[@class='basket__btn-top basket__top basket__btn-top--sm']";
    public static final String ITEM_IN_CART = "//div[@class='basket__products-item-name']";

}
