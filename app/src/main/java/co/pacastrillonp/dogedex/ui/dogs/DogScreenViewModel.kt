package co.pacastrillonp.dogedex.ui.dogs

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.pacastrillonp.dogedex.presentables.Dog
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class DogScreenViewModel : ViewModel() {

    private val _dogList = MutableLiveData<List<Dog>>()
    val dogList: LiveData<List<Dog>> = _dogList

    init {
        getDogs()
    }

    private fun getDogs() {
        viewModelScope.launch {
            getFakeDogs()
        }
    }

    private suspend fun getFakeDogs() {
        withContext(Dispatchers.IO) {
            val dogList = mutableListOf<Dog>()
            dogList.add(
                Dog(
                    1, 1, "Chihuahua", "Toy", 5.4,
                    6.7, "", "12 - 15", "", 10.5,
                    12.3
                )
            )
            dogList.add(
                Dog(
                    2, 1, "Labrador", "Toy", 5.4,
                    6.7, "", "12 - 15", "", 10.5,
                    12.3
                )
            )
            dogList.add(
                Dog(
                    3, 1, "Retriever", "Toy", 5.4,
                    6.7, "", "12 - 15", "", 10.5,
                    12.3
                )
            )
            dogList.add(
                Dog(
                    4, 1, "San Bernardo", "Toy", 5.4,
                    6.7, "", "12 - 15", "", 10.5,
                    12.3
                )
            )
            dogList.add(
                Dog(
                    5, 1, "Husky", "Toy", 5.4,
                    6.7, "", "12 - 15", "", 10.5,
                    12.3
                )
            )
            dogList.add(
                Dog(
                    6, 1, "Xoloscuincle", "Toy", 5.4,
                    6.7, "", "12 - 15", "", 10.5,
                    12.3
                )
            )
            _dogList.postValue(dogList)
        }
    }

}