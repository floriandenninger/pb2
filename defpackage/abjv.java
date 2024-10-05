package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abjv {
    public abju a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();

    private final void c(abju abjuVar) {
        if (abjuVar == null) {
            return;
        }
        int b = abjuVar.b();
        if (b == 0) {
            this.d.add(abjuVar);
        } else if (b != 1) {
            this.b.add(abjuVar);
        } else {
            this.c.add(abjuVar);
        }
    }

    public final void b(abju abjuVar) {
        if (this.a == null) {
            abjuVar.i();
            this.a = abjuVar;
        } else {
            if (abjuVar.b() >= this.a.b()) {
                this.a.c();
                c(this.a);
                abjuVar.i();
                this.a = abjuVar;
                return;
            }
            c(abjuVar);
        }
    }

    public final void a(abju abjuVar) {
        abju abjuVar2;
        if (abjuVar != this.a) {
            if (abjuVar.b() == 0) {
                this.d.remove(abjuVar);
                return;
            } else if (abjuVar.b() == 1) {
                this.c.remove(abjuVar);
                return;
            } else {
                if (abjuVar.b() == 2) {
                    this.b.remove(abjuVar);
                    return;
                }
                return;
            }
        }
        if (!this.b.isEmpty()) {
            abjuVar2 = (abju) this.b.remove(r3.size() - 1);
        } else if (!this.c.isEmpty()) {
            abjuVar2 = (abju) this.c.remove(r3.size() - 1);
        } else if (this.d.isEmpty()) {
            abjuVar2 = null;
        } else {
            abjuVar2 = (abju) this.d.remove(r3.size() - 1);
        }
        this.a = abjuVar2;
        if (abjuVar2 != null) {
            abjuVar2.i();
        }
    }
}
