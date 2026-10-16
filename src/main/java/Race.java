public class Race {
    String leaderName = "";
    int leaderDistance = 0;

    public void checkNewCar(Car car) {
        int currentDistance = 24 * car.speed;

        if (currentDistance > leaderDistance) {
            leaderName = car.name;
            leaderDistance = currentDistance;
        }
    }
}