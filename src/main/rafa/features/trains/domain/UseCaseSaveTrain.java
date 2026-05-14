package main.rafa.features.trains.domain;

public class UseCaseSaveTrain {
    TrainRepository trainRepository;

    public UseCaseSaveTrain(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public void execute(Train train){
        trainRepository.saveTrain(train);
    }
}
