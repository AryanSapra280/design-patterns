package com.designpatterns.designpatterns.designPatterns.creational.builder;

public class UserDto {
    private final String name;
    private final int age;
    private final String gender;
    private final String college;

    public UserDto(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.gender = builder.gender;
        this.college = builder.college;
    }
    public static Builder builder() {
        return new Builder();
    }
    //Builder inner class is created for the mandatory fields
    public static class Builder {
        private String name;
        private int age;
        private String gender;
        private String college;

        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder age(int age) {
            this.age = age;
            return this;
        }
        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }
        public Builder college(String college) {
            this.college = college;
            return this;
        }
        public UserDto build() {
            return new UserDto(this);
        }
    }
    @Override
    public String toString() {
        return "UserDTO is created with " + name;
    }
}

