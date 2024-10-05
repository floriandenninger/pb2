package defpackage;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afpg implements View.OnLayoutChangeListener {
    final /* synthetic */ afph a;
    private final avgg b;

    public afpg(afph afphVar, avgg avggVar) {
        this.a = afphVar;
        this.b = avggVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.b.removeOnLayoutChangeListener(this);
        this.a.a(this.b);
    }
}
