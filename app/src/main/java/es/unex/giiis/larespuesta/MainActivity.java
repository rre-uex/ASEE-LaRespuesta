package es.unex.giiis.larespuesta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int[] answers = { 42, -10, 0, 100, 1000 };
    public static final int answer = 42;

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView answerView = (TextView) findViewById(R.id.respuesta_view);

        int val = findAnswer();
        Log.d(TAG,"El valor devuelto por la funcion es: "+val);
        String output = (val == answer) ? "42" : "Puede que nunca la sepamos";
        answerView.setText("La respuesta a la vida, al universo a todo es:\n\n"
                + output);
    }

    private int findAnswer() {
        for (int val : answers) {
            Log.d(TAG,"El valor dentro del bucle es: "+val);
            if (val == answer)
                return val;
        }
        return -1;
    }
}