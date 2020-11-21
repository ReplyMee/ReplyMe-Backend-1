package com.mustafa.replyme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class FeedRecyclerAdapter (private val userEmailArray: ArrayList<String>,private val userQuestionArray : ArrayList<String>,private val userImageArray : ArrayList<String>) : RecyclerView.Adapter<FeedRecyclerAdapter.PostHolder>() {
//(private val userEmailArray: ArrayList<String>,private val userQuestionArray : ArrayList<String>,private val userImageArray : ArrayList<String>)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedRecyclerAdapter.PostHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_view_row, parent, false)

        return PostHolder(view)
    }




    override fun getItemCount(): Int {

       return userEmailArray.size
    }


    override fun onBindViewHolder(holder: FeedRecyclerAdapter.PostHolder, position: Int) {
        holder.recyclerEmailText?.text=userEmailArray[position]
        holder.recyclerQuestionText?.text = userQuestionArray[position]
        Picasso.get().load(userImageArray[position]).into(holder.recyclerImageView)


    }

    class PostHolder(view: View) : RecyclerView.ViewHolder(view)
    {
        //view holder sınıfındaki görüntüler burada
        var recyclerEmailText: TextView? = null
        var recyclerQuestionText: TextView? = null
        var recyclerImageView: ImageView? = null

        init {

            recyclerEmailText = view.findViewById(R.id.recyclerEmailText)
            recyclerQuestionText = view.findViewById(R.id.recyclerQuestionText)
            recyclerImageView =  view.findViewById(R.id.recyclerImageView)


        }

    }


}

