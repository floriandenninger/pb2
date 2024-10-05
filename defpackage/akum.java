package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class akum implements ynk {
    public final /* synthetic */ akux a;
    private final /* synthetic */ int b;

    public /* synthetic */ akum(akux akuxVar, int i) {
        this.b = i;
        this.a = akuxVar;
    }

    @Override // defpackage.zfi
    public final /* synthetic */ void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            b((Throwable) obj);
        } else if (i != 1) {
            b((Throwable) obj);
        } else {
            b((Throwable) obj);
        }
    }

    @Override // defpackage.ynk
    public final void b(Throwable th) {
        int i = this.b;
        if (i == 0) {
            this.a.G("Failed to clean up unused ClientApi uploads.", th);
        } else if (i != 1) {
            this.a.G("Failed to retrieve the Upload.", th);
        } else {
            this.a.G("Failed to resume and clean up expired ClientApi uploads.", th);
        }
    }
}
