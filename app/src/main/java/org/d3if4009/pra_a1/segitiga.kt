package org.d3if4009.pra_a1


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if4009.pra_a1.databinding.FragmentSegitigaBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class segitiga : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSegitigaBinding>(
            inflater, R.layout.fragment_segitiga, container, false
        )

        fun HitungLuas(alas: Int, tinggi: Int) : Double{
            return (alas*tinggi).toDouble()
        }
        binding.btnHitungpp.setOnClickListener {
            val HasilLuas = HitungLuas(binding.editText2.text.toString().toInt(), binding.editText3.text.toString().toInt())
        }

        fun HitungKeliling(sisi: Int) : Double{
            return (sisi*3).toDouble()
        }
        binding.btnHitungpp.setOnClickListener {
            val HasilKeliling = HitungKeliling(binding.editText2.text.toString().toInt(), binding.editText3.text.toString().toInt())
        }
        return binding.root
    }

}
