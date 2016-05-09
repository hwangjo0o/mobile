# mobile
Mobile/Cloud class
package com.example.hwangjo0o.myapplication1;

    import android.os.Bundle;
    import android.support.design.widget.FloatingActionButton;
    import android.support.design.widget.Snackbar;
    import android.support.v7.app.AppCompatActivity;
    import android.support.v7.widget.Toolbar;
    import android.view.View;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.widget.Button;
    import android.widget.EditText;
    import android.widget.TextView;
    import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

EditText edit1, edit2;
Button btnA, btnS, btnM, btnD, btnE;
Button[] button = new Button[10];
int[] numbutton={R.id.button0, R.id.button1,R.id.button2,R.id.button3,R.id.button4,
        R.id.button5,R.id.button6,R.id.button7,R.id.button8,R.id.button9,};
TextView textResult;
int num1, num2;
Integer Result;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    setTitle("Juhyun's calculator");

    edit1 = (EditText) findViewById(R.id.editText);
    edit2 = (EditText) findViewById(R.id.editText2);

    btnA = (Button) findViewById(R.id.buttonAdd);
    btnS = (Button) findViewById(R.id.buttonSub);
    btnM = (Button) findViewById(R.id.buttonMult);
    btnD = (Button) findViewById(R.id.buttonDiv);
    btnE = (Button) findViewById(R.id.buttonEqu);

    textResult = (TextView) findViewById(R.id.result);

    for(int i=0; i<10; i++)
    {
        button[i] = (Button) findViewById(numbutton[i]);
    }

    for(int i=0; i<10; i++)
    {
        final int index;
        index = i;

        button[index].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                String a, b;

                if(edit1.isFocused() == true){
                    a = edit1.getText().toString()
                            + button[index].getText().toString();
                    edit1.setText(a);
                }
                else if(edit2.isFocused() == true){
                    b = edit2.getText().toString()
                            + button[index].getText().toString();
                    edit2.setText(b);
                }
                else{
                    Toast.makeText(getApplicationContext(), "입력 필수!", 0).show();
                }
            }
        });
    }

    View.OnClickListener clisten = new View.OnClickListener() {
        public void onClick(View v) {
            num1 = Integer.parseInt(edit1.getText().toString());
            num2 = Integer.parseInt(edit2.getText().toString());

            switch(v.getId()){
                case R.id.buttonAdd :
                    Result = num1 + num2;
                    break;

                case R.id.buttonSub :
                    Result = num1 - num2;
                    break;

                case R.id.buttonMult :
                    Result = num1 * num2;
                    break;

                case R.id.buttonDiv :
                    Result = num1 / num2;
                    break;

                case R.id.buttonEqu :
                    textResult.setText(Result);
                    break;
            }
        }
    };
    btnA.setOnClickListener(clisten);
    btnS.setOnClickListener(clisten);
    btnM.setOnClickListener(clisten);
    btnD.setOnClickListener(clisten);
    btnE.setOnClickListener(clisten);
}
}
