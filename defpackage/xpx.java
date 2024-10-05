package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xpx {
    private final ajng a;
    private final ajst b;
    private final ajwl c;

    public xpx(ajvc ajvcVar) {
        this.a = ajvcVar != null ? ajvcVar.lC() : null;
        this.b = ajvcVar instanceof ajst ? (ajst) ajvcVar : null;
        this.c = ajvcVar instanceof ajwl ? (ajwl) ajvcVar : null;
    }

    private final void b(apjo apjoVar) {
        ajwl ajwlVar;
        if (apjoVar == null || (ajwlVar = this.c) == null) {
            return;
        }
        ajwlVar.G(apjoVar);
    }

    private static int c(Object obj) {
        if (obj instanceof apzx) {
            int aD = aobq.aD(((apzx) obj).k);
            if (aD == 0) {
                return 1;
            }
            return aD;
        }
        if (obj instanceof ajds) {
            return d(((ajds) obj).a);
        }
        if (obj instanceof aqrf) {
            return d((aqrf) obj);
        }
        return 1;
    }

    private static int d(aqrf aqrfVar) {
        aqrg aqrgVar = aqrfVar.d;
        if (aqrgVar == null) {
            aqrgVar = aqrg.a;
        }
        int aD = aobq.aD(((aqre) aqrgVar.pX(aqre.b)).c);
        if (aD == 0) {
            return 1;
        }
        return aD;
    }

    public final void a(Object obj, boolean z) {
        ajwl ajwlVar;
        obj.getClass();
        ajng ajngVar = this.a;
        if (ajngVar == null || this.b == null) {
            return;
        }
        int a = ajngVar.a();
        int c = c(obj) - 1;
        apjo apjoVar = null;
        int i = 0;
        for (int i2 = 0; i2 < a; i2++) {
            Object c2 = this.a.c(i2);
            if (c2 instanceof apzy) {
                i = -1;
            } else if (c2 instanceof apjo) {
                apjoVar = (apjo) c2;
            } else {
                int c3 = c(c2) - 1;
                if (c >= c3) {
                    this.b.ly(obj, i2 + i);
                    if (z && (ajwlVar = this.c) != null && c == c3) {
                        ajwlVar.G(c2);
                    }
                    b(apjoVar);
                    return;
                }
            }
        }
        this.b.z(obj);
        b(apjoVar);
    }
}
