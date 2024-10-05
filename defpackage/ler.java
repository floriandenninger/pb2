package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ler implements Runnable {
    public final /* synthetic */ les a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ajnf c;
    private final /* synthetic */ int d;

    public /* synthetic */ ler(les lesVar, int i, ajnf ajnfVar, int i2) {
        this.d = i2;
        this.a = lesVar;
        this.b = i;
        this.c = ajnfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d == 0) {
            les lesVar = this.a;
            int i = this.b;
            ajnf ajnfVar = this.c;
            wv i2 = lesVar.a.e.i(Math.max(i - 1, 0));
            if (i2 != null) {
                i2.a.sendAccessibilityEvent(8);
            }
            lesVar.a.f.r().pf(ajnfVar);
            return;
        }
        les lesVar2 = this.a;
        int i3 = this.b;
        ajnf ajnfVar2 = this.c;
        wv i4 = lesVar2.a.e.i(i3);
        if (i4 != null) {
            i4.a.sendAccessibilityEvent(8);
        }
        lesVar2.a.f.r().pf(ajnfVar2);
    }
}
