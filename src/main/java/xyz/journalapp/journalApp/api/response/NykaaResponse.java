package xyz.journalapp.journalApp.api.response;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;


@Data
public class NykaaResponse {
        private String status;
        private String message;
        private Response response;


        @Data
        public class Response{
            private ArrayList<Trending> trending;

        }

        @Data
        public class Trending{
            private String type;
            private String url;
            private String q;
        }

}
