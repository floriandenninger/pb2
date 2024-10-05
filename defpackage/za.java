package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class za {
    public final aeg a = new aeg();
    public final aee b = new aee();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(wv wvVar) {
        yz yzVar = (yz) this.a.get(wvVar);
        if (yzVar == null) {
            yzVar = yz.a();
            this.a.put(wvVar, yzVar);
        }
        yzVar.b |= 1;
    }

    public final void b(long j, wv wvVar) {
        this.b.k(j, wvVar);
    }

    public final void c() {
        this.a.clear();
        this.b.j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(wv wvVar) {
        yz yzVar = (yz) this.a.get(wvVar);
        if (yzVar == null) {
            return;
        }
        yzVar.b &= -2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(wv wvVar) {
        int c = this.b.c();
        while (true) {
            c--;
            if (c < 0) {
                break;
            } else if (wvVar == this.b.h(c)) {
                this.b.m(c);
                break;
            }
        }
        yz yzVar = (yz) this.a.remove(wvVar);
        if (yzVar != null) {
            yz.c(yzVar);
        }
    }

    public final boolean f(wv wvVar) {
        yz yzVar = (yz) this.a.get(wvVar);
        return (yzVar == null || (yzVar.b & 1) == 0) ? false : true;
    }

    public final asc g(wv wvVar, int i) {
        yz yzVar;
        asc ascVar;
        int c = this.a.c(wvVar);
        if (c >= 0 && (yzVar = (yz) this.a.i(c)) != null) {
            int i2 = yzVar.b;
            if ((i2 & i) != 0) {
                int i3 = (i ^ (-1)) & i2;
                yzVar.b = i3;
                if (i == 4) {
                    ascVar = yzVar.c;
                } else if (i == 8) {
                    ascVar = yzVar.d;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.a.g(c);
                    yz.c(yzVar);
                }
                return ascVar;
            }
        }
        return null;
    }

    public final void h(wv wvVar, asc ascVar) {
        yz yzVar = (yz) this.a.get(wvVar);
        if (yzVar == null) {
            yzVar = yz.a();
            this.a.put(wvVar, yzVar);
        }
        yzVar.d = ascVar;
        yzVar.b |= 8;
    }

    public final void i(wv wvVar, asc ascVar) {
        yz yzVar = (yz) this.a.get(wvVar);
        if (yzVar == null) {
            yzVar = yz.a();
            this.a.put(wvVar, yzVar);
        }
        yzVar.c = ascVar;
        yzVar.b |= 4;
    }
}
