package design.deft.decorate.mode.deft.listener.git.demo;

import design.deft.decorate.mode.deft.listener.git.component.MyObservable;
import design.deft.decorate.mode.deft.listener.git.component.MyObserver;

public class ObserverDemo implements MyObserver {
    @Override
    public void update(MyObservable o, Object arg) {
        System.out.println(
                "数据发生改变，测试成功！测试10.0被修改了啦--------------------");
    }
}
