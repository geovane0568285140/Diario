package com.example.dirio.view.viewModel


import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.dirio.R
import com.example.dirio.Repository.DiariesRepostiry


class MainViewModel(application: Application) : AndroidViewModel(application) {

    private val _drawable = MutableLiveData<Int>()
    val drawable: LiveData<Int> = _drawable

    private val db = DiariesRepostiry(application)

    fun startFragment(nav: NavController){
            when(nav.currentDestination?.id){
                R.id.DiariesFragment -> {
                    _drawable.value = R.drawable.baseline_add_24
                    nav.navigate(R.id.EditFragment)
                }
                R.id.EditFragment -> {
                    _drawable.value = R.drawable.baseline_add_task_24
                    nav.navigate(R.id.DiariesFragment)
                }
            }
    }


}