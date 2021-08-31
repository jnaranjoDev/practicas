package com.practica.ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) {
		//definir fichero
		FileWriter fw = null;
		BufferedWriter bw = null;
		File file = new File("file.txt");
		
		try {
			file.createNewFile();
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write("Hola Mundo");
			bw.newLine();
			bw.write("Hola Mndo2");
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(bw != null) bw.close();
				if(fw != null) fw.close();
			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}

		try {
			
			FileReader input = new FileReader(file);
			BufferedReader bufInput = new BufferedReader(input);
			try {
				FileWriter output = new FileWriter(new File("file2.txt"));
				BufferedWriter bufOutput = new BufferedWriter(output);
				try {
					String line;
					// lee la primera línea
					line = bufInput.readLine();
					while (line != null) {
//						// escribe la línea en el archivo de salida
						bufOutput.write(line, 0, line.length());
						bufOutput.newLine();
						// lee la línea siguiente
						line = bufInput.readLine();
						System.out.println(line);
					}
				} finally {
					bufOutput.close();
				}
			} finally {
				bufInput.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
