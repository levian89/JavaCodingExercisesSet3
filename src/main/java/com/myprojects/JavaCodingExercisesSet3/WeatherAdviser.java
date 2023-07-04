package com.myprojects.JavaCodingExercisesSet3;
import java.util.Scanner;

public class WeatherAdviser {

    public String provideWeatherAdvisory(int temperature) {
        if (temperature<0) {
            return "It's freezing! Wear a heavy coat.";
        } else if (temperature<=10) {
            return "It's cold! Bundle up.";
        } else if (temperature<=20) {
            return "It's cool! A light jacket will do.";
        } else {
            return "It's warm! Enjoy the day.";
        }
    }

    public static void main(String[] args) {
        WeatherAdviser adviser = new WeatherAdviser();
        System.out.println(adviser.provideWeatherAdvisory(25));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature value: ");
        int tempValue = scanner.nextInt();
        WeatherAdviser adviser1 = new WeatherAdviser();
        System.out.println(adviser1.provideWeatherAdvisory(tempValue));
    }
}
