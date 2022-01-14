package com.codecool.animalvoices;

import java.util.List;

public class VoiceMaker {
    // Your task: Refactor this program based on the open-closed principle then extend it with your favourite animal.
    // Also write a test which checks if it works with your favourite animal.
    // Optional extra task: remove aditional space at the end of the string.
    public String generateVoice(List<Animal> animals){
        StringBuilder builder = new StringBuilder();
        for (Animal animal : animals) {
            if (animal instanceof Cow){
                builder.append("muuu");
            }
            if (animal instanceof Cat){
                builder.append("miau");
            }
            builder.append(" ");
        }
        return builder.toString();
    }
}
