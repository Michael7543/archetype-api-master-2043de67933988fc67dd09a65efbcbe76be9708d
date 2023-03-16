package ec.edu.epn.rest.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
	
	public static Date cambioFormatoFecha(Date date, String format){
		Date fecha = null ;
		SimpleDateFormat dt = new SimpleDateFormat(format);
	    try {
			fecha = dt.parse(String.valueOf(date));
	    } catch (ParseException e) {
			e.printStackTrace();
		}
	    return fecha;
	}

	public static Date cambioFormatoFechaFormat(Date date, String format){
		Date fecha = null ;
		SimpleDateFormat dt = new SimpleDateFormat(format);
		fecha = cambioFormatoFechaTexto(dt.format(date),format);
		return fecha;
	}
	
	public static Date cambioFormatoFechaTexto(String date, String format){
		Date fecha = null ;
		SimpleDateFormat dt = new SimpleDateFormat(format);
	    try {
			fecha = dt.parse(date);
	    } catch (ParseException e) {
			e.printStackTrace();
		}
	    return fecha;
	}
	
	public static String  generarNumeroIdentididad(Long codigoEstudiante,Long codigoSede) {
		String numeroIdentidad="PEN_"+String.format("%05d", codigoSede)+"_"+String.format("%06d", codigoEstudiante);
		return numeroIdentidad;
	}

}

