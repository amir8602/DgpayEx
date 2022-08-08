package matrix_mul;

public class ThreadSum extends Thread {
    private final Integer operandOne;
    private final Integer operandTwo;
    private Integer sum;

    public ThreadSum(Integer operandOne, Integer operandTwo) {
        this.operandOne = operandOne;
        this.operandTwo = operandTwo;
    }

    @Override
    public void run() {
        sum = operandOne + operandTwo;
    }

    public Integer getOperandOne() {
        return operandOne;
    }

    public Integer getOperandTwo() {
        return operandTwo;
    }

    public Integer getSum() {
        return sum;
    }
}
