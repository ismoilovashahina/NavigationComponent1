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
class SecondFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSecondBinding.inflate(inflater, container, false)
        val user = arguments?.getSerializable("user") as User
        binding.textView.text = user.name + ' ' + user.password
        binding.t2.setOnClickListener {
            it.findNavController().navigate(R.id.navigateToFirstFragment)
        }
        return binding.root
    }

}