package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afeg implements Runnable {
    final /* synthetic */ byte[] a;
    final /* synthetic */ long b;
    final /* synthetic */ afei c;

    public afeg(afei afeiVar, byte[] bArr, long j) {
        this.c = afeiVar;
        this.a = bArr;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        afea afeaVar = this.c.c;
        byte[] bArr = this.a;
        long j = this.b;
        afdt afdtVar = ((afdz) afeaVar).a;
        if (j < afdtVar.i) {
            afdtVar.d();
        }
        afdtVar.b();
        afdtVar.g.add(bArr);
        afdtVar.h.add(Long.valueOf(j));
        afdtVar.i = j;
        if (afdtVar.g()) {
            afdtVar.a();
        }
    }
}
