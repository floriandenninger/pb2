package defpackage;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lry extends lyp implements ypd {
    private final ci h;
    private final aahd i;
    private final aalw j;
    private final ajut k;
    private final lru l;

    public lry(Context context, ypa ypaVar, aahd aahdVar, ajvb ajvbVar, ajoy ajoyVar, lru lruVar, aalw aalwVar, aoae aoaeVar, ci ciVar, ajut ajutVar, byte[] bArr, byte[] bArr2) {
        super(context, ypaVar, aahdVar, ajvbVar, ajoyVar, lruVar, aalwVar, aoaeVar, null, null);
        this.i = aahdVar;
        this.h = ciVar;
        this.l = lruVar;
        this.j = aalwVar;
        this.k = ajutVar;
    }

    @Override // defpackage.lyp, defpackage.ajwn, defpackage.ajva
    public final void a(atdc atdcVar, View view, Object obj, acra acraVar) {
        this.e = obj;
        this.f = acraVar;
        ajxw.b(this.h, atdcVar, this.i, this.k, c(), new knb(acraVar, 2), this.j, this.l);
    }

    @Override // defpackage.lyp, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls != lry.class) {
            return mcy.h(this, obj, i);
        }
        if (i == -1) {
            return new Class[]{izi.class};
        }
        if (i == 0) {
            b((izi) obj);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
