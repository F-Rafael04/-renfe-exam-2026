package main.rafa.features.trains.domain; //cambiar por la ruta correcta

public class Train {
    private String id;
    private String name;
    private String model;
    private String maxSpeed;

    public Train(String id, String name, String model, String maxSpeed) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Train{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed='" + maxSpeed + '\'' +
                '}';
    }
}


