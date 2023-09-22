package com.myfirsttest

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class EmailValidatorTest {
    private lateinit var validator:EmailValidator

    @Before
    fun setup(){
        validator = EmailValidator()
    }

    @Test
    fun emailValidator_CorrectEmailSimple_ReturnsTrue() {
        assertTrue(validator.isValidEmail("name@email.com"))
    }

    @Test
    fun emailValidator_CorrectEmailSubDomain_ReturnsTrue() {
        assertTrue(validator.isValidEmail("name@email.co.uk"))
    }

    @Test
    fun emailValidator_InvalidEmailNoTld_ReturnsFalse() {
        assertFalse(validator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailDoubleDot_ReturnsFalse() {
        assertFalse(validator.isValidEmail("name@email..com"))
    }

    @Test
    fun emailValidator_InvalidEmailNoUsername_ReturnsFalse() {
        assertFalse(validator.isValidEmail("@email.com"))
    }

    @Test
    fun emailValidator_EmptyString_ReturnsFalse() {
        assertFalse(validator.isValidEmail(""))
    }

    @Test
    fun emailValidator_NullEmail_ReturnsFalse() {
        assertFalse(validator.isValidEmail(null))
    }
//Home Work

    @Test
    fun emailValidator_InvalidEmailNoDomain_ReturnsFalse() {
        assertFalse(validator.isValidEmail("name@"))
    }
    @Test
    fun emailValidator_InvalidEmailNoZoneDomain_ReturnsFalse() {
        assertFalse(validator.isValidEmail("name@email"))
    }

    @Test
    fun emailValidator_InvalidEmailNoAtSymbol_ReturnsFalse() {
        assertFalse(validator.isValidEmail("nameemail.ru"))
    }

    @Test
    fun emailValidator_InvalidEmailNoDotSymbol_ReturnsFalse() {
        assertFalse(validator.isValidEmail("name@emailru"))
    }
}
