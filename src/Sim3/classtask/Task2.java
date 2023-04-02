package Sim3.classtask;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void planetslist() {
        List<String> planets = new ArrayList<>();
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Pluto");
        planets.add("Venus");
        planets.add("Mars");
        planets.add("Earth");
        StringBuilder sb = new StringBuilder();
        List<String> res = new ArrayList<>();
        for (int i = 0; i < planets.size(); i++) {
            if (!res.contains(planets.get(i))) {
                res.add(planets.get(i));
                int count = 0;
                for (String planet : planets) {
                    if (planet.equals(planets.get(i))) count++;
                }
                sb.append(planets.get(i)).append(":").append(count).append("\n");
            }
        }
        System.out.println(sb);
    }
}
