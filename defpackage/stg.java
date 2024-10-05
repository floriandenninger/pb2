package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class stg {
    public final ayqi a;
    public final ayqi b;
    public final AtomicReference c;
    public final AtomicBoolean d;
    public final stj e;

    public stg(stj stjVar, ayqi ayqiVar) {
        ayqi a = ayqr.a();
        this.e = stjVar;
        this.a = ayqiVar;
        this.b = a;
        this.c = new AtomicReference();
        this.d = new AtomicBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        ayqx ayqxVar = (ayqx) this.c.getAndSet(null);
        if (ayqxVar != null) {
            ayqxVar.qc();
        }
    }
}
