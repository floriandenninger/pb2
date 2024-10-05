package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class nrb {
    public final String a;
    public final nqg b;
    int c = 0;
    public nqo d = nqo.NOT_ENGAGING;
    apxf e;

    public nrb(String str, nqg nqgVar) {
        this.a = str;
        this.b = nqgVar;
    }

    private final void b() {
        nqb b = this.b.b();
        int i = this.c;
        if (i == 1) {
            this.b.o(this.e);
            return;
        }
        if (i == 2) {
            this.b.D(this.e);
            if (b != null) {
                b.d();
                return;
            }
            return;
        }
        if (i == 3) {
            this.b.C();
            if (b != null) {
                b.c();
                return;
            }
            return;
        }
        if (i == 4) {
            this.b.n();
        } else {
            if (i != 5) {
                return;
            }
            this.b.B();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nrb)) {
            return false;
        }
        nrb nrbVar = (nrb) obj;
        return amkq.b(this.a, nrbVar.a) && amkq.b(this.b, nrbVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public void a(int i) {
        if (i == 5) {
            int i2 = this.c;
            if (i2 == 0) {
                return;
            }
            if (i2 == 1) {
                this.c = 5;
                b();
                return;
            }
        }
        while (true) {
            int i3 = this.c;
            if (i3 == i) {
                return;
            }
            if (i > i3) {
                amkq.N(true);
                this.c++;
                b();
            } else if (i >= i3) {
                continue;
            } else {
                amkq.N(i3 < 5);
                int i4 = this.c;
                if (i4 <= 2) {
                    return;
                }
                if (i4 == 4) {
                    i4 = 3;
                }
                this.c = i4 - 1;
                b();
            }
        }
    }
}
