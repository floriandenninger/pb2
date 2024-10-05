package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hjf implements View.OnClickListener, hjs, hgp {
    public final azrl a = azrl.e();
    public final azrw b;
    public final azrw c;
    public LinearLayoutManager d;
    public wr e;
    public final ohg f;
    private final azrw g;
    private final yqw h;
    private final ayqi i;
    private final acra j;
    private final hrv k;
    private View l;
    private hgq m;
    private acra n;
    private ayqx o;
    private jqr p;

    public hjf(ohg ohgVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, acra acraVar, yqw yqwVar, ayqi ayqiVar, hrv hrvVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.f = ohgVar;
        this.b = azrwVar;
        this.g = azrwVar2;
        this.c = azrwVar3;
        this.h = yqwVar;
        this.i = ayqiVar;
        this.j = acraVar;
        this.k = hrvVar;
    }

    @Override // defpackage.hjs
    public final acra a() {
        return this.n;
    }

    @Override // defpackage.hjs
    public final aypy b() {
        return this.a.U();
    }

    @Override // defpackage.hjs
    public final void c() {
        this.m.c();
        this.p.b(acsb.b(116646)).a();
        Object obj = this.o;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
            this.o = null;
        }
    }

    @Override // defpackage.hjs
    public final void d(View view, acra acraVar) {
        this.m = new hgq(view, this);
        this.k.q();
        View findViewById = view.findViewById(R.id.shorts_edit_timeline_button);
        this.l = findViewById;
        findViewById.setOnClickListener(this);
        this.p = new jqr(this.j);
        this.n = acraVar;
    }

    @Override // defpackage.hjs
    public final void e(acsc acscVar) {
        this.p.a(acscVar).b();
    }

    @Override // defpackage.hjs
    public final void f(long j, int i) {
        g(j, jqr.c(this.n, apxf.a, i));
    }

    @Override // defpackage.hjs
    public final void g(final long j, apxf apxfVar) {
        if (j != Long.MIN_VALUE) {
            this.o = ((hkg) this.c.get()).b().ak(1L).ab(this.i).p(wbs.K(this.h.a())).ax(new ayrs() { // from class: hjd
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    hjf.this.h(j);
                }
            });
        } else {
            LinearLayoutManager linearLayoutManager = this.d;
            if (linearLayoutManager != null) {
                linearLayoutManager.Z(0);
            }
        }
        final hkg hkgVar = (hkg) this.c.get();
        hkgVar.b.clear();
        hkgVar.d.i(new zrz() { // from class: hkf
            @Override // defpackage.zrz
            public final void a(File file, axdu axduVar) {
                hkg hkgVar2 = hkg.this;
                if (axduVar != null && axduVar.a() > 0) {
                    ArrayList<axdk> arrayList = new ArrayList(axduVar.e());
                    Collections.sort(arrayList, bea.h);
                    for (axdk axdkVar : arrayList) {
                        Iterator it = ((Set) hkgVar2.a.get()).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                hkj hkjVar = (hkj) it.next();
                                if (hkjVar.b(axdkVar)) {
                                    hkgVar2.b.add(hkjVar.a(axdkVar));
                                    break;
                                }
                            }
                        }
                    }
                }
                hkgVar2.c.c(new dsm());
            }
        });
        hgq hgqVar = this.m;
        ViewGroup viewGroup = hgqVar.a;
        if (hgqVar.d == null) {
            hgp hgpVar = hgqVar.b;
            View findViewById = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.timeline, hgqVar.a, false).findViewById(R.id.timeline_root);
            RecyclerView recyclerView = (RecyclerView) findViewById.findViewById(R.id.tracks_list);
            recyclerView.ae(null);
            findViewById.getContext();
            LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(1);
            hjf hjfVar = (hjf) hgpVar;
            hjfVar.d = linearLayoutManager2;
            linearLayoutManager2.r(true);
            hjfVar.d.n = true;
            hjfVar.e = new hje(recyclerView.getContext());
            recyclerView.af(hjfVar.d);
            recyclerView.ac((vw) hjfVar.b.get());
            recyclerView.setImportantForAccessibility(2);
            new zn(new hkd((hkg) hjfVar.c.get())).i(recyclerView);
            ohg ohgVar = hjfVar.f;
            hjs hjsVar = (hjs) ohgVar.c.get();
            hjsVar.getClass();
            hgo hgoVar = (hgo) ohgVar.d.get();
            hgoVar.getClass();
            yqw yqwVar = (yqw) ohgVar.g.get();
            ((tgn) ohgVar.b.get()).getClass();
            ((tgk) ohgVar.e.get()).getClass();
            ((tgd) ohgVar.a.get()).getClass();
            hrv hrvVar = (hrv) ohgVar.f.get();
            hrvVar.getClass();
            findViewById.getClass();
            new hkc(hjsVar, hgoVar, yqwVar, hrvVar, findViewById);
            hgqVar.d = findViewById;
        }
        if (hgqVar.d.getParent() != null) {
            ((ViewGroup) hgqVar.d.getParent()).removeView(hgqVar.d);
        }
        viewGroup.addView(hgqVar.d, 0);
        hgqVar.d(true);
        hgo hgoVar2 = (hgo) this.g.get();
        hgoVar2.g(0L);
        hgoVar2.e();
        hfr b = this.p.b(acsb.b(116646));
        b.a = apxfVar;
        b.b();
        hfq a = this.p.a(acsb.c(113372));
        a.h(true);
        a.a();
        hfq a2 = this.p.a(acsb.c(116666));
        a2.h(true);
        a2.a();
        hfq a3 = this.p.a(acsb.c(116664));
        a3.h(true);
        a3.a();
    }

    @Override // defpackage.hjs
    public final void h(long j) {
        wr wrVar;
        if (j == Long.MIN_VALUE || (wrVar = this.e) == null || this.d == null) {
            return;
        }
        int b = ((ajox) this.b.get()).b();
        while (true) {
            b--;
            if (b < 0) {
                b = 0;
                break;
            } else if (((ajox) this.b.get()).mu(b) == j) {
                break;
            }
        }
        wrVar.b = b;
        this.d.bd(this.e);
    }

    @Override // defpackage.hjs
    public final boolean i() {
        int i;
        hgq hgqVar = this.m;
        return hgqVar == null || (i = hgqVar.c.t) == 5 || i == 4;
    }

    @Override // defpackage.hjs
    public final jqr j() {
        return this.p;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.l) {
            f(Long.MIN_VALUE, 109823);
        }
    }
}
