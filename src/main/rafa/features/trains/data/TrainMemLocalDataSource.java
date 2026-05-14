package main.rafa.features.trains.data; //cambiar por la ruta correcta

import main.rafa.features.trains.domain.Train;
import main.rafa.features.trains.domain.TrainRepository;

import java.util.ArrayList;
import java.util.Objects;

public class TrainMemLocalDataSource {



public static TrainMemLocalDataSource instace = null;

    public static TrainMemLocalDataSource getInstance(){
        if (instace == null){
            instace = new TrainMemLocalDataSource();
        }
        return instace;
    }

    private ArrayList<Train> storage = new ArrayList<>();

    public ArrayList<Train> findAll() {
        return storage;
    }

    public void save(Train train) {
        storage.add(train);
    }

    public void delete(String trainId) {
        storage.removeIf(train -> Objects.equals(train.getId(), trainId));
    }
}
