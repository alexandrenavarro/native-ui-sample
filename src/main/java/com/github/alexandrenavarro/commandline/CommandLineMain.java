package com.github.alexandrenavarro.commandline;

import org.springframework.util.StringUtils;

public class CommandLineMain {

    public static void main(String[] args) {
        System.out.println(StringUtils.isEmpty("") ? "empty" : "notEmpty");
    }
}
