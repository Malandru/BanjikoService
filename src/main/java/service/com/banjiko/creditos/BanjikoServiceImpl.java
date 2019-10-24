package service.com.banjiko.creditos;

import com.banjiko.creditos.*;
import com.banjiko.creditos.TablaRequestDocument.TablaRequest;
import com.banjiko.creditos.TablaResponseDocument.TablaResponse;

public class BanjikoServiceImpl extends BanjikoServiceSkeleton
{
    private AmortizacionDao amortizacionDao;

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
        long noCuenta = credito.getCuenta().getNoCuenta();

        AmortizacionDto amortizacionDto = new AmortizacionDto(saldo, meses, tasaInteres);
        amortizacionDto.setNoCuenta(noCuenta);
        amortizacionDao.add(credito);

        System.out.println("Generando tabla de amortizacion");
        TablaResponseDocument responseDocument = TablaResponseDocument.Factory.newInstance();
        TablaResponse response = responseDocument.addNewTablaResponse();
        Table table = response.addNewTabla();

        for(int mes = 0; mes < meses; mes++)
        {
            amortizacionDto.updateAmortizacion();
            amortizacionDto.putInto(table);
            amortizacionDto.print();

            amortizacionDao.add(amortizacionDto);
        }

        System.out.println("Respondiendo con la tabla generada");
        return responseDocument;
    }

    public void setAmortizacionDao(AmortizacionDao amortizacionDao)
    {
        this.amortizacionDao = amortizacionDao;
    }
}
