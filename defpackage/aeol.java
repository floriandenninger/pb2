package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aeol implements anhh {
    final /* synthetic */ cnh a;
    final /* synthetic */ aeom b;

    public aeol(aeom aeomVar, cnh cnhVar) {
        this.b = aeomVar;
        this.a = cnhVar;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.b.c(ByteBuffer.allocateDirect(this.a.b.length).put(this.a.b));
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        aeom aeomVar = this.b;
        aeon.c(aeomVar.a, aeomVar.c);
    }
}
