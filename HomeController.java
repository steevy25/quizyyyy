package com.quiz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        StringBuilder homePage = new StringBuilder();
        homePage.append("<h1>Bienvenue sur la page d'accueil du quiz !</h1>");
        homePage.append("<p><a href='/questions'>Voir les questions</a></p>");
        homePage.append("<p><a href='/answer/0'>Voir la réponse à la question 1</a></p>");
        homePage.append("<p><a href='/answer/1'>Voir la réponse à la question 2</a></p>");
        homePage.append("<p><a href='/answer/2'>Voir la réponse à la question 3</a></p>");
        homePage.append("<p><a href='/answer/3'>Voir la réponse à la question 4</a></p>");
        homePage.append("<p><a href='/answer/4'>Voir la réponse à la question 5</a></p>");
        homePage.append("<p><a href='/answer/5'>Voir la réponse à la question 6</a></p>");
        homePage.append("<p><a href='/answer/6'>Voir la réponse à la question 7</a></p>");
        homePage.append("<p><a href='/answer/7'>Voir la réponse à la question 8</a></p>");
        homePage.append("<p><a href='/answer/8'>Voir la réponse à la question 9</a></p>");
        homePage.append("<p><a href='/answer/9'>Voir la réponse à la question 10</a></p>");
        return homePage.toString();
    }
}

