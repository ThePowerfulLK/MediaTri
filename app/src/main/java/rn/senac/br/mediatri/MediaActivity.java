package rn.senac.br.mediatri;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MediaActivity extends Activity {

    private EditText txNota1;
    private EditText txNota2;
    private EditText txNota3;
    private Button btCalcular;
    private TextView mediaFinal;
    private double nota1;
    private double nota2;
    private double nota3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txNota1 = (EditText) findViewById(R.id.txNota1);
        txNota2 = (EditText) findViewById(R.id.txNota2);
        txNota3 = (EditText) findViewById(R.id.txNota3);
        btCalcular = (Button) findViewById(R.id.btCalcular);
        mediaFinal =(TextView) findViewById(R.id.mediaFinal);
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                nota1 = Double.parseDouble(txNota1.getText().toString());
                nota2 = Double.parseDouble(txNota2.getText().toString());
                nota3 = Double.parseDouble(txNota3.getText().toString());

                Double media = calcularMedia(nota1, nota2, nota3);
                mediaFinal.setText(media.toString());
            }
        });


    }
    private double calcularMedia(double n1, double n2, double n3) {
        double mediaFinal = (n1 + n2 + n3 ) / 3;
        return mediaFinal;
    }
}
