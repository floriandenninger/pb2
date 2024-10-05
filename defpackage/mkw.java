package defpackage;

import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mkw implements azrw {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ mkw(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.azrw
    public final Object get() {
        int i = this.b;
        if (i == 0) {
            return new FrameLayout.LayoutParams(-1, this.a);
        }
        if (i == 1) {
            int i2 = this.a;
            return new LinearLayout.LayoutParams(i2, i2);
        }
        if (i != 2) {
            return i != 3 ? Integer.valueOf(this.a) : new FrameLayout.LayoutParams(this.a, -1);
        }
        int i3 = this.a;
        return new FrameLayout.LayoutParams(i3, i3);
    }
}
