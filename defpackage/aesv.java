package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aesv extends ozm {
    final /* synthetic */ aesy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aesv(aesy aesyVar, pbz pbzVar) {
        super(pbzVar);
        this.a = aesyVar;
    }

    @Override // defpackage.ozm, defpackage.pcn
    public final void g(final long j, int i, int i2, int i3, byte[] bArr) {
        Long l;
        final aesy aesyVar = this.a;
        if (aesyVar.j && (l = aesyVar.i) != null) {
            final long longValue = l.longValue();
            Handler handler = aesyVar.c;
            if (handler != null && aesyVar.d != null) {
                handler.post(new Runnable() { // from class: aess
                    @Override // java.lang.Runnable
                    public final void run() {
                        aesy aesyVar2 = aesy.this;
                        long j2 = longValue;
                        long j3 = j;
                        afbs afbsVar = (afbs) aesyVar2.d;
                        if (aesyVar2.e != afbsVar.u()) {
                            return;
                        }
                        afbsVar.D = (j2 - j3) / 1000;
                    }
                });
            }
            this.a.j = false;
        }
        aeta aetaVar = this.a.l;
        if (aetaVar.p < 0) {
            aetaVar.p = j;
        }
        aetaVar.q = j;
        this.a.l(j);
        super.g(j, i, i2, i3, bArr);
    }
}
