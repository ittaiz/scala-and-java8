package com.ittaiz.javaone.pattern_matching;

import static java.util.Arrays.stream;

public class MatchTypesAndGuardJavaExample {

    public static void main(String[] args) {
        Dog lucky = new Dog("Lucky", false);
        Dog bonny = new Dog("Bonny", true);
        Cat philip = new Cat("Philip");
        takeCareOfPets(lucky, bonny, philip);
    }

    private static void takeCareOfPets(Animal... pets) {
        stream(pets).forEach(MatchTypesAndGuardJavaExample::takeCareOfPet);
    }

    private static void takeCareOfPet(Animal pet) {
        switch (AnimalEnumFactory.resolve(pet)) {
            case Cat:
                System.out.println("I hope you appreciate I let you pet me");
                break;
            case Dog:
                if (((Dog) pet).canBeTakenForAWalk()) {
                    System.out.println("Going out for a walk");
                } else {
                    System.out.println("Thanks for petting me");
                }
                break;
        }
    }


    public static class AnimalEnumFactory {

        public static AnimalEnum resolve(Animal animal) {
            if (animal instanceof Cat) {
                return AnimalEnum.Cat;
            } else if (animal instanceof Dog) {
                return AnimalEnum.Dog;
            } else {
                return null;
            }
        }
    }

    public enum AnimalEnum {
        Cat, Dog
    }
}
