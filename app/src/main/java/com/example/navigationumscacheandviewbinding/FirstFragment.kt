package com.example.navigationumscacheandviewbinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationumscacheandviewbinding.Adapters.UMSAdapter
import com.example.navigationumscacheandviewbinding.CLASS.UMS
import com.example.navigationumscacheandviewbinding.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    lateinit var umsAdapter: UMSAdapter
    lateinit var umsList: ArrayList<UMS>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        _binding = FragmentFirstBinding.inflate(inflater, container, false)

        loadData()


        return binding.root


    }

    private fun loadData() {

        umsList = ArrayList()

        for (i in 0 until 100) {
            umsList.add(
                UMS(
                    "Mobi 20",
                    "*111*120#",
                    "20.000/1000 so'mlik oylik/kunlik abonent to'lov 500/17",
                    "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                            "\n" +
                            "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                            "\n" +
                            "Internet-trafikni yaxlitlash kvanti 1 KB.\n" +
                            "\n" +
                            "“Mobi 20” tarifida “Gap ko‘p” xizmatini ulash mumkin. Ulanish narxi- 10 000 so`m\n" +
                            "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi.\n" +
                            "\n" +
                            "Ushbu tarif rejasiga o'tish uchun abonent balansida kamida 24 210,35 so'm (tarif rejasini o'zgartirish uchun 4210,35 so'm miqdoridagi to'lovni hisobga olganda)  yoki 40 000 so'm (tarif rejasini o'zgartirish uchun 20000 so'm miqdoridagi to'lovni hisobga olganda) bo'lishi kerak. Hisobda yuqorida ko'rsatib o'tilgan qiymatlardan kam mablag' bo'lganda, o'tishni amalga oshirish imkoniyati mavjud emas."
                )
            )

            umsList.add(
                UMS(
                    "Mobi 30",
                    "*111*120#",
                    "20.000/1000 so'mlik oylik/kunlik abonent to'lov 500/17",
                    "Qo‘ng‘iroqlarni narxlash daqiqalar bo‘yicha amalga oshiriladi.\n" +
                            "\n" +
                            "Barcha chiquvchi qo‘ng‘iroqlarni narxlash 1-soniyadan boshlanadi. Qo‘ng‘iroq davomiyligi katta tarafga qarab yaxlitlanadi.\n" +
                            "\n" +
                            "Internet-trafikni yaxlitlash kvanti 1 KB.\n" +
                            "\n" +
                            "“Mobi 20” tarifida “Gap ko‘p” xizmatini ulash mumkin. Ulanish narxi- 10 000 so`m\n" +
                            "Ushbu tarif rejasiga yangi ulanilganda yoki o‘tilganda, abonent to‘lovi darhol yechib olinadi. Abonent to‘loviga kiritilgan daqiqa, Mb va SMS to'plamlari to‘liq hajmda beriladi.\n" +
                            "\n" +
                            "Ushbu tarif rejasiga o'tish uchun abonent balansida kamida 24 210,35 so'm (tarif rejasini o'zgartirish uchun 4210,35 so'm miqdoridagi to'lovni hisobga olganda)  yoki 40 000 so'm (tarif rejasini o'zgartirish uchun 20000 so'm miqdoridagi to'lovni hisobga olganda) bo'lishi kerak. Hisobda yuqorida ko'rsatib o'tilgan qiymatlardan kam mablag' bo'lganda, o'tishni amalga oshirish imkoniyati mavjud emas."
                )
            )

        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        umsAdapter  = UMSAdapter(umsList,object : UMSAdapter.OnItemClickListener{
            override fun onItemClick(ums: UMS, position: Int) {

                val bundle = Bundle()

                bundle.putSerializable("a",ums)

                findNavController().navigate(R.id.secondFragment,bundle)

            }

        })


        binding.rv.adapter = umsAdapter

    }

}