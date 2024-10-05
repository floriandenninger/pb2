package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cjc implements ciz {
    public final String a;
    public final cim b;
    public final cin c;
    public final cip d;
    public final cip e;
    public final cil f;
    public final float g;
    public final List h;
    public final cil i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;

    public cjc(String str, int i, cim cimVar, cin cinVar, cip cipVar, cip cipVar2, cil cilVar, int i2, int i3, float f, List list, cil cilVar2, boolean z) {
        this.a = str;
        this.k = i;
        this.b = cimVar;
        this.c = cinVar;
        this.d = cipVar;
        this.e = cipVar2;
        this.f = cilVar;
        this.l = i2;
        this.m = i3;
        this.g = f;
        this.h = list;
        this.i = cilVar2;
        this.j = z;
    }

    @Override // defpackage.ciz
    public final cgo a(cfz cfzVar, cjp cjpVar) {
        return new cgu(cfzVar, cjpVar, this);
    }
}
