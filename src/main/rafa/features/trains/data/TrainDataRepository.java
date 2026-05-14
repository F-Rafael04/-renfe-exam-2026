package main.rafa.features.trains.data;

import main.rafa.features.trains.domain.Train;
import main.rafa.features.trains.domain.TrainRepository;

import java.util.List;

public class TrainDataRepository implements TrainRepository {
    private TrainMemLocalDataSource trainMemLocalDataSource;

    public TrainDataRepository(TrainMemLocalDataSource trainMemLocalDataSource) {
        this.trainMemLocalDataSource = trainMemLocalDataSource;
    }

    @Override
    public void saveTrain(Train train) {
        trainMemLocalDataSource.save(train);
    }

    @Override
    public List<Train> getAll() {
        return trainMemLocalDataSource.findAll();
    }

    @Override
    public void removeTrain(String id) {
        trainMemLocalDataSource.delete(id);
    }
}
