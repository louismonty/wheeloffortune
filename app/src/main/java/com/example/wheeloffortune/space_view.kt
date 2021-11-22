package com.example.wheeloffortune

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList




class space_view : Fragment() {

    private val randomWord : String = "Test"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.game_fragment, container, false)
        createTodayView(view)

        return view
    }

    private fun createTodayView(view: View){

        val today_event_recyclerview = view.findViewById<RecyclerView>(R.id.displayText)

        today_event_recyclerview.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        val data = ArrayList<GameModel>()




        for (letter in randomWord){
            data.add(GameModel(letter.toString(),false))
        }

        System.out.println(data.size)

        val adapter = GameAdapter(data)

        today_event_recyclerview.adapter = adapter
    }
    private fun getRandomWord():String{
        return "test"
    }
    fun reload(){}

}