package service.com.banjiko.creditos;

import com.banjiko.creditos.Credito;
import org.springframework.jdbc.core.JdbcTemplate;

public class AmortizacionDao
{
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(AmortizacionDto dto)
    {
        String sentence = "INSERT INTO amortizacion VALUES('', %s,'%s', %s, %s, %s, %s)";
        String insert = String.format(sentence, dto.getNoAmortizacion(),
        dto.getNoCuenta(), dto.getCapital(), dto.getInteres(),
        dto.getTotal(), dto.getSaldo());
        System.out.println(insert);
        jdbcTemplate.execute(insert);
    }

    public void add(Credito credito)
    {
        String sentence = "INSERT INTO prestamo VALUES('','%s', %s, %s)";
        String insert = String.format(sentence, credito.getCuenta(),
        credito.getMonto(), credito.getPlazoMeses());
        System.out.println(insert);
        jdbcTemplate.execute(insert);
    }
}
