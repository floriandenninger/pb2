package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cct extends btg {
    public cct(btl btlVar) {
        super(btlVar);
    }

    @Override // defpackage.btp
    public final String a() {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }

    @Override // defpackage.btg
    public final /* bridge */ /* synthetic */ void c(buu buuVar, Object obj) {
        ccs ccsVar = (ccs) obj;
        String str = ccsVar.a;
        buuVar.e(1);
        byr byrVar = ccsVar.b;
        byte[] e = byr.e(null);
        if (e == null) {
            buuVar.e(2);
        } else {
            buuVar.c(2, e);
        }
    }
}
