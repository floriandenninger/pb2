package defpackage;

import android.view.ViewGroup;
import android.widget.RelativeLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zhk implements zhh {
    private final int a;
    private final int b;

    public zhk(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.zhh
    public final /* bridge */ /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        int[] rules = layoutParams2.getRules();
        int i = this.a;
        int i2 = rules[i];
        int i3 = this.b;
        if (i2 == i3) {
            return false;
        }
        layoutParams2.addRule(i, i3);
        return true;
    }
}
