package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hmz extends yvo {
    final /* synthetic */ String a;
    final /* synthetic */ long b;
    final /* synthetic */ hnb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hmz(hnb hnbVar, String str, cnk cnkVar, String str2, long j) {
        super(1, str, cnkVar);
        this.c = hnbVar;
        this.a = str2;
        this.b = j;
    }

    @Override // defpackage.yvo
    public final cnm qk(cnh cnhVar) {
        return cnm.b(cnhVar.b, null);
    }

    @Override // defpackage.yvo
    public final /* bridge */ /* synthetic */ void ql(Object obj) {
        byte[] bArr = (byte[]) obj;
        String valueOf = String.valueOf(this.a);
        if (valueOf.length() != 0) {
            "Response delivered for ".concat(valueOf);
        }
        ((hmw) this.c.b).n(this.b, ammv.j(bArr));
        hfp hfpVar = this.c.c;
        acsx acsxVar = hfpVar.f;
        if (acsxVar == null) {
            return;
        }
        acsxVar.c("aft");
        hfpVar.f = null;
    }
}
