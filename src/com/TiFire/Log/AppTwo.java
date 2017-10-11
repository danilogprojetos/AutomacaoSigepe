package com.TiFire.Log;

import org.apache.log4j.Logger;

public class AppTwo {

	private static final Logger log = Logger.getLogger(AppTwo.class);

	public static void exemploApp() {
		
		String nameClass =  AppTwo.class.getSimpleName();
		
		
		log.debug(String.format("%s - Mensagem de debug.", nameClass));
		
		log.debug(String.format("%s - Mensagem de info.", nameClass));
		
		log.warn(String.format("%s - Mensagem de warning.", nameClass));
		
		log.error(String.format("%s - Mensagem de erro.", nameClass));
			
		
		
		
	}
	
	
}
