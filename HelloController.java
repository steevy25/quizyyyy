 package com.quiz;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HelloController {

    private static final List<String> QUESTIONS = Arrays.asList(
            "Quelle est la capitale de la France ?",
            "Combien de continents y a-t-il sur Terre ?",
            "Qui a écrit 'Les Misérables' ?",
            "Quel est le plus grand océan du monde ?",
            "En quelle année la Première Guerre mondiale a-t-elle commencé ?",
            "Qui a peint la Mona Lisa ?",
            "Quel est l'élément chimique représenté par le symbole 'O' ?",
            "Quel est le plus long fleuve du monde ?",
            "Dans quelle ville se trouve le Colisée ?",
            "Quel pays a inventé le football ?"
    );

    private static final Map<Integer, String> REPONSES = new HashMap<>();

    static {
        REPONSES.put(0, "La capitale de la France est Paris.");
        REPONSES.put(1, "Il y a 7 continents sur Terre.");
        REPONSES.put(2, "Victor Hugo a écrit 'Les Misérables'.");
        REPONSES.put(3, "Le plus grand océan du monde est l'océan Pacifique.");
        REPONSES.put(4, "La Première Guerre mondiale a commencé en 1914.");
        REPONSES.put(5, "Leonardo da Vinci a peint la Mona Lisa.");
        REPONSES.put(6, "L'élément chimique représenté par le symbole 'O' est l'oxygène.");
        REPONSES.put(7, "Le plus long fleuve du monde est le Nil.");
        REPONSES.put(8, "Le Colisée se trouve à Rome, en Italie.");
        REPONSES.put(9, "Le football a été inventé en Angleterre.");
    }

    // Affiche la liste de toutes les questions avec des liens vers les réponses
    @GetMapping("/questions")
    public String getQuestions() {
        StringBuilder questionsPage = new StringBuilder();
        questionsPage.append("<h1>Liste des questions</h1>");
        for (int i = 0; i < QUESTIONS.size(); i++) {
            questionsPage.append("<p>Question " + (i + 1) + ": " + QUESTIONS.get(i) + " <a href='/answer/" + i + "'>Voir la réponse</a></p>");
        }
        return questionsPage.toString();
    }

    // Affiche la réponse d'une question spécifique
    @GetMapping("/answer/{id}")
    public String getAnswer(@PathVariable int id) {
        if (id >= 0 && id < QUESTIONS.size()) {
            return "<h1>Réponse à la question " + (id + 1) + " :</h1><p>" + REPONSES.get(id) + "</p>";
        } else {
            return "<h1>Erreur</h1><p>Désolé, cette question n'existe pas.</p>";
        }
    }
}
