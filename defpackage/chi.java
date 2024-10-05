package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class chi implements chh {
    private final List a;
    private clt c = null;
    private float d = -1.0f;
    private clt b = g(0.0f);

    public chi(List list) {
        this.a = list;
    }

    private final clt g(float f) {
        clt cltVar = (clt) this.a.get(r0.size() - 1);
        if (f >= cltVar.c()) {
            return cltVar;
        }
        for (int size = this.a.size() - 2; size > 0; size--) {
            clt cltVar2 = (clt) this.a.get(size);
            if (this.b != cltVar2 && cltVar2.d(f)) {
                return cltVar2;
            }
        }
        return (clt) this.a.get(0);
    }

    @Override // defpackage.chh
    public final float a() {
        return ((clt) this.a.get(r0.size() - 1)).b();
    }

    @Override // defpackage.chh
    public final float b() {
        return ((clt) this.a.get(0)).c();
    }

    @Override // defpackage.chh
    public final clt c() {
        return this.b;
    }

    @Override // defpackage.chh
    public final boolean d(float f) {
        clt cltVar = this.c;
        clt cltVar2 = this.b;
        if (cltVar == cltVar2 && this.d == f) {
            return true;
        }
        this.c = cltVar2;
        this.d = f;
        return false;
    }

    @Override // defpackage.chh
    public final boolean e() {
        return false;
    }

    @Override // defpackage.chh
    public final boolean f(float f) {
        if (this.b.d(f)) {
            return !this.b.e();
        }
        this.b = g(f);
        return true;
    }
}
