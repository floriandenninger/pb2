package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aipp implements ayrv {
    public final /* synthetic */ amml a;
    private final /* synthetic */ int b;

    public /* synthetic */ aipp(amml ammlVar, int i) {
        this.b = i;
        this.a = ammlVar;
    }

    @Override // defpackage.ayrv
    public final Object a(Object obj) {
        awjf awjfVar;
        int i = this.b;
        if (i == 0) {
            return (banv) this.a.apply(((ahel) obj).a());
        }
        if (i == 1) {
            amml ammlVar = this.a;
            String str = (String) obj;
            try {
                awjfVar = (awjf) aonm.parseFrom(awjf.a, aalt.b(str), aomw.b());
            } catch (aoob unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 92);
                sb.append("Found entityKey=`");
                sb.append(str);
                sb.append("` that does not contain a PlaylistVideoEntityId message as it's identifier.");
                zga.b(sb.toString());
                awjfVar = null;
            }
            return awjfVar != null ? (String) ammlVar.apply(awjfVar.c) : "";
        }
        ahel ahelVar = (ahel) obj;
        return ((aypn) this.a.apply(ahelVar.a())).A(new iis(ahelVar, 2));
    }
}
