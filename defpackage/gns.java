package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class gns implements Runnable {
    public final /* synthetic */ gnt a;
    public final /* synthetic */ auft b;
    public final /* synthetic */ View c;
    private final /* synthetic */ int d;

    public /* synthetic */ gns(gnt gntVar, auft auftVar, View view, int i) {
        this.d = i;
        this.a = gntVar;
        this.b = auftVar;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        if (i == 0) {
            gnt gntVar = this.a;
            auft auftVar = this.b;
            gntVar.a.d(auftVar.d, this.c);
            return;
        }
        if (i != 1) {
            gnt gntVar2 = this.a;
            auft auftVar2 = this.b;
            gntVar2.a.d(auftVar2.d, this.c);
            return;
        }
        gnt gntVar3 = this.a;
        auft auftVar3 = this.b;
        gntVar3.a.d(auftVar3.d, this.c);
    }
}
