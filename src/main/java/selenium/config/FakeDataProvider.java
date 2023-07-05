package selenium.config;

import com.github.javafaker.Faker;

public class FakeDataProvider {

    Faker faker = new Faker();

    public String generateFakeFullName(){
        return faker.name().firstName();
    }
    public String generateFakeEmail(){
        return faker.internet().emailAddress();

    }
    public String generateFakeAddress(){
        return faker.address().fullAddress();
    }
    public String generateFakePermanentAddress() {
        return faker.address().secondaryAddress();

    }
}
