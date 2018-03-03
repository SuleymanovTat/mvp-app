package ru.suleymanovtat.mvpapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements IView, View.OnClickListener {

    MainPresenter presenter;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.editText);
        Button btnGetIt = (Button) findViewById(R.id.btnGetIt);
        btnGetIt.setOnClickListener(this);

        if (presenter == null)
            presenter = new MainPresenter(this);
    }

    @Override
    public String getUrl() {
        return editText.getText().toString();
    }


    @Override
    public void showData() {
        Toast.makeText(this, "showData", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showError() {
        Toast.makeText(this, "showError", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onClick(View v) {
        presenter.onGetButtonClick();
    }
}
