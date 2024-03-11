package co.pacastrillonp.dogedex.ui.dogs

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.pacastrillonp.dogedex.domain.usecases.FetchDogsUseCase
import co.pacastrillonp.dogedex.presentables.Dog
import co.pacastrillonp.dogedex.presentables.mappers.dogsResponseToDogs
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DogScreenViewModel @Inject constructor(
    private val fetchDogsUseCase: FetchDogsUseCase
) : ViewModel() {

    private val _dogList = MutableLiveData<List<Dog>>()
    val dogList: LiveData<List<Dog>> = _dogList

    init {
        getDogs()
    }

    private fun getDogs() {
        viewModelScope.launch {
            val dogs = fetchDogsUseCase.execute().dogsResponseToDogs()
            _dogList.postValue(dogs)
        }
    }

}