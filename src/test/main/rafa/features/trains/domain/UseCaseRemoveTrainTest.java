package main.rafa.features.trains.domain;

import Mock.TrainMockRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UseCaseRemoveTrainTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void execute() {
        TrainMockRepository trainMockRepository= new TrainMockRepository();
        trainMockRepository.removeTrain("MD5-001");
        assertEquals(1, trainMockRepository.getRemoveCount());
    }
}