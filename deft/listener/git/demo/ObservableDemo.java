package design.deft.decorate.mode.deft.listener.git.demo;

import design.deft.decorate.mode.deft.listener.git.component.MyObservable;

public class ObservableDemo extends MyObservable {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String date) {
        this.data = date;
        this.setChange();
        this.notifyObservers();
    }
}
