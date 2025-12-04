package utils;

public class ApiUtils {

    public static final String listAll = "https://dog.ceo/api/breeds/list/all";
    public static final String randomImage = "https://dog.ceo/api/breeds/image/random";
    public static final String imagesByBreedTemplate = "https://dog.ceo/api/breed/%s/images";

    public static String getImagesByBreed(String breed) {
        return String.format(imagesByBreedTemplate, breed);
    }

}
