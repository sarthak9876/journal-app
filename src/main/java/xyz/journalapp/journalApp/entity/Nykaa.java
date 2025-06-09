package xyz.journalapp.journalApp.entity;


import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import xyz.journalapp.journalApp.api.response.NykaaResponse;

import java.util.ArrayList;

@Document(collection = "nykaa_data")
@Data
public class Nykaa {

        private String status;
        private String message;
        private xyz.journalapp.journalApp.api.response.NykaaResponse.Response response;


        @Data
        public class Response{
            private ArrayList<xyz.journalapp.journalApp.api.response.NykaaResponse.Trending> trending;
        }

        @Data
        public class Trending{
            private String type;
            private String url;
            @Id
            private String q;
        }
    }

