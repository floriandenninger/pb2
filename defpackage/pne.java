package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pne {
    public CharSequence a;
    public CharSequence b;
    public CharSequence c;
    public CharSequence d;
    public CharSequence e;
    public byte[] f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public Integer n;
    public Integer o;
    public CharSequence p;
    public CharSequence q;
    public CharSequence r;

    public pne() {
    }

    public pne(pnf pnfVar) {
        this.a = pnfVar.b;
        this.b = pnfVar.c;
        this.c = pnfVar.d;
        this.d = pnfVar.e;
        this.e = pnfVar.f;
        this.f = pnfVar.g;
        this.g = pnfVar.h;
        this.h = pnfVar.i;
        this.i = pnfVar.j;
        this.j = pnfVar.k;
        this.k = pnfVar.l;
        this.l = pnfVar.m;
        this.m = pnfVar.n;
        this.n = pnfVar.o;
        this.o = pnfVar.p;
        this.p = pnfVar.q;
        this.q = pnfVar.r;
        this.r = pnfVar.s;
    }

    public final pnf a() {
        return new pnf(this);
    }

    public final void b(byte[] bArr, int i) {
        if (this.f == null || pts.R(Integer.valueOf(i), 3) || !pts.R(this.g, 3)) {
            this.f = (byte[]) bArr.clone();
            this.g = Integer.valueOf(i);
        }
    }
}
