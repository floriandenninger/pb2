package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class duj {
    public int a;
    public boolean b;
    private int e;
    private int f;
    private int g;
    private int h;
    private final drm i;
    public final dui d = new dui(this);
    public final List c = new ArrayList(2);

    public duj(int i, int i2, drm drmVar) {
        this.a = i;
        this.e = i2;
        this.f = drmVar.b();
        this.g = drmVar.d();
        this.h = drmVar.g();
        this.i = drmVar;
    }

    public final void a(duh duhVar) {
        if (duhVar == null) {
            return;
        }
        synchronized (this) {
            this.c.add(duhVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i) {
        int c = this.i.c();
        int e = this.i.e();
        int b = this.i.b();
        int d = this.i.d();
        int g = this.i.g();
        if (c < 0 || e < 0) {
            return;
        }
        if (c == this.a && e == this.e && b == this.f && d == this.g && g == this.h && i != 1) {
            return;
        }
        this.a = c;
        this.e = e;
        this.f = b;
        this.g = d;
        this.h = g;
        this.b = false;
        synchronized (this) {
            if (this.c.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.c);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((duh) arrayList.get(i2)).a(c, e, b, d, i);
            }
        }
    }

    public final void c(boolean z) {
        boolean z2 = true;
        if (!this.b && !z) {
            z2 = false;
        }
        this.b = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return this.a < 0 || this.e < 0 || this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(int i, int i2) {
        if (d()) {
            return true;
        }
        for (int i3 = i; i3 < i + i2; i3++) {
            if (this.a <= i3 && i3 <= this.e) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(int i, int i2) {
        return d() || i2 == -1 || i <= Math.max((this.a + i2) + (-1), this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(int i) {
        return d() || i <= this.e;
    }
}
