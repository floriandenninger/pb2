package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cdj extends btp {
    public cdj(btl btlVar) {
        super(btlVar);
    }

    @Override // defpackage.btp
    public final String a() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
