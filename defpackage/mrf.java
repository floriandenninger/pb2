package defpackage;

import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mrf implements Runnable {
    public final /* synthetic */ FrameLayout a;
    private final /* synthetic */ int b;

    public /* synthetic */ mrf(FrameLayout frameLayout, int i) {
        this.b = i;
        this.a = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.setVisibility(8);
        } else {
            this.a.requestFocus();
        }
    }
}
