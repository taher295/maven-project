package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }
 /**
   * @param someone this name of person
    * @return greeting String
   */
  //TODO: Add javadoc comment
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
