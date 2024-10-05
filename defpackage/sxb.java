package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sxb {
    public View a;
    public Integer b;
    public Integer c;
    public szf d;
    public ayry e;
    public Map f;
    public wh g;
    public Boolean h;
    public StringBuilder i;
    public WeakReference j;
    public syg k;
    public amru l;
    public sxj m;
    public String n;
    public String o;
    public syb p;
    public AtomicReference q;
    public ajzj r;
    private Float s;
    private Boolean t;
    private Boolean u;
    private WeakReference v;
    private Boolean w;

    public sxb() {
    }

    public sxb(sxc sxcVar) {
        this.a = sxcVar.b;
        this.b = sxcVar.c;
        this.c = sxcVar.d;
        this.d = sxcVar.e;
        this.e = sxcVar.f;
        this.s = Float.valueOf(sxcVar.g);
        this.t = Boolean.valueOf(sxcVar.h);
        this.f = sxcVar.i;
        this.r = sxcVar.x;
        this.g = sxcVar.j;
        this.u = Boolean.valueOf(sxcVar.k);
        this.h = Boolean.valueOf(sxcVar.l);
        this.i = sxcVar.m;
        this.v = sxcVar.n;
        this.j = sxcVar.o;
        this.k = sxcVar.p;
        this.l = sxcVar.q;
        this.m = sxcVar.r;
        this.n = sxcVar.s;
        this.o = sxcVar.t;
        this.p = sxcVar.u;
        this.w = Boolean.valueOf(sxcVar.v);
        this.q = sxcVar.w;
    }

    public final sxc a() {
        Float f = this.s;
        if (f == null || this.t == null || this.u == null || this.h == null || this.w == null) {
            StringBuilder sb = new StringBuilder();
            if (this.s == null) {
                sb.append(" imagePrefetchRangeRatio");
            }
            if (this.t == null) {
                sb.append(" useDynamicPropsForStylePropertiesInternal");
            }
            if (this.u == null) {
                sb.append(" useIncrementalMountOnChildrenInternal");
            }
            if (this.h == null) {
                sb.append(" useLegacyVisibleInternal");
            }
            if (this.w == null) {
                sb.append(" couldOverlapWithElementsConfig");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        sxc sxcVar = new sxc(this.a, this.b, this.c, this.d, this.e, f.floatValue(), this.t.booleanValue(), this.f, this.r, this.g, this.u.booleanValue(), this.h.booleanValue(), this.i, this.v, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.w.booleanValue(), this.q);
        boolean z = true;
        if (sxcVar.u != null && sxcVar.v) {
            z = false;
        }
        amkq.O(z, "Setting an ElementsConfig overrides other values set on the ConversionContext, like useIncrementalMountOnChildren, useLegacyVisible, and elementsInteractionLogger. Configure them through the ElementsConfig instead of directly on the ConversionContext.");
        return sxcVar;
    }

    public final void b(boolean z) {
        this.w = Boolean.valueOf(z);
    }

    public final void c(float f) {
        this.s = Float.valueOf(f);
    }

    public final void d(awpj awpjVar) {
        this.v = awpjVar == null ? null : new WeakReference(awpjVar);
    }

    public final void e(boolean z) {
        this.t = Boolean.valueOf(z);
    }

    public final void f(boolean z) {
        b(true);
        this.u = Boolean.valueOf(z);
    }
}
