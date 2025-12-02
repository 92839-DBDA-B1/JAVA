import java.util.*;

class Project {
    private int id;
    private String title;
    private int teamSize;
    private double projectCost;
    private String technology;

    public Project(int id, String title, int teamSize, double projectCost, String technology) {
        this.id = id;
        this.title = title;
        this.teamSize = teamSize;
        this.projectCost = projectCost;
        this.technology = technology;
    }

    public int getId() { return id; }
    public int getTeamSize() { return teamSize; }
    public double getProjectCost() { return projectCost; }

    @Override
    public String toString() {
        return "ID: " + id + ", Title: " + title + ", TeamSize: " + teamSize +
               ", Cost: " + projectCost + ", Tech: " + technology;
    }

    @Override
    public int hashCode() { return id; }

    @Override
    public boolean equals(Object obj) {
        return this.id == ((Project)obj).id;
    }
}

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Project> set = new HashSet<>();
        ArrayList<Project> list = new ArrayList<>();

        while (true) {
            System.out.println("\n----- Project Menu -----");
            System.out.println("1. Add Dummy Projects");
            System.out.println("2. Add Project from User");
            System.out.println("3. Display All Projects");
            System.out.println("4. Delete Project by ID");
            System.out.println("5. Copy to ArrayList");
            System.out.println("6. Display Projects from List");
            System.out.println("7. Sort Projects by Cost");
            System.out.println("8. Find Max Team Size Project");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    set.add(new Project(1, "Train Reservation", 5, 5000000, "Java"));
                    set.add(new Project(2, "Airline Reservation", 3, 6000000, ".NET"));
                    set.add(new Project(4, "Online Grocery", 6, 3000000, "Java"));
                    set.add(new Project(5, "Online Book Shop", 2, 3000000, ".NET"));
                    set.add(new Project(3, "Online Jewelry Shop", 4, 4000000, "Java"));
                    set.add(new Project(6, "Bus Reservation", 3, 3500000, "JS"));
                    System.out.println("Dummy Data Added!");
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Team Size: ");
                    int team = sc.nextInt();
                    System.out.print("Enter Cost: ");
                    double cost = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Technology: ");
                    String tech = sc.nextLine();
                    set.add(new Project(id, title, team, cost, tech));
                    break;

                case 3:
                    for (Project p : set) {
                        System.out.println(p);
                    }
                    break;

                case 4:
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    set.removeIf(p -> p.getId() == delId);
                    break;

                case 5:
                    list.clear();
                    list.addAll(set);
                    System.out.println("Copied to List!");
                    break;

                case 6:
                    list.forEach(System.out::println);
                    break;

                case 7:
                    list.sort(Comparator.comparingDouble(Project::getProjectCost));
                    System.out.println("Sorted by Cost!");
                    break;

                case 8:
                    Project maxProj = Collections.max(set, Comparator.comparingInt(Project::getTeamSize));
                    System.out.println("Max Team Size Project: " + maxProj);
                    break;

                case 9:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
            }
        }
    }
}
