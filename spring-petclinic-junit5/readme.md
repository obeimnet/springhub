# Spring PetClinic Sample Application with JUnit 5 
[![Build Status](https://travis-ci.org/obeimnet/springhub.svg?branch=master)](https://travis-ci.org/obeimnet/springhub)

A modified version of Sprig PetClinic Application with all unit and integration tests written in Junit5 and java version upgraded to 11.

## Summary of Changes: ##

**Junit4 to JUnit5 mapping:**

- org.junit.Test=>org.junit.jupiter.api.Test

- org.junit.runner.RunWith=>org.junit.jupiter.api.extension.ExtendWith

- org.junit.Before=> org.junit.jupiter.api.BeforeEach

- org.junit.Ignore=>org.junit.jupiter.api.Disabled

- org.springframework.test.context.junit4.SpringRunner=>org.springframework.test.context.junit.jupiter.SpringExtension;

- org.junit.Test(expected=Exception.class)=> org.junit.jupiter.api.Assertions.assertThrows


 