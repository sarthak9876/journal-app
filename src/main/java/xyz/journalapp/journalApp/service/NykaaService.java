package xyz.journalapp.journalApp.service;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import xyz.journalapp.journalApp.api.response.NykaaResponse;
import xyz.journalapp.journalApp.entity.Nykaa;
import xyz.journalapp.journalApp.repository.NykaaRepository;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;

@Component
public class NykaaService {

    @Autowired
    private NykaaRepository nykaaRepository;
    @Autowired
    private RestTemplate restTemplate;


    public static final String NYKAA_URL="http://www.nykaa.com/search/trending";

    public ResponseEntity<NykaaResponse> fetchNykaaData(){
        try {
            ResponseEntity<NykaaResponse> response = restTemplate.exchange(NYKAA_URL, HttpMethod.GET, null, NykaaResponse.class);
//            if(response.getBody() != null){
//                nykaaRepository.save(response);
//            }
            return response;
        }catch(Exception e){
            e.getStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body(null);
        }
    }

    public void saveEntry(NykaaResponse nykaaResponse){
//        nykaaRepository.save(nykaaResponse);
    }

    public void getByQuery(String query){
//        Nykaa response = nykaaRepository.findByQuery(query);
    }





}
