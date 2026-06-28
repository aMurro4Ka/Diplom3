package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import io.qameta.allure.Step;

// Создаем класс MainPage для представления главной страницы сайта
public class MainPage {
    private WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    // Локаторы элементов на главной странице
    private By loginButton = By.xpath(".//button[text()='Войти в аккаунт']"); // Локатор кнопки "Войти в аккаунт"
    private By profileButton = By.xpath(".//p[text()='Личный Кабинет']"); // Локатор кнопки "Личный кабинет"
    private By bunButton = By.xpath(".//span[text()='Булки']"); // Локатор кнопки "Булки"
    private By sauceButton = By.xpath(".//span[text()='Соусы']"); // Локатор кнопки "Соусы"
    private By fillingButton = By.xpath(".//span[text()='Начинки']"); // Локатор кнопки "Начинки"
    private By createOrderButton = By.xpath(".//button[text()='Оформить заказ']"); // Локатор кнопки "Оформить заказ"
    private By menuTabLocator = By.xpath("//div[contains(@class,'tab_tab__1SPyG tab_tab_type_current__2BEPc')]"); // Локатор вкладок меню

    // Методы для взаимодействия с элементами на главной странице

    @Step("Клик по кнопке 'Войти в аккаунт'")
    public void clickLoginButton() {
        driver.findElement(loginButton).click(); // Находим и кликаем кнопку "Войти в аккаунт"
    }

    @Step("Клик по кнопке 'Личный кабинет'")
    public void clickAccountButton() {
        driver.findElement(profileButton).click(); // Находим и кликаем кнопку "Личный кабинет"
    }

    @Step("Клик по кнопке 'Булки'")
    public void clickBunButton() {
        driver.findElement(bunButton).click(); // Находим и кликаем кнопку "Булки"
    }

    @Step("Клик по кнопке 'Соусы'")
    public void clickSauceButton() {
        driver.findElement(sauceButton).click(); // Находим и кликаем кнопку "Соусы"
    }

    @Step("Клик по кнопке 'Начинки'")
    public void clickFillingButton() {
        driver.findElement(fillingButton).click(); // Находим и кликаем кнопку "Начинки"
    }

    @Step("Получение текста кнопки 'Оформить заказ'")
    public String getCreateOrderButtonText(){
        return driver.findElement(createOrderButton).getText(); // Получаем текст кнопки "Оформить заказ"
    }

    @Step("Получение текста активной вкладки меню")
    public String getMenuTabLocator(){
        return driver.findElement(menuTabLocator).getText(); // Получаем текст вкладок меню
    }
}