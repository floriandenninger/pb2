package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zhb implements azrw {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ zhb(int i, int i2, int i3) {
        this.c = i3;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.azrw
    public final Object get() {
        if (this.c == 0) {
            return new ViewGroup.LayoutParams(this.a, this.b);
        }
        return new FrameLayout.LayoutParams(this.a, this.b);
    }
}
