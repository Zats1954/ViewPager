package ru.zatsoft.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignUpFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sign_up, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val userNameET = view.findViewById<EditText>(R.id.etUserNameSignUp)
        val userPassET = view.findViewById<EditText>(R.id.etUserPassSignUp)
        val loginUpBTN = view.findViewById<Button>(R.id.btnLoginSignUp)
        loginUpBTN.setOnClickListener {
             val userNameSignUp = userNameET.text.toString()
            val userPassSignUp = userPassET.text.toString()
            if(userNameSignUp.isEmpty() || userPassSignUp.isEmpty()) {
                Toast.makeText(context, "Данные не введены", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
              val bundle = Bundle()
              val signInFragment = SignInFragment()
              bundle.putString("name", userNameSignUp)
            bundle.putString("pass", userPassSignUp)
            signInFragment.arguments = bundle
            fragmentManager?.beginTransaction()?.replace(R.id.containerID, signInFragment)?.commit()
            Toast.makeText(context,"Вы успешно зарегистированы", Toast.LENGTH_LONG).show()
            }
            }
        }