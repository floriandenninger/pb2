package defpackage;

import android.content.res.Configuration;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes3.dex */
public final class fxj {
    public Set a;
    public boolean b = false;
    private final azrw c;
    private Set d;
    private Set e;

    public fxj(azrw azrwVar) {
        this.c = azrwVar;
    }

    public final void a() {
        Iterator it = ((Set) this.c.get()).iterator();
        while (it.hasNext()) {
            g((fxi) it.next());
        }
    }

    public final void b() {
        this.b = false;
        Set set = this.d;
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((fxi) it.next()).a();
        }
    }

    public final void c(Configuration configuration) {
        Set set = this.e;
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((fxh) it.next()).e(configuration);
        }
    }

    public final void d() {
        Set set = this.a;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                nko nkoVar = ((nkn) it.next()).a;
                fwh fwhVar = nkoVar.d;
                if (fwhVar != null) {
                    nkoVar.a.f(fwhVar);
                }
                fwh fwhVar2 = nkoVar.e;
                if (fwhVar2 != null) {
                    nkoVar.a.f(fwhVar2);
                }
                fwh fwhVar3 = nkoVar.f;
                if (fwhVar3 != null) {
                    nkoVar.a.f(fwhVar3);
                }
                fwh fwhVar4 = nkoVar.g;
                if (fwhVar4 != null) {
                    nkoVar.a.f(fwhVar4);
                }
                fwh fwhVar5 = nkoVar.h;
                if (fwhVar5 != null) {
                    nkoVar.a.f(fwhVar5);
                }
                nkoVar.a.f(nkoVar.b);
                gnv gnvVar = nkoVar.c;
                if (gnvVar != null) {
                    nkoVar.a.f(gnvVar);
                }
            }
        }
        this.a = null;
        this.e = null;
        this.d = null;
    }

    public final void e() {
        this.b = true;
        Set set = this.d;
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((fxi) it.next()).b();
        }
    }

    public final void f(fxh fxhVar) {
        if (this.e == null) {
            this.e = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        this.e.add(fxhVar);
    }

    public final void g(fxi fxiVar) {
        if (this.d == null) {
            this.d = Collections.newSetFromMap(new ConcurrentHashMap());
        }
        this.d.add(fxiVar);
    }

    public final void h(fxh fxhVar) {
        Set set = this.e;
        if (set != null) {
            set.remove(fxhVar);
        }
    }

    public final void i(fxi fxiVar) {
        Set set = this.d;
        if (set != null) {
            set.remove(fxiVar);
        }
    }
}
