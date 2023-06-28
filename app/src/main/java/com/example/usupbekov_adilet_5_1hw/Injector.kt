package com.example.usupbekov_adilet_5_1hw

class Injector {
    companion object {
        fun getPresenter(): Presenter {
            return Presenter()
        }

        fun getModel(): Model {
            return Model()
        }
    }
}