package pe.edu.pucp.a20190000.myfirstlogin.data.api;

import pe.edu.pucp.a20190000.myfirstlogin.data.api.in.LoginInRO;
import pe.edu.pucp.a20190000.myfirstlogin.data.api.out.UserOutRO;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {

    @POST("user/login")
    Call<UserOutRO> login(@Body LoginInRO user);

}
