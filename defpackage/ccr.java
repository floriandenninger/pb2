package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ccr extends btg {
    public ccr(btl btlVar) {
        super(btlVar);
    }

    @Override // defpackage.btp
    public final String a() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // defpackage.btg
    public final /* bridge */ /* synthetic */ void c(buu buuVar, Object obj) {
        cdm cdmVar = (cdm) obj;
        String str = cdmVar.a;
        if (str == null) {
            buuVar.e(1);
        } else {
            buuVar.f(1, str);
        }
        String str2 = cdmVar.b;
        if (str2 == null) {
            buuVar.e(2);
        } else {
            buuVar.f(2, str2);
        }
    }
}
