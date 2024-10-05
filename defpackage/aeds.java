package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aeds implements anfz {
    public final /* synthetic */ anhy a;
    private final /* synthetic */ int b;

    public /* synthetic */ aeds(anhy anhyVar, int i) {
        this.b = i;
        this.a = anhyVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.a;
        }
        if (i == 2) {
            return ((Boolean) obj).booleanValue() ? this.a : anaf.O(false);
        }
        return this.a;
    }
}
