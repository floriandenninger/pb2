package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bqm extends bpc implements bqi {
    final /* synthetic */ bqn a;
    private final String b;
    private final String c;
    private boolean d;
    private int e = -1;
    private int f;
    private bqh g;
    private int h;

    public bqm(bqn bqnVar, String str, String str2) {
        this.a = bqnVar;
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.bpc
    public final void a() {
        this.a.m(this);
    }

    @Override // defpackage.bpc
    public final void b(int i) {
        bqh bqhVar = this.g;
        if (bqhVar != null) {
            bqhVar.d(this.h, i);
        } else {
            this.e = i;
            this.f = 0;
        }
    }

    @Override // defpackage.bpc
    public final void c(int i) {
        bqh bqhVar = this.g;
        if (bqhVar != null) {
            bqhVar.f(this.h, i);
        } else {
            this.f += i;
        }
    }

    @Override // defpackage.bqi
    public final int d() {
        return this.h;
    }

    @Override // defpackage.bqi
    public final void e(bqh bqhVar) {
        this.g = bqhVar;
        String str = this.b;
        String str2 = this.c;
        int i = bqhVar.d;
        bqhVar.d = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", str);
        bundle.putString("routeGroupId", str2);
        int i2 = bqhVar.c;
        bqhVar.c = i2 + 1;
        bqhVar.g(3, i2, i, null, bundle);
        this.h = i;
        if (this.d) {
            bqhVar.b(i);
            int i3 = this.e;
            if (i3 >= 0) {
                bqhVar.d(this.h, i3);
                this.e = -1;
            }
            int i4 = this.f;
            if (i4 != 0) {
                bqhVar.f(this.h, i4);
                this.f = 0;
            }
        }
    }

    @Override // defpackage.bqi
    public final void f() {
        bqh bqhVar = this.g;
        if (bqhVar != null) {
            bqhVar.a(this.h);
            this.g = null;
            this.h = 0;
        }
    }

    @Override // defpackage.bpc
    public final void g() {
        this.d = true;
        bqh bqhVar = this.g;
        if (bqhVar != null) {
            bqhVar.b(this.h);
        }
    }

    @Override // defpackage.bpc
    public final void h() {
        i(0);
    }

    @Override // defpackage.bpc
    public final void i(int i) {
        this.d = false;
        bqh bqhVar = this.g;
        if (bqhVar != null) {
            bqhVar.e(this.h, i);
        }
    }
}
