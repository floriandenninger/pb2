package defpackage;

import android.os.Parcel;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aarr {
    static aarr a;
    volatile boolean b;
    private final azrw c;
    private final afsy d;

    public aarr(azrw azrwVar, aaea aaeaVar, afsy afsyVar) {
        this.c = azrwVar;
        this.d = afsyVar;
        a = this;
        if (aaeaVar != null) {
            aaeaVar.a.ax(new ayrs() { // from class: aarq
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    aarr aarrVar = aarr.this;
                    atfr atfrVar = ((arfd) obj).f;
                    if (atfrVar == null) {
                        atfrVar = atfr.a;
                    }
                    aarrVar.b = atfrVar.g;
                }
            });
        }
    }

    public static aooy b(Parcel parcel, aooy aooyVar) {
        byte[] createByteArray = parcel.createByteArray();
        if (createByteArray == null) {
            return aooyVar;
        }
        aarr aarrVar = a;
        if (aarrVar != null) {
            aarrVar.a(createByteArray, aooyVar);
        }
        try {
            return aooyVar.toBuilder().mergeFrom(createByteArray, aomw.b()).build();
        } catch (aoob e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static aooy c(byte[] bArr, aooy aooyVar) {
        aarr aarrVar = a;
        if (aarrVar != null) {
            return aarrVar.a(bArr, aooyVar);
        }
        try {
            return aooyVar.toBuilder().mergeFrom(bArr, aomw.b()).build();
        } catch (aoob e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [aooy, java.lang.Object] */
    public final aooy a(final byte[] bArr, aooy aooyVar) {
        bArr.getClass();
        aooyVar.getClass();
        try {
            ?? n = aooyVar.getParserForType().n(bArr, aomw.b());
            ((aaqz) this.c.get()).b(this.d.c(), n, bArr, new amnv() { // from class: aarp
                @Override // defpackage.amnv
                public final Object get() {
                    aomf F;
                    byte[] bArr2 = bArr;
                    try {
                        if (aarr.a == null || !aarr.a.b) {
                            F = yny.F(aomf.x(bArr2), 1);
                        } else {
                            F = yny.G(bArr2, 1);
                        }
                        if (F == null) {
                            return arnd.a;
                        }
                        return (arnd) aonm.parseFrom(arnd.a, F, aomw.b());
                    } catch (aoob e) {
                        zga.d("Exception while parsing response context", e);
                        return arnd.a;
                    }
                }
            });
            return n;
        } catch (aoob e) {
            zga.d("Exception while parsing InnerTube response", e);
            return null;
        }
    }
}
