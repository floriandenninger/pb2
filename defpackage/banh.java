package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class banh {
    public List b;
    private boolean d;
    private boolean e;
    private banc[] f;
    public int a = 1;
    private int c = 2;

    public banh() {
        List list = this.b;
        if (list == null) {
            this.b = new ArrayList();
        } else {
            list.clear();
        }
        this.d = false;
        this.e = false;
        this.f = new banc[10];
    }

    public static Object[] c(List list) {
        int size = list.size();
        if (size == 0) {
            return new Object[]{band.a, band.a};
        }
        if (size == 1) {
            return new Object[]{list.get(0), list.get(1)};
        }
        bana banaVar = new bana(list);
        return new Object[]{banaVar, banaVar};
    }

    public final bamz a() {
        bamz j = j(this.b, this.d, this.e);
        this.f = (banc[]) this.f.clone();
        return j;
    }

    public final void b(int i) {
        banc bancVar = new banc(this.a, this.c, i, this.f);
        d(bancVar, bancVar);
        this.f[i] = bancVar;
    }

    public final void d(banj banjVar, bani baniVar) {
        this.b.add(banjVar);
        this.b.add(baniVar);
        this.d = (banjVar == null) | this.d;
        this.e |= baniVar == null;
    }

    public final void e() {
        b(4);
    }

    public final void f() {
        b(5);
    }

    public final void g() {
        b(6);
    }

    public final void h() {
        this.c = 4;
    }

    public final void i(String str) {
        Object obj;
        bang bangVar = new bang(str);
        Object obj2 = null;
        if (this.b.size() > 0) {
            obj2 = this.b.get(r4.size() - 2);
            obj = this.b.get(r4.size() - 1);
        } else {
            obj = null;
        }
        if (obj2 == null || obj == null || obj2 != obj || !(obj2 instanceof banc)) {
            throw new IllegalStateException("No field to apply suffix to");
        }
        banc bancVar = new banc((banc) obj2, bangVar);
        this.b.set(r0.size() - 2, bancVar);
        this.b.set(r0.size() - 1, bancVar);
        this.f[bancVar.a] = bancVar;
    }

    private static bamz j(List list, boolean z, boolean z2) {
        if (!z || !z2) {
            int size = list.size();
            if (size >= 2 && (list.get(0) instanceof banf)) {
                banf banfVar = (banf) list.get(0);
                if (banfVar.b == null && banfVar.a == null) {
                    bamz j = j(list.subList(2, size), z, z2);
                    banj banjVar = j.a;
                    bani baniVar = j.b;
                    banfVar.a = banjVar;
                    banfVar.b = baniVar;
                    return new bamz(banfVar, banfVar);
                }
            }
            Object[] c = c(list);
            if (z) {
                return new bamz(null, (bani) c[1]);
            }
            if (z2) {
                return new bamz((banj) c[0], null);
            }
            return new bamz((banj) c[0], (bani) c[1]);
        }
        throw new IllegalStateException("Builder has created neither a printer nor a parser");
    }
}
