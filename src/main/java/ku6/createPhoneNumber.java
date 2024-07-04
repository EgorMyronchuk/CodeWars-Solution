package ku6;

public class createPhoneNumber {
    public static String createPhoneNumber1(int[] numbers) {
        return String.format("(%s%s%s) %s%s%s-%s%s%s%s", numbers[0],numbers[1],numbers[2],numbers[3],
                 numbers[4],numbers[5],numbers[6],numbers[7],numbers[8] , numbers[9]  );
    }


    public static void main(String[] args) {
        System.out.println(createPhoneNumber1(new int[]{1,2,3,4,5,6,7,8,9,0}));
    }

}
