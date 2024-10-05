package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aaed implements anfz {
    public final /* synthetic */ aaee a;
    private final /* synthetic */ int b;

    public /* synthetic */ aaed(aaee aaeeVar, int i) {
        this.b = i;
        this.a = aaeeVar;
    }

    @Override // defpackage.anfz
    public final anhy a(Object obj) {
        int i = this.b;
        if (i == 0) {
            return ((abep) this.a.a.get()).g();
        }
        if (i == 1) {
            return ((abep) this.a.a.get()).g();
        }
        aaee aaeeVar = this.a;
        if (((Boolean) obj).booleanValue()) {
            return anaf.O(aaeb.STAGING.i);
        }
        return anfq.i(((abep) aaeeVar.a.get()).c(), new aaed(aaeeVar, 0), angq.a);
    }
}
