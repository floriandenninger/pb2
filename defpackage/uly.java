package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uly extends ult {
    public static final amml a = new uly();

    @Override // defpackage.ult
    public final void a(qrl qrlVar, ukh ukhVar) {
        if (!qrlVar.h() || "null".equals(qrlVar.f())) {
            return;
        }
        ukhVar.c = qrlVar.f();
    }

    @Override // defpackage.ult
    public final void b(qrl qrlVar, ukh ukhVar) {
        if (!qrlVar.i() || "null".equals(qrlVar.g())) {
            return;
        }
        ukhVar.b = qrlVar.g();
    }

    @Override // defpackage.ult
    public final void c(qrl qrlVar, ukh ukhVar) {
        DataHolder dataHolder = qrlVar.a;
        int i = qrlVar.b;
        int i2 = qrlVar.c;
        dataHolder.a("is_dasher", i);
        ukhVar.c(dataHolder.d[i2].getInt(i, dataHolder.c.getInt("is_dasher")) == 2);
    }
}
