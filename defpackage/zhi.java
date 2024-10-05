package defpackage;

import android.view.ViewGroup;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zhi implements zhh {
    private final float a;

    public zhi(float f) {
        this.a = f;
    }

    @Override // defpackage.zhh
    public final /* bridge */ /* synthetic */ boolean a(ViewGroup.LayoutParams layoutParams) {
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (Math.abs(layoutParams2.weight - this.a) < 1.0E-4f) {
            return false;
        }
        layoutParams2.weight = this.a;
        return true;
    }
}
