public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off into the sky.%n", this.getName());
        }
    }

    @Override
    public int ascend(int altitude) {
        if (this.flying) {
            this.altitude = Math.max(this.altitude + altitude, 120);
            System.out.printf("%s flies upward, altitude: %d%n", this.getName(), this.altitude);
        } else {
            System.out.printf("%s do not fly.%n", this.getName());
        }
        return this.altitude;
    }

    @Override
    public int descend(int altitude) {
        if (this.flying) {
            this.altitude = Math.min(this.altitude - altitude, 10);
            System.out.printf("%s flies down, altitude: %d%n", this.getName(), this.altitude);
        } else {
            System.out.printf("%s is already on the ground.%n", this.getName());
        }
        return this.altitude;
    }

    @Override
    public void glide() {
        System.out.println("glides in the air.");
    }

    @Override
    public void land() {
        if (this.altitude == 1 && this.flying) {
            System.out.printf("%s lands on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too high, he can't land.%n", this.getName());
        }
    }
}
