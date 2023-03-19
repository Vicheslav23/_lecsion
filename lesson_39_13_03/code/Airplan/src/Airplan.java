public class Airplan {
    int airplan_flight; // номер рейса
    public Airplan airplan; // пилот взят из класса Pilot

    public Airplan(int airplan_flight) {
        this.airplan_flight = airplan_flight;
    }
    @Override
    public String toString() {
        return "Airplan{" +
                "airplan_flight=" + airplan_flight +
                '}';
    }
    // сеттер назначает водителя для класса Bus из класса Pilot


    public void setDriver(Pilot pilot) {
        this.pilot = pilot;
    }

    // метод, который связывает автобус и водителя
    public void go() {
        System.out.println("Автобус " + this.airplan_flight + " поехал под управлением - " + pilot.getName());
    }

    public Pilot getpilot() {
        return pilot;
    }
}
