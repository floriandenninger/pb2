package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bmt {
    private final List a;
    private final bjc[] b;

    public bmt(List list) {
        this.a = list;
        this.b = new bjc[list.size()];
    }

    public final void a(long j, pth pthVar) {
        azd.b(j, pthVar, this.b);
    }

    public final void b(bik bikVar, bmz bmzVar) {
        for (int i = 0; i < this.b.length; i++) {
            bmzVar.c();
            bjc n = bikVar.n(bmzVar.a(), 3);
            pms pmsVar = (pms) this.a.get(i);
            String str = pmsVar.n;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            String valueOf = String.valueOf(str);
            pse.f(z, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            String str2 = pmsVar.c;
            if (str2 == null) {
                str2 = bmzVar.b();
            }
            pmr pmrVar = new pmr();
            pmrVar.a = str2;
            pmrVar.k = str;
            pmrVar.d = pmsVar.f;
            pmrVar.c = pmsVar.e;
            pmrVar.C = pmsVar.F;
            pmrVar.m = pmsVar.p;
            n.rp(pmrVar.a());
            this.b[i] = n;
        }
    }
}
