package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahcd implements actc {
    private final String a;

    public ahcd(String str) {
        this.a = str;
    }

    @Override // defpackage.actc
    public final actb a(actg actgVar) {
        return new ahce(this.a, actgVar.a().a(), actgVar.e().t());
    }
}
