package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("myKebab")
@JsonTest
public class BeerDtoMyKebabTest extends BaseTest{

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void myKebabTest() throws JsonProcessingException {
        BeerDto dto = getDto();
        String beerJson = objectMapper.writeValueAsString(dto);

        System.out.println(beerJson);
    }
}
