package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class etw {
    public final aioc a;
    private final aadw b;

    public etw(aadw aadwVar, azrw azrwVar) {
        this.b = aadwVar;
        this.a = (aioc) azrwVar.get();
    }

    public final aypn a() {
        return this.a.V();
    }

    public final aypn b() {
        return this.a.G().d;
    }

    public final Boolean c() {
        apxs apxsVar = this.b.b().z;
        if (apxsVar == null) {
            apxsVar = apxs.a;
        }
        boolean z = false;
        if (apxsVar.d) {
            if (this.a.E() != null && this.a.E().Q()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return false;
    }

    public final Long d() {
        ainy E = this.a.E();
        aixh o = E != null ? E.o() : null;
        if (o != null) {
            return Long.valueOf(o.b());
        }
        return null;
    }
}
