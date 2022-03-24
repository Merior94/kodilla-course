package com.kodilla.exception.test;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallengeTestSuite {

    @Test
    public void testprobablyIWillThrowException() {
        // given
        SecondChallenge secondChallenge = new SecondChallenge();

        // when & then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.0,0.0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.999,0.0)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.0,1.5)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.999,0.0)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.999,1.499)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.999,1.501))
        );
    }
}
