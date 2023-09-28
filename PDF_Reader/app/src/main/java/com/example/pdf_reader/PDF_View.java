package com.example.pdf_reader;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.util.FitPolicy;

import java.io.File;

public class PDF_View extends AppCompatActivity {


    String filepath = " ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf_view);




        PDFView pdf = findViewById(R.id.pdfView);


        // Get the file path from the intent
        String filePath = getIntent().getStringExtra("file_path");


        File file = new File(filePath);
        Uri path = Uri.fromFile(file);
        pdf.fromUri(path).load();

    }
}
















