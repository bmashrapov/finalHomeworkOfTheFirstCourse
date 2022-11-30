public class StaffService {
    public static Staff[] staff = new Staff[10];

    public static void printAll(Staff[] staff) {

        for (Staff i : staff) {
            if (i != null) {
                System.out.println(i);
            }
        }
    }

    private static double findSum(Staff[] staff) {
        double sum = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null) {
                sum += staff[i].getSalary();
            }
        }
        return sum;
    }

    public static void findSumPrinting(Staff[] staff) {
        System.out.println("The amount of salary: " + findSum(staff));
    }

    private static double findAverageSalary(Staff[] staff) {
        double averageSalary = 0;
        int elementCount = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null) {
                elementCount++;
            }
        }
        averageSalary = StaffService.findSum(staff) / elementCount;
        return averageSalary;
    }

    public static void findAverageSalaryPrinting(Staff[] staff) {
        System.out.println("Average salary: " + findAverageSalary(staff));
    }

    public static void findMaxSalary(Staff[] staff) {
        double maxSalary = staff[0].getSalary();
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null) {
                if (staff[i].getSalary() > maxSalary) {
                    maxSalary = staff[i].getSalary();
                }
            }
        }
        for (Staff value : staff) {
            if (value != null) {
                if (maxSalary == value.getSalary())
                    System.out.println(value.getFirstName() + " gets the maximum salary of " + maxSalary);
            }
        }
    }

    public static void findMinSalary(Staff[] staff) {
        double minSalary = staff[0].getSalary();
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null) {
                if (staff[i].getSalary() < minSalary) {
                    minSalary = staff[i].getSalary();
                }
            }
        }
        for (Staff value : staff) {
            if (value != null) {
                if (minSalary == value.getSalary())
                    System.out.println(value.getFirstName() + " gets the minimum salary of " + minSalary);
            }
        }
    }

    public static void printAllFullName(Staff[] staff) {
        StringBuilder sb = new StringBuilder();
        sb.append("Full name of employees: " + "\n");
        for (Staff i : staff) {
            if (i != null) {
                String f = i.getFirstName() + " " + i.getMiddleName();
                sb.append(f).append(" \n");
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}





