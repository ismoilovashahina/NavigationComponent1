package uz.itschool.fragmentnavigation1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import uz.itschool.fragmentnavigation1.data.User
import uz.itschool.fragmentnavigation1.databinding.FragmentFirstBinding
import uz.itschool.fragmentnavigation1.databinding.FragmentSecondBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class SecondFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSecondBinding.inflate(inflater, container, false)
        val user = arguments?.getSerializable("user") as User
        val name = param1
        val password = param2
        binding.textView.text = name + ' ' + password
        binding.t2.setOnClickListener {
            it.findNavController().navigate(R.id.navigateToFirstFragment)
        }
        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SecondFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

}