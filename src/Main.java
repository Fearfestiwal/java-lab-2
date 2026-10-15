import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        BigDecimal productCost = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.05");
        BigDecimal singleUnitVat = productCost.multiply(vatRate);


        BigDecimal totalNetSales = BigDecimal.ZERO;
        BigDecimal totalVatAmount = BigDecimal.ZERO;

        for (int i = 0; i < 10000; i++) {
            totalNetSales = totalNetSales.add(productCost);
            totalVatAmount = totalVatAmount.add(singleUnitVat);
        }


        BigDecimal totalGrossValue = totalNetSales.add(totalVatAmount);


        System.out.println(singleUnitVat);
        System.out.println(totalNetSales);
        System.out.println(totalVatAmount);
        System.out.println(totalGrossValue);
    }
}