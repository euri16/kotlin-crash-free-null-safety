package com.eury.crashfreeapp.javaexample;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.eury.crashfreeapp.R;
import com.eury.crashfreeapp.javaexample.books.AbstBook;
import com.eury.crashfreeapp.javaexample.books.DramaBook;
import com.eury.crashfreeapp.javaexample.books.SciFiBook;

public class SampleActivity extends AppCompatActivity {

    TextView tvBookName;
    TextView tvBookYear;
    TextView tvAuthorName;
    TextView tvSummary;
    ImageView ivAuthorPicture;
    Button btnOpenVideo;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvBookName = findViewById(R.id.tvBookName);
        tvBookYear = findViewById(R.id.tvBookYear);
        tvAuthorName = findViewById(R.id.tvAuthorName);
        tvSummary = findViewById(R.id.tvSummary);
        ivAuthorPicture = findViewById(R.id.ivAuthorPicture);
        btnOpenVideo = findViewById(R.id.btnOpenVideo);
    }

    public void setValues(Book book) {
        if(book != null) {
            if (tvBookName != null && book.getTitle() != null) {
                tvBookName.setText(book.getTitle());
            }

            if (tvBookYear != null && book.getYear() != null) {
                tvBookYear.setText(String.valueOf(book.getYear()));
            }

            if(tvAuthorName != null && book.getAuthor() != null && book.getAuthor().getName() != null) {
                tvAuthorName.setText(book.getAuthor().getName());
            }

            if(ivAuthorPicture != null) {
                /*Glide.with(this)
                        .load(book.getAuthor().getPhotos().getFullImageUrl())
                        .into(ivAuthorPicture);*/
            }
        }
    }

    public void setValues(AbstBook book) {
        String videoUrl = null;
        String summary = null;

        if(book != null) {
            if (book instanceof DramaBook) {
                DramaBook dramaBook = (DramaBook) book;
                summary = dramaBook.getSummary();
            }

            if (book instanceof SciFiBook) {
                SciFiBook dramaBook = (SciFiBook) book;
                videoUrl = dramaBook.getVideoUrl();
            }


            if (tvBookName != null && book.getTitle() != null) {
                tvBookName.setText(book.getTitle());
            }

            if (tvBookYear != null && book.getYear() != null) {
                tvBookYear.setText(String.valueOf(book.getYear()));
            }

            if(tvAuthorName != null && book.getAuthor() != null && book.getAuthor().getName() != null) {
                tvAuthorName.setText(book.getAuthor().getName());
            }

            if(tvSummary != null && summary != null) {
                tvSummary.setVisibility(View.VISIBLE);
                tvSummary.setText(summary);
            }

            String finalVideoUrl = videoUrl;
            btnOpenVideo.setOnClickListener(v -> {
                if(finalVideoUrl != null) {
                    openVideo(finalVideoUrl);
                }
            });

            if(ivAuthorPicture != null) {
                /*Glide.with(this)
                        .load(book.getAuthor().getPhotos().getFullImageUrl())
                        .into(ivAuthorPicture);*/
            }
        }
    }

    private void openVideo(String url) {

    }
}
