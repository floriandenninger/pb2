package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sws {
    public View a;
    public View b;
    public szk c;
    public Object d;
    public awpu e;
    public sxs f;
    public String g;
    public syb h;
    private sxc i;

    public sws() {
    }

    public sws(swu swuVar) {
        this.a = swuVar.a;
        this.b = swuVar.b;
        this.c = swuVar.c;
        this.d = swuVar.d;
        this.e = swuVar.e;
        this.f = swuVar.f;
        this.g = swuVar.g;
        this.h = swuVar.h;
        this.i = swuVar.i;
    }

    public final swu a() {
        sxc sxcVar = this.i;
        if (sxcVar == null) {
            throw new IllegalStateException("Missing required properties: conversionContext");
        }
        return new swu(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, sxcVar);
    }

    public final void b(sxc sxcVar) {
        if (sxcVar == null) {
            throw new NullPointerException("Null conversionContext");
        }
        this.i = sxcVar;
    }
}
