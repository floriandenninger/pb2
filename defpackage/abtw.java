package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abtw implements Runnable {
    public final /* synthetic */ abub a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    private final /* synthetic */ int d;

    public /* synthetic */ abtw(abub abubVar, int i, String str, int i2) {
        this.d = i2;
        this.a = abubVar;
        this.b = i;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            abub abubVar = this.a;
            int i = this.b;
            String str = this.c;
            abwp abwpVar = abubVar.A;
            if (abwpVar != null) {
                abwpVar.a(i, str, null);
                return;
            }
            return;
        }
        abub abubVar2 = this.a;
        int i2 = this.b;
        String str2 = this.c;
        abwp abwpVar2 = abubVar2.A;
        if (abwpVar2 != null) {
            abwy abwyVar = abwpVar2.b;
            if (abwyVar.S) {
                abwyVar.e.g(i2, str2);
            }
        }
    }
}
