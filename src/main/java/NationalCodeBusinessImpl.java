
/*
 HOW TO :

   This implementation of NationalCodeBusiness created just to work and test in java back-end
  and using console to show results !
*/
public class NationalCodeBusinessImpl implements NationalCodeBusiness {

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
