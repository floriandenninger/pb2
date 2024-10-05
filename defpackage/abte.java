package defpackage;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class abte implements acaa {
    final /* synthetic */ abtk a;
    private boolean b;
    private boolean c;

    public abte(abtk abtkVar) {
        this.a = abtkVar;
    }

    @Override // defpackage.acaa
    public final void a(acac acacVar) {
        abtk abtkVar = this.a;
        if (acacVar == abtkVar.j) {
            this.b = true;
        }
        if (acacVar == abtkVar.k) {
            this.c = true;
        }
        if (this.b && this.c) {
            this.b = false;
            this.c = false;
            Handler handler = abtkVar.c;
            handler.getClass();
            handler.post(abtkVar.y);
        }
    }
}
