package com.example.sanzablancoaka2c.java101;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method moves the subject to the Variables item
     */
    public void variables (View v) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.subject_image_view);
        imageView.setImageResource(R.drawable.variable_types);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.subject_text_view);
        textView.setText("Variables");
    }

    /**
     * This method moves the Objects & Classes to the next item
     */
    public void objectsClasses(View v) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.subject_image_view);
        imageView.setImageResource(R.drawable.objects_classes);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.subject_text_view);
        textView.setText("Objects & Classes");
    }

    /**
     * This method moves the subject to the Decisions item
     */
    public void decisions (View v) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.subject_image_view);
        imageView.setImageResource(R.drawable.decisions);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.subject_text_view);
        textView.setText("Decisions");
    }

    /**
     * This method moves the subject to the Loops item
     */
    public void loops (View v) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.subject_image_view);
        imageView.setImageResource(R.drawable.loops);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.subject_text_view);
        textView.setText("Loops");
    }

    /**
     * This method moves the subject to the Loops item
     */
    public void arrays (View v) {
        // TODO: Find a reference to the ImageView in the layout. Change the image.
        ImageView imageView = (ImageView) findViewById(R.id.subject_image_view);
        imageView.setImageResource(R.drawable.arrays);

        // TODO: Find a reference to the TextView in the layout. Change the text.
        TextView textView = (TextView) findViewById(R.id.subject_text_view);
        textView.setText("Arrays");
    }
}

