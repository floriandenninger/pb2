package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bann {
    final char a;
    final int b;
    final int c;
    final int d;
    final boolean e;
    final int f;

    public bann(char c, int i, int i2, int i3, boolean z, int i4) {
        if (c != 'u' && c != 'w' && c != 's') {
            StringBuilder sb = new StringBuilder(15);
            sb.append("Unknown mode: ");
            sb.append(c);
            throw new IllegalArgumentException(sb.toString());
        }
        this.a = c;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    public final long a(bajf bajfVar, long j) {
        try {
            return d(bajfVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                bakm bakmVar = (bakm) bajfVar;
                if (!bakmVar.m.s(j)) {
                    j = bakmVar.m.e(j, 1);
                } else {
                    return d(bajfVar, j);
                }
            }
        }
    }

    public final long b(bajf bajfVar, long j) {
        try {
            return d(bajfVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                bakm bakmVar = (bakm) bajfVar;
                if (!bakmVar.m.s(j)) {
                    j = bakmVar.m.e(j, -1);
                } else {
                    return d(bajfVar, j);
                }
            }
        }
    }

    public final long c(bajf bajfVar, long j) {
        bakm bakmVar = (bakm) bajfVar;
        int a = this.d - bakmVar.i.a(j);
        if (a == 0) {
            return j;
        }
        if (this.e) {
            if (a < 0) {
                a += 7;
            }
        } else if (a > 0) {
            a -= 7;
        }
        return bakmVar.i.e(j, a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bann) {
            bann bannVar = (bann) obj;
            if (this.a == bannVar.a && this.b == bannVar.b && this.c == bannVar.c && this.d == bannVar.d && this.e == bannVar.e && this.f == bannVar.f) {
                return true;
            }
        }
        return false;
    }

    private final long d(bajf bajfVar, long j) {
        int i = this.c;
        bakm bakmVar = (bakm) bajfVar;
        if (i >= 0) {
            return bakmVar.j.h(j, i);
        }
        return bakmVar.j.e(bakmVar.l.e(bakmVar.j.h(j, 1), 1), this.c);
    }
}
