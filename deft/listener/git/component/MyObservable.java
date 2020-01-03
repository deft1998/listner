package design.deft.decorate.mode.deft.listener.git.component;

import design.deft.decorate.mode.deft.listener.git.component.MyObserver;

import java.util.Vector;

public class MyObservable {


    private boolean changed = false;
    Vector<MyObserver> observers=new Vector<>();

    public boolean addObservers(MyObserver observer) {
        if (observer==null) {
            throw new NullPointerException();
        }
        return observers.add(observer);
    }
    public void setChange(){
        changed=true;
    }

    public void cleanrChange(){
        changed=false;
    }

    public void notifyObservers(){
        if (!changed)return;

        for (MyObserver observer : observers) {
            //TODO
            observer.update(this, "");
        }
        cleanrChange();
    }



    //传递改变后的数据
    public void notifyObservers(Object o){
        if (!changed)return;

        for (MyObserver observer : observers) {
            //TODO
            observer.update(this, o);
        }
        cleanrChange();
    }

    public boolean deleteObserver(MyObserver o){
        if(!observers.contains(o)){
           throw new NullPointerException();
        }
        return observers.remove(o);
    }

    public void deleteObservers(){
        observers.removeAllElements();
    }

    public int getObserversSize(){
        return observers.size();
    }
    public boolean hasChange(){
        return changed;
    }


}
