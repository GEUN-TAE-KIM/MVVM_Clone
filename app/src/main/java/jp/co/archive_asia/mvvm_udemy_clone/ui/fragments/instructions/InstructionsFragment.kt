package jp.co.archive_asia.mvvm_udemy_clone.ui.fragments.instructions

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.co.archive_asia.mvvm_udemy_clone.models.Result
import android.webkit.WebViewClient
import jp.co.archive_asia.mvvm_udemy_clone.R
import jp.co.archive_asia.mvvm_udemy_clone.common.Constants
import jp.co.archive_asia.mvvm_udemy_clone.databinding.FragmentInstructionsBinding

class InstructionsFragment : Fragment() {

    private var _binding: FragmentInstructionsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentInstructionsBinding.inflate(inflater, container, false)

        val args = arguments
        val myBundle: Result? = args?.getParcelable(Constants.RECIPE_RESULT_KEY)

        binding.instructionsWebView.webViewClient = object : WebViewClient() {}
        val websiteUrl: String = myBundle!!.sourceUrl
        binding.instructionsWebView.loadUrl(websiteUrl)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
