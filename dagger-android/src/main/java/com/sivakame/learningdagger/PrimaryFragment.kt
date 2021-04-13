package com.sivakame.learningdagger

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerFragment
import javax.inject.Inject

// TODO 4: Indicate that we want to inject this fragment
class PrimaryFragment : DaggerFragment() {
    /**
     * @see ViewModelFactory to see creation of lazy property viewModelFactory.
     * It is injected from the ViewModelModule class
     */
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: PrimaryViewModel by viewModels { viewModelFactory }

    private lateinit var timestampTextView: TextView

    /**
     * Since this implements DaggerFragment(),
     * it takes care of injection behind the scenes in onAttach()
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_primary, container, false)
        timestampTextView = view.findViewById(R.id.timestamp)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel.infoText.observe(viewLifecycleOwner, Observer {
            timestampTextView.text = "current time = $it"
        })
    }
}
