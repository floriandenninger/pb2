package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cdh extends btp {
    public cdh(btl btlVar) {
        super(btlVar);
    }

    @Override // defpackage.btp
    public final String a() {
        return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
    }
}
