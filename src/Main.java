import exo.Partie1;
import exo.Partie2;
import factory.TripFactory;
import models.Trip;

import java.util.List;

void main() {
    List<Trip> trips = TripFactory.generateTrips(10);

    // Partie 1
    // Partie1 partie1 = new Partie1();
    // System.out.println(partie1.longAndExpensiveTrips(trips));
    // System.out.println(partie1.badTrips(trips));
    // System.out.println(partie1.recentTrips(trips));

    // Partie 2
    Partie2 partie2 = new Partie2();
    System.out.println(partie2.countByCity(trips));
    System.out.println(partie2.revenueByDriver(trips));
    System.out.println(partie2.avgDurationByCity(trips));
}
