import exo.Partie1;
import factory.TripFactory;
import models.Trip;

import java.util.List;

void main() {
    List<Trip> trips = TripFactory.generateTrips(10);
    Partie1 partie1 = new Partie1();

    System.out.println(partie1.longAndExpensiveTrips(trips));
    System.out.println(partie1.badTrips(trips));
    System.out.println(partie1.recentTrips(trips));
}
