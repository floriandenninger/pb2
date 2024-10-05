package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class rnv implements qqu {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ rnv(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.qqu
    public final void a(Object obj, Object obj2) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ((qdo) ((qdl) obj).D()).j(new qdm((rpv) obj2, 1, (byte[]) null), this.a);
                return;
            } else {
                String str = this.a;
                ((rob) ((roc) obj).D()).a(new roa((rpv) obj2), str);
                return;
            }
        }
        String str2 = this.a;
        roa roaVar = new roa((rpv) obj2);
        rob robVar = (rob) ((roc) obj).D();
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 36);
        sb.append("CURRENT:");
        sb.append(str2);
        sb.append(":com.youtube.mainapp.android");
        robVar.a(roaVar, sb.toString());
    }
}
