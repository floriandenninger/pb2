package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class afrn implements ynl {
    public final /* synthetic */ String a;
    private final /* synthetic */ int b;

    public /* synthetic */ afrn(String str, int i) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.ynl, defpackage.zfi
    public final void a(Object obj) {
        if (this.b == 0) {
            String str = this.a;
            if (((Boolean) obj).booleanValue()) {
                String valueOf = String.valueOf(str);
                if (valueOf.length() != 0) {
                    "In DefaultDelayedEventService: ".concat(valueOf);
                    return;
                }
                return;
            }
            return;
        }
        String str2 = this.a;
        if (((Boolean) obj).booleanValue()) {
            String valueOf2 = String.valueOf(str2);
            if (valueOf2.length() != 0) {
                "SVideoEffectsController: Successfully deleted asset ".concat(valueOf2);
                return;
            }
            return;
        }
        String valueOf3 = String.valueOf(str2);
        zga.b(valueOf3.length() != 0 ? "SVideoEffectsController: Failed to delete asset ".concat(valueOf3) : new String("SVideoEffectsController: Failed to delete asset "));
    }
}
