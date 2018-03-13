package Uppgift5_Calculator;

public class Calculator {

    
    
    protected boolean operatorSuported(String operator){
        if(operator.equalsIgnoreCase("+") || operator.equalsIgnoreCase("-") ||
                operator.equalsIgnoreCase("*") || operator.equalsIgnoreCase("/")){
            return true;
        }
       return false;
    }
public double calculate(double a, double b, String operator)throws OperatorNotSupoerted{
    if (!operatorSuported(operator)) {
        throw new OperatorNotSupoerted("Felaktig operator");
    }
    if (operator.equalsIgnoreCase("+")) return a+b;
        else if (operator.equalsIgnoreCase("-")) return a-b;
        else if (operator.equalsIgnoreCase("*")) return a*b;
        else return a/b;
    }
    
}     
    
  