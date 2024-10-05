package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hvi implements hxg {
    public final hse a;
    public View b;
    boolean c;

    public hvi(hse hseVar) {
        this.a = hseVar;
    }

    @Override // defpackage.hxg
    public final float a() {
        if (this.c) {
            return this.b.getHeight();
        }
        return 0.0f;
    }

    @Override // defpackage.hxg
    public final float b() {
        if (this.c) {
            return 0.0f;
        }
        return this.b.getHeight();
    }

    @Override // defpackage.hxg
    public final View c() {
        return this.b;
    }

    public final void d() {
        if (this.c) {
            gfw.z(this);
            this.c = false;
        }
    }

    @Override // defpackage.hxg
    public final void e() {
    }

    @Override // defpackage.hxg
    public final void f() {
    }

    public final void g() {
        if (this.c) {
            return;
        }
        gfw.z(this);
        this.c = true;
    }
}
