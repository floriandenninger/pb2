package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abgz implements ajol {
    final /* synthetic */ abha a;

    public abgz(abha abhaVar) {
        this.a = abhaVar;
    }

    @Override // defpackage.ajol
    public final void a(ajok ajokVar, ajng ajngVar, int i) {
        String str;
        Object c = ajngVar.c(i);
        if (c instanceof asro) {
            str = ((asro) c).c;
        } else if (c instanceof asrp) {
            str = ((asrp) c).c;
        } else {
            str = c instanceof asrm ? ((asrm) c).b : null;
        }
        str.getClass();
        abgy abgyVar = (abgy) this.a.c.get(str);
        ajokVar.f("ticker_start_timestamp_ms", Long.valueOf(abgyVar.c));
        ajokVar.f("ticker_applied_action", abgyVar.d);
    }
}
