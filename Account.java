package conta_bancaria;

public class Account {
  private   Integer number;
   private Double balance;
  private   Double withdraw_limit;
   private String holder;

    public Account(Integer number, Double balance, Double withdraw_limit, String holder) {
        this.number = number;
        this.balance = balance;
        this.withdraw_limit = withdraw_limit;
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getBalance() {
        return balance;
    }
    public Double getWithdraw_limit() {
        return withdraw_limit;
    }

    public void setWithdraw_limit(Double withdraw_limit) {
        this.withdraw_limit = withdraw_limit;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }
    public void deposit(double value){
        balance +=value;

    }
    public void withdraw(double value){
      if (value > withdraw_limit) {
         throw new ModeAccount("Valor digitado é maior que o limite de saque");
     } else if (value > getBalance()) {
         throw new ModeAccount("Valor em conta é menor que o valor que deseja ser sacado");
     }
       else if (value <= withdraw_limit) {
          balance -= value;
      }
  }
}
