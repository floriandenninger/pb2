package defpackage;

import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zhm implements zhh {
    private final int a;
    private final /* synthetic */ int b;

    public zhm(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.zhh
    public final boolean a(ViewGroup.LayoutParams layoutParams) {
        if (this.b != 0) {
            int i = layoutParams.height;
            int i2 = this.a;
            if (i == i2) {
                return false;
            }
            layoutParams.height = i2;
            return true;
        }
        int i3 = layoutParams.width;
        int i4 = this.a;
        if (i3 == i4) {
            return false;
        }
        layoutParams.width = i4;
        return true;
    }
}
