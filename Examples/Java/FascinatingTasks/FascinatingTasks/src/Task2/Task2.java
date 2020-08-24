package Task2;


import static Task2.Graph.calculateShortestPathFromSource;

public class Task2 {
    public static void main(String[] args) {




        City gdansk = new City("gdansk");
        City bydgoszcz = new City("bydgoszcz");
        City torun = new City("torun");
        City warszawa = new City("warszawa");


        gdansk.addDestination(bydgoszcz, 1);
        gdansk.addDestination(torun, 3);

        bydgoszcz.addDestination(gdansk, 1);
        bydgoszcz.addDestination(torun, 1);
        bydgoszcz.addDestination(warszawa, 4);

        torun.addDestination(gdansk, 3);
        torun.addDestination(bydgoszcz, 1);
        torun.addDestination(warszawa, 1);

        warszawa.addDestination(bydgoszcz, 4);
        warszawa.addDestination(torun, 1);



        Graph graph = new Graph();

        graph.addCity(gdansk);
        graph.addCity(bydgoszcz);
        graph.addCity(torun);
        graph.addCity(warszawa);



        graph = calculateShortestPathFromSource(graph, gdansk);
        System.out.println(warszawa);
        graph = calculateShortestPathFromSource(graph, bydgoszcz);
        System.out.println(warszawa);

    }

}