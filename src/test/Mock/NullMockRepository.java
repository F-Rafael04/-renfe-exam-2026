package Mock;

import main.rafa.features.trains.domain.Train;
import main.rafa.features.trains.domain.TrainRepository;

import java.util.List;

public class NullMockRepository implements TrainRepository {

    @Override
    public void saveTrain(Train train) {

    }

    @Override
    public List<Train> getAll() {
        return null;
    }

    @Override
    public void removeTrain(String id) {

    }
}
