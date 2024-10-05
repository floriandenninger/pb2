package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class akxo implements Runnable {
    public final /* synthetic */ akxw a;
    private final /* synthetic */ int b;

    public /* synthetic */ akxo(akxw akxwVar, int i) {
        this.b = i;
        this.a = akxwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            akxw akxwVar = this.a;
            if (akxwVar.h) {
                return;
            }
            akxwVar.h = true;
            akxwVar.g();
            return;
        }
        if (i == 1) {
            akxw akxwVar2 = this.a;
            akxwVar2.e.clear();
            akxwVar2.g.clear();
            akxwVar2.g();
            return;
        }
        akxw akxwVar3 = this.a;
        if (akxwVar3.h) {
            akxwVar3.h = false;
            akxwVar3.g();
        }
    }
}
