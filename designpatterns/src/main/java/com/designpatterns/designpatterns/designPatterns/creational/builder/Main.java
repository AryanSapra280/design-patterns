package com.designpatterns.designpatterns.designPatterns.creational.builder;

public class Main{
    public static void main(String args[]) {
        UserDto userDto = UserDto.builder()
                .age(18).name("Aryan").college("JIIT").gender("M").build();
        System.out.println(userDto.toString());
    }

}