package defpackage;

import android.util.Pair;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class pou implements plg {
    public static final pou d = new por();

    public abstract pos a(int i, pos posVar, boolean z);

    public abstract pot b(int i, pot potVar, long j);

    public int c(boolean z) {
        return z() ? -1 : 0;
    }

    public abstract int d(Object obj);

    public int e(boolean z) {
        if (z()) {
            return -1;
        }
        return h() - 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pou)) {
            return false;
        }
        pou pouVar = (pou) obj;
        if (pouVar.h() != h() || pouVar.g() != g()) {
            return false;
        }
        pot potVar = new pot();
        pos posVar = new pos();
        pot potVar2 = new pot();
        pos posVar2 = new pos();
        for (int i = 0; i < h(); i++) {
            if (!y(i, potVar).equals(pouVar.y(i, potVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < g(); i2++) {
            if (!a(i2, posVar, true).equals(pouVar.a(i2, posVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public int f(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == e(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == e(z) ? c(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public abstract int g();

    public abstract int h();

    public int hashCode() {
        pot potVar = new pot();
        pos posVar = new pos();
        int h = h() + 217;
        for (int i = 0; i < h(); i++) {
            h = (h * 31) + y(i, potVar).hashCode();
        }
        int g = (h * 31) + g();
        for (int i2 = 0; i2 < g(); i2++) {
            g = (g * 31) + a(i2, posVar, true).hashCode();
        }
        return g;
    }

    public abstract Object i(int i);

    public int j(int i, int i2) {
        if (i2 != 0) {
            return i2 != 1 ? i == c(false) ? e(false) : i - 1 : i;
        }
        if (i == c(false)) {
            return -1;
        }
        return i - 1;
    }

    public pos jH(Object obj, pos posVar) {
        return a(d(obj), posVar, true);
    }

    public final int u(int i, pos posVar, pot potVar, int i2, boolean z) {
        int i3 = x(i, posVar).c;
        if (y(i3, potVar).p != i) {
            return i + 1;
        }
        int f = f(i3, i2, z);
        if (f == -1) {
            return -1;
        }
        return y(f, potVar).o;
    }

    public final Pair v(pot potVar, pos posVar, int i, long j) {
        Pair w = w(potVar, posVar, i, j, 0L);
        pse.c(w);
        return w;
    }

    public final Pair w(pot potVar, pos posVar, int i, long j, long j2) {
        pse.i(i, h());
        b(i, potVar, j2);
        if (j == -9223372036854775807L) {
            j = potVar.m;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = potVar.o;
        x(i2, posVar);
        while (i2 < potVar.p && posVar.e != j) {
            int i3 = i2 + 1;
            if (x(i3, posVar).e > j) {
                break;
            }
            i2 = i3;
        }
        a(i2, posVar, true);
        long j3 = j - posVar.e;
        long j4 = posVar.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = posVar.b;
        pse.c(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    public final pos x(int i, pos posVar) {
        return a(i, posVar, false);
    }

    public final pot y(int i, pot potVar) {
        return b(i, potVar, 0L);
    }

    public final boolean z() {
        return h() == 0;
    }
}
