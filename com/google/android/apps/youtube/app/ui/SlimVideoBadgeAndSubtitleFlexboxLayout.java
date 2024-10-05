package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.flexbox.FlexboxLayout;
import defpackage.ptv;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SlimVideoBadgeAndSubtitleFlexboxLayout extends FlexboxLayout {
    public int a;

    public SlimVideoBadgeAndSubtitleFlexboxLayout(Context context) {
        super(context);
        this.a = -1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.flexbox.FlexboxLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a < 0 || this.b == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.c.size());
        for (ptv ptvVar : this.c) {
            if (ptvVar.a() != 0) {
                arrayList.add(ptvVar);
            }
        }
        if (arrayList.size() > this.a) {
            removeViewAt(getChildCount() - 1);
            measure(i, i2);
        }
    }

    public SlimVideoBadgeAndSubtitleFlexboxLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = -1;
    }

    public SlimVideoBadgeAndSubtitleFlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = -1;
    }
}
