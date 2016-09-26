
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
        
        
        arquivosdir.mkdirs();
        products1.createNewFile();
        subdir.mkdir();
        products2.createNewFile();
  
        
        
        System.out.print("\n"+"¿Existe la carpeta arquivosdir ? "+arquivosdir.exists());
        System.out.print("\n"+"¿Existe el fichero products1 ? "+products1.exists());
        System.out.print("\n"+"¿Existe la carpeta subdir ? "+subdir.exists());
        System.out.print("\n"+"¿Existe el fichero products2 ? "+products2.exists());
        System.out.print("\n"+"Directorios y subdirectorios creados en arquivosdir : " );
        String[] punto5 = arquivosdir.list();
        for(int i=0;i<punto5.length;i++){
            System.out.println(punto5[i]);
        }
        System.out.println("Ruta del primer directorio : "+arquivosdir.getPath());
        System.out.println("Datos primer archivo : "+"\n  nombre : "+products1.getName()+"\n ruta : "+products1.getPath()+"\n escritura :"+products1.);
                
        
        
    }

   
    
}
