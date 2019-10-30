enum Callendar{
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
}
public class Month {
    private int monthNumber;
    
    public Month(){
        this.monthNumber = 1;
    }
    public Month(int monthNum){
        if(monthNum > 0 && monthNum < 13){
            this.monthNumber = monthNum;
        }else{
            this.monthNumber = 1;
        }
    }
    public Month(String monthName) throws IllegalArgumentException{
        try{
           Callendar month = Callendar.valueOf(monthName.toUpperCase());
           this.monthNumber = month.ordinal() + 1; 
        }catch(IllegalArgumentException e){
            System.out.println("Invalid month name");
        }      
    }
    
    public void setMonthNumber(int monthNum){
        if(monthNum > 0 && monthNum < 13){
            this.monthNumber = monthNum;
        }else{
            this.monthNumber = 1;
        }
    }
    public int getMonthNumber(){
        return this.monthNumber;
    }
    public Callendar getMonthName(){
        return Callendar.values()[this.monthNumber - 1];
        
    }
    public boolean checkIfEqual(Month monthToCheck){
        if(this.monthNumber == monthToCheck.getMonthNumber()){
            return true;
        }else{
            return false;
        } 
    }
    public boolean greatherThan(Month monthToCheck){
        if(this.monthNumber > monthToCheck.getMonthNumber()){
            return true;
        }else{
            return false;
        }
    }
    public boolean lessThan(Month monthToCheck){
        if(this.monthNumber < monthToCheck.getMonthNumber()){
            return true;
        }else{
            return false;
        }
    }
}
