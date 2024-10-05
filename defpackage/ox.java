package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ox implements pd {
    final pd a;
    int b = 0;
    int c = -1;
    int d = -1;

    public ox(pd pdVar) {
        this.a = pdVar;
    }

    public final void a() {
        int i = this.b;
        if (i == 0) {
            return;
        }
        if (i == 1) {
            pd pdVar = this.a;
            ((or) pdVar).a.l(this.c, this.d);
        } else if (i != 2) {
            pd pdVar2 = this.a;
            ((or) pdVar2).a.a.d(this.c, this.d, null);
        } else {
            pd pdVar3 = this.a;
            ((or) pdVar3).a.m(this.c, this.d);
        }
        this.b = 0;
    }

    public final void b(int i, int i2) {
        a();
        ((or) this.a).a.oe(i, i2);
    }

    public final void c(int i) {
        int i2;
        int i3;
        int i4;
        if (this.b != 3 || i > (i3 = this.d + (i2 = this.c)) || (i4 = i + 1) < i2) {
            a();
            this.c = i;
            this.d = 1;
            this.b = 3;
            return;
        }
        this.c = Math.min(i, i2);
        this.d = Math.max(i3, i4) - this.c;
    }
}
