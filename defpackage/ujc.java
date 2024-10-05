package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ujc extends uje {
    private final qlm a;
    private final qlm b;
    private final String c;

    public ujc(Context context) {
        qlm qlmVar = new qlm(context, "ONEGOOGLE_MOBILE", null);
        qlm d = qlm.d(context, "ONEGOOGLE_MOBILE");
        this.a = qlmVar;
        this.b = d;
        this.c = context.getApplicationContext().getPackageName();
    }

    @Override // defpackage.uje, defpackage.ujf
    public final void a(Object obj, aoso aosoVar) {
        tff b;
        qli qliVar;
        if (obj != null) {
            b = tff.a(tyo.X(obj));
        } else {
            b = tff.b();
        }
        int i = b.b;
        if (i == 4) {
            return;
        }
        if (i == 1) {
            if (obj != null) {
            } else {
                i = 2;
            }
        }
        amkq.E(aosoVar.e() != aost.UNKNOWN_EVENT);
        amkq.E(aosoVar.d() != aosr.UNKNOWN_COMPONENT);
        amkq.E(aosoVar.c() != aosq.UNKNOWN_COMPONENT_APPEARANCE);
        aone createBuilder = aosp.a.createBuilder();
        aosn aosnVar = (aosn) aosoVar.toBuilder();
        String str = this.c;
        aosnVar.copyOnWrite();
        ((aoso) aosnVar.instance).o(str);
        aoso aosoVar2 = (aoso) aosnVar.build();
        createBuilder.copyOnWrite();
        aosp aospVar = (aosp) createBuilder.instance;
        aosoVar2.getClass();
        aospVar.c = aosoVar2;
        aospVar.b |= 1;
        aosp aospVar2 = (aosp) createBuilder.build();
        int i2 = i - 1;
        if (i2 == 0) {
            qli c = this.a.c(aospVar2.toByteArray());
            c.e(String.valueOf(tyo.Y(obj)));
            qliVar = c;
        } else if (i2 != 1) {
            qliVar = this.b.c(aospVar2.toByteArray());
        } else {
            qliVar = this.a.c(aospVar2.toByteArray());
        }
        qliVar.c(aosoVar.e().ae);
        qliVar.b();
    }
}
