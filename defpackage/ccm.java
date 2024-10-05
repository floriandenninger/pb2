package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ccm extends btg {
    public ccm(btl btlVar) {
        super(btlVar);
    }

    @Override // defpackage.btp
    public final String a() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // defpackage.btg
    public final /* bridge */ /* synthetic */ void c(buu buuVar, Object obj) {
        ccl cclVar = (ccl) obj;
        buuVar.f(1, cclVar.a);
        buuVar.d(2, cclVar.b.longValue());
    }
}
