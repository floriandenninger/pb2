package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class aez {
    aff a = null;
    public float b = 0.0f;
    final ArrayList c = new ArrayList();
    boolean d = false;
    public aey e;

    public aez() {
    }

    public static final boolean l(aff affVar) {
        return affVar.l <= 1;
    }

    public final aff a(boolean[] zArr, aff affVar) {
        int i;
        int i2 = this.e.a;
        aff affVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float b = this.e.b(i3);
            if (b < 0.0f) {
                aff d = this.e.d(i3);
                if ((zArr == null || !zArr[d.c]) && d != affVar && (((i = d.n) == 3 || i == 4) && b < f)) {
                    f = b;
                    affVar2 = d;
                }
            }
        }
        return affVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(aff affVar) {
        aff affVar2 = this.a;
        if (affVar2 != null) {
            this.e.g(affVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(affVar, true);
        this.a = affVar;
        if (f == 1.0f) {
            return;
        }
        this.b /= f;
        aey aeyVar = this.e;
        int i = aeyVar.f;
        for (int i2 = 0; i != -1 && i2 < aeyVar.a; i2++) {
            float[] fArr = aeyVar.e;
            fArr[i] = fArr[i] / f;
            i = aeyVar.d[i];
        }
    }

    public final void c(afb afbVar, aff affVar, boolean z) {
        if (affVar == null || !affVar.g) {
            return;
        }
        this.b += affVar.f * this.e.a(affVar);
        this.e.c(affVar, z);
        if (z) {
            affVar.b(this);
        }
        if (this.e.a == 0) {
            this.d = true;
            afbVar.c = true;
        }
    }

    public void d(afb afbVar, aez aezVar, boolean z) {
        aey aeyVar = this.e;
        float a = aeyVar.a(aezVar.a);
        aeyVar.c(aezVar.a, z);
        aey aeyVar2 = aezVar.e;
        int i = aeyVar2.a;
        for (int i2 = 0; i2 < i; i2++) {
            aff d = aeyVar2.d(i2);
            aeyVar.e(d, aeyVar2.a(d) * a, z);
        }
        this.b += aezVar.b * a;
        if (z) {
            aezVar.a.b(this);
        }
        if (this.a == null || this.e.a != 0) {
            return;
        }
        this.d = true;
        afbVar.c = true;
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.e.a == 0;
    }

    public final void f(afb afbVar, int i) {
        this.e.g(afbVar.p(i), 1.0f);
        this.e.g(afbVar.p(i), -1.0f);
    }

    public final void g(aff affVar, aff affVar2, aff affVar3, aff affVar4, float f) {
        this.e.g(affVar, -1.0f);
        this.e.g(affVar2, 1.0f);
        this.e.g(affVar3, f);
        this.e.g(affVar4, -f);
    }

    public final void h(aff affVar, aff affVar2, aff affVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(affVar, 1.0f);
                this.e.g(affVar2, -1.0f);
                this.e.g(affVar3, -1.0f);
                return;
            }
        }
        this.e.g(affVar, -1.0f);
        this.e.g(affVar2, 1.0f);
        this.e.g(affVar3, 1.0f);
    }

    public final void i(aff affVar, aff affVar2, aff affVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(affVar, 1.0f);
                this.e.g(affVar2, -1.0f);
                this.e.g(affVar3, 1.0f);
                return;
            }
        }
        this.e.g(affVar, -1.0f);
        this.e.g(affVar2, 1.0f);
        this.e.g(affVar3, -1.0f);
    }

    public final void j(aff affVar, aff affVar2, aff affVar3, aff affVar4, float f) {
        this.e.g(affVar3, 0.5f);
        this.e.g(affVar4, 0.5f);
        this.e.g(affVar, -0.5f);
        this.e.g(affVar2, -0.5f);
        this.b = -f;
    }

    public aff k(boolean[] zArr) {
        return a(zArr, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aez.toString():java.lang.String");
    }

    public aez(afa afaVar) {
        this.e = new aey(this, afaVar);
    }
}
