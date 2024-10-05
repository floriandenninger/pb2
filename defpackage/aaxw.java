package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aaxw extends aasw {
    public final aapw a;
    private final aasp b;

    public aaxw(aarm aarmVar, ajoy ajoyVar, ysl yslVar, aapw aapwVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        this.a = aapwVar;
        this.b = c(asem.a, aarmVar, aaxq.d, aaxf.l);
    }

    public final aaxv a() {
        return new aaxv(this.f, null, null, null);
    }

    public final anhy b(aaxv aaxvVar, Executor executor) {
        return anfq.h(this.b.b(aaxvVar, executor), new amml() { // from class: aaxu
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                asem asemVar = (asem) obj;
                aaxw.this.a.a(asemVar);
                return asemVar;
            }
        }, angq.a);
    }
}
