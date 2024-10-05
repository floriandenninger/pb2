package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class omn implements xoi {
    final /* synthetic */ omq a;
    private String b;

    public omn(omq omqVar) {
        this.a = omqVar;
    }

    @Override // defpackage.xoi
    public final void a() {
        String str = this.b;
        if (str != null) {
            this.a.g.b(str);
        }
    }

    @Override // defpackage.xoi
    public final void b() {
        this.b = this.a.g.a();
    }
}
