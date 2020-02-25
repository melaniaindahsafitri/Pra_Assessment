package org.d3if4009.pra_a1


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.view.*
import org.d3if4009.pra_a1.databinding.FragmentPersegiPanjangBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 *
 */
class persegiPanjang : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentPersegiPanjangBinding>(
            inflater, R.layout.fragment_persegi_panjang, container, false

        )

        fun HitungLuas(panjang: Int, Lebar: Int): Double {
            return (panjang * Lebar).toDouble()
        }
        binding.btnHitungpp.setOnClickListener {
            val HasilLuas =
                HitungLuas(binding.editText2.text.toString().toInt(), binding.editText3.text.toString().toInt())
        }

        fun HitungKeliling(panjang: Int, Lebar: Int): Double {
            return (panjang * 2) + (Lebar * 2).toDouble()
        }
        binding.btnHitungpp.setOnClickListener {
            val HasilKeliling =
                HitungKeliling(binding.editText2.text.toString().toInt(), binding.editText3.text.toString().toInt())
        }
        return binding.root
    }
}