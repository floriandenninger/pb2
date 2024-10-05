package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abta implements Runnable {
    public final /* synthetic */ abtk a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ abta(abtk abtkVar, int i, int i2) {
        this.c = i2;
        this.a = abtkVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            abtk abtkVar = this.a;
            int i = this.b;
            absn absnVar = abtkVar.n;
            if (absnVar != null) {
                absnVar.a(i);
                return;
            }
            return;
        }
        abtk abtkVar2 = this.a;
        int i2 = this.b;
        abwa abwaVar = abtkVar2.B;
        if (abwaVar != null) {
            abwaVar.a(i2);
            abtkVar2.B = null;
        }
    }
}
