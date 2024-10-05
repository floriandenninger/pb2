package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ozp implements Runnable {
    final /* synthetic */ IOException a;
    final /* synthetic */ ozs b;

    public ozp(ozs ozsVar, IOException iOException) {
        this.b = ozsVar;
        this.a = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ozs ozsVar = this.b;
        ozsVar.c.b(ozsVar.b, this.a);
    }
}
