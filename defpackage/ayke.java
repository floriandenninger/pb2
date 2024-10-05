package defpackage;

import io.grpc.Status;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayke extends ayaq {
    public final ayai a;
    private final ayba b;
    private final axzp c;
    private final Executor d;
    private final aych e;
    private axzo f;
    private axzr g;

    public ayke(ayba aybaVar, axzp axzpVar, Executor executor, aych aychVar, axzo axzoVar) {
        this.b = aybaVar;
        this.c = axzpVar;
        this.e = aychVar;
        Executor executor2 = axzoVar.c;
        executor = executor2 != null ? executor2 : executor;
        this.d = executor;
        axzo axzoVar2 = new axzo(axzoVar);
        axzoVar2.c = executor;
        this.f = axzoVar2;
        this.a = ayai.b();
    }

    @Override // defpackage.aycv, defpackage.axzr
    public final void b(String str, Throwable th) {
        axzr axzrVar = this.g;
        if (axzrVar != null) {
            axzrVar.b(str, th);
        }
    }

    @Override // defpackage.ayaq, defpackage.aycv
    protected final axzr f() {
        return this.g;
    }

    @Override // defpackage.ayaq, defpackage.axzr
    public final void k(ayaw ayawVar, aycd aycdVar) {
        new aybn(this.e, aycdVar, this.f);
        ayaz a = this.b.a();
        Status status = a.a;
        if (status.f()) {
            ayle b = ((aylg) a.b).b(this.e);
            if (b != null) {
                this.f = this.f.d(ayle.a, b);
            }
            axzr a2 = this.c.a(this.e, this.f);
            this.g = a2;
            a2.k(ayawVar, aycdVar);
            return;
        }
        this.d.execute(new aykd(this, ayawVar, status, null, null));
        this.g = aykx.h;
    }
}
