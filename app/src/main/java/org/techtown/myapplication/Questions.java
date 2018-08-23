package org.techtown.myapplication;

public class Questions {

    public String mQuestions[] = {

            "which is the 1st planet in the Solar system?",
            "which is the 2nd planet in the Solar system?",
            "which is the 3rd planet in the Solar system?",
            "which is the 4th planet in the Solar system?",
            "which is the 5th planet in the Solar system?",
            "which is the 6th planet in the Solar system?",
            "which is the 7th planet in the Solar system?",
            "which is the 8th planet in the Solar system?"
    };

    private String mChoices[][] ={
            {"Mercury", "Venus", "Mars", "Saturn"},
            {"Jupiter", "Venus", "Mars", "Jupiter"},
            {"Earth", "Venus", "Mars", "Saturn"},
            {"Mercury", "Jupiter", "Mars", "Saturn"},
            {"Mercury", "Venus", "Mars", "Jupiter"},
            {"Mercury", "Venus", "Mars", "Saturn"},
            {"Mercury", "Uranus", "Mars", "Saturn"},
            {"Neptune", "Venus", "Mars", "Saturn"}
    };

    private String mCorrectAnswers[] = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }


}
