package com.example.emailapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<EmailModel> emails = new ArrayList<>();
        emails.add(new EmailModel(R.drawable.ic_e, "Edurila.com", "$19 Only (First10 spots)",
                "12:34PM", R.drawable.ic_baseline_star_border_24));
        emails.add(new EmailModel(R.drawable.ic_c, "Chris Abad", "Help make Campaign Monitor",
                "11:22AM", R.drawable.ic_baseline_star_border_24));
        emails.add(new EmailModel(R.drawable.ic_t, "Tuto.com", "8h de formation gratuite et",
                "11:04PM", R.drawable.ic_baseline_star_border_24));
        emails.add(new EmailModel(R.drawable.ic_s, "support", "Societe Ovh: suvi de vos",
                "10:26PM", R.drawable.ic_baseline_star_border_24));
        emails.add(new EmailModel(R.drawable.ic_m, "Matt from lonic", "The New lonic Creator is Here",
                "9:24PM", R.drawable.ic_baseline_star_border_24));
        emails.add(new EmailModel(R.drawable.ic_s_2, "Soictttt", "Welcome to the office .....",
                "8:18PM", R.drawable.ic_baseline_star_border_24));
        emails.add(new EmailModel(R.drawable.ic_t_2, "TSUH", "Welcome to the my scholl .....",
                "7:20PM", R.drawable.ic_baseline_star_border_24));
        emails.add(new EmailModel(R.drawable.ic_t_2, "TSUH", "Hello, this is .....",
                "6:12PM", R.drawable.ic_baseline_star_border_24));
        EmailAdapter adapter = new EmailAdapter(this, emails);
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}