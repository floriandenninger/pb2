package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class abtu implements Runnable {
    public final /* synthetic */ abub a;
    private final /* synthetic */ int b;

    public /* synthetic */ abtu(abub abubVar, int i) {
        this.b = i;
        this.a = abubVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            this.a.c();
            return;
        }
        abub abubVar = this.a;
        abubVar.i = false;
        abubVar.j = false;
    }
}
