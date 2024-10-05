package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class tnq implements anfz {
    public final /* synthetic */ tkv a;
    private final /* synthetic */ int b;

    public /* synthetic */ tnq(tkv tkvVar, int i) {
        this.b = i;
        this.a = tkvVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = this.b;
        if (i == 0) {
            tkv tkvVar = (tkv) obj;
            return anaf.O(Boolean.valueOf(tkvVar != null ? tov.p(this.a, tkvVar) : false));
        }
        if (i == 1) {
            tsx.i((tkl) obj, "%s: Unable to correct isolated structure, returning null instead of group %s", "FileGroupManager", this.a.d);
            return anhv.a;
        }
        tkv tkvVar2 = this.a;
        if (true != ((Boolean) obj).booleanValue()) {
            tkvVar2 = null;
        }
        return anaf.O(tkvVar2);
    }
}
