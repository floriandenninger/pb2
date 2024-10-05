package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cdg extends btp {
    public cdg(btl btlVar) {
        super(btlVar);
    }

    @Override // defpackage.btp
    public final String a() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}
