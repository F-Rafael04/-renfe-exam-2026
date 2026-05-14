package main.rafa.features.trains.domain;

import java.util.List;

public class UseCaseGetAllTrains {
    TrainRepository trainRepository;

    public UseCaseGetAllTrains(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public List<Train> execute(){
        return trainRepository.getAll();
    }
}
