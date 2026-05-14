package main.rafa.features.trains.domain;

import Mock.TrainMockRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UseCaseSaveTrainTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void execute() {
        TrainMockRepository trainMockRepository = new TrainMockRepository();
        Train train = new Train("MD5-001", "Zeus", "Bullet Sonic", "200");
        trainMockRepository.saveTrain(train);
        assertEquals(1, trainMockRepository.getSaveCount());

    }
}