/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import temporizador.tlsa2.VisuAgenda;

/**
 *
 * @author CFA0542
 */
public class ReadFileService {
    public String read(){
         File file = new File(System.getProperty("java.io.tmpdir") + File.separator + "agenda.txt");
         StringBuilder builder = new StringBuilder();
        try{
            if(file.exists() && file.canRead()){
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null){
                builder.append(line);
            }
         }
        }catch (IOException e){
            e.printStackTrace();
        } 
        
        return builder.toString();
    }
}
