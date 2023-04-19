package com.example.devmodel.emblish;

import android.util.Log;

public class ConcreteComponent extends Component{
    @Override
    public void operation() {
        Log.e("embish", "operation: concreteComponent ");
    }
}
