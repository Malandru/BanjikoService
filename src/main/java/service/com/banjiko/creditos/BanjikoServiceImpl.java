package service.com.banjiko.creditos;

import com.banjiko.creditos.*;
import com.banjiko.creditos.TablaRequestDocument.TablaRequest;
import com.banjiko.creditos.TablaResponseDocument.TablaResponse;

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

        double capital = saldo / meses;;
        double interes;
        double total;

        System.out.println("Generando tabla de amortizacion");
        TablaResponseDocument responseDocument = TablaResponseDocument.Factory.newInstance();
        TablaResponse response = responseDocument.addNewTablaResponse();
        Table table = response.addNewTabla();

        for(int mes = 0; mes < meses; mes++)
        {
            interes = saldo * tasaInteres;
            total = capital + interes;
            saldo -= capital;
            //TODO: Guardar valores en la db
            table.addNoAmortizacion(mes);
            table.addCapital(capital);
            table.addInteres(interes);
            table.addTotal(total);
            table.addSaldo(saldo);

            print(capital, interes, total);
        }
        System.out.println("Respondiendo con la tabla generada");

        return responseDocument;
    }

    private void print(double capital, double interes, double total)
    {
        System.out.println("Capital: " + capital);
        System.out.println("Interes: " + interes);
        System.out.println("Total: " + total);
        System.out.println("----------------------\n");
    }
}
