package com.bighao.project.common.annotations;

import static android.view.View.GONE;
import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Hao on 2022/3/14
 */
@IntDef({VISIBLE, INVISIBLE, GONE})
@Retention(RetentionPolicy.SOURCE)
public @interface Visibility {
}
