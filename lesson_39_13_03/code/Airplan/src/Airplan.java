public class Airplan {
    int airplanFlight; // номер рейса
    public Pilot pilot; // пилот взят из класса Pilot

    public Airplan(int airplanFlight) {
        this.airplanFlight = airplanFlight;
    }
    @Override
    public String toString() {
        return "Airplan{" +
                "airplan_flight=" + airplanFlight +
                '}';
    }
    // сеттер назначает водителя для класса Bus из класса Pilot


    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    // метод, который связывает автобус и водителя
    public void go() {
        System.out.println("Автобус " + this.airplanFlight + " поехал под управлением - " + pilot.getName());
    }

    public Pilot getpilot() {
        return pilot;
    }
}
