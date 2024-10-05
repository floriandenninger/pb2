package defpackage;

import io.grpc.Status;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amky implements Runnable {
    final /* synthetic */ amkz a;
    final /* synthetic */ aydj b;

    public amky(amkz amkzVar, aydj aydjVar) {
        this.a = amkzVar;
        this.b = aydjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        amkz amkzVar = this.a;
        aydj aydjVar = this.b;
        try {
            aydjVar.a(amkzVar.a());
        } catch (Throwable th) {
            if (th instanceof IOException) {
                aydjVar.a.a(Status.o.withDescription("Credentials failed to obtain metadata").c(th));
            } else {
                aydjVar.a.a(Status.i.withDescription("Failed computing credential metadata").c(th));
            }
        }
    }
}
