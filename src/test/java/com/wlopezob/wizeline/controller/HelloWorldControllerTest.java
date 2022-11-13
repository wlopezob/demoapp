package com.wlopezob.wizeline.controller;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class HelloWorldControllerTest {

  @Autowired
  HelloWorldController helloWorldController;

  @Test
  @DisplayName("Getting Hello, World")
  public void HelloWorldTest(){
    final String helloWorld = "Hello, World. DEVOPS 01";
    Assertions.assertEquals(helloWorldController.HelloWorld(),helloWorld);
  }
}