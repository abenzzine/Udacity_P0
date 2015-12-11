package myapplication.example.com.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View view){

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Button buttonClicked = null;
        CharSequence messageText = null;
        Toast toast ;

        switch (view.getId()) {
            case R.id.button:
                buttonClicked = (Button) findViewById(R.id.button);
                messageText = "This button will launch my " + buttonClicked.getText();
                duration = Toast.LENGTH_SHORT;
                toast = Toast.makeText(context, messageText, duration);
                toast.show();
                break;
            case R.id.button2:
                buttonClicked = (Button) findViewById(R.id.button2);
                messageText = "This button will launch my " + buttonClicked.getText();
                duration = Toast.LENGTH_SHORT;
                toast = Toast.makeText(context, messageText, duration);
                toast.show();
                break;
            case R.id.button3:
                buttonClicked = (Button) findViewById(R.id.button3);
                messageText = "This button will launch my " + buttonClicked.getText();
                duration = Toast.LENGTH_SHORT;
                toast = Toast.makeText(context, messageText, duration);
                toast.show();
                break;
            case R.id.button4:
                buttonClicked = (Button) findViewById(R.id.button4);
                messageText = "This button will launch my " + buttonClicked.getText();
                duration = Toast.LENGTH_SHORT;
                toast = Toast.makeText(context, messageText, duration);
                toast.show();
                break;
            case R.id.button5:
                buttonClicked = (Button) findViewById(R.id.button5);
                messageText = "This button will launch my " + buttonClicked.getText();
                duration = Toast.LENGTH_SHORT;
                toast = Toast.makeText(context, messageText, duration);
                toast.show();
                break;
            case R.id.button6:
                buttonClicked = (Button) findViewById(R.id.button6);
                messageText = "This button will launch my " + buttonClicked.getText();
                duration = Toast.LENGTH_SHORT;
                toast = Toast.makeText(context, messageText, duration);
                toast.show();
                break;

        }

    }
}
