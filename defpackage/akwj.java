package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class akwj extends akwr {
    public akwj(akyb akybVar) {
        super(akybVar);
    }

    @Override // defpackage.akwr
    public final akzs b(akzs akzsVar) {
        if (akzsVar == null) {
            return null;
        }
        aone builder = akzsVar.toBuilder();
        c(builder);
        return (akzs) builder.build();
    }

    public abstract void c(aone aoneVar);
}
