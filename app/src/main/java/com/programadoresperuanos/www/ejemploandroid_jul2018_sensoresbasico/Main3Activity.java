package com.programadoresperuanos.www.ejemploandroid_jul2018_sensoresbasico;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import static android.Manifest.permission.BODY_SENSORS;

public class Main3Activity extends AppCompatActivity {

    TextView respuesta;
    RelativeLayout l;
    Snackbar snak1,snak2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        l = findViewById(R.id.milayout);
        respuesta = findViewById(R.id.textView);
        snak1 = Snackbar.make(l,"El permiso para los sensores fue aceptado.",Snackbar.LENGTH_LONG);
        snak2 = Snackbar.make(l,"El permiso requerido no fue aceptado",Snackbar.LENGTH_LONG);
        snak2.setActionTextColor(getResources().getColor(R.color.colorProgramadoresPeruanosPrimary));
        snak2.setAction("Solicitar", new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {
                requerirPermisos();
            }
        });
        if(verificarPermisos()){
            iniciarApp();
        }else{
            justificarPermisos();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_uno,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.opcion1:
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                return true;
            case R.id.opcion2:
                startActivity(new Intent(getApplicationContext(),Main2Activity.class));
                return true;
            case R.id.opcion3:
                startActivity(new Intent(getApplicationContext(),Main3Activity.class));
                return true;
            case R.id.opcion4:
                startActivity(new Intent(getApplicationContext(),Main4Activity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch(requestCode){
            case 1:
                if(grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    iniciarApp();
                    snak1.show();
                }else{
                    snak2.show();
                }
                break;
            default:
                break;
        }
    }

    private void justificarPermisos() {
        if(ActivityCompat.shouldShowRequestPermissionRationale(Main3Activity.this,BODY_SENSORS)){
            snak2.show();
        }else{
            requerirPermisos();
        }
    }

    private boolean verificarPermisos() {
        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.M){
            return true;
        }
        if(ActivityCompat.checkSelfPermission(getApplicationContext(),BODY_SENSORS) == PackageManager.PERMISSION_GRANTED){
            return true;
        }
        return false;
    }

    private void requerirPermisos() {
        ActivityCompat.requestPermissions(Main3Activity.this,new String[]{BODY_SENSORS},1);
    }

    private void iniciarApp() {
        SensorManager manager = (SensorManager) getSystemService(SENSOR_SERVICE);
        List<Sensor> sensores = manager.getSensorList(Sensor.TYPE_ALL);
        String missensores = "";
        for(Sensor sensor: sensores){
            missensores += sensor.getName()+"\r\n";
        }
        respuesta.setText(missensores);
    }

}
