package com.TiFire.Controller;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;

public class Funcionario_Vendedor {

	public void FunVen ( ) throws FindFailed {
		
		
		Screen executa = new Screen();
		executa.click("//tifiresuporte7/Imagens/Sigepe/Cadastros/Cadastros.png");
		executa.click("//tifiresuporte7/Imagens/Sigepe/Cadastros/Funcionario_Vendedor/Funcionario_Vendedor.png");
		executa.wait("//tifiresuporte7/Imagens/Sigepe/TelaPad1.png", 10);
		executa.type(Key.INSERT, KeyModifier.CTRL);
		executa.paste("Alexandre Talarico");
		executa.wait("//tifiresuporte7/Imagens/Sigepe/TelaPad1.png", 10);
		executa.type(Key.ENTER, KeyModifier.CTRL + KeyModifier.SHIFT);
		executa.type(Key.F4, KeyModifier.ALT);
		
	
	
	}
	
}
