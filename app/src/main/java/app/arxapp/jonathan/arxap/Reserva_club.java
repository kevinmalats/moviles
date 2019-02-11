package app.arxapp.jonathan.arxap;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reserva_club extends AppCompatActivity {

    ImageView botonRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva_club);

        botonRegresar = (ImageView) (findViewById(R.id.regresar));
        botonRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), Menu_Residente.class);
                startActivityForResult(intent, 0);
                finish();
            }
        });

    }
}
