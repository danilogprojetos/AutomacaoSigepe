package com.TiFire.Controller;


import java.awt.event.KeyAdapter;
import java.sql.SQLException;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.IRobot.KeyMode;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;



public class CadastroCliente {

	public void CadCli() throws FindFailed, ClassNotFoundException, SQLException {

		Screen executa = new Screen();

			
		executa.click("//tifiresuporte7/Imagens/Sigepe/Cadastros/Cadastros.png");
		executa.click("//tifiresuporte7/Imagens/Sigepe/Cadastros/Cliente/Cliente.png");
		executa.wait("//tifiresuporte7/Imagens/Sigepe/TelaPad1.png", 10);
		executa.type(Key.INSERT, KeyModifier.CTRL);
		executa.paste("Danilo Augusto");
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type("87030140");
		executa.type(Key.ENTER, 10);
		executa.wait("//tifiresuporte7/Imagens/Sigepe/TelaPad2.png", 10);
		executa.type(Key.ENTER);
		executa.type("Avenida Tiradentes");
		executa.type(Key.ENTER);
		executa.type("441");
		executa.type(Key.ENTER);
		executa.paste("Proximo a Sanepar");
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type("3023-7230");
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.paste("contato@tifire.com");
		executa.type(Key.ENTER);
		executa.type("09805631940");
		executa.type(Key.ENTER);
		executa.paste("110588704");
		executa.type(Key.ENTER, KeyModifier.CTRL + KeyModifier.SHIFT);
		executa.type(Key.F4, KeyModifier.ALT);

		}

	}

	
	
