package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vuz extends oxt {
    private long i;

    public vuz(oyr oyrVar) {
        super(oyrVar, oxv.a);
        this.i = 0L;
    }

    @Override // defpackage.oys
    protected final long K(long j) {
        return Math.max(0L, j - this.i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oys, defpackage.oyx
    public final long b() {
        return super.b() + this.i;
    }

    @Override // defpackage.oxt, defpackage.oyx, defpackage.oxi
    public final void k(int i, Object obj) {
        if (i == 1001) {
            this.i = ((Long) obj).longValue();
        } else {
            super.k(i, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oxt, defpackage.oyx
    public final oxp m() {
        return null;
    }
}
