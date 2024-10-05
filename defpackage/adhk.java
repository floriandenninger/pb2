package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adhk implements anhh {
    private final /* synthetic */ int a;

    public adhk(int i) {
        this.a = i;
    }

    @Override // defpackage.anhh
    public final void b(Object obj) {
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        if (this.a != 0) {
            return;
        }
        zga.d("Failed to hide notifications", th);
    }
}
