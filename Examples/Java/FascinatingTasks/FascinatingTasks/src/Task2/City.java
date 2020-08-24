package Task2;
import java.util.*;

/**
 * The type City it's Node of our graph
 */
public class City {

    private String name;
    /**
     *a list of nodes that describes
     * the shortest path calculated
     * from the starting node.
     */
    private List<City> shortestPath = new LinkedList<>();
    /**
     * Default
     */
    private Integer distance =200000;
    /**
     * used to link immediate neighbors with edge length
     */
    Map<City, Integer> adjacentCities= new HashMap<>();

    /**
     * Add destination.
     *
     * @param destination the destination
     * @param distance    the distance
     */
    public void addDestination(City destination, int distance) {
        adjacentCities.put(destination, distance);
    }

    /**
     * Instantiates a new City.
     *
     * @param name the name
     */
    public City(String name) {
        this.name = name;
    }

    /**
     * Gets shortest path.
     *
     * @return the shortest path
     */
    public List<City> getShortestPath() {
        return shortestPath;
    }

    /**
     * Sets shortest path.
     *
     * @param shortestPath the shortest path
     * @return the shortest path
     */
    public City setShortestPath(List<City> shortestPath) {
        this.shortestPath = shortestPath;
        return this;
    }

    /**
     * Gets distance.
     *
     * @return the distance
     */
    public Integer getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return ""+distance;
    }

    /**
     * Sets distance.
     *
     * @param distance the distance
     * @return the distance
     */
    public City setDistance(Integer distance) {
        this.distance = distance;
        return this;
    }

    /**
     * Gets adjacent nodes.
     *
     * @return the adjacent nodes
     */
    public Map<City, Integer> getAdjacentCities() {
        return adjacentCities;
    }


    }

