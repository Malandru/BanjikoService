package service.com.banjiko.creditos;

import com.banjiko.creditos.BanjikoServiceSkeleton;
import com.banjiko.creditos.TablaRequestDocument;
import com.banjiko.creditos.TablaRequestDocument.TablaRequest;
import com.banjiko.creditos.TablaResponseDocument;
import org.fintech.data.Credito;

public class BanjikoServiceImpl extends BanjikoServiceSkeleton
{
    @Override
    public TablaResponseDocument banjikoOperation(TablaRequestDocument tablaRequest)
    {
        System.out.println("Atendiendo peticion en Banjiko");
        TablaRequest request = tablaRequest.getTablaRequest();
        Credito credito = request.getPrestamo();

        System.out.println("Inicializando variables");
        int meses = credito.getPlazoMeses();
        float tasaInteres = credito.getInteres();
        double saldo = credito.getMonto();

        double capital;
        double interes;
        double iva;
        double total;

        System.out.println("Haciendo tabla de amortizacion");
        for(int mes = 0; mes < meses; mes++)
        {
            capital = saldo / meses;
            interes = saldo * tasaInteres;
            iva = interes * 0.16;
            total = capital + capital + interes + iva;
            saldo -= capital;
            //TODO: Guardar valores en la db
            //TODO: Asignar al response
            print(capital, interes, iva, total);
        }
        System.out.println("Retachando el error");
        return super.banjikoOperation(tablaRequest);
    }

    private void print(double capital, double interes, double iva, double total)
    {
        System.out.println("Capital: " + capital);
        System.out.println("Interes: " + interes);
        System.out.println("IVA: " + iva);
        System.out.println("Total: " + total);
        System.out.println("----------------------\n");
    }
}
