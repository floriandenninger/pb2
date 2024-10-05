package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class soa extends lo {
    final /* synthetic */ szx a;
    final /* synthetic */ sww b;
    final /* synthetic */ swt c;
    final /* synthetic */ sxc d;
    final /* synthetic */ AtomicReference e;
    final /* synthetic */ AtomicBoolean f;
    final /* synthetic */ szx g;
    final /* synthetic */ szx h;
    final /* synthetic */ int i;

    public soa(szx szxVar, sww swwVar, swt swtVar, sxc sxcVar, AtomicReference atomicReference, AtomicBoolean atomicBoolean, szx szxVar2, int i, szx szxVar3) {
        this.a = szxVar;
        this.b = swwVar;
        this.c = swtVar;
        this.d = sxcVar;
        this.e = atomicReference;
        this.f = atomicBoolean;
        this.g = szxVar2;
        this.i = i;
        this.h = szxVar3;
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        szx szxVar = this.a;
        if (szxVar != null) {
            sww swwVar = this.b;
            awnw a = szxVar.a();
            swt swtVar = this.c;
            sxc sxcVar = this.d;
            soc.a(recyclerView, swwVar, a, swtVar, sxcVar.u, sxcVar.r);
        }
        AtomicReference atomicReference = this.e;
        if (atomicReference == null || atomicReference.get() == null) {
            return;
        }
        ((syu) this.e.get()).b(recyclerView, i, i2);
    }

    @Override // defpackage.lo
    public final void b(RecyclerView recyclerView, int i) {
        szx szxVar;
        if (i != 0) {
            if (i == 1 && this.f.compareAndSet(false, true) && (szxVar = this.h) != null) {
                sww swwVar = this.b;
                awnw a = szxVar.a();
                swt swtVar = this.c;
                sxc sxcVar = this.d;
                soc.a(recyclerView, swwVar, a, swtVar, sxcVar.u, sxcVar.r);
                return;
            }
            return;
        }
        if (this.f.compareAndSet(true, false)) {
            szx szxVar2 = this.g;
            if (szxVar2 != null) {
                sww swwVar2 = this.b;
                awnw a2 = szxVar2.a();
                swt swtVar2 = this.c;
                sxc sxcVar2 = this.d;
                soc.a(recyclerView, swwVar2, a2, swtVar2, sxcVar2.u, sxcVar2.r);
            }
            if (this.i == 2) {
                sxc sxcVar3 = this.d;
                int i2 = soc.a;
                awpj c = sxcVar3.c();
                syg b = sxcVar3.b();
                if (b == null || c == null) {
                    return;
                }
                b.a(c, 3);
            }
        }
    }
}
