package com.example.wheeloffortune


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView










class GameAdapter (private val mList: List<GameModel>) : RecyclerView.Adapter<GameAdapter.ViewHolder>(){

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.space_view, parent, false)

        return ViewHolder(view)
    }
    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val GameModel = mList[position]
       //if(GameModel.visablity) {
            holder.textView.text = GameModel.word;
        //}else{holder.textView.text = ""}
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList.size
    }

    /*fun getTextView(index : Int):TextView{

    }

     */

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }
}