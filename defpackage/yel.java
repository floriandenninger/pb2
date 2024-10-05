package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yel implements aaha {
    public final aoae a;
    private final yfe b;

    public yel(yfe yfeVar, aoae aoaeVar, byte[] bArr, byte[] bArr2) {
        this.b = yfeVar;
        this.a = aoaeVar;
    }

    @Override // defpackage.aaha
    public final void kE(apxf apxfVar, Map map) {
        asjp asjpVar = (asjp) apxfVar.pX(asjp.b);
        final yfe yfeVar = this.b;
        final byte[] I = asjpVar.c.I();
        final byte[] I2 = asjpVar.d.I();
        yfeVar.d.add(new yek(this));
        final int i = 0;
        final int i2 = 1;
        ynm.n(yfeVar.b, ((abep) yfeVar.c.get()).c(), new zfi() { // from class: yfc
            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i == 0) {
                    yfeVar.a(aaeb.PRODUCTION, I, I2);
                    return;
                }
                yfeVar.a((aaeb) obj, I, I2);
            }
        }, new zfi() { // from class: yfc
            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i2 == 0) {
                    yfeVar.a(aaeb.PRODUCTION, I, I2);
                    return;
                }
                yfeVar.a((aaeb) obj, I, I2);
            }
        });
    }
}
