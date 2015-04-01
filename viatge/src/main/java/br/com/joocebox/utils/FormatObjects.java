package br.com.joocebox.utils;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class FormatObjects {
	
    public static Number formatStringPriceToNumberObject(String price, RedirectAttributes redirectAttributes){
    	Locale locBrazil = new Locale("pt", "BR");
    	NumberFormat nf = NumberFormat.getInstance(locBrazil);
    	Number value = 0;
    	
    	try {
			value = nf.parse(price);
		} catch (ParseException e) {
			redirectAttributes.addFlashAttribute("errUpdateDestinationRequested", "Ocorreu um problema na corversão do valor R$" + price + "tente novamnete!");
			e.printStackTrace();
		}
		return value;
    }
    
    public static Date formatStringDateToDateObject(String date, RedirectAttributes redirectAttributes){
		Locale locBrazil = new Locale("pt", "BR");
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locBrazil);
		Date parseDate = null;

		try {
			parseDate = df.parse(date);

		} catch (ParseException e) {
			redirectAttributes.addFlashAttribute("errUpdateDestinationRequested", "Parece que a data fornecida não coincide com o padrão dia/mês/ano");
			e.printStackTrace();
		}
		return parseDate;
    }

}
