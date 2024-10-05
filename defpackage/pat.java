package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pat extends pav implements pah {
    private final paw a;

    public pat(String str, ozv ozvVar, paw pawVar, String str2) {
        super(str, -1L, ozvVar, str2, pawVar, null);
        this.a = pawVar;
    }

    @Override // defpackage.pah
    public final int a() {
        return this.a.a;
    }

    @Override // defpackage.pah
    public final int b(long j) {
        return this.a.a(j);
    }

    @Override // defpackage.pah
    public final int c(long j, long j2) {
        paw pawVar = this.a;
        int i = pawVar.a;
        int a = pawVar.a(j2);
        if (pawVar.c == null) {
            int i2 = pawVar.a + ((int) (j / ((pawVar.b * 1000000) / pawVar.g)));
            return i2 < i ? i : (a == -1 || i2 <= a) ? i2 : a;
        }
        int i3 = i;
        while (i3 <= a) {
            int i4 = (i3 + a) / 2;
            long b = pawVar.b(i4);
            if (b < j) {
                i3 = i4 + 1;
            } else {
                if (b <= j) {
                    return i4;
                }
                a = i4 - 1;
            }
        }
        return i3 != i ? a : i3;
    }

    @Override // defpackage.pah
    public final long d(int i, long j) {
        paw pawVar = this.a;
        List list = pawVar.c;
        if (list != null) {
            return (((paz) list.get(i - pawVar.a)).b * 1000000) / pawVar.g;
        }
        if (i == pawVar.a(j)) {
            return j - pawVar.b(i);
        }
        return (pawVar.b * 1000000) / pawVar.g;
    }

    @Override // defpackage.pah
    public final long e(int i) {
        return this.a.b(i);
    }

    @Override // defpackage.pah
    public final pas f(int i) {
        return this.a.c(this, i);
    }

    @Override // defpackage.pah
    public final boolean g() {
        return this.a.d();
    }

    @Override // defpackage.pav
    public final pah h() {
        return this;
    }

    @Override // defpackage.pav
    public final pas i() {
        return null;
    }
}
