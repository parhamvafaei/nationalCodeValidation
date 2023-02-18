package case_two;

import case_one.NationalCode;
import case_one.NationalCodeBusinessImpl;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Application {

    Scanner scanner = new Scanner(System.in);
    NationalCodeBusinessImpl business = new NationalCodeBusinessImpl();


    List<NationalCode> startApp() {

        List<NationalCode> result = new ArrayList<>();
        System.out.println("input your national code : ");
        String input = scanner.next();
        while (!(input.equals("exit"))) {
            NationalCode nationalCode = business.convertToNationalCode(input);
            business.validateNationalCode(nationalCode);
            result.add(nationalCode);
        }

//sort nationalCode
        result.sort(Comparator.comparingInt(s -> Integer.parseInt(s.getNationalCode())));


//print elements with details
        for (NationalCode index : result) {
            System.out.println(index);
        }

        return result;
    }
}
