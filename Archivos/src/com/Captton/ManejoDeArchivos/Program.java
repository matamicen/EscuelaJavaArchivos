package com.Captton.ManejoDeArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

import javax.management.NotificationFilterSupport;

public class Program {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		String absoluta = "/home/alumno/workspace/MiArchivitito.txt";
		
		String absoluta = "MiArchivito.txt";

		File file = new File(absoluta);

		try {
			if (!file.exists()) {
				file.createNewFile();
			}

		} catch (IOException e) {
			// TODO: handle exception
			e.getMessage();
		}

		Writer w = null;
		BufferedWriter bw = null;

		try {

			w = new FileWriter(file);
			bw = new BufferedWriter(w);

			try {
				
				bw.write("Linea 1");
				bw.newLine();
				bw.write("Linea 2");
				bw.flush();
				
			} catch (IOException e) {
				// TODO: handle exception
				e.getMessage();
				
			} finally {
				
				w.close();
				bw.close();
			}

		} catch (IOException e) {
			// TODO: handle exception
			e.getMessage();
		}

		Reader r = null;
		BufferedReader br = null;
		
		try {
			
			r = new FileReader(file);
			br = new BufferedReader(r);
			
			String texto = "";
			
			while ((texto = br.readLine()) != null ) {
				System.out.println(texto);
			}
			
			r.close();
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
