package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class xu extends vz {
    boolean k = true;

    public abstract boolean e(wv wvVar);

    public abstract boolean f(wv wvVar, wv wvVar2, int i, int i2, int i3, int i4);

    public abstract boolean g(wv wvVar, int i, int i2, int i3, int i4);

    public abstract boolean h(wv wvVar);

    @Override // defpackage.vz
    public final boolean o(wv wvVar) {
        return !this.k || wvVar.t();
    }

    @Override // defpackage.vz
    public final boolean r(wv wvVar, asc ascVar, asc ascVar2) {
        int i;
        int i2;
        if (ascVar == null || ((i = ascVar.a) == (i2 = ascVar2.a) && ascVar.b == ascVar2.b)) {
            return e(wvVar);
        }
        return g(wvVar, i, ascVar.b, i2, ascVar2.b);
    }

    @Override // defpackage.vz
    public final boolean s(wv wvVar, wv wvVar2, asc ascVar, asc ascVar2) {
        int i;
        int i2;
        int i3 = ascVar.a;
        int i4 = ascVar.b;
        if (wvVar2.A()) {
            int i5 = ascVar.a;
            i2 = ascVar.b;
            i = i5;
        } else {
            i = ascVar2.a;
            i2 = ascVar2.b;
        }
        return f(wvVar, wvVar2, i3, i4, i, i2);
    }

    @Override // defpackage.vz
    public final boolean t(wv wvVar, asc ascVar, asc ascVar2) {
        int i;
        int i2;
        int i3 = ascVar.a;
        int i4 = ascVar.b;
        View view = wvVar.a;
        if (ascVar2 == null) {
            i = view.getLeft();
        } else {
            i = ascVar2.a;
        }
        int i5 = i;
        if (ascVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = ascVar2.b;
        }
        int i6 = i2;
        if (!wvVar.v() && (i3 != i5 || i4 != i6)) {
            view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
            return g(wvVar, i3, i4, i5, i6);
        }
        return h(wvVar);
    }

    @Override // defpackage.vz
    public final boolean u(wv wvVar, asc ascVar, asc ascVar2) {
        int i = ascVar.a;
        int i2 = ascVar2.a;
        if (i != i2 || ascVar.b != ascVar2.b) {
            return g(wvVar, i, ascVar.b, i2, ascVar2.b);
        }
        l(wvVar);
        return false;
    }

    public final void x() {
        this.k = false;
    }
}
