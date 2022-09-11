package com.f4l.challenge_ch3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_letter.*
import kotlinx.android.synthetic.main.fragment_word.*

class WordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_word, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var getKey = arguments?.getString("key")
        when(getKey) {
            "A" -> {
                var word = arrayListOf(
                    WordList("Angka"),
                    WordList("Apa"),
                    WordList("Acne")
                )
                val adapterKata = WordAdapter(word)
                recycler_view.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.words)
                }
            }
            "B" -> {
                var word = arrayListOf(
                    WordList("Becak"),
                    WordList("BBM"),
                    WordList("Binding")
                )
                val adapterKata = WordAdapter(word)
                recycler_view.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.words)
                }
            }
            "C" -> {
                var word = arrayListOf(
                    WordList("Coklat"),
                    WordList("China"),
                    WordList("Cheese")
                )
                val adapterKata = WordAdapter(word)
                recycler_view.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.words)
                }
            }
            "D" -> {
                var word = arrayListOf(
                    WordList("Dokar"),
                    WordList("Design"),
                    WordList("Data")
                )
                val adapterKata = WordAdapter(word)
                recycler_view.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.words)
                }
            }
            "E" -> {
                var word = arrayListOf(
                    WordList("Emas"),
                    WordList("Enji"),
                    WordList("Endah n Resa")
                )
                val adapterKata = WordAdapter(word)
                recycler_view.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.words)
                }
            }
            "F" -> {
                var word = arrayListOf(
                    WordList("Fani"),
                    WordList("Fiction"),
                    WordList("Fry pan")
                )
                val adapterKata = WordAdapter(word)
                recycler_view.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.words)
                }
            }
            "G" -> {
                var word = arrayListOf(
                    WordList("Gilang"),
                    WordList("Galih dan Ratna"),
                    WordList("Geologi")
                )
                val adapterKata = WordAdapter(word)
                recycler_view.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.words)
                }
            }
            "H" -> {
                var word = arrayListOf(
                    WordList("Hilang"),
                    WordList("Hampa"),
                    WordList("Hisab")
                    )
                    val adapterKata = WordAdapter(word)
                recycler_view.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.words)
                }
            }
            "I" -> {
                var word = arrayListOf(
                    WordList("Ikatan Cinta"),
                    WordList("ITalk"),
                    WordList("Induk Semang")
                    )
                    val adapterKata = WordAdapter(word)
                recycler_view.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.words)
                }
            }
            "J" -> {
                var word = arrayListOf(
                    WordList("Jerome"),
                    WordList("Jimin"),
                    WordList("Janji Hati")
                    )
                    val adapterKata = WordAdapter(word)
                recycler_view.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.words)
                }
            }
            "K" -> {
                var word = arrayListOf(
                    WordList("Kpop"),
                    WordList("Keyboard"),
                    WordList("Kancil")
                )
                val adapterKata = WordAdapter(word)
                recycler_view.adapter = adapterKata
                adapterKata.onClick = {
                    var bundle = Bundle()
                    bundle.putString("key", it.words)
                }
            }
            }

                val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                recycler_view.layoutManager = layoutManager
        }
    }