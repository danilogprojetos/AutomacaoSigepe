package com.TiFire.Controller;

import java.sql.SQLException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;

public class CadastroFornecedor {
	
		
	public void CadFor() throws FindFailed, ClassNotFoundException, SQLException {

		Screen executa = new Screen();

			
		executa.click("//tifiresuporte7/Imagens/Sigepe/Cadastros/Cadastros.png");
		executa.click("//tifiresuporte7/Imagens/Sigepe/Cadastros/Fornecedor/Fornecedor.png");
		executa.wait("//tifiresuporte7/Imagens/Sigepe/TelaPad1.png", 10);
		executa.type(Key.INSERT, KeyModifier.CTRL);
		executa.paste("Fornecedor Teste");
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type("Avenida Brasil, 4125");
		executa.type(Key.ENTER);
		executa.paste("Centro");
		executa.type(Key.ENTER);
		executa.type(Key.F3);
		executa.paste("Maringa");
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.type(Key.ENTER);
		executa.wait("//tifiresuporte7/Imagens/Sigepe/TelaPad2.png", 100);
		executa.type(Key.ENTER);		
		executa.paste("87140-000");
		executa.type(Key.ENTER);
		executa.paste("(44) 3023 8700");
		executa.type(Key.ENTER);
		executa.type("(44) 3023 8701");
		executa.type(Key.ENTER);
		executa.paste("09805631940");
		executa.type(Key.ENTER);
		executa.paste("ISENTO");executa.type(Key.ENTER, KeyModifier.CTRL + KeyModifier.SHIFT);
		executa.type(Key.F4, KeyModifier.ALT);

		}

	}

	
	



