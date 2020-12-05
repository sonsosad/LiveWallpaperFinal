package son.dev.app.livewallpaper.remote;

import son.dev.app.livewallpaper.model.ComputerVision;
import son.dev.app.livewallpaper.model.URLUpload;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface IComputerVision {
    @Headers({
            "Content-type: application/json",
            "Ocp-Apim-Subscription-Key:471d49b9afc14e38b766f771cc34f575"
    })
    @POST
    Call<ComputerVision> analyzeImage(@Url String apiEndpoint, @Body URLUpload url);
}
