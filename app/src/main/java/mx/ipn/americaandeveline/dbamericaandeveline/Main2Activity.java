package mx.ipn.americaandeveline.dbamericaandeveline;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView muestradatos;
    String nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        muestradatos= (TextView) findViewById(R.id.nombre);

        Bundle recibe= new Bundle();
        recibe= this.getIntent().getExtras();

        nombre= recibe.getString("nombre");

        muestradatos.setText("Nombre:" + nombre);
    }
}
