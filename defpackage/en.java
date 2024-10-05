package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public class en {
    public final ce a;
    public int e;
    public int f;
    private final List g = new ArrayList();
    public final HashSet b = new HashSet();
    public boolean c = false;
    public boolean d = false;

    public en(int i, int i2, ce ceVar, aio aioVar) {
        this.e = i;
        this.f = i2;
        this.a = ceVar;
        aioVar.b(new em(this));
    }

    public void a() {
        if (this.d) {
            return;
        }
        if (dd.W(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("SpecialEffectsController: ");
            sb.append(this);
            sb.append(" has called complete.");
        }
        this.d = true;
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Runnable runnable) {
        this.g.add(runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.c) {
            return;
        }
        this.c = true;
        if (this.b.isEmpty()) {
            a();
            return;
        }
        ArrayList arrayList = new ArrayList(this.b);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((aio) arrayList.get(i)).a();
        }
    }

    public final void e(aio aioVar) {
        b();
        this.b.add(aioVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(int i, int i2) {
        int i3 = i2 - 1;
        if (i3 == 1) {
            if (this.e == 1) {
                if (dd.W(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: For fragment ");
                    sb.append(this.a);
                    sb.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
                    sb.append((Object) ej.oM(this.f));
                    sb.append(" to ADDING.");
                }
                this.e = 2;
                this.f = 2;
                return;
            }
            return;
        }
        if (i3 != 2) {
            if (this.e != 1) {
                if (dd.W(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: For fragment ");
                    sb2.append(this.a);
                    sb2.append(" mFinalState = ");
                    sb2.append((Object) ej.o(this.e));
                    sb2.append(" -> ");
                    sb2.append((Object) ej.o(i));
                    sb2.append(". ");
                }
                this.e = i;
                return;
            }
            return;
        }
        if (dd.W(2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("SpecialEffectsController: For fragment ");
            sb3.append(this.a);
            sb3.append(" mFinalState = ");
            sb3.append((Object) ej.o(this.e));
            sb3.append(" -> REMOVED. mLifecycleImpact  = ");
            sb3.append((Object) ej.oM(this.f));
            sb3.append(" to REMOVING.");
        }
        this.e = 1;
        this.f = 3;
    }

    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + ((Object) ej.o(this.e)) + "} {mLifecycleImpact = " + ((Object) ej.oM(this.f)) + "} {mFragment = " + this.a + "}";
    }
}
