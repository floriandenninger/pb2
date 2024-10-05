package com.google.android.libraries.youtube.edit.audioswap.ui;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.google.android.libraries.youtube.common.ui.DefaultTabsBar;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class AudioSwapTabsBar extends DefaultTabsBar {
    public ViewPager c;

    public AudioSwapTabsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.yzq
    public final void m(int i, boolean z) {
        super.m(i, z);
        ViewPager viewPager = this.c;
        if (viewPager == null || !z) {
            return;
        }
        viewPager.m(i, true);
    }
}
