package main.rafa.features.trains.domain;

public class UseCaseRemoveTrain {
    TrainRepository trainRepository;

    public UseCaseRemoveTrain(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    public void execute(String id){
        trainRepository.removeTrain(id);
    }
}
