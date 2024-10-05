package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mth implements View.OnLayoutChangeListener {
    final /* synthetic */ mti a;
    private final avgg b;
    private final boolean c;

    public mth(mti mtiVar, avgg avggVar, boolean z) {
        this.a = mtiVar;
        this.b = avggVar;
        this.c = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.b.removeOnLayoutChangeListener(this);
        this.a.a(this.b, this.c);
    }
}
