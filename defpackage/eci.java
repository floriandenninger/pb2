package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class eci extends ecl {
    private final View h;

    public eci(ebe ebeVar, aone aoneVar, int i, View view) {
        super(ebeVar, "Rh7wPiyt0Q0zAefasWAQ/36LhULiVi3U1eCO9K34euxkll+3xBb3q2iaqyDuAy33", "Kmv9uscZLQkY9DcwgermeDphrIGnHnQJYdRAudw6Thg=", aoneVar, i, 57);
        this.h = view;
    }

    @Override // defpackage.ecl
    protected final void a() {
        if (this.h != null) {
            Boolean bool = (Boolean) pyi.v.e();
            ebh ebhVar = new ebh((String) this.d.invoke(null, this.h, this.a.a.getResources().getDisplayMetrics(), bool));
            aone createBuilder = dvn.a.createBuilder();
            long longValue = ebhVar.a.longValue();
            createBuilder.copyOnWrite();
            dvn dvnVar = (dvn) createBuilder.instance;
            dvnVar.b |= 4;
            dvnVar.c = longValue;
            long longValue2 = ebhVar.b.longValue();
            createBuilder.copyOnWrite();
            dvn dvnVar2 = (dvn) createBuilder.instance;
            dvnVar2.b |= 8;
            dvnVar2.d = longValue2;
            long longValue3 = ebhVar.c.longValue();
            createBuilder.copyOnWrite();
            dvn dvnVar3 = (dvn) createBuilder.instance;
            dvnVar3.b |= 16;
            dvnVar3.e = longValue3;
            if (bool.booleanValue()) {
                long longValue4 = ebhVar.d.longValue();
                createBuilder.copyOnWrite();
                dvn dvnVar4 = (dvn) createBuilder.instance;
                dvnVar4.b |= 32;
                dvnVar4.f = longValue4;
            }
            aone aoneVar = this.g;
            dvn dvnVar5 = (dvn) createBuilder.build();
            aoneVar.copyOnWrite();
            dvo dvoVar = (dvo) aoneVar.instance;
            dvo dvoVar2 = dvo.a;
            dvnVar5.getClass();
            dvoVar.R = dvnVar5;
            dvoVar.c |= 524288;
        }
    }
}
