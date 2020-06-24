package com.tian.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.tian.myapplication.databinding.FragmentHomeDataBinding


/**
 *
 *  desc
 */
class FragmentData(private val tagViewModel:String) : Fragment() {

    private var binding: FragmentHomeDataBinding?  = null
    private var model: DataViewModel ? = null  // by viewModels<DataViewModel>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        if (binding == null) {
            init(inflater, container)
        }
        return binding?.root
    }


    private fun init(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) {
        binding = FragmentHomeDataBinding.inflate(inflater, container, false)

        //1>使用相同的初始化方式
//        model = ViewModelProviders.of(this).get(DataViewModel::class.java)

        //2>方式
//        model = ViewModelProviders.of(this).get(tagViewModel,DataViewModel::class.java)

        //3>方式
//        model = ViewModelProviders.of(requireActivity()).get(tagViewModel,DataViewModel::class.java)

        //4>方式 只有这种方式会导致数据错乱
        model = ViewModelProviders.of(requireActivity()).get(DataViewModel::class.java)


        binding?.model = model
        binding?.lifecycleOwner = this

    }


}