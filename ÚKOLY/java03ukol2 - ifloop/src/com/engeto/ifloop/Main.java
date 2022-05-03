package com.engeto.ifloop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    //region Demo
    /**
     * Ukázka použítí metody {@link Support#safeReadInt()}
     *
     * Tato metoda použije metodu {@link Support#safeReadInt() k načtení
     * jednoho čísla od uživatele a vypsání tohoto čísla na výstup.
     *
     * Podobně můžeš používat metodu {@link Support#safeReadInt()}
     * i v dalších metodách.
     */
    public static void readOneIntFromInputAndPrintIt() {
        int input = Support.safeReadInt();
        System.out.println("You entered: "+input);
    }
    //endregion

    //region Úlohy na cykly
    /**
     * Čte čísla, která zadává uživatel a vypisuje je na výstup.
     * Metoda pokračuje ve čtení opakovaně tak dlouho, dokud uživatel zadává kladná čísla či nulu.
     *
     * Jakmile uživatel zadá záporné číslo, metoda skončí.
     */
                            //--------HOTOVO----Task 1--------------
    public static void readIntsFromInputAndPrintItUntilNegative() {
        int input = Support.safeReadInt();
        while (input >= 0) {
            System.out.println(input);
            input = Support.safeReadInt();
        }
        if (input < 0) {
            System.out.println("Záporné číslo, konec metody");
        }
    }

    /**
     * Čte čísla ze vstupu tak dlouho, dokud uživatel nezadá záporné číslo.
     * Jako návratovou hodnotu vrátí součet zadaných čísel (záporné číslo by nemělo být zahrnuto).
     *
     * @return Součet všech zadaných čísel (záporné číslo ukončující vstup není zahrnuto).
     */
                            //--------HOTOVO-----Task 2-------------
    public static int sumAllInputUntilNegative() {
        int value = 0;
        int input = Support.safeReadInt();
        if (input > 0) {
            value = value + input;
            do {
                input = Support.safeReadInt();
                if (input > 0) {
                    value = value + input;
                } else {
                    System.out.println("Záporné číslo, konec metody");
                }
            } while (input > 0);
        }
        return value;
    }

    /**
     * Čte čísla ze vstupu tak dlouho, dokud uživatel nezadá záporné číslo.
     * Všechna načtená čísla uloží do listu, který vrátí jako návratovou hodnotu.
     *
     * @return List načtených hodnot (záporná hodnota není zahrnuta v listu)
     */
                        //--------HOTOVO-----Task 3-------------
    public static List<Integer> storeAllInputInArrayListUntilNegative() {

        int input = Support.safeReadInt();
        List<Integer> numbers = new ArrayList<>();

        while (input >= 0) {
            numbers.add(input);
            input = Support.safeReadInt();
        }
        return numbers;
    }

    /**
     * Dostane jako parametr list čísel. Vypíše čísla na obrazovku. Každé číslo vypiš na samostatný řádek.
     * @param list List čísel, která se mají vypsat.
     */
                    //--------HOTOVO-----Task 4-------------
    public static void printAllIntegersFromList(List<Integer> list) {
                        for(Integer x : list) {
                            System.out.println(x);
                        }
    }

    /**
     * Sečte hodnoty z listu a vrátí výsledek jako návratovou hodnotu.
     * @param list List čísel, která chceme sečíst.
     * @return Součet všech čísel v listu.
     */

                         //--------HOTOVO-----Task 5-------------
    public static Integer sumAllIntegersFromList(List<Integer> list) {
        int value = 0;
        for (Integer x : list){
            value = value + x;}
        return value;
    }
    //endregion

    //region Podmínky
    /**
     * Vypíše čísla ze seznamu, která jsou menší než zadaný limit.
     * @param list Seznam čísel, která máme zkontrolovat.
     * @param limit Limit - vypsána budou pouze čísla z listu, která jsou menší než limit
     */
                //--------HOTOVO-----Task 6-------------
    public static void printIntegersUnderLimit(List<Integer> list, int limit) {
        for (int x : list) {
            if (x < limit) {
                System.out.println(x);
            }
        }
    }

    /**
     * Vypíše čísla ze zadaného listu.
     * Při výpisu ale nahradí:
     * - číslo 1 slovem "one",
     * - číslo 2 slovem "two",
     * - číslo 3 slovem "three"
     * Ostatní čísla vypíše jako číselnou hodnotu.
     * Například pokud dostane jako parametr seznam [5, 3, 1, 48, 2],
     * vypíše: 5, three, one, 48, two.
     * @param list Seznam čísel, která se mají vypsat.
     */
                    //--------HOTOVO-----Task 7-------------
    public static void printIntegersWithReplace(List<Integer> list) {
        for (Integer x : list) {
            if (x == 1) {
                System.out.println("one");
            } else if (x == 2){
                System.out.println("two");
            } else if(x == 3) {
                System.out.println("three");
            } else {
                System.out.println(x);
            }
        }
    }
    //endregion

    public static void main(String[] args) {
        // Příklad:
        System.out.println("--- Example - read and print one integer ---");
        readOneIntFromInputAndPrintIt();
        // ---
        System.out.println("--- Task 1 - read and print integers until negative ---");
        readIntsFromInputAndPrintItUntilNegative();
        // ---
        System.out.println("--- Task 2 - sum all integers until negative ---");
        System.out.println("Total sum: " + sumAllInputUntilNegative());
        // ---
        System.out.println("--- Task 3 - read integers to list until negative ---");
        List<Integer> list = storeAllInputInArrayListUntilNegative();
        System.out.println(list);
        // ---
        System.out.println("--- Task 4 - print all integers from list ---");
        printAllIntegersFromList(list);
        // ---
        System.out.println("--- Task 5 - sum all integers in list ---");
        System.out.println("Total sum: " + sumAllIntegersFromList(list));
        // ---
        System.out.println("--- Task 6 - print integers under 5 from list ---");
        printIntegersUnderLimit(list, 5);
        // ---
        System.out.println("--- Task 7 - print integers - replace: 1 => \"one\", 2 => \"two\", 3 => \"three\" ---");
        printIntegersWithReplace(list);
    }
}