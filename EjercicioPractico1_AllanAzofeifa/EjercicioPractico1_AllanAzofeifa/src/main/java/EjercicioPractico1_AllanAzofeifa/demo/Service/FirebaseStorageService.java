/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package EjercicioPractico1_AllanAzofeifa.demo.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {
    
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    //El BuketName es el <id_del_proyecto> + ".appspot.com#
    final String BucketName = "EjercicioPractico1_AllanAzofeifa-07262.appspot.com";
    
    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "EjercicioPractico1_AllanAzofeifa";
    
    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "EjercicioPractico1_AllanAzofeifa-70262-firebase-adminsdk-ftnwx-0442f8d4ll.json";
}
