public interface Fly {


    // abstarct method need to be override if i use it in une class qui en hérite

    void takeOff();


    int ascend(int meters);

    int descend(int meters);


    void land();


    // celle ci est par defut pour toute les class qui en herite (implement) donc pas besoin de l'overide dans la classe qui l'utilisera
    default void glide() {
        System.out.println("It glides into the air.");
    }

    ;
}



