package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class txu extends btg {
    public txu(btl btlVar) {
        super(btlVar);
    }

    @Override // defpackage.btp
    public final String a() {
        return "INSERT OR IGNORE INTO `chime_thread_states` (`id`,`thread_id`,`last_updated_version`,`read_state`,`deletion_status`,`count_behavior`,`system_tray_behavior`,`modified_timestamp`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
    }

    @Override // defpackage.btg
    public final /* synthetic */ void c(buu buuVar, Object obj) {
        txc txcVar = (txc) obj;
        buuVar.d(1, txcVar.a);
        String str = txcVar.b;
        if (str != null) {
            buuVar.f(2, str);
        } else {
            buuVar.e(2);
        }
        buuVar.d(3, txcVar.c);
        int i = txcVar.e;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        buuVar.d(4, i2);
        int i3 = txcVar.f;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        buuVar.d(5, i4);
        int i5 = txcVar.g;
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        buuVar.d(6, i6);
        int i7 = txcVar.h;
        int i8 = i7 - 1;
        if (i7 == 0) {
            throw null;
        }
        buuVar.d(7, i8);
        buuVar.d(8, txcVar.d);
    }
}
