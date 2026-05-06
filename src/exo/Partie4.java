package exo;

import models.Trip;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class Partie4 {
    ToDoubleFunction<Trip> tripPrice = trip -> trip.price();
    Function<Trip, String> tripCity = trip -> trip.city();
    Predicate<Trip> premiumTrip = trip -> trip.price() > 30 && trip.rating() > 4;

    public double totalRevenueSequential(List<Trip> trips) {
        // stream()
        return trips.stream()
                .mapToDouble(tripPrice)
                .sum();
    }

    public double totalRevenueParallel(List<Trip> trips) {
        // parallelStream()
        return trips.parallelStream()
                .mapToDouble(tripPrice)
                .sum();
    }

    public Map<String, Long> countByCityParallel(List<Trip> trips) {
        // coder ici
        return trips.parallelStream()
                .collect(Collectors.groupingBy(tripCity, Collectors.counting()));
    }

    public List<Trip> premiumTripsParallel(List<Trip> trips) {
        // prix > 30 et rating > 4
        return trips.parallelStream()
                .filter(premiumTrip)
                .toList();
    }
}
