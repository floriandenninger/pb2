package defpackage;

import android.view.Surface;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oyj implements Runnable {
    final /* synthetic */ Surface a;
    final /* synthetic */ oym b;

    public oyj(oym oymVar, Surface surface) {
        this.b = oymVar;
        this.a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.d(this.a);
    }
}
