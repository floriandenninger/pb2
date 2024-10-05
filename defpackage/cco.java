package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cco extends btg {
    public cco(btl btlVar) {
        super(btlVar);
    }

    @Override // defpackage.btp
    public final String a() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
    }

    @Override // defpackage.btg
    public final /* bridge */ /* synthetic */ void c(buu buuVar, Object obj) {
        String str = ((ccn) obj).a;
        if (str == null) {
            buuVar.e(1);
        } else {
            buuVar.f(1, str);
        }
        buuVar.d(2, r5.b);
    }
}
