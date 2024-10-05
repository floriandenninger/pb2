package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class afad extends bds {
    public final afag o;
    public final int p;

    public afad(ate ateVar, ath athVar, pms pmsVar, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, bdm bdmVar, afag afagVar, int i3) {
        super(ateVar, athVar, pmsVar, i, obj, j, j2, j3, j4, j5, i2, j6, bdmVar);
        this.o = afagVar;
        this.p = i3;
    }

    @Override // defpackage.bds
    protected final bdo g(final bdk bdkVar) {
        return new bdo() { // from class: afac
            @Override // defpackage.bdo
            public final bjc a(int i, int i2) {
                afad afadVar = afad.this;
                return new afae(bdkVar.a(i, i2), afadVar.o, afadVar.p);
            }
        };
    }
}
