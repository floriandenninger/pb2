package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aldq {
    public final avtr j;
    private final akyb o;
    private final alep p;

    public aldq(avtr avtrVar, akyb akybVar, alep alepVar) {
        this.j = avtrVar;
        this.o = akybVar;
        this.p = alepVar;
    }

    public abstract akyq a(akzs akzsVar);

    public abstract akzp b(akzs akzsVar);

    public anhy d(String str, akwm akwmVar) {
        return anaf.O(t(this.p.d(), false));
    }

    public abstract ayro e();

    public abstract String f();

    public abstract boolean h();

    public boolean j() {
        return false;
    }

    public akyq l() {
        return null;
    }

    public abstract akwp m(Throwable th, String str, akwm akwmVar, boolean z);

    public abstract anhy p(String str, akwm akwmVar);

    public void r(long j, akzs akzsVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final akwp t(akzp akzpVar, boolean z) {
        return u(akzpVar, z, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final akwp u(akzp akzpVar, boolean z, ayrs ayrsVar) {
        ayro e = e();
        if (e == null) {
            throw new IllegalStateException("Only GarbageCollection has a null setState func and should not call createJobUpdater");
        }
        return new aldp(this, this.o, akzpVar, ayrsVar, akzpVar, z, e);
    }
}
