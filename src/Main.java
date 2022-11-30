public class Main {
    public static void main(String[] args) {
        StaffService staffService = new StaffService();
        Staff[] staff = new Staff[10];
        staff[0] = new Staff("Patrick", "Crossman", 1, 4800);
        staff[1] = new Staff("David", "Bush", 1, 4700);
        staff[2] = new Staff("Jacob", "Carter", 2, 4600);
        staff[3] = new Staff("Oscar", "Evans", 2, 4500);
        staff[4] = new Staff("Oliver", "Fisher", 3, 4800);
        staff[5] = new Staff("Elizabeth", "Day", 3, 4900);
        staff[6] = new Staff("Lillian", "Flame", 4, 5000);
        staff[7] = new Staff("Lucy", "Leman", 4, 5100);
        staff[8] = new Staff("Clara", "Osborne", 5, 5200);
        staff[9] = new Staff("Lola", "Turner", 5, 5300);
        StaffService.printAll(staff);
        StaffService.findSumPrinting(staff);
        StaffService.findAverageSalaryPrinting(staff);
        StaffService.findMaxSalary(staff);
        StaffService.findMinSalary(staff);
        StaffService.printAllFullName(staff);
    }
}