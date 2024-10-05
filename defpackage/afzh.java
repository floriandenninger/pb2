package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afzh implements afzj {
    public final Context a;
    private final Executor b;
    private final azrr c = azrr.ab();
    private boolean d = false;
    private final aadw e;

    public afzh(Context context, aadw aadwVar, Executor executor) {
        this.a = context;
        this.e = aadwVar;
        this.b = executor;
    }

    @Override // defpackage.afzj
    public final void a(final antg antgVar) {
        if (this.d) {
            return;
        }
        this.d = true;
        ayqj x = ayqj.C(new Callable() { // from class: afzg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                afzh afzhVar = afzh.this;
                antc.c(afzhVar.a, antgVar);
                zga.g("FirebaseApp initialization complete");
                return true;
            }
        }).M(azre.b(this.b)).x(zxi.j);
        asvu asvuVar = this.e.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        int i = asvuVar.aq;
        StringBuilder sb = new StringBuilder(68);
        sb.append("Initializing Async FirebaseApp client... (");
        sb.append(i);
        sb.append(" seconds delay)");
        zga.g(sb.toString());
        if (i > 0) {
            x = x.v(i, TimeUnit.SECONDS);
        }
        x.Z(this.c);
    }

    @Override // defpackage.afzj
    public final boolean b() {
        if (this.c.af()) {
            return ((Boolean) this.c.ac()).booleanValue();
        }
        return false;
    }
}
