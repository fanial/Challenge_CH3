package com.f4l.challenge_ch3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_letter.*

class LetterFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return inflater.inflate(R.layout.fragment_letter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       val listLetter = arrayListOf(
           DataList("A"),
           DataList("B"),
           DataList("C"),
           DataList("D"),
           DataList("E"),
           DataList("F"),
           DataList("G"),
           DataList("H"),
           DataList("I"),
           DataList("J"),
           DataList("K"),
       )
        val adapter = LetterAdapter(listLetter)
        val lManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        val rView = recycler_view_letter
        rView.layoutManager = lManager
        rView.adapter = adapter
        adapter.onClick = {
            var bundle = Bundle()
            bundle.putString("key", it.key)
            Navigation.findNavController(view).navigate(R.id.action_letterFragment_to_wordFragment, bundle)
        }
    }



}