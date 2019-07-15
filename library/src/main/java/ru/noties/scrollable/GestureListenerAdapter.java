package ru.noties.scrollable;

import android.view.GestureDetector;
import android.view.MotionEvent;

/**
 * Created by Dimitry Ivanov (mail@dimitryivanov.ru) on 29.03.2015.
 */
public abstract class GestureListenerAdapter implements GestureDetector.OnGestureListener {

    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
//        用户执行抛操作之后的回调，MOVE事件之后手松开（UP事件）那一瞬间的x或者y方向速度，如果达到一定数值（源码默认是每秒50px），
//        就是抛操作（也就是快速滑动的时候松手会有这个回调，因此基本上有onFling必然有onScroll）。

        return false;
    }
}
