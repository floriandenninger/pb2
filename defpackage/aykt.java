package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aykt extends axzp {
    public final String b;
    public final /* synthetic */ aykx c;
    public final AtomicReference a = new AtomicReference(aykx.g);
    private final axzp d = new aykn(this);

    public aykt(aykx aykxVar, String str) {
        this.c = aykxVar;
        str.getClass();
        this.b = str;
    }

    @Override // defpackage.axzp
    public final axzr a(aych aychVar, axzo axzoVar) {
        if (this.a.get() != aykx.g) {
            return c(aychVar, axzoVar);
        }
        this.c.o.execute(new ayko(this, 2));
        if (this.a.get() != aykx.g) {
            return c(aychVar, axzoVar);
        }
        if (this.c.A.get()) {
            return new aykp();
        }
        ayks ayksVar = new ayks(this, ayai.b(), aychVar, axzoVar);
        this.c.o.execute(new aykq(this, ayksVar));
        return ayksVar;
    }

    @Override // defpackage.axzp
    public final String b() {
        return this.b;
    }

    public final axzr c(aych aychVar, axzo axzoVar) {
        ayba aybaVar = (ayba) this.a.get();
        if (aybaVar == null) {
            return this.d.a(aychVar, axzoVar);
        }
        if (aybaVar instanceof aylf) {
            ayle b = ((aylf) aybaVar).b.b(aychVar);
            if (b != null) {
                axzoVar = axzoVar.d(ayle.a, b);
            }
            return this.d.a(aychVar, axzoVar);
        }
        return new ayke(aybaVar, this.d, this.c.l, aychVar, axzoVar);
    }

    public final void d(ayba aybaVar) {
        Collection collection;
        ayba aybaVar2 = (ayba) this.a.get();
        this.a.set(aybaVar);
        if (aybaVar2 != aykx.g || (collection = this.c.w) == null) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((ayks) it.next()).j();
        }
    }
}
