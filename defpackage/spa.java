package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class spa implements spz {
    private final /* synthetic */ int c;
    public static final /* synthetic */ spa b = new spa(1);
    public static final /* synthetic */ spa a = new spa(0);

    private /* synthetic */ spa(int i) {
        this.c = i;
    }

    @Override // defpackage.spz
    public final dgy a(dhe dheVar, sxc sxcVar, Object obj, String str, aoam aoamVar, sod sodVar, List list) {
        if (this.c == 0) {
            axoq axoqVar = (axoq) obj;
            String str2 = spb.a;
            soy a2 = soz.a(dheVar);
            a2.h(spb.b(aoamVar));
            a2.g(list);
            int b2 = axoqVar.b(4);
            if (b2 != 0 && axoqVar.b.get(b2 + axoqVar.a) != 0) {
                a2.T();
                String str3 = spb.a;
                int andIncrement = spb.b.getAndIncrement();
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 11);
                sb.append(str3);
                sb.append(andIncrement);
                a2.C(sb.toString());
            }
            return a2;
        }
        axok axokVar = (axok) obj;
        soy a3 = soz.a(dheVar);
        a3.h(spb.b(aoamVar));
        a3.g(list);
        int i = (int) (axokVar.b(6) != 0 ? axokVar.b.getInt(r6 + axokVar.a) & 4294967295L : 0L);
        if (i != 0) {
            a3.a.f = Integer.valueOf(i);
        }
        int i2 = (int) (axokVar.b(4) != 0 ? axokVar.b.getInt(r6 + axokVar.a) & 4294967295L : 0L);
        if (i2 != 0) {
            a3.a.w = Integer.valueOf(i2);
        }
        aoam c = spb.c(aoamVar);
        if (c != null && c.X() != null) {
            a3.a.v = c.X();
        }
        axof axofVar = new axof();
        if (!szz.m(aoamVar, axofVar) || !aoaj.r(axofVar, 14)) {
            a3.u(true);
        } else {
            a3.u(axofVar.aI());
        }
        return a3;
    }
}
