package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hgw implements ayrs {
    public final /* synthetic */ hhd a;
    private final /* synthetic */ int b;

    public /* synthetic */ hgw(hhd hhdVar, int i) {
        this.b = i;
        this.a = hhdVar;
    }

    @Override // defpackage.ayrs
    public final void a(Object obj) {
        if (this.b == 0) {
            this.a.aO(((Boolean) obj).booleanValue());
            return;
        }
        hhd hhdVar = this.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        hhdVar.aO(booleanValue);
        axdm axdmVar = booleanValue ? axdm.PREVIEW_MODE_MINI : axdm.PREVIEW_MODE_REGULAR;
        String valueOf = String.valueOf(axdmVar.toString());
        if (valueOf.length() != 0) {
            "Updating preview mode: ".concat(valueOf);
        }
        zrx a = hhdVar.ag.a();
        if (a != null) {
            zqc zqcVar = a.b;
            axcl a2 = axcq.a();
            a2.copyOnWrite();
            ((axcq) a2.instance).C(axdmVar);
            zqcVar.a.add((axcq) a2.build());
        }
        if (booleanValue) {
            return;
        }
        hhdVar.b.y();
    }
}
