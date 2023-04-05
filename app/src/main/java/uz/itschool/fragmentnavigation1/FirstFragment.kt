package uz.itschool.fragmentnavigation1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import uz.itschool.fragmentnavigation1.data.User
import uz.itschool.fragmentnavigation1.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding.t1.setOnClickListener {
            val name = binding.name.text
            val password = binding.password.text
            val user = User(name.toString(), password.toString())
            val bundle = bundleOf("user" to user)
            it.findNavController().navigate(R.id.navigateToSecondFragment, bundle)
        }
        return binding.root
    }

}