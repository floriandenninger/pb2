package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acnz implements Runnable {
    public final /* synthetic */ abso a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ acnz(abso absoVar, int i, int i2) {
        this.c = i2;
        this.a = absoVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c != 0) {
            abso absoVar = this.a;
            int i = this.b;
            if (absoVar != null) {
                absoVar.a(i);
                return;
            }
            return;
        }
        abso absoVar2 = this.a;
        int i2 = this.b;
        if (absoVar2 != null) {
            absoVar2.a(i2);
        }
    }
}
