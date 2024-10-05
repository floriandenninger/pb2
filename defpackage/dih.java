package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dih implements din {
    public dju a;
    public dju b;
    public dju c;
    public dha d;
    public float e;
    public float f;
    public int g;
    public int h;
    public final List i = new ArrayList(4);

    @Override // defpackage.din
    public final float a() {
        return this.f;
    }

    @Override // defpackage.din
    public final float b() {
        return this.e;
    }

    @Override // defpackage.din
    public final int c() {
        return this.i.size();
    }

    @Override // defpackage.din
    public final int d() {
        return this.h;
    }

    @Override // defpackage.din
    public final int e() {
        return this.g;
    }

    @Override // defpackage.din
    public final dha f() {
        return this.d;
    }

    @Override // defpackage.din
    public final din g(int i) {
        return (din) this.i.get(i);
    }

    @Override // defpackage.din
    public final dju h() {
        return this.b;
    }

    @Override // defpackage.din
    public final dju i() {
        return this.c;
    }

    @Override // defpackage.din
    public final dju j() {
        return this.a;
    }

    @Override // defpackage.din
    public final void kl(int i) {
        this.h = i;
    }

    @Override // defpackage.din
    public final void km(float f) {
        this.f = f;
    }

    @Override // defpackage.din
    public final void kn(float f) {
        this.e = f;
    }

    @Override // defpackage.din
    public final void ko(int i) {
        this.g = i;
    }
}
