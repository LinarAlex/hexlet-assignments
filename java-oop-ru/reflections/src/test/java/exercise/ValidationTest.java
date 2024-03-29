package exercise;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;



class ValidationTest {

    @Test
    void testValidate() {
        Address address1 = new Address("Russia", "Ufa", "Lenina", "54", null);
        List<String> result1 = Validator.validate(address1);
        List<String> expected1 = List.of();
        assertThat(result1).isEqualTo(expected1);

        Address address2 = new Address(null, "London", "1-st street", "5", "1");
        List<String> result2 = Validator.validate(address2);
        List<String> expected2 = List.of("country");
        assertThat(result2).isEqualTo(expected2);

        Address address3 = new Address("USA", null, null, null, "1");
        List<String> result3 = Validator.validate(address3);
        List<String> expected3 = List.of("city", "street", "houseNumber");
        assertThat(result3).isEqualTo(expected3);
    }

    // BEGIN
    @Test
    void testAdvancedValidate() {
        Address address1 = new Address("USA", "Texas", null, "7", "10");
        Map<String, List<String>> result1 = Validator.advancedValidate(address1);
        Map<String, List<String>> expected1 = new HashMap<>();
        expected1.put("country", List.of("length less than 4"));
        expected1.put("street", List.of("can not be null"));
        assertThat((result1)).isEqualTo(expected1);

        Address address2 = new Address("Russia", "Moscow", "Pobedi", "24", "4");
        Map<String, List<String>> result2 = Validator.advancedValidate(address2);
        Map<String, List<String>> expected2 = new HashMap<>();
        assertThat(result2).isEqualTo(expected2);

        Address address3 = new Address("OAE", null, null, null, "1");
        Map<String, List<String>> result3 = Validator.advancedValidate(address3);
        Map<String, List<String>> expected3 = new HashMap<>();
        expected3.put("country", List.of("length less than 4"));
        expected3.put("city", List.of("can not be null"));
        expected3.put("street", List.of("can not be null"));
        expected3.put("houseNumber", List.of("can not be null"));
        assertThat(result3).isEqualTo(expected3);
    }
    // END
}
