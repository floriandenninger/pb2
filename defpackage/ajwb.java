package defpackage;

import android.support.v7.widget.LinearLayoutManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ajwb implements Runnable {
    public final /* synthetic */ ajwi a;
    public final /* synthetic */ int b;
    private final /* synthetic */ int c;

    public /* synthetic */ ajwb(ajwi ajwiVar, int i, int i2) {
        this.c = i2;
        this.a = ajwiVar;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            ajwi ajwiVar = this.a;
            int i = this.b;
            wd wdVar = ajwiVar.K.n;
            if (wdVar != null) {
                ((LinearLayoutManager) wdVar).aa(i, 0);
                return;
            }
            return;
        }
        ajwi ajwiVar2 = this.a;
        ajwiVar2.K.aa(this.b);
    }
}
