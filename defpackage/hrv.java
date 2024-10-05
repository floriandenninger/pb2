package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hrv {
    public final aaea a;
    public final axze b;
    private final axzg c;
    private final axzg d;

    public hrv(aaea aaeaVar, axze axzeVar, axzg axzgVar, axzg axzgVar2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = aaeaVar;
        this.b = axzeVar;
        this.c = axzgVar;
        this.d = axzgVar2;
    }

    public final int a() {
        autm autmVar = this.a.a().z;
        if (autmVar == null) {
            autmVar = autm.a;
        }
        int i = autmVar.h;
        if (i <= 0) {
            return 15000;
        }
        return i;
    }

    public final int b() {
        autm autmVar = this.a.a().z;
        if (autmVar == null) {
            autmVar = autm.a;
        }
        int i = autmVar.g;
        if (i <= 0) {
            return 1000;
        }
        return i;
    }

    public final boolean c() {
        return ((Boolean) this.b.a.a.Y(axyz.c).B().aB()).booleanValue();
    }

    public final boolean d() {
        return ((Boolean) this.b.a.a.Y(axyz.i).B().aB()).booleanValue();
    }

    public final boolean e() {
        return ((Boolean) this.b.a.a.Y(axyz.j).B().aB()).booleanValue();
    }

    public final boolean f() {
        return ((Boolean) this.b.a.a.Y(akuo.q).B().aB()).booleanValue();
    }

    public final boolean g() {
        return ((Boolean) this.b.a.a.Y(axyz.h).B().aB()).booleanValue();
    }

    public final boolean h() {
        return ((Boolean) this.b.a.a.Y(akuo.r).B().aB()).booleanValue();
    }

    public final boolean i() {
        autm autmVar = this.a.a().z;
        if (autmVar == null) {
            autmVar = autm.a;
        }
        return autmVar.f;
    }

    public final boolean j() {
        autm autmVar = this.a.a().z;
        if (autmVar == null) {
            autmVar = autm.a;
        }
        return autmVar.i;
    }

    public final boolean k() {
        autm autmVar = this.a.a().z;
        if (autmVar == null) {
            autmVar = autm.a;
        }
        return autmVar.x;
    }

    public final boolean l() {
        return ((Boolean) this.b.a.a.Y(axyz.b).B().aB()).booleanValue();
    }

    public final boolean m() {
        autm autmVar = this.a.a().z;
        if (autmVar == null) {
            autmVar = autm.a;
        }
        return autmVar.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean n() {
        Boolean bool;
        aqvj aqvjVar = this.d.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45359660L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45359660L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45359660L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean o() {
        autm autmVar = this.a.a().z;
        if (autmVar == null) {
            autmVar = autm.a;
        }
        return autmVar.n;
    }

    public final boolean p() {
        autm autmVar = this.a.a().z;
        if (autmVar == null) {
            autmVar = autm.a;
        }
        return autmVar.m;
    }

    public final void q() {
        this.c.a.a.Y(axzb.c).B();
    }
}
