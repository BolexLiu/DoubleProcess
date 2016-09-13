package bolex.doubleprocess;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import bolex.doubleprocess.Service.LocalService;
import bolex.doubleprocess.Service.RemoteService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startService(new Intent(this, LocalService.class));
        startService(new Intent(this, RemoteService.class));
    }
}
