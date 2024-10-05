package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class akwq extends akwj {
    private final akzp a;

    public akwq(akyb akybVar, akzp akzpVar) {
        super(akybVar);
        this.a = akzpVar;
    }

    @Override // defpackage.akwj
    public final void c(aone aoneVar) {
        try {
            d().a(aoneVar, this.a);
            e(aoneVar);
        } catch (Exception e) {
            throw new RuntimeException("Could not apply the setState BiFunction.", e);
        }
    }

    public abstract ayro d();

    public void e(aone aoneVar) {
    }
}
