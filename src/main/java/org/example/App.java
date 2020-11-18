package org.example;

import com.google.gson.Gson;
import sun.java2d.pipe.BufferedRenderPipe;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args)
    {
        String json = "";

        try {
            BufferedReader lectorJson = new BufferedReader(new FileReader("json1.json"));

            String linea = "";
            while( (linea = lectorJson.readLine()) != null ){
                json += linea;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(json);

        Gson gson = new Gson();
        Persona p = gson.fromJson(json, Persona.class);

        p.setEdad(35); // Cambiar edad en el objeto persona

        System.out.println(p);

    }
}
