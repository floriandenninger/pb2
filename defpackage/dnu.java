package defpackage;

import android.view.Choreographer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dnu implements Choreographer.FrameCallback {
    final /* synthetic */ dnw a;

    public dnu(dnw dnwVar) {
        this.a = dnwVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.d(j);
    }
}
