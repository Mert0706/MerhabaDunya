package com.bilgeadam.merhabadunya;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MerhabaService {
        @GetMapping("/merhaba")

        public String selamlar(){

            return "Merhabalar Canım benim";

        }

        @GetMapping("/ugurla")
        public String ugurla(){

            String mesaj = "Canını yerim bay bayyyy ";

            return mesaj;
        }



}
