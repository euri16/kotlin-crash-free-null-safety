package com.eury.crashfreeapp.kotlinexample

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.eury.crashfreeapp.R
import com.eury.crashfreeapp.kotlinexample.books.AbstBook
import com.eury.crashfreeapp.kotlinexample.books.DramaBook
import com.eury.crashfreeapp.kotlinexample.books.SciFiBook

class SampleActivity : AppCompatActivity() {
    private val tvBookName: TextView?
            by lazy { findViewById<TextView>(R.id.tvBookName) }

    private val tvBookYear: TextView?
            by lazy { findViewById<TextView>(R.id.tvBookYear) }

    private val tvAuthorName: TextView?
            by lazy { findViewById<TextView>(R.id.tvAuthorName) }

    private val tvSummary: TextView?
            by lazy { findViewById<TextView>(R.id.tvSummary) }

    private val ivAuthorPicture: ImageView?
            by lazy { findViewById<ImageView>(R.id.ivAuthorPicture) }

    private val btnOpenVideo: Button?
            by lazy { findViewById<Button>(R.id.btnOpenVideo) }


    fun setValues(book: Book?) {
        tvBookName?.text = book?.title
        tvBookYear?.text = book?.year?.toString()
        tvAuthorName?.text = book?.author?.name
        ivAuthorPicture?.let {
            /*Glide.with(this)
                .load(book?.author?.photos?.fullImageUrl)
                .into(ivAuthorPicture);*/
        }
    }

    fun setValues(book: AbstBook?) {
        tvBookName?.text = book?.title
        tvBookYear?.text = book?.year?.toString()
        tvAuthorName?.text = book?.author?.name

        ivAuthorPicture?.let {
            /*Glide.with(this)
                .load(book?.author?.photos?.fullImageUrl)
                .into(ivAuthorPicture);*/
        }

        when (book) {
            is DramaBook -> {
                tvSummary?.setText(book.summary)
                tvSummary?.visibility = View.VISIBLE
            }
            is SciFiBook -> {
                btnOpenVideo!!.setOnClickListener { v: View? ->
                    book.videoUrl?.let {
                        openVideo(it)
                    }
                }
            }
        }
    }

    fun openVideo(url:String) {}
}
