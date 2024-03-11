package co.pacastrillonp.dogedex.domain.usecases

abstract class BaseUseCase<T> {
    abstract suspend fun execute(): T?
}