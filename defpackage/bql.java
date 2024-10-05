package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bql extends boz implements bqi {
    final /* synthetic */ bqn a;
    private final String b;
    private boolean c;
    private int e;
    private bqh f;
    private int d = -1;
    private int g = -1;

    public bql(bqn bqnVar, String str) {
        this.a = bqnVar;
        this.b = str;
    }

    @Override // defpackage.bpc
    public final void a() {
        this.a.m(this);
    }

    @Override // defpackage.bpc
    public final void b(int i) {
        bqh bqhVar = this.f;
        if (bqhVar != null) {
            bqhVar.d(this.g, i);
        } else {
            this.d = i;
            this.e = 0;
        }
    }

    @Override // defpackage.bpc
    public final void c(int i) {
        bqh bqhVar = this.f;
        if (bqhVar != null) {
            bqhVar.f(this.g, i);
        } else {
            this.e += i;
        }
    }

    @Override // defpackage.bqi
    public final int d() {
        return this.g;
    }

    @Override // defpackage.bqi
    public final void e(bqh bqhVar) {
        bqk bqkVar = new bqk();
        this.f = bqhVar;
        String str = this.b;
        int i = bqhVar.d;
        bqhVar.d = i + 1;
        int i2 = bqhVar.c;
        bqhVar.c = i2 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", str);
        bqhVar.g(11, i2, i, null, bundle);
        bqhVar.g.put(i2, bqkVar);
        this.g = i;
        if (this.c) {
            bqhVar.b(i);
            int i3 = this.d;
            if (i3 >= 0) {
                bqhVar.d(this.g, i3);
                this.d = -1;
            }
            int i4 = this.e;
            if (i4 != 0) {
                bqhVar.f(this.g, i4);
                this.e = 0;
            }
        }
    }

    @Override // defpackage.bqi
    public final void f() {
        bqh bqhVar = this.f;
        if (bqhVar != null) {
            bqhVar.a(this.g);
            this.f = null;
            this.g = 0;
        }
    }

    @Override // defpackage.bpc
    public final void g() {
        this.c = true;
        bqh bqhVar = this.f;
        if (bqhVar != null) {
            bqhVar.b(this.g);
        }
    }

    @Override // defpackage.bpc
    public final void h() {
        i(0);
    }

    @Override // defpackage.bpc
    public final void i(int i) {
        this.c = false;
        bqh bqhVar = this.f;
        if (bqhVar != null) {
            bqhVar.e(this.g, i);
        }
    }
}
