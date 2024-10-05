package defpackage;

import io.grpc.Status;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ayjf implements Runnable {
    final /* synthetic */ Status a;
    final /* synthetic */ ayjp b;
    private final /* synthetic */ int c;

    public ayjf(ayjp ayjpVar, Status status, int i) {
        this.c = i;
        this.b = ayjpVar;
        this.a = status;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            ArrayList arrayList = new ArrayList(this.b.l);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ayli) arrayList.get(i)).k(this.a);
            }
            return;
        }
        if (this.b.p.a == ayae.SHUTDOWN) {
            return;
        }
        ayjp ayjpVar = this.b;
        ayjpVar.q = this.a;
        ayli ayliVar = ayjpVar.o;
        ayjp ayjpVar2 = this.b;
        aygo aygoVar = ayjpVar2.n;
        ayjpVar2.o = null;
        this.b.n = null;
        this.b.b(ayae.SHUTDOWN);
        this.b.f.b();
        if (this.b.l.isEmpty()) {
            this.b.e();
        }
        ayjp ayjpVar3 = this.b;
        ayjpVar3.e.d();
        aydg aydgVar = ayjpVar3.i;
        if (aydgVar != null) {
            aydgVar.a();
            ayjpVar3.i = null;
            ayjpVar3.r = null;
        }
        aydg aydgVar2 = this.b.j;
        if (aydgVar2 != null) {
            aydgVar2.a();
            this.b.k.j(this.a);
            ayjp ayjpVar4 = this.b;
            ayjpVar4.j = null;
            ayjpVar4.k = null;
        }
        if (ayliVar != null) {
            ayliVar.j(this.a);
        }
        if (aygoVar != null) {
            aygoVar.j(this.a);
        }
    }
}
