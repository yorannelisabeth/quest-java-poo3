public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;


    // constructor

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;

    }

    ;


// method


    @Override
    public String sing() {
        return "Screech!";
    }

    ;

    public boolean isFlying() {
        return flying;
    }

    ;

    public int getAltitude() {
        return altitude;
    }

    ;


    @Override
    public void takeOff() {

        //pk le ! en gros on prend une focntion qui pour apliquer ce quil y a apres {} doit ètre corrspondante a true dans ces condition comme on a initialiser a false il faut que on lui mette l'inverse de false cest a dire "!"
        if (!this.flying) {

            this.altitude = 1;
            this.flying = true;
            System.out.println(this.getName() + "takes off in the sky");
        }
    }


    @Override
    public int ascend(int meters) {

        if (this.flying == true) {
            this.altitude += meters;
            System.out.println("The " + this.getName() + " is ascending over " + this.getAltitude());

        }
        return this.altitude;
    }

    @Override
    public int descend(int meters) {
        if (this.flying == true) {
            this.altitude -= meters;
            System.out.println("The " + this.getName() + " is descending over " + this.getAltitude());

        }
        return this.altitude;
    }

    @Override
    public void land() {
        if (this.flying && this.altitude <= 5) {
            this.flying = true;
            System.out.printf("%s it land on the ground.%n", this.getName());
        } else {
            System.out.printf("%s is too hight, it can't land on the ground.%n", this.getName());
        }
    }


}
