package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pce extends pbx {
    final /* synthetic */ pcg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pce(pcg pcgVar, pft pftVar) {
        super(pftVar);
        this.f = pcgVar;
    }

    @Override // defpackage.pbx, defpackage.pcn
    public final void g(long j, int i, int i2, int i3, byte[] bArr) {
        super.g(j, i, i2, i3, bArr);
        this.f.b++;
    }
}
