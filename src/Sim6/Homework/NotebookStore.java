package Sim6.Homework;
import java.util.*;

public class NotebookStore {
    private final List<Notebook> notebooks;

    public NotebookStore(){ notebooks = new ArrayList<>();}

    public void addNotebook(Notebook notebook) {
        notebooks.add(notebook);
    }

    public void filterNotebooks(Map<String, Object> filters) {
        for (Notebook notebook : notebooks) {
            boolean matchesFilter = true;

            for (Map.Entry<String, Object> entry : filters.entrySet()) {
                String field = entry.getKey();
                Object value = entry.getValue();

                switch (field) {
                    case "brand":
                        matchesFilter &= notebook.getBrand().equals(value);
                        break;
                    case "model":
                        matchesFilter &= notebook.getModel().equals(value);
                        break;
                    case "price":
                        matchesFilter &= notebook.getPrice() >= (double) value;
                        break;
                    case "screen_size":
                        matchesFilter &= notebook.getScreenSize() >= (double) value;
                        break;
                    case "ram":
                        matchesFilter &= notebook.getRam() >= (int) value;
                        break;
                    case "harddisk":
                        matchesFilter &= notebook.getHarddisk() >= (int) value;
                        break;
                    case "processor":
                        matchesFilter &= notebook.getProcessor().equals(value);
                        break;
                    case "videocard":
                        matchesFilter &= notebook.getVideocardCard().equals(value);
                        break;
                    case "OS":
                        matchesFilter &= notebook.getOS_name().equals(value);
                    default:
                        System.out.println("Unknown filter: " + field);
                        break;
                }
            }

            if (matchesFilter) {
                System.out.println(notebook.getBrand() + " " + notebook.getModel() + " - " + notebook.getPrice() + " RUB");
            }
        }
    }

    public static void main(String[] args) {
        NotebookStore store = new NotebookStore();

        Notebook notebook1 = new Notebook("Apple", "MacBook Pro M1", 120000.00, 13.3, 8, 512, "m1", "m1", "MacOS");
        Notebook notebook2 = new Notebook("Dell", "XPS 15", 70199.99, 15.6, 8, 256, "Intel Core i3", "Nvidia Iris Graphics", "Windows");
        Notebook notebook3 = new Notebook("HP", "Pavilion x360", 80299.99, 16.7, 16, 512, "AMD Ryzen 7500", "AMD Radeon Graphics", "Linux");

        store.addNotebook(notebook1);
        store.addNotebook(notebook2);
        store.addNotebook(notebook3);

        Map<String, Object> filters = new HashMap<>();
//        filters.put("price", 80000.0);
//        filters.put("ram", 16);
        filters.put("harddisk", 512);

        System.out.println("Notebooks searching filter:");
        store.filterNotebooks(filters);
    }
}
