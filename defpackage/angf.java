package defpackage;

import java.util.logging.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class angf implements Runnable {
    final /* synthetic */ angk a;

    public angf(angk angkVar) {
        this.a = angkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.e(angj.WILL_CLOSE, angj.CLOSING);
        angk angkVar = this.a;
        angk.a.logp(Level.FINER, "com.google.common.util.concurrent.ClosingFuture", "close", "closing {0}", angkVar);
        angkVar.b.close();
        this.a.e(angj.CLOSING, angj.CLOSED);
    }
}
