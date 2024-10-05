package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hro implements ynk {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ hro(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.zfi
    public final /* synthetic */ void a(Object obj) {
        if (this.b != 0) {
            b((Throwable) obj);
        } else {
            b((Throwable) obj);
        }
    }

    @Override // defpackage.ynk
    public final void b(Throwable th) {
        if (this.b != 0) {
            String valueOf = String.valueOf(this.a);
            zga.d(valueOf.length() != 0 ? "SVideoEffectsController: Failed to delete the asset ".concat(valueOf) : new String("SVideoEffectsController: Failed to delete the asset "), th);
        } else {
            String str = this.a;
            afsi.c(2, 6, str.length() != 0 ? "[ShortsCreation][Android][Upload]".concat(str) : new String("[ShortsCreation][Android][Upload]"), th);
        }
    }
}
