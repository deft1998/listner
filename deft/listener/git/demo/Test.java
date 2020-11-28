package design.deft.decorate.mode.deft.listener.git.demo;

import design.deft.decorate.mode.deft.listener.git.component.MyObservable;

public class Test {

    public static void main(String[] args) {
        ObservableDemo observable = new ObservableDemo();
        observable.addObservers(new ObserverDemo());
        observable.setData("数据改变");
        System.out.print("冲突解决");
    }
}
