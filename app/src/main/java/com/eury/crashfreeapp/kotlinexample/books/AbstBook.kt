package com.eury.crashfreeapp.kotlinexample.books

import android.content.res.Resources
import android.graphics.drawable.Drawable
import androidx.core.content.res.ResourcesCompat
import com.eury.crashfreeapp.R
import com.eury.crashfreeapp.kotlinexample.Author

sealed class AbstBook(open val id: Int?, open val title: String?,
    open val year: Int?, open val author: Author?) {
    abstract fun getIcon(resources: Resources): Drawable?
}

data class DramaBook(
    override val id: Int?, override val title: String?,
    override val year: Int?, override val author: Author?,
    val summary:String?
) : AbstBook(id, title, year, author) {
    override fun getIcon(resources: Resources) =
        ResourcesCompat.getDrawable(resources, R.drawable.ic_drama, null)
}

data class SciFiBook(
    override val id: Int?, override val title: String?,
    override val year: Int?, override val author: Author?,
    val videoUrl:String?
) : AbstBook(id, title, year, author) {
    override fun getIcon(resources: Resources) =
        ResourcesCompat.getDrawable(resources, R.drawable.ic_scifi, null)
}