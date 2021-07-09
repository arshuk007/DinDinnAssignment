package com.example.dindinn.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.dindinn.R
import com.example.dindinn.adapter.IncredientItemsListAdapter
import com.example.dindinn.databinding.FragmentIncredientBinding
import com.example.dindinn.model.IncredientItem
import com.example.dindinn.utils.AppConstants
import com.example.dindinn.viewmodel.IncredientViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.ArrayList

class IncredientFragment : Fragment() {

    lateinit var binding: FragmentIncredientBinding
    private val viewModel: IncredientViewModel by viewModel()
    private var items: ArrayList<IncredientItem>? = null

    companion object {
        fun newInstance(items: ArrayList<IncredientItem>?):IncredientFragment{
            val fragment = IncredientFragment()
            val bundle = Bundle()
            bundle.putParcelableArrayList(AppConstants.KEY_DATA, items)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_incredient, container, false)
        init()
        setData()
        return binding.root
    }

    private fun init() {
        binding.lifecycleOwner = this
        items = arguments?.getParcelableArrayList(AppConstants.KEY_DATA)
    }

    /**
     * set data to recyclerview
     */
    private fun setData(){
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 3)
        val adapter = IncredientItemsListAdapter(requireContext(), items)
        binding.recyclerView.adapter = adapter
        adapter?.setOnItemClickListener(object: IncredientItemsListAdapter.MyClickListener{
            override fun onItemClick(position: Int, view: View) {

            }
        })
    }
}