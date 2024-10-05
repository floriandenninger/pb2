package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class kea extends ahus implements aheq, fnp {
    private final Set a;
    public fhg d;
    public atzm e;
    public boolean f;
    public long g;
    public long h;

    public kea(Context context) {
        super(context);
        this.a = new CopyOnWriteArraySet();
    }

    @Override // defpackage.aivf
    public ViewGroup.LayoutParams c() {
        throw null;
    }

    public void d(Context context, View view) {
        throw null;
    }

    public final void j(ahep ahepVar) {
        Set set = this.a;
        ahepVar.getClass();
        set.add(ahepVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void k() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahep) it.next()).p();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahus
    public ahux kU(Context context) {
        ahux kU = super.kU(context);
        kU.e = false;
        return kU;
    }

    @Override // defpackage.ahus
    public final void kV() {
        this.e = null;
        super.X();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ahep) it.next()).q(false);
        }
    }

    @Override // defpackage.aheq
    public final void m(atzm atzmVar, boolean z) {
        kX();
        if (amkq.b(this.e, atzmVar) && this.f == z) {
            return;
        }
        this.e = atzmVar;
        this.f = z;
        Z(1);
    }

    public boolean mY(fhg fhgVar) {
        throw null;
    }

    @Override // defpackage.aheq
    public final void n(long j, long j2) {
        if (this.g == j && this.h == j2) {
            return;
        }
        this.g = j;
        this.h = j2;
        Z(2);
    }

    @Override // defpackage.fnp
    public final void nH(fhg fhgVar) {
        if (this.d != fhgVar) {
            this.d = fhgVar;
            Z(4);
        }
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        return this.e != null;
    }
}
