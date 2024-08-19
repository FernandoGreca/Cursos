package model.exeption;

public class WithdrawLimitError extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public WithdrawLimitError(String msg){
        super(msg);
    }
}
