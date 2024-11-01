package com.example.dirio.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dirio.databinding.FragmentDiariesBinding
import com.example.dirio.view.viewModel.DiariesViewModel

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class DiariesFragment : Fragment() {

    private var _binding: FragmentDiariesBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: DiariesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentDiariesBinding.inflate(inflater, container, false)
        viewModel = ViewModelProvider(this)[DiariesViewModel::class.java]

        binding.recyclerviewDiaries.layoutManager = LinearLayoutManager(context)

        return binding.root
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        binding.buttonFirst.setOnClickListener {
//            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
//        }
//    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}