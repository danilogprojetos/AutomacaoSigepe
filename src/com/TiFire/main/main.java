package com.TiFire.main;

import java.sql.SQLException;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Screen;

import com.TiFire.Controller.CadastroCliente;
import com.TiFire.Controller.CadastroFornecedor;


public class main {

	public static void main(String[] args) throws FindFailed, ClassNotFoundException, SQLException {
		
		Screen executa = new Screen();
	
		App.open("//DESKTOP-ASD4K9J/homologacao/Sigepe/Sigepe/sigepea.exe");
		executa.wait("//tifiresuporte7/Imagens/Sigepe/AbrirSigepea/TelaLoginSigepe.png", 10);
		executa.click("//tifiresuporte7/Imagens/Sigepe/AbrirSigepea/TelaLoginSigepe.png");
		executa.type("f", 5);
		executa.type(Key.ENTER);
		executa.paste("f");
		executa.type(Key.ENTER);
		executa.wait("//tifiresuporte7/Imagens/Sigepe/AbrirSigepea/Abertura.png", 20);
		
		//CadastroCliente c = new CadastroCliente(); 
		//c.CadCli();
		executa.wait("//tifiresuporte7/Imagens/Sigepe/TelaPad3.png",10);
		CadastroFornecedor f = new CadastroFornecedor();
		f.CadFor();
	
}

}

