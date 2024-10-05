package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bwk extends bwd {
    int p;
    boolean q;
    private ArrayList r;
    private boolean s;
    private int t;

    public bwk(byte[] bArr) {
        this();
        J(1);
        f(new bvx(2));
        f(new bvu());
        f(new bvx(1));
    }

    private final void N(bwd bwdVar) {
        this.r.add(bwdVar);
        bwdVar.h = this;
    }

    @Override // defpackage.bwd
    public final void E() {
        this.t |= 2;
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((bwd) this.r.get(i)).E();
        }
    }

    @Override // defpackage.bwd
    public final /* synthetic */ void F(long j) {
        this.a = j;
    }

    @Override // defpackage.bwd
    public final void G(lo loVar) {
        this.n = null;
        this.t |= 8;
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((bwd) this.r.get(i)).G(null);
        }
    }

    @Override // defpackage.bwd
    public final void H(ll llVar) {
        super.H(llVar);
        this.t |= 4;
        if (this.r != null) {
            for (int i = 0; i < this.r.size(); i++) {
                ((bwd) this.r.get(i)).H(llVar);
            }
        }
    }

    @Override // defpackage.bwd
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final void C(long j) {
        ArrayList arrayList;
        this.b = j;
        if (this.b < 0 || (arrayList = this.r) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bwd) this.r.get(i)).C(j);
        }
    }

    public final void J(int i) {
        this.s = i == 0;
    }

    public final void K() {
        for (int i = 0; i < this.r.size(); i++) {
            ((bwd) this.r.get(i)).y(R.id.inner_container);
        }
        super.y(R.id.inner_container);
    }

    @Override // defpackage.bwd
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void z(View view) {
        for (int i = 0; i < this.r.size(); i++) {
            ((bwd) this.r.get(i)).z(view);
        }
        super.z(view);
    }

    @Override // defpackage.bwd
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void D(TimeInterpolator timeInterpolator) {
        this.t |= 1;
        ArrayList arrayList = this.r;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bwd) this.r.get(i)).D(timeInterpolator);
            }
        }
        this.c = timeInterpolator;
    }

    @Override // defpackage.bwd
    public final void b(bwm bwmVar) {
        if (w(bwmVar.b)) {
            ArrayList arrayList = this.r;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bwd bwdVar = (bwd) arrayList.get(i);
                if (bwdVar.w(bwmVar.b)) {
                    bwdVar.b(bwmVar);
                    bwmVar.c.add(bwdVar);
                }
            }
        }
    }

    @Override // defpackage.bwd
    public final void c(bwm bwmVar) {
        if (w(bwmVar.b)) {
            ArrayList arrayList = this.r;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                bwd bwdVar = (bwd) arrayList.get(i);
                if (bwdVar.w(bwmVar.b)) {
                    bwdVar.c(bwmVar);
                    bwmVar.c.add(bwdVar);
                }
            }
        }
    }

    @Override // defpackage.bwd
    public final /* bridge */ /* synthetic */ Object clone() {
        return clone();
    }

    public final void e(bwc bwcVar) {
        super.x(bwcVar);
    }

    public final void f(bwd bwdVar) {
        N(bwdVar);
        long j = this.b;
        if (j >= 0) {
            bwdVar.C(j);
        }
        if ((this.t & 1) != 0) {
            bwdVar.D(this.c);
        }
        if ((this.t & 2) != 0) {
            bwdVar.E();
        }
        if ((this.t & 4) != 0) {
            bwdVar.H(this.o);
        }
        if ((this.t & 8) != 0) {
            bwdVar.G(null);
        }
    }

    @Override // defpackage.bwd
    /* renamed from: h */
    public final bwd clone() {
        bwk bwkVar = (bwk) super.clone();
        bwkVar.r = new ArrayList();
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            bwkVar.N(((bwd) this.r.get(i)).clone());
        }
        return bwkVar;
    }

    @Override // defpackage.bwd
    public final String k(String str) {
        String k = super.k(str);
        for (int i = 0; i < this.r.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(k);
            sb.append("\n");
            sb.append(((bwd) this.r.get(i)).k(str + "  "));
            k = sb.toString();
        }
        return k;
    }

    @Override // defpackage.bwd
    public final void l(bwm bwmVar) {
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((bwd) this.r.get(i)).l(bwmVar);
        }
    }

    @Override // defpackage.bwd
    public final void o(ViewGroup viewGroup, bwn bwnVar, bwn bwnVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.a;
        int size = this.r.size();
        int i = 0;
        while (i < size) {
            bwd bwdVar = (bwd) this.r.get(i);
            if (j > 0) {
                if (!this.s) {
                    if (i == 0) {
                        i = 0;
                    }
                }
                long j2 = bwdVar.a;
                if (j2 > 0) {
                    bwdVar.F(j2 + j);
                } else {
                    bwdVar.F(j);
                }
            }
            bwdVar.o(viewGroup, bwnVar, bwnVar2, arrayList, arrayList2);
            i++;
        }
    }

    @Override // defpackage.bwd
    public final void q(ViewGroup viewGroup) {
        super.q(viewGroup);
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((bwd) this.r.get(i)).q(viewGroup);
        }
    }

    @Override // defpackage.bwd
    public final void r(View view) {
        super.r(view);
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((bwd) this.r.get(i)).r(view);
        }
    }

    @Override // defpackage.bwd
    public final void s(View view) {
        super.s(view);
        int size = this.r.size();
        for (int i = 0; i < size; i++) {
            ((bwd) this.r.get(i)).s(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bwd
    public final void t() {
        if (!this.r.isEmpty()) {
            bwj bwjVar = new bwj(this);
            ArrayList arrayList = this.r;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((bwd) arrayList.get(i)).x(bwjVar);
            }
            this.p = this.r.size();
            if (this.s) {
                ArrayList arrayList2 = this.r;
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((bwd) arrayList2.get(i2)).t();
                }
                return;
            }
            for (int i3 = 1; i3 < this.r.size(); i3++) {
                ((bwd) this.r.get(i3 - 1)).x(new bwi((bwd) this.r.get(i3)));
            }
            bwd bwdVar = (bwd) this.r.get(0);
            if (bwdVar != null) {
                bwdVar.t();
                return;
            }
            return;
        }
        u();
        p();
    }

    @Override // defpackage.bwd
    public final /* bridge */ /* synthetic */ void y(int i) {
        K();
    }

    public bwk() {
        this.r = new ArrayList();
        this.s = true;
        this.q = false;
        this.t = 0;
    }
}
