package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        String inputString = m.readInput();
        ArrayList<Integer> numbers = m.splitNumbers(inputString);
        m.findDistance(numbers);
    }

    private void findDistance(ArrayList<Integer> numbers) {
        ArrayList<Integer> sortedNumbers = new ArrayList<>(numbers);
        sortedNumbers.sort(Comparator.naturalOrder());
        int pos1 = (numbers.indexOf(sortedNumbers.get(0)));
        int pos2 = (numbers.indexOf(sortedNumbers.get(1)));
        int result = (Math.abs(pos1 - pos2));
        System.out.println(result);
    }

    private String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private ArrayList<Integer> splitNumbers(String inputString) {
        String[] numbsArray = inputString.split("\\s+");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (String number : numbsArray) {
            numbers.add(Integer.parseInt(number));
        }
        return numbers;
    }
}
