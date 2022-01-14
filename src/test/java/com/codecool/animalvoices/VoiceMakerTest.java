package com.codecool.animalvoices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class VoiceMakerTest {

    private static VoiceMaker voiceMaker;

    @BeforeAll
    static void init(){
        voiceMaker = new VoiceMaker();
    }

    @Test
    void test_generateVoice_cat() {
        List<Animal> animals = new ArrayList<Animal>(){{
            add(new Cat());
        }};
        Assertions.assertEquals("miau ", voiceMaker.generateVoice(animals));
    }

    @Test
    void test_generateVoice_cow() {
        List<Animal> animals = new ArrayList<Animal>(){{
            add(new Cow());
        }};
        Assertions.assertEquals("muuu ", voiceMaker.generateVoice(animals));
    }

    @Test
    void test_generateVoice_multiple() {
        List<Animal> animals = new ArrayList<Animal>(){{
            add(new Cow());
            add(new Cat());
        }};
        Assertions.assertEquals("muuu miau ", voiceMaker.generateVoice(animals));
    }
}