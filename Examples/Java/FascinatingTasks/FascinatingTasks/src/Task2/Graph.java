package Task2;
import java.util.*;

public class Graph {

    private Set<City> cities = new HashSet<>();

    /**
     * Add city.
     *
     * @param nodeA the node a
     */
    public void addCity(City nodeA) {
        cities.add(nodeA);
    }


    /**
     * Calculate shortest path from source graph.
     *
     * @param graph  the graph
     * @param source the source
     * @return the graph
     */
    public static Graph calculateShortestPathFromSource(Graph graph, City source) {
        source.setDistance(0);

        Set<City> settledCities = new HashSet<>();
        Set<City> unsettledCities = new HashSet<>();

        unsettledCities.add(source);

        while (unsettledCities.size() != 0) {
            City currentCity = getLowestDistanceCity(unsettledCities);
            unsettledCities.remove(currentCity);

            for (Map.Entry< City, Integer> adjacencyPair:
                    currentCity .getAdjacentCities().entrySet()) {
                City adjacentCity = adjacencyPair.getKey();
                Integer edgeWeight = adjacencyPair.getValue();

                if (!settledCities.contains(adjacentCity)) {
                    calculateMinimumDistance(adjacentCity, edgeWeight, currentCity );
                    unsettledCities.add(adjacentCity);
                }
            }
            settledCities.add(currentCity );
        }
        return graph;
    }

    /**
     * compares the actual distance with the newly
     * calculated one by following the recently explored path
     * @param evaluationCity
     * @param edgeWeigh
     * @param sourceCity
     */
    private static void calculateMinimumDistance(City evaluationCity, Integer edgeWeigh, City sourceCity) {
        Integer sourceDistance = sourceCity.getDistance();
        if (sourceDistance + edgeWeigh < evaluationCity.getDistance()) {
            evaluationCity.setDistance(sourceDistance + edgeWeigh);
            LinkedList<City> shortestPath = new LinkedList<>(sourceCity.getShortestPath());
            shortestPath.add(sourceCity);
            evaluationCity.setShortestPath(shortestPath);
        }
    }
    @Override
    public String toString() {
        return "Graph{" +
                "cities=" + cities +
                '}';
    }
    /**
     *
     * @param unsettledCities
     * @return  the node with the smallest
     * distance from the given number of unsettled nodes
     */
    private static City getLowestDistanceCity(Set < City > unsettledCities) {
        City lowestDistanceCity= null;
        int lowestDistance = 200000;
        for (City city: unsettledCities) {
            int cityDistance = city.getDistance();
            if (cityDistance < lowestDistance) {
                lowestDistance = cityDistance;
                lowestDistanceCity = city;
            }
        }
        return lowestDistanceCity;
    }


}