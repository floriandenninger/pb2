package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agrw extends aasw {
    private final afsy a;
    private final String b;
    private final agru c;

    public agrw(Context context, aarm aarmVar, ajoy ajoyVar, afsy afsyVar, ysl yslVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(ajoyVar, yslVar, null, null, null);
        afsyVar.getClass();
        this.a = afsyVar;
        String k = yjj.k(context);
        zhq.m(k);
        this.b = k;
        this.c = new agru(this, aarmVar);
    }

    public final agrv a() {
        agrv agrvVar = new agrv(this.f, this.a.c(), null, null, null);
        agrvVar.k = this.b;
        return agrvVar;
    }

    public final arxp b(agrv agrvVar) {
        return (arxp) this.c.d(agrvVar);
    }
}
