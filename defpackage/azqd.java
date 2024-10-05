package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azqd {
    public final Object[] a;
    Object[] b;
    int c;

    public azqd() {
        Object[] objArr = new Object[5];
        this.a = objArr;
        this.b = objArr;
    }

    public final void a(Object obj) {
        int i = this.c;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.b[4] = objArr;
            this.b = objArr;
            i = 0;
        }
        this.b[i] = obj;
        this.c = i + 1;
    }

    public final void b(azqc azqcVar) {
        Object obj;
        for (Object[] objArr = this.a; objArr != null; objArr = objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (azqcVar.a(obj)) {
                    return;
                }
            }
        }
    }

    public final void c(Object obj) {
        this.a[0] = obj;
    }

    public final boolean d(banw banwVar) {
        Object obj;
        Object[] objArr = this.a;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (obj != azqm.a) {
                    if (!(obj instanceof azqk)) {
                        if (obj instanceof azql) {
                            banwVar.f(((azql) obj).a);
                        } else {
                            banwVar.c(obj);
                        }
                    } else {
                        banwVar.b(((azqk) obj).a);
                        return true;
                    }
                } else {
                    banwVar.sh();
                    return true;
                }
            }
            objArr = objArr[4];
        }
    }
}
