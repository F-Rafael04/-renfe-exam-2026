package main.rafa.features.trains.presentation;

import main.rafa.features.trains.data.TrainDataRepository;
import main.rafa.features.trains.data.TrainMemLocalDataSource;
import main.rafa.features.trains.domain.Train;
import main.rafa.features.trains.domain.UseCaseGetAllTrains;
import main.rafa.features.trains.domain.UseCaseRemoveTrain;
import main.rafa.features.trains.domain.UseCaseSaveTrain;

public class TrainView {

    public static void fuction1(){
        Train train = new Train("MD5-001", "Zeus", "Bullet Sonic", "200");
        fuction2();
        UseCaseSaveTrain useCaseSaveTrain = new UseCaseSaveTrain(new TrainDataRepository(TrainMemLocalDataSource.getInstance()));
        useCaseSaveTrain.execute(train);
        fuction2();
    }

    public static void fuction2(){
        UseCaseGetAllTrains useCaseGetAllTrains = new UseCaseGetAllTrains(new TrainDataRepository(TrainMemLocalDataSource.getInstance()));
        System.out.println(useCaseGetAllTrains.execute());
    }

    public static void fuction3(){
        fuction2();
        UseCaseRemoveTrain useCaseRemoveTrain = new UseCaseRemoveTrain(new TrainDataRepository(TrainMemLocalDataSource.getInstance()));
        useCaseRemoveTrain.execute("MD5-001");
        fuction2();
    }
}
