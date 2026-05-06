package exo;

import models.Trip;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Partie3 {
    Comparator<Trip> byPrice = (trip1, trip2) -> Double.compare(trip1.price(), trip2.price());
    Comparator<Trip> byRating = (trip1, trip2) -> Double.compare(trip1.rating(), trip2.rating());

    public List<Trip> top10ExpensiveTrips(List<Trip> trips) {
        // coder ici
        return trips.stream()
                .sorted(byPrice.reversed())
                .limit(10)
                .toList();
    }

    public Optional<Trip> bestTrip(List<Trip> trips) {
        // coder ici
        return trips.stream()
                .max(byRating);
    }
}
