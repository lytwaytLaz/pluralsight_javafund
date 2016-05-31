/**
 * What does it do?
 *
 * @param
 * @author Jim Wilson
 * @return
 */
public class MathEquation {
    public double leftVal;
    public double rightVal;
    public double result;
    public char opCode;

    public void execute() {
        switch(opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                result = rightVal != 0.0d ? leftVal / rightVal : 0.0d;
                break;
            //            if(val2 != 0.0d)
            //                result = val1 / val2;
            //            else
            //                result = 0.0d;
            case 'm':
                result = leftVal * rightVal;
                break;
            default:
                System.out.println("Error - invalid opCode");
                result = 0.0d;
                break;
        }

    }
}
