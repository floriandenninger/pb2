package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ccu extends btp {
    public ccu(btl btlVar) {
        super(btlVar);
    }

    @Override // defpackage.btp
    public final String a() {
        return "DELETE from WorkProgress where work_spec_id=?";
    }
}
