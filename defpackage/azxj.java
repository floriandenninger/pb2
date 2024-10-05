package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azxj extends azxo implements azxg {
    private final boolean a;

    public azxj() {
        u(null);
        azvx t = t();
        azvy azvyVar = t instanceof azvy ? (azvy) t : null;
        boolean z = false;
        if (azvyVar != null) {
            azxo e = azvyVar.e();
            while (true) {
                if (e.sn()) {
                    z = true;
                    break;
                }
                azvx t2 = e.t();
                azvy azvyVar2 = t2 instanceof azvy ? (azvy) t2 : null;
                if (azvyVar2 == null) {
                    break;
                } else {
                    e = azvyVar2.e();
                }
            }
        }
        this.a = z;
    }

    @Override // defpackage.azxo
    public final boolean n() {
        return true;
    }

    @Override // defpackage.azxo
    public final boolean sn() {
        return this.a;
    }
}
