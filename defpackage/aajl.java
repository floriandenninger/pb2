package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aajl implements aalc {
    private final aakl c;
    private final aalo d;
    private final shf e;
    private final amrz f;
    private final aajr h;
    private final aajr i;
    private final aajr j;
    private final List b = new ArrayList();
    public aoqa a = aalj.a;
    private final AtomicBoolean g = new AtomicBoolean(false);

    public aajl(aakl aaklVar, aajr aajrVar, aajr aajrVar2, aajr aajrVar3, aalo aaloVar, shf shfVar, amrz amrzVar, byte[] bArr, byte[] bArr2) {
        this.c = aaklVar;
        this.i = aajrVar;
        this.j = aajrVar2;
        this.h = aajrVar3;
        this.d = aaloVar;
        this.e = shfVar;
        this.f = amrzVar;
    }

    private final aakt l(aakt aaktVar) {
        return this.j.a(aaktVar.e());
    }

    private final ayph m(final boolean z) {
        if (this.g.getAndSet(true)) {
            throw new IllegalStateException("Cannot commit a set of pending edits more than once.");
        }
        if (this.b.isEmpty()) {
            return ayph.f();
        }
        final aakl aaklVar = this.c;
        final List list = this.b;
        anhy i = aney.i(anht.q(((vhj) aaklVar.c.get()).a(new vip() { // from class: aakg
            @Override // defpackage.vip
            public final Object a(viq viqVar) {
                aakl aaklVar2 = aakl.this;
                boolean z2 = z;
                List list2 = list;
                amrp amrpVar = !z2 ? new amrp() : null;
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ((aajj) it.next()).b((aaka) aaklVar2.d.get(), viqVar, amrpVar);
                }
                return amrpVar != null ? amrpVar.g() : amru.q();
            }
        })), Throwable.class, ufj.i, angq.a);
        if (!z) {
            aajv aajvVar = this.i.a;
            anaf.Y(i, new aaju(aajvVar), aajvVar.d);
        }
        ayph v = ayph.v(i);
        azrj W = azrj.W();
        v.I(W);
        ayph x = W.x();
        final aajr aajrVar = this.h;
        return x.q(new ayrs() { // from class: aajk
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                aajr.this.a.p((Throwable) obj);
            }
        });
    }

    @Override // defpackage.aalc
    public final aalc a(String str) {
        this.b.add(new aakb(this.c, str, this.a));
        return this;
    }

    @Override // defpackage.aalc
    public final ayph b() {
        return m(false);
    }

    @Override // defpackage.aalc
    public final ayph c() {
        return m(true);
    }

    @Override // defpackage.aalc
    public final void d(aakt aaktVar) {
        this.b.add(aaje.a(this.c, this.f, l(aaktVar), this.a, this.e));
    }

    @Override // defpackage.aalc
    public final void e(aakt aaktVar, aaku aakuVar) {
        List list = this.b;
        aakl aaklVar = this.c;
        amrz amrzVar = this.f;
        aakt l = l(aaktVar);
        list.add(new aaje(aaklVar, amrzVar, l, aakuVar, this.a, this.e, l.d()));
    }

    @Override // defpackage.aalc
    public final void f(String str, aaku aakuVar) {
        this.b.add(new aaje(this.c, this.f, null, aakuVar, this.a, this.e, str));
    }

    @Override // defpackage.aalc
    public final void g(String str) {
        this.b.add(new aakc(this.c, str, this.a));
    }

    @Override // defpackage.aalc
    public final /* synthetic */ void h(aakt aaktVar) {
        whu.ae(this, aaktVar);
    }

    @Override // defpackage.aalc
    public final void i(String str, aqua aquaVar, byte[] bArr) {
        this.b.add(new aakm(this.c, this.d, str, aquaVar, bArr, this.e, this.a));
    }

    @Override // defpackage.aalc
    public final /* synthetic */ void j(Iterable iterable) {
        whu.ad(this, iterable);
    }

    @Override // defpackage.aalc
    public final void k(whu whuVar) {
        this.b.add(aaje.a(this.c, this.f, this.j.a(whuVar), this.a, this.e));
    }
}
