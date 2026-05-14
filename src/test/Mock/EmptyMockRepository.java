package Mock;

import main.rafa.features.trains.domain.Train;
import main.rafa.features.trains.domain.TrainRepository;

import java.util.ArrayList;
import java.util.List;

public class EmptyMockRepository implements TrainRepository {

    @Override
    public void saveTrain(Train train) {

    }

    @Override
    public List<Train> getAll() {

        List<Train> trains = new ArrayList<>();
        return trains;
    }

    @Override
    public void removeTrain(String id) {

    }
}
