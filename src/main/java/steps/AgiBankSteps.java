package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;
import io.restassured.response.Response;
import logic.AllListLogic;
import logic.BreedImagesLogic;
import logic.RandomBreedImagesLogic;
import org.junit.Assert;
import utils.ApiUtils;

import java.util.List;

public class AgiBankSteps {

    private AllListLogic allListLogic;
    private BreedImagesLogic breedImagesLogic;
    private RandomBreedImagesLogic randomBreedImagesLogic;
    private Response response;
    private String url;

    @Before
    public void before() {
        this.allListLogic = new AllListLogic();
        this.breedImagesLogic = new BreedImagesLogic();
        this.randomBreedImagesLogic = new RandomBreedImagesLogic();
    }

    @Given("que eu quero validar a requisição GET - List all breeds")
    public void queeuquerovalidarostatuscodedarequisicaoget(){
        this.url = ApiUtils.listAll;
    }

    @When("enviar a requisição All List")
    public void enviararequisicao(){
        this.response = this.allListLogic.chamadaGetAllList(url);
    }

    @Then("statuscode deverá ser {int}")
    public void statuscodedeveraser(int statusCode){
        Assert.assertEquals(statusCode, response.getStatusCode());
    }

    @Then("status deverá ser {string}")
    public void validarstatus(String status){
        Assert.assertEquals(status, response.jsonPath().getString("status"));
    }

    @Given("que eu quero validar raça por pais da requisição GET - List all breeds")
    public void queeuquerovalidarracaporpaisdarequisicaoget(){
        this.url = ApiUtils.listAll;
    }

    @Then("validar se há raça {string} no pais {string}")
    public void validarseháraçanopais(String raca, String pais) {
        List<String> subRacas = response.jsonPath().getList("message." + raca);

        if (subRacas == null || subRacas.isEmpty()) {
            Assert.assertTrue("A raça " + raca + " não possui sub-raças", subRacas.isEmpty());
        } else {
            Assert.assertTrue("A raça " + raca + " não contém o país esperado: " + pais,
                    subRacas.contains(pais));
        }
    }

    @Given("que eu quero validar a requisição GET - images by breed da raça {string}")
    public void queeuqerovalidararequisicaogetimagesbybreed(String raca){
        this.url = ApiUtils.getImagesByBreed(raca);
    }

    @When("enviar a requisição images by breed")
    public void enviararequisicaoimagesbybreed(){
        this.response = this.breedImagesLogic.chamadaGetImagesByBreed(url);
    }

    @Given("que eu quero validar a requisição GET - random images by breed da raça")
    public void queeuquerovalidararequisicaoGETrandomimagesbybreeddaraca(){
        this.url = ApiUtils.randomImage;
    }

    @When("enviar a requisição random images")
    public void enviararequsicaorandomimages(){
        this.response = this.randomBreedImagesLogic.chamadaRandomImagesBreeds(url);
    }

}
