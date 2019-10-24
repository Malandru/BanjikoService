package service.com.banjiko.creditos;

import com.banjiko.creditos.Table;

public class AmortizacionDto
{
    private long noCuenta;
    private int noAmortizacion;
    private float tasaInteres;

    private double capital;
    private double interes;
    private double total;
    private double saldo;

    public AmortizacionDto(double saldo, int meses, float tasaInteres)
    {
        noAmortizacion = 0;
        capital = saldo / meses;
        this.saldo = saldo;
        this.tasaInteres = tasaInteres;
    }

    public void setNoCuenta(long noCuenta)
    {
        this.noCuenta = noCuenta;
    }

    public void updateAmortizacion()
    {
        noAmortizacion++;
        interes = saldo * tasaInteres;
        total = capital + interes;
        saldo -= capital;
    }

    public void putInto(Table table)
    {
        table.addNoAmortizacion(noAmortizacion);
        table.addCapital(capital);
        table.addInteres(interes);
        table.addTotal(total);
        table.addSaldo(saldo);
    }

    public void print()
    {
        System.out.println("Capital: " + capital);
        System.out.println("Interes: " + interes);
        System.out.println("Total: " + total);
        System.out.println("----------------------\n");
    }
}
