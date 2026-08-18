

class AttendanceFees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter attendance percentage: ");
        int attendance = sc.nextInt();

        System.out.print("Enter exam fee paid (1 for Yes, 0 for No): ");
        int fee = sc.nextInt();

        if (attendance >= 75) {
            if (fee == 1) {
                System.out.println("Student is eligible for the exam.");
            } else {
                System.out.println("Please pay the exam fee.");
            }
        } else {
            System.out.println("Student is not eligible due to low attendance.");
        }
    }
}