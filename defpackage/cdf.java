package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cdf extends btp {
    public cdf(btl btlVar) {
        super(btlVar);
    }

    @Override // defpackage.btp
    public final String a() {
        return "UPDATE workspec SET period_start_time=? WHERE id=?";
    }
}
