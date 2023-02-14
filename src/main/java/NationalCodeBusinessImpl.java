
/*

  implement NationalCodeBusiness class and application logic
*/
public class NationalCodeBusinessImpl implements NationalCodeBusiness {




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
