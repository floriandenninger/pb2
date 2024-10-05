package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fcl implements actc {
    private final int a;

    public fcl(int i) {
        this.a = i;
    }

    @Override // defpackage.actc
    public final actb a(actg actgVar) {
        int a = actgVar.a().a();
        boolean t = actgVar.e().t();
        int i = this.a;
        if (i == 0) {
            return new fcs(a, t);
        }
        if (i == 1) {
            return new fcn(a, t, null);
        }
        if (i == 2) {
            return new fcn(a, t);
        }
        if (i == 4) {
            return new fcq(a, t);
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append(i);
        sb.append(" type is not support");
        throw new IllegalStateException(sb.toString());
    }
}
