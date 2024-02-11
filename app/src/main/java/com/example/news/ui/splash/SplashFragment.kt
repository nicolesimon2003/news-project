package com.example.news.ui.splash

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.news.R

class SplashFragment : Fragment() {

    private val SPLASH_SCREEN_DELAY = 2000

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.postDelayed({
            navigateToNextScreen()
        }, SPLASH_SCREEN_DELAY.toLong())
    }

    private fun navigateToNextScreen() {
        findNavController().navigate(R.id.action_splashFragment_to_loginFragment)
    }

    override fun onDestroy() {
        super.onDestroy()
        Handler(Looper.getMainLooper()).removeCallbacksAndMessages(null)
        super.onDestroyView()
    }

}