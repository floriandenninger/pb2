package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ccp extends btp {
    public ccp(btl btlVar) {
        super(btlVar);
    }

    @Override // defpackage.btp
    public final String a() {
        return "DELETE FROM SystemIdInfo where work_spec_id=?";
    }
}
