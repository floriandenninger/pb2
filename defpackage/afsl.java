package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afsl implements cnk {
    private final /* synthetic */ int c;
    public static final /* synthetic */ afsl b = new afsl(3);
    public static final /* synthetic */ afsl a = new afsl(1);

    public afsl(int i) {
        this.c = i;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        int i = this.c;
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
            return;
        }
        zga.d("Network error while sending request ", cnqVar);
    }
}
