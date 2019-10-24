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
        //TODO: Guardar valores en la db
    }

    public void add(Credito credito)
    {
        //TODO: Guardar valores en la db
    }
}
