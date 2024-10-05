package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctc implements ctd, dds {
    private static final hy a = ddu.b(20, new cun(1));
    private ctd b;
    private boolean c;
    private boolean d;
    private final aldo e = aldo.c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ctc d(ctd ctdVar) {
        ctc ctcVar = (ctc) a.a();
        did.ap(ctcVar);
        ctcVar.d = false;
        ctcVar.c = true;
        ctcVar.b = ctdVar;
        return ctcVar;
    }

    @Override // defpackage.ctd
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.ctd
    public final Class b() {
        return this.b.b();
    }

    @Override // defpackage.ctd
    public final Object c() {
        return this.b.c();
    }

    @Override // defpackage.ctd
    public final synchronized void e() {
        this.e.b();
        this.d = true;
        if (this.c) {
            return;
        }
        this.b.e();
        this.b = null;
        a.b(this);
    }

    @Override // defpackage.dds
    public final aldo f() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g() {
        this.e.b();
        if (this.c) {
            this.c = false;
            if (this.d) {
                e();
                return;
            }
            return;
        }
        throw new IllegalStateException("Already unlocked");
    }
}
