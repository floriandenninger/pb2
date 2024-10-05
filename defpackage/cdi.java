package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cdi extends btp {
    public cdi(btl btlVar) {
        super(btlVar);
    }

    @Override // defpackage.btp
    public final String a() {
        return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
    }
}
