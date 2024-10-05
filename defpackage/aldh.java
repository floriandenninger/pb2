package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class aldh implements Runnable {
    public final /* synthetic */ aldn a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ aldh(aldn aldnVar, String str, int i) {
        this.c = i;
        this.a = aldnVar;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.c;
        if (i == 0) {
            this.a.e(this.b);
            return;
        }
        if (i == 1) {
            this.a.e(this.b);
            return;
        }
        if (i == 2) {
            this.a.e(this.b);
            return;
        }
        if (i == 3) {
            this.a.e(this.b);
            return;
        }
        aldn aldnVar = this.a;
        String str = this.b;
        aldnVar.b(str, false);
        aldnVar.e(str);
    }
}
