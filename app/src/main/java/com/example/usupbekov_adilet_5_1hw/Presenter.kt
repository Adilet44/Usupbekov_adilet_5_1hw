package com.example.usupbekov_adilet_5_1hw

class Presenter {
    private var model = Injector.getModel()
    private lateinit var view: CounterView

    fun increment() {
        model.increment()
        if(model.count == 15) {
            view.changeColor()
            view.showCount(model.count)
        }else if (model.count == 10) {
            view.showCongratulation()
            view.showCount(model.count)
        }
        view.showCount(model.count)

    }
    fun decrement() {
        model.decrement()
        if(model.count == 10) {
            view.showCongratulation()
            view.showCount(model.count)
        }
        view.showCount(model.count)
    }

    fun attachView(viewFromActivivty: MainActivity) {
        view = viewFromActivivty
    }
}