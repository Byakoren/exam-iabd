package exo;

import models.Trip;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class Partie2 {
    Function<Trip, String> tripCity = trip -> trip.city();
    Function<Trip, String> tripDriver = trip -> trip.driverId();
    ToDoubleFunction<Trip> tripPrice = trip -> trip.price();
    ToDoubleFunction<Trip> tripDuration = trip -> trip.durationMin();

    public Map<String, Long> countByCity(List<Trip> trips) {
        // coder ici
        return trips.stream()
                .collect(Collectors.groupingBy(tripCity, Collectors.counting()));
    }

    public Map<String, Double> revenueByDriver(List<Trip> trips) {
        // revenu par chauffeur
        // coder ici
        return trips.stream()
                .collect(Collectors.groupingBy(tripDriver, Collectors.summingDouble(tripPrice)));
    }

    public Map<String, Double> avgDurationByCity(List<Trip> trips) {
        // coder ici
        // durée moyenne par ville
        return trips.stream()
                .collect(Collectors.groupingBy(tripCity, Collectors.averagingDouble(tripDuration)));
    }
}
