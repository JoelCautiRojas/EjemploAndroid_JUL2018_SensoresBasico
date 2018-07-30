package com.programadoresperuanos.www.ejemploandroid_jul2018_sensoresbasico;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.programadoresperuanos.www.ejemploandroid_jul2018_sensoresbasico.adaptadores.adaptador_list_item_sensor;
import com.programadoresperuanos.www.ejemploandroid_jul2018_sensoresbasico.modelos.sensor_model;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    RecyclerView r;
    List<sensor_model> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        r = findViewById(R.id.recycler1);
        datos = new ArrayList<sensor_model>();
        datos.add(new sensor_model("TYPE_ACCELEROMETER","acelerometro","Sensores de movimiento",getString(R.string.s1),getString(R.string.u1),"Hardware","API 3",3,"metros sobre segundo al cuadrado",false,null));
        datos.add(new sensor_model("TYPE_ACCELEROMETER_UNCALIBRATED","acelerometro no calibrado","Sensores de movimiento",getString(R.string.s14),getString(R.string.u14),"Hardware","API 3",6,"metros sobre segundo al cuadrado",false,null));
        datos.add(new sensor_model("TYPE_AMBIENT_TEMPERATURE","temperatura ambiental","Sensores ambientales",getString(R.string.s2),getString(R.string.u2),"Hardware","API 14",1,"grados celsius",false,null));
        datos.add(new sensor_model("TYPE_GAME_ROTATION_VECTOR","vector de rotacion para juegos","Sensores de posicion",getString(R.string.s19),getString(R.string.u19),"Software","API 18",3,"N/A",false,null));
        datos.add(new sensor_model("TYPE_GEOMAGNETIC_ROTATION_VECTOR","vector de rotacion geomagnetico","Sensores de posicion",getString(R.string.s20),getString(R.string.u20),"Software","API 18",3,"N/A",false,null));
        datos.add(new sensor_model("TYPE_GRAVITY","gravedad","Sensores de movimiento",getString(R.string.s3),getString(R.string.u3),"Software o Hardware","API 9",3,"metros sobre segundo al cuadrado",false,null));
        datos.add(new sensor_model("TYPE_GYROSCOPE","giroscopio","Sensores de movimiento",getString(R.string.s4),getString(R.string.u4),"Hardware","API 3",3,"radianes sobre segundo",false,null));
        datos.add(new sensor_model("TYPE_GYROSCOPE_UNCALIBRATED","giroscopio no calibrado","Sensores de movimiento",getString(R.string.s15),getString(R.string.u15),"Hardware","API 3",6,"radianes sobre segundo",false,null));
        datos.add(new sensor_model("TYPE_HEART_RATE","frecuencia cardíaca","Sensores ambientales",getString(R.string.s22),getString(R.string.u22),"Hardware","API 20",1,"latidos por minuto",false,null));
        datos.add(new sensor_model("TYPE_LIGHT","luz ambiental","Sensores ambientales",getString(R.string.s5),getString(R.string.u5),"Hardware","API 3",1,"lumenes sobre metro cuadrado",false,null));
        datos.add(new sensor_model("TYPE_LINEAR_ACCELERATION","acelerometro lineal","Sensores de movimiento",getString(R.string.s6),getString(R.string.u6),"Software o Hardware","API 9",3,"metros sobre segundo al cuadrado",false,null));
        datos.add(new sensor_model("TYPE_MAGNETIC_FIELD","campo magnetico","Sensores de posicion",getString(R.string.s7),getString(R.string.u7),"Hardware","API 3",3,"microtesla",false,null));
        datos.add(new sensor_model("TYPE_MAGNETIC_FIELD_UNCALIBRATED","campo magnetico no calibrado","Sensores de posicion",getString(R.string.s21),getString(R.string.u21),"Software","API 3",6,"microtesla",false,null));
        datos.add(new sensor_model("TYPE_ORIENTATION","orientacion","Sensores de posicion",getString(R.string.s8),getString(R.string.u8),"Software","API 3",3,"grado",true,"API 8"));
        datos.add(new sensor_model("TYPE_PRESSURE","presion atmosferica","Sensores ambientales",getString(R.string.s9),getString(R.string.u9),"Hardware","API 3",1,"hectopascal",false,null));
        datos.add(new sensor_model("TYPE_PROXIMITY","proximidad","Sensores de posicion",getString(R.string.s10),getString(R.string.u10),"Hardware","API 3",1,"centimetros",false,null));
        datos.add(new sensor_model("TYPE_RELATIVE_HUMIDITY","humedad relativa","Sensores ambientales",getString(R.string.s11),getString(R.string.u11),"Hardware","API 14",1,"porcentajes",false,null));
        datos.add(new sensor_model("TYPE_ROTATION_VECTOR","vector de rotacion","Sensores de movimiento",getString(R.string.s12),getString(R.string.u12),"Software o Hardware","API 9",4,"adimensional",false,null));
        datos.add(new sensor_model("TYPE_SIGNIFICANT_MOTION","movimiento significativo","Sensores movimiento",getString(R.string.s16),getString(R.string.u16),"Software","API 18",0,"N/A",false,null));
        datos.add(new sensor_model("TYPE_STEP_COUNTER","contador de pasos","Sensores de movimiento",getString(R.string.s17),getString(R.string.u17),"Hardware","API 19",1,"paso",false,null));
        datos.add(new sensor_model("TYPE_STEP_DETECTOR","detector de pasos","Sensores de movimiento",getString(R.string.s18),getString(R.string.u18),"Hardware","API 19",0,"N/A",false,null));
        datos.add(new sensor_model("TYPE_TEMPERATURE","temperatura interna","Sensores ambientales",getString(R.string.s13),getString(R.string.u13),"Hardware","API 3",1,"grados celsius",true,"API 14"));
        adaptador_list_item_sensor miadaptador = new adaptador_list_item_sensor(getApplicationContext(),datos);
        r.setAdapter(miadaptador);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        r.setLayoutManager(manager);
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

}
