package com.rks.musicx.misc.widgets;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.transition.ChangeBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.TransitionSet;
import android.util.AttributeSet;

/*
 * Created by Coolalien on 6/28/2016.
 */

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class SharedTransitionSet extends TransitionSet {

    public SharedTransitionSet(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SharedTransitionSet() {
        super();
        init();
    }

    private void init() {
        setOrdering(ORDERING_TOGETHER);
        addTransition(new ChangeBounds()).
                addTransition(new ChangeTransform()).
                addTransition(new ChangeImageTransform());
    }
}