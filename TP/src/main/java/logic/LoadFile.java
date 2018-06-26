package logic;

import java.io.*;

public class LoadFile {

	Paciente p;
	String path;
	String temp;
	
	public LoadFile(Paciente d, String pat) {
		
		this.p = d;
		this.path = pat;
		this.temp = null;
		
	}
	
	
	public void load() {
		 try{
	            FileReader fr = new FileReader(path);
	            BufferedReader br = new BufferedReader(fr);

	            while ((temp = br.readLine()) != null){
	            	
	            	
	            	
	            	
	            	
	            	
	            }
	            br.close();
	            fr.close();
	        } catch (FileNotFoundException ex){
	            System.err.println("Unable to open file");
	        } catch (IOException ex){
	            System.err.println("Error reading file");
	        } catch (NullPointerException ex){
	            System.err.println("LoadQuestions: Invalid path");
	        }
	    
	}
	
	
	
	
	
	
}
