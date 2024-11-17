package ru.zatsoft.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_sign_in, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val name = arguments?.getString("name")
        val pass = arguments?.getString("pass")

        val userNameET = view.findViewById<EditText>(R.id.etUserNameSignIn)
        val userPassET = view.findViewById<EditText>(R.id.etUserPassSignIn)
        val loginInBTN = view.findViewById<Button>(R.id.btnLoginSignIn)
        loginInBTN.setOnClickListener {
            if(name != userNameET.text.toString() ||
                pass != userPassET.text.toString()) {
                Toast.makeText(context, "Введены неправильно пароль или логин", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            } else {
                fragmentManager?.beginTransaction()?.replace(R.id.containerID, MainFragment())?.commit()
            }
        }
    }
}