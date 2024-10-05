package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class angb implements anhh {
    final /* synthetic */ angk a;
    final /* synthetic */ Executor b;

    public angb(angk angkVar, Executor executor) {
        this.a = angkVar;
        this.b = executor;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.b.a.a((Closeable) obj, this.b);
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
    }
}
