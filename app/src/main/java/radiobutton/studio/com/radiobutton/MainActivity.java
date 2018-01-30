package radiobutton.studio.com.radiobutton;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

    private RadioGroup radioGroup;
    private RadioButton radioEscolhido;
    private Button botaoEscolher;
    private TextView textoExibicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup)findViewById(R.id.radioGroupId);
        botaoEscolher = (Button)findViewById(R.id.botaoEscolher);
        textoExibicao = (TextView)findViewById(R.id.textExibicao);

        botaoEscolher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idRadioEscolhido = radioGroup.getCheckedRadioButtonId();
                //textoExibicao.setText("id: " + R.id.radioGroupId);

                if(idRadioEscolhido > 0){
                    radioEscolhido = (RadioButton)findViewById(idRadioEscolhido);

                    textoExibicao.setText(radioEscolhido.getText());
                }
            }
        });
    }
}
