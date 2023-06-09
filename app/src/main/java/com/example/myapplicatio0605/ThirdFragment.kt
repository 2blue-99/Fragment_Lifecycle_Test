package com.example.myapplicatio0605

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ThirdFragment : Fragment() {

    var test = 0

    init {
        Log.e("TAG", "third init: $test", )
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("TAG", "third onAttach", )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(savedInstanceState!=null){
            test = savedInstanceState.getInt("gap")
        }
        Log.e("TAG", "third onCreate / savedInstanceState : $test", )
    }

    //프래그먼트의 View를 초기화
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e("TAG", "third onCreateView", )
        return inflater.inflate(R.layout.fragment_second, container, false)
    }



    //onCreateView에서 정상적인 View객체가 반환됐을때 이 단계로 넘어오기에 해당 오버라이드에서는 완전한 View의 생성을 보장
    // 따라서 View초기값 설정, 리스너, LiveData 옵저빙, RecyclerView나 ViewPager2에 사용될 adapter 세팅등을 이곳에서 하는것이 더 안전
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e("TAG", "third onViewCreated", )
    }


    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.e("TAG", "third onViewStateRestored", )
    }

    override fun onStart() {
        super.onStart()
        Log.e("TAG", "third onStarte", )
    }

    override fun onResume() {
        super.onResume()
        Log.e("TAG", "third onResume", )
    }

    override fun onPause() {
        super.onPause()
        Log.e("TAG", "third onPause: ", )
    }

    override fun onStop() {
        super.onStop()
        Log.e("TAG", "third onStop: ", )
    }

    override fun onSaveInstanceState(outState: Bundle) {
        val gap = 777
        outState.putInt("gap",gap)
        super.onSaveInstanceState(outState)
        Log.e("TAG", "third onSaveInstanceState:", )

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("TAG", "third onDestroyView: ", )
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e("TAG", "third onDestroy: ", )
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("TAG", "third onDetach: ", )
    }
}