package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aadw {
    public final aady a;
    private final ayqj c;
    private final ayqj e;
    private final Object f;
    private final Object g;
    private volatile apwy b = null;
    private volatile apck d = null;

    public aadw(ayqj ayqjVar, ayqj ayqjVar2, aady aadyVar) {
        this.c = ayqjVar;
        this.e = ayqjVar2;
        this.a = aadyVar;
        if (d()) {
            this.f = new Object();
            this.g = new Object();
        } else {
            this.g = this;
            this.f = this;
        }
    }

    public final apck a() {
        if (this.d != null) {
            return this.d;
        }
        synchronized (this.f) {
            if (this.d == null) {
                if (d()) {
                    try {
                        this.d = (apck) this.e.X();
                    } catch (Throwable unused) {
                        this.d = apck.a;
                    }
                } else {
                    atej atejVar = b().k;
                    if (atejVar == null) {
                        atejVar = atej.a;
                    }
                    apck apckVar = atejVar.q;
                    if (apckVar == null) {
                        apckVar = apck.a;
                    }
                    this.d = apckVar;
                }
            }
        }
        return this.d;
    }

    public final apwy b() {
        return this.b == null ? c() : this.b;
    }

    public final apwy c() {
        synchronized (this.g) {
            if (this.b == null) {
                try {
                    this.b = (apwy) this.c.X();
                } catch (Throwable unused) {
                    this.b = apwy.a;
                }
            }
        }
        return this.b;
    }

    public final boolean d() {
        return this.e != null;
    }
}
