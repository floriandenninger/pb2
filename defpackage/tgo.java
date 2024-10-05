package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tgo implements tfi {
    private final tff a;

    public tgo(tff tffVar) {
        this.a = tffVar;
    }

    @Override // defpackage.tfi
    public final anhy a(tfp tfpVar) {
        if (tfpVar instanceof thg) {
            thg thgVar = (thg) tfpVar;
            if (thgVar.a().pY(tgq.a)) {
                tgp tgpVar = (tgp) thgVar.a().pX(tgq.a);
                int P = sgf.P(tgpVar.d);
                if (P == 0) {
                    P = 1;
                }
                int i = P - 1;
                if (i == 1) {
                    if ((tgpVar.b & 1) != 0) {
                        return anaf.O(tff.a(tgpVar.c));
                    }
                    throw new IllegalArgumentException("GAIA type must have a name");
                }
                if (i == 2) {
                    return anaf.O(new tff(3, null));
                }
                if (i == 3) {
                    return anaf.O(tff.b());
                }
                if (i != 4) {
                    throw new IllegalArgumentException("Unknown type");
                }
                return anaf.O(this.a);
            }
        }
        return anaf.O(null);
    }
}
