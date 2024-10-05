package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azya implements azss, azst {
    public static final azya a = new azya();

    private azya() {
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
        return this;
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
