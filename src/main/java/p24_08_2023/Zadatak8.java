package p24_08_2023;

import java.util.ArrayList;

public class Zadatak8 {
    public static void main(String[] args) {
        ArrayList<String> inputs = new ArrayList<>();
        inputs.add("first name");
        inputs.add("last name");
        inputs.add("email");
        inputs.add("password");
        inputs.add("phone");
        inputs.add("address");

        ArrayList<Boolean> required = new ArrayList<>();
        required.add(true);
        required.add(true);
        required.add(true);
        required.add(true);
        required.add(false);
        required.add(false);



        for(int i = 0; i < inputs.size(); i++) {
            String star = "";
            if(required.get(i)) {
                star = "*";
            }
            System.out.println(inputs.get(i) + ": " + star + "____________________");
        }
    }
}
