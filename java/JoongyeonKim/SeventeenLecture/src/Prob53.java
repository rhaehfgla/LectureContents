import java.math.BigInteger;

class 이건희 {
    BigInteger money;
    String company;

    public 이건희(BigInteger money, String company) {
        this.money = money;
        this.company = company;
    }

    @Override
    public String toString() {
        return "이건희{" +
                "money=" + money +
                ", company='" + company + '\'' +
                '}';
    }
}

class 이재용 extends 이건희 {
    String recentInvest;

    public 이재용(BigInteger money, String company, String recentInvest) {
        super(money, company);
        this.recentInvest = recentInvest;
    }

    @Override
    public String toString() {
        return "이재용{" +
                "money=" + money +
                ", company='" + company + '\'' +
                ", recentInvest='" + recentInvest + '\'' +
                '}';
    }
}

public class Prob53 {
    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger("100000000000000");
        이건희 samsung = new 이건희(bigNum, "삼성그룹");

        이재용 newSamsung = new 이재용(bigNum.multiply(BigInteger.TEN),
                            // BigInteger.TEN은 BigInteger 클래스에서 제공하는 전역에서 접근 가능한 상수다
                "삼성전자", "바이오 사업");

        System.out.println(samsung);
        System.out.println(newSamsung);
    }
}