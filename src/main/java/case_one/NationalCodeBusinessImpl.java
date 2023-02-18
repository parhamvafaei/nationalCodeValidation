package case_one;

/*

  implement case_one.NationalCodeBusiness class and application logic
*/
public class NationalCodeBusinessImpl implements NationalCodeBusiness {

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
                condition = true;

        }
        if (condition == false)
            throw new NationalCodeValidationException("the nationalCode numbers are same");


        if (nationalCode.length() != 10)
            throw new NationalCodeValidationException("size of the nationalCode is wrong");

        condition=false;

        return NationalCode.builder().nationalCode(nationalCode.toString()).build();
    }


    //check nationalCode validation just based on algorithm
    @Override
    public void validateNationalCode(NationalCode nationalCode) {
        int position = 10 ;
        int sum =0;


        for (int i = 0; i < 9; i++) {
           sum+= (int) nationalCode.getNationalCode().charAt(i) * position ;
           position--;
        }
      float   result =sum/ 11 ;
        if (result <2 ) {
            if (result == (int) nationalCode.getNationalCode().charAt(9))
                nationalCode.setIsValid(true);

        }else {
            if ( (int) nationalCode.getNationalCode().charAt(9)== (11 - result))
                nationalCode.setIsValid(true);
        }
        }



    @Override
    public String getStateCode(NationalCode nationalCode) {
        return nationalCode.getNationalCode().substring(0,2);
    }

    @Override
    public String getPersonUniqueCode(NationalCode nationalCode) {
        return nationalCode.getNationalCode().substring(2,8);
    }
}
