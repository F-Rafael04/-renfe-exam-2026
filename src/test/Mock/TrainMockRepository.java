package Mock;

import main.rafa.features.trains.domain.Train;
import main.rafa.features.trains.domain.TrainRepository;

import java.util.ArrayList;
import java.util.List;

public class TrainMockRepository implements TrainRepository {

    private Integer saveCount = 0;
    private Integer removeCount = 0;

    @Override
    public void saveTrain(Train train) {
        saveCount++;
    }

    @Override
    public List<Train> getAll() {
        List<Train> trains = new ArrayList<>();
        Train train1 = new Train("MD5-001", "Zeus", "Bullet Sonic", "200");
        Train train2 = new Train("MD5-002", "Zeus", "Bullet Sonic", "200");
        Train train3 = new Train("MD5-003", "Zeus", "Bullet Sonic", "200");

        trains.add(train1);
        trains.add(train2);
        trains.add(train3);

        return trains;
    }

    @Override
    public void removeTrain(String id) {
        removeCount++;

    }

    public Integer getRemoveCount() {
        return removeCount;
    }

    public Integer getSaveCount() {
        return saveCount;
    }
}
