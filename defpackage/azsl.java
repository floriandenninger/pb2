package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class azsl implements azss {
    private final azst key;

    public azsl(azst azstVar) {
        azstVar.getClass();
        this.key = azstVar;
    }

    @Override // defpackage.azsv
    public Object fold(Object obj, azty aztyVar) {
        aztyVar.getClass();
        return azth.a(this, obj, aztyVar);
    }

    @Override // defpackage.azss, defpackage.azsv
    public azss get(azst azstVar) {
        azstVar.getClass();
        return azth.b(this, azstVar);
    }

    @Override // defpackage.azss
    public azst getKey() {
        return this.key;
    }

    @Override // defpackage.azsv
    public azsv minusKey(azst azstVar) {
        azstVar.getClass();
        return azth.c(this, azstVar);
    }

    @Override // defpackage.azsv
    public azsv plus(azsv azsvVar) {
        azsvVar.getClass();
        return azth.d(this, azsvVar);
    }
}
