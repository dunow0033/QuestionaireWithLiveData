package com.example.questionairewithlivedataandviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class QuestionViewModel : ViewModel() {

    private var _scorePresent: MutableLiveData<Int> = MutableLiveData()
    val scorePresent: LiveData<Int> = _scorePresent

    private var _miami: MutableLiveData<Boolean> = MutableLiveData()
    val miami: LiveData<Boolean> = _miami

    private var _orlando: MutableLiveData<Boolean> = MutableLiveData()
    val orlando: LiveData<Boolean> = _orlando

    private var _tallahassee: MutableLiveData<Boolean> = MutableLiveData()
    val tallahassee: LiveData<Boolean> = _tallahassee


}