package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class hoa implements Runnable {
    public final /* synthetic */ hoj a;
    private final /* synthetic */ int b;

    public /* synthetic */ hoa(hoj hojVar, int i) {
        this.b = i;
        this.a = hojVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.s.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.a.s.setVisibility(8);
        } else {
            if (i != 2) {
                this.a.u();
                return;
            }
            hnh hnhVar = this.a.z;
            hnhVar.c = null;
            hnhVar.a.clear();
        }
    }
}
