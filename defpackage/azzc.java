package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azzc implements azss {
    public static final azwk b = new azwk();
    public final Throwable a;
    private final azst c = b;

    public azzc(Throwable th) {
        this.a = th;
    }

    @Override // defpackage.azsv
    public final Object fold(Object obj, azty aztyVar) {
        return azth.a(this, obj, aztyVar);
    }

    @Override // defpackage.azss, defpackage.azsv
    public final azss get(azst azstVar) {
        return azth.b(this, azstVar);
    }

    @Override // defpackage.azss
    public final azst getKey() {
        return this.c;
    }

    @Override // defpackage.azsv
    public final azsv minusKey(azst azstVar) {
        return azth.c(this, azstVar);
    }

    @Override // defpackage.azsv
    public final azsv plus(azsv azsvVar) {
        return azth.d(this, azsvVar);
    }
}
