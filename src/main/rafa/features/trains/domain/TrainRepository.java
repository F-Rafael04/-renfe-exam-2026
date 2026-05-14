package main.rafa.features.trains.domain;

import java.util.List;

public interface TrainRepository {
    public void saveTrain(Train train);
    public List<Train> getAll();
    public void removeTrain(String id);
}
