package defpackage;

import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aijn implements yst {
    private final ypa a;
    private final WeakReference b;
    private final aaep c = new aaep();
    private final aaeo d = new aaeo();
    private final aaen e = new aaen();
    private final aaem f = new aaem();

    public aijn(ypa ypaVar, acsx acsxVar) {
        this.a = ypaVar;
        this.b = new WeakReference(acsxVar);
    }

    @Override // defpackage.yst
    public final void a() {
        this.a.d(this.d);
        acsx acsxVar = (acsx) this.b.get();
        if (acsxVar != null) {
            acsxVar.c(this.d.f());
        }
    }

    @Override // defpackage.yst
    public final void b() {
        this.a.d(this.c);
        acsx acsxVar = (acsx) this.b.get();
        if (acsxVar != null) {
            acsxVar.c(this.c.f());
        }
    }

    @Override // defpackage.yst
    public final void c() {
        this.a.d(this.f);
        acsx acsxVar = (acsx) this.b.get();
        if (acsxVar != null) {
            acsxVar.c(this.f.f());
        }
    }

    @Override // defpackage.yst
    public final void d() {
        this.a.d(this.e);
        acsx acsxVar = (acsx) this.b.get();
        if (acsxVar != null) {
            acsxVar.c(this.e.f());
        }
    }
}
