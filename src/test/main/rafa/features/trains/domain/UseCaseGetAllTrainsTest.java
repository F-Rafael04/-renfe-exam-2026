package main.rafa.features.trains.domain;

import Mock.EmptyMockRepository;
import Mock.NullMockRepository;
import Mock.TrainMockRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UseCaseGetAllTrainsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void executeAny() {

        TrainMockRepository trainMockRepository = new TrainMockRepository();

        assertEquals(3, trainMockRepository.getAll());

        assertEquals("Zeus", trainMockRepository.getAll().get(0).getName());

    }

    @Test
    void executeEmpty(){
        EmptyMockRepository emptyMockRepository = new EmptyMockRepository();

        assertEquals(0, emptyMockRepository.getAll());
    }

    @Test
    void executeNull(){
        NullMockRepository nullMockRepository = new NullMockRepository();

        assertNull(nullMockRepository.getAll());
    }
}