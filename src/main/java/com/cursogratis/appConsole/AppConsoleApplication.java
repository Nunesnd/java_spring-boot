package com.cursogratis.appConsole;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.*;

@SpringBootApplication
public class AppConsoleApplication {

	public static void main(String[] args) {

		/*
		João é um comerciante que vende laranjas e precisa fazer uma entrega de algumas caixas.
		Cada laranja ele vnede por 0,50 centavos, cada caixa tem 50 laranjas.

		Faça um programa que peça a quantidade de caixas para João e de o total a receber.
		*/

		System.out.println("###############");
		System.out.println("Seja bem vindo!");
		System.out.println("###############");

		Console cons = System.console();

		int quantCaixas = Integer.parseInt(cons.readLine("Informe a quantidade de caixas que será vendida: "));

		System.out.println("Você digitou "+ quantCaixas);

		double valorLaranja = 0.50;
		int quantidadeLaranjaPorCaixa = 50;

		int totalDeLarajas = quantCaixas * quantidadeLaranjaPorCaixa;

		double valorTotal = totalDeLarajas * valorLaranja;

		System.out.println("A venda resultou em uma totalde R$"+valorTotal );

		//SpringApplication.run(AppConsoleApplication.class, args);

	}

}
