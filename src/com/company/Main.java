package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static final String SPACE_CHAR = "\\s+";
    private static final int FIRST_NUMBER_INDEX = 0;
    private static final int SECOND_NUMBER_INDEX = 1;

    public static void main(String[] args) {
        Main main = new Main();
        String inputString = main.readInput();
        List<Integer> numbers = main.splitNumbers(inputString);
        main.findDistance(numbers);
    }

    private void findDistance(List<Integer> numbers) {
        List<Integer> sortedNumbers = new ArrayList<>(numbers);
        sortedNumbers.sort(Comparator.naturalOrder());
        int pos1 = (numbers.indexOf(sortedNumbers.get(FIRST_NUMBER_INDEX)));
        int pos2 = (numbers.indexOf(sortedNumbers.get(SECOND_NUMBER_INDEX)));
        int result = (Math.abs(pos1 - pos2));
        System.out.println(result);
    }

    private String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private List<Integer> splitNumbers(String inputString) {
        String[] numbsArray = inputString.split(SPACE_CHAR);
        List<Integer> numbers = new ArrayList<>();
        for (String number : numbsArray) {
            numbers.add(Integer.parseInt(number));
        }
        return numbers;
    }
}
