package io.qameta.allure;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AuthTests {

    @Test
    @AllureId("10816")
    @DisplayName("Авторизация через Google")
    @Story("Авторизация через сторонние системы")
    @Owner("allure8")
    @Feature("Авторизация")
    public void testGoogleAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Google");
        step("Авторизуемся как пользователь 'Mr.Google'", () -> {
            step("Вводим логин 'google-user' ");
            step("Вводим пароль 'google-pass' ");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из Google", () -> {
            step("Имя 'Mr.Google'");
            step("Login 'google-user'");
            step("Аватарка");
        });
        step("Разлогиниваемся");
    }
    @Test
    @AllureId("10832")
    @DisplayName("Авторизация через Facebook")
    @Story("Авторизация через сторонние системы")
    @Owner("allure8")
    @Feature("Авторизация")
    public void testFacebookAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Facebook");
        step("Авторизуемся как пользователь Mr.Facebook", () -> {
            step("Вводим логин facebook-user");
            step("Вводим пароль facebook-pass");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из Facebook", () -> {
            step("Имя Mr.Facebook");
            step("Login facebook-user");
            step("Аватарка");
        });
        step("Разлогиниваемся");
    }
    @Test
    @AllureId("10833")
    @DisplayName("Авторизация через VK")
    @Story("Авторизация через сторонние системы")
    @Owner("allure8")
    @Feature("Авторизация")
    public void testVkAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через VK");
        step("Авторизуемся как пользователь Mr.VK", () -> {
            step("Вводим логин vk-user");
            step("Вводим пароль vk-pass");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из VK", () -> {
            step("Имя Mr.VK");
            step("Login vk-user");
            step("Аватарка");
        });
        step("Разлогиниваемся");
    }


}
