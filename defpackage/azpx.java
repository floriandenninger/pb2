package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class azpx extends azpv {
    private static final long serialVersionUID = -2151279923272604993L;
    protected final banw f;
    protected Object g;

    public azpx(banw banwVar) {
        this.f = banwVar;
    }

    @Override // defpackage.aytf
    public final void d() {
        lazySet(32);
        this.g = null;
    }

    public final void g(Object obj) {
        int i = get();
        while (i != 8) {
            if ((i & (-3)) != 0) {
                return;
            }
            if (i != 2) {
                this.g = obj;
                if (compareAndSet(0, 1)) {
                    return;
                }
                i = get();
                if (i == 4) {
                    this.g = null;
                    return;
                }
            } else {
                lazySet(3);
                banw banwVar = this.f;
                banwVar.c(obj);
                if (get() != 4) {
                    banwVar.sh();
                    return;
                }
                return;
            }
        }
        this.g = obj;
        lazySet(16);
        banw banwVar2 = this.f;
        banwVar2.c(obj);
        if (get() != 4) {
            banwVar2.sh();
        }
    }

    @Override // defpackage.aytf
    public final boolean j() {
        return get() != 16;
    }

    public void sd() {
        set(4);
        this.g = null;
    }

    @Override // defpackage.aytb
    public final int sf(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    @Override // defpackage.aytf
    public final Object sg() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        Object obj = this.g;
        this.g = null;
        return obj;
    }

    @Override // defpackage.banx
    public final void sj(long j) {
        Object obj;
        if (!azqb.h(j)) {
            return;
        }
        do {
            int i = get();
            if ((i & (-2)) != 0) {
                return;
            }
            if (i == 1) {
                if (!compareAndSet(1, 3) || (obj = this.g) == null) {
                    return;
                }
                this.g = null;
                banw banwVar = this.f;
                banwVar.c(obj);
                if (get() != 4) {
                    banwVar.sh();
                    return;
                }
                return;
            }
        } while (!compareAndSet(0, 2));
    }
}
