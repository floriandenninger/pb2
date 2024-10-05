package defpackage;

import com.google.android.exoplayer.MediaFormat;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class pjy implements Runnable {
    final /* synthetic */ MediaFormat a;
    final /* synthetic */ pka b;

    public pjy(pka pkaVar, MediaFormat mediaFormat) {
        this.b = pkaVar;
        this.a = mediaFormat;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b.g(this.a);
    }
}
