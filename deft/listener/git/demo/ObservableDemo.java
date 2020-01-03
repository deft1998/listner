package design.deft.decorate.mode.deft.listener.git.demo;

import design.deft.decorate.mode.deft.listener.git.component.MyObservable;

public class ObservableDemo extends MyObservable {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        this.setChange();
        this.notifyObservers();
    }
}
