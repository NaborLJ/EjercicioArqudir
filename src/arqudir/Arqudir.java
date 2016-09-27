
package arqudir;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;


public class Arqudir {

    
    public static void main(String[] args) throws IOException{
        
        
        
        File arquivosdir = new File ("/home/oracle/NetBeansProjects/arquivos/arquivosdir");
        File products1 = new File ("/home/oracle/NetBeansProjects/arquivos/arquivosdir/products1.txt");
        File subdir = new File ("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir");
        File products2 = new File ("/home/oracle/NetBeansProjects/arquivos/arquivosdir/subdir/products2.txt");
        File products1oculto = new File("/home/oracle/NetBeansProjects/arquivos/arquivosdir/products1.txt~");
        //Creación de la carpeta arquivosdir.
        arquivosdir.mkdirs();
        //Creación del fichero products1.
        products1.createNewFile();
        //Creación de la carpeta subdir.
        subdir.mkdir();
        //Creación de el archivo products2.
        products2.createNewFile();
        //Hace que el archivo products1 no pueda ser escrito.
        products1.setWritable(false);
        //Retorna el permiso de escritura al fichero products1.
         products1.setWritable(true);
      /*
        //Borra el archivo products1.
        products1.delete();
        products1oculto.delete();
        //Borra el archivo products2.
        products2.delete();
        //Borra el directorio subdir.
        subdir.delete();
        //Borra el directorio arquivos dir.
        arquivosdir.delete();
        **/
        
        //Prints que nos mostraran por pantalla los pasos/información que creamos/modificamos.
        if(arquivosdir.exists()==true){
            System.out.println("Creada/Existente la carpeta arquivosdir");
        }else
            System.out.println("La carpeta arquivosdir no existe o no ha sido creada");
        if(products1.exists()==true){
            System.out.println("Creada/Existente el fichero products1 ");
        }else
            System.out.println("El fichero products1 no existe o no ha sido creado  ");
        if(subdir.exists()==true){
            System.out.println("Creada/Existente la carpeta subdir ");
        }else
            System.out.println("La carpeta subdir no existe o no ha sido creada");
        if(products2.exists()==true){
            System.out.print("El fichero products2 creado satisfactoriamente(o ya existente) ");
        }else
            System.out.println("El fichero products2 no existe o no ha sido creado satisfactoriamente");
        
        System.out.print("\n"+"Directorios y subdirectorios creados en arquivosdir : " );
        String[] punto5 = arquivosdir.list();
        for(int i=0;i<punto5.length;i++){
            System.out.println(punto5[i]);
        }
        System.out.println("Ruta del primer directorio : "+arquivosdir.getPath());
        System.out.println("Datos primer archivo : "+"\n nombre : "+products1.getName()+"\n ruta : "+products1.getPath()+"\n escritura :"+products1.canWrite()+"\n lectura :"+products1.canRead()+"\n tamaño en bytes : "+products1.length());
                
        
        
    }

   
    
}
