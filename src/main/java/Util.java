public class Util {
    boolean condition;



//To get directly code from user and validate it
//To comply that every method should do one job and readability take this validation apart
    public NationalCode convertToNationalCode(String string) {



        StringBuilder nationalCode = new StringBuilder();
        nationalCode.append(string.replaceAll("\\s", ""));

        if (nationalCode.length() == 8)
            nationalCode.insert(0, "00");

        if (nationalCode.length() == 9)
            nationalCode.insert(0, "0");

        for (char index : nationalCode.toString().toCharArray()) {
            char first = nationalCode.toString().charAt(0);
            if (index != first)
                this.condition = true;

            if (condition == false)
                throw new NationalCodeValidationException("the nationalCode numbers are same");
        }

        if (nationalCode.length() != 10)
            throw new NationalCodeValidationException("size of the nationalCode is wrong");


        return NationalCode.builder().nationalCode(nationalCode.toString()).build();
    }
}
