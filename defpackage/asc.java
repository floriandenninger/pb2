package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asc {
    public int a;
    public int b;

    public asc() {
        this.a = 0;
        this.b = 1;
    }

    public asc(byte[] bArr) {
    }

    public final asd a() {
        return new asd(this.a, this.b);
    }

    public final void b(wv wvVar) {
        View view = wvVar.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        view.getRight();
        view.getBottom();
    }

    public final int c() {
        return this.b | this.a;
    }

    public final void d(int i, int i2) {
        if (i2 == 1) {
            this.a = i;
        } else {
            this.b = i;
        }
    }

    public final void e(int i) {
        if (i == 1) {
            this.a = 0;
        } else {
            this.b = 0;
        }
    }

    public final void f(int i) {
        d(i, 0);
    }
}
