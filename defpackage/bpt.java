package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpt {
    final bpc a;
    final int b;
    final bpv c;
    final List d;
    public final WeakReference e;
    private final bpv g;
    private final bpv h;
    public anhy f = null;
    private boolean i = false;
    private boolean j = false;

    public bpt(bpp bppVar, bpv bpvVar, bpc bpcVar, int i, bpv bpvVar2, Collection collection) {
        this.e = new WeakReference(bppVar);
        this.c = bpvVar;
        this.a = bpcVar;
        this.b = i;
        this.g = bppVar.s;
        this.h = bpvVar2;
        this.d = collection != null ? new ArrayList(collection) : null;
        bppVar.m.postDelayed(new bpr(this), 15000L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.i || this.j) {
            return;
        }
        this.j = true;
        bpc bpcVar = this.a;
        if (bpcVar != null) {
            bpcVar.i(0);
            this.a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        anhy anhyVar;
        bpw.c();
        if (this.i || this.j) {
            return;
        }
        bpp bppVar = (bpp) this.e.get();
        if (bppVar != null && bppVar.A == this && ((anhyVar = this.f) == null || !anhyVar.isCancelled())) {
            this.i = true;
            bppVar.A = null;
            bpp bppVar2 = (bpp) this.e.get();
            if (bppVar2 != null) {
                bpv bpvVar = bppVar2.s;
                bpv bpvVar2 = this.g;
                if (bpvVar == bpvVar2) {
                    bppVar2.m.b(263, bpvVar2, this.b);
                    bpc bpcVar = bppVar2.t;
                    if (bpcVar != null) {
                        bpcVar.i(this.b);
                        bppVar2.t.a();
                    }
                    if (!bppVar2.w.isEmpty()) {
                        for (bpc bpcVar2 : bppVar2.w.values()) {
                            bpcVar2.i(this.b);
                            bpcVar2.a();
                        }
                        bppVar2.w.clear();
                    }
                    bppVar2.t = null;
                }
            }
            bpp bppVar3 = (bpp) this.e.get();
            if (bppVar3 == null) {
                return;
            }
            bpv bpvVar3 = this.c;
            bppVar3.s = bpvVar3;
            bppVar3.t = this.a;
            bpv bpvVar4 = this.h;
            if (bpvVar4 == null) {
                bppVar3.m.b(262, new hx(this.g, bpvVar3), this.b);
            } else {
                bppVar3.m.b(264, new hx(bpvVar4, bpvVar3), this.b);
            }
            bppVar3.w.clear();
            bppVar3.h();
            bppVar3.m();
            List list = this.d;
            if (list != null) {
                bppVar3.s.h(list);
                return;
            }
            return;
        }
        a();
    }
}
