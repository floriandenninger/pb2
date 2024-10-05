package defpackage;

import com.google.android.libraries.youtube.player.features.prefetch.WillAutonavInformer;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class keg implements ahfd {
    public final ywr a;
    public final ywr b;
    public boolean c = true;
    private final Executor e;
    private final Set f;
    private final WillAutonavInformer g;

    public keg(ywr ywrVar, ywr ywrVar2, Executor executor, WillAutonavInformer willAutonavInformer) {
        ywrVar.getClass();
        this.a = ywrVar;
        ywrVar2.getClass();
        this.b = ywrVar2;
        this.e = executor;
        this.g = willAutonavInformer;
        this.f = Collections.newSetFromMap(new WeakHashMap());
        willAutonavInformer.c.B().ab(ayqr.a()).ay(new ayrs() { // from class: kef
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                keg kegVar = keg.this;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue() != kegVar.c) {
                    kegVar.c = bool.booleanValue();
                    kegVar.b();
                }
            }
        }, izw.t);
    }

    public final void b() {
        boolean g = g();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((ahfc) it.next()).t(g);
        }
    }

    @Override // defpackage.ahfd
    public final void c(final zfi zfiVar) {
        ynm.k(this.a.a(), angq.a, jun.k, new ynl() { // from class: kee
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                zfiVar.a(Boolean.valueOf(keg.this.h((awwk) obj)));
            }
        });
    }

    @Override // defpackage.ahfd
    public final void d(ahfc ahfcVar) {
        this.f.add(ahfcVar);
    }

    public final void e(boolean z) {
        if (z != g()) {
            ynm.k(this.a.b(new eou(z, 9)), this.e, jun.l, new ynl() { // from class: ked
                @Override // defpackage.ynl, defpackage.zfi
                public final void a(Object obj) {
                    keg.this.b();
                }
            });
        }
    }

    public final void f(ahfc ahfcVar) {
        this.f.remove(ahfcVar);
    }

    @Override // defpackage.ahfd
    public final boolean g() {
        return h((awwk) this.a.c());
    }

    public final boolean h(awwk awwkVar) {
        return (awwkVar.b & 4) != 0 ? awwkVar.e : this.c;
    }
}
