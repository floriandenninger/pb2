package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class mgh implements alrx {
    private final /* synthetic */ int c;
    public static final /* synthetic */ mgh b = new mgh(1);
    public static final /* synthetic */ mgh a = new mgh(0);

    private /* synthetic */ mgh(int i) {
        this.c = i;
    }

    @Override // defpackage.alrx
    public final void a(Exception exc) {
        if (this.c != 0) {
            zga.d("Failed to launch review flow", exc);
        } else {
            zga.d("Failed to request In-App Review", exc);
        }
    }
}
