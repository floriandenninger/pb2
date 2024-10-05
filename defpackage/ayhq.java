package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayhq implements Runnable {
    final /* synthetic */ InputStream a;
    final /* synthetic */ ayhx b;

    public ayhq(ayhx ayhxVar, InputStream inputStream) {
        this.b = ayhxVar;
        this.a = inputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.e.n(this.a);
    }
}
