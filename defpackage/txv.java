package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class txv extends btp {
    public txv(btl btlVar) {
        super(btlVar);
    }

    @Override // defpackage.btp
    public final String a() {
        return "DELETE FROM chime_thread_states WHERE modified_timestamp < ?";
    }
}
