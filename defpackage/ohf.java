package defpackage;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.OverScrollLinearLayoutManager;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ohf implements ohb, oiq, oir {
    private final Activity a;
    private final oip b;
    private final acra c;
    private final oiy d;
    private final aaea e;
    private final LoadingFrameLayout f;
    private final TextView g;
    private final TextView h;
    private final ImageView i;
    private final View j;
    private final boolean k;
    private boolean l;
    private String m;
    private int n;
    private String o;
    private aubs p;
    private oix q;
    private ic r;
    private ic s;
    private final ahey t;
    private final ahey u;

    public ohf(Activity activity, ahey aheyVar, oiy oiyVar, aadw aadwVar, ahey aheyVar2, aoae aoaeVar, aaea aaeaVar, final oip oipVar, View view, View view2, acra acraVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = activity;
        this.d = oiyVar;
        this.u = aheyVar;
        this.k = evr.aP(aadwVar);
        this.t = aheyVar2;
        this.b = oipVar;
        this.e = aaeaVar;
        this.c = acraVar;
        this.j = view;
        this.g = (TextView) view.findViewById(R.id.set_title);
        this.h = (TextView) view.findViewById(R.id.set_subtitle);
        this.i = (ImageView) view.findViewById(R.id.set_expand_button);
        view.setOnClickListener(new View.OnClickListener() { // from class: ohc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ohf.this.f(!oipVar.k(4), true);
            }
        });
        this.f = (LoadingFrameLayout) view2;
        this.l = false;
        aheyVar.e(this);
        aoaeVar.D(this);
        if (i()) {
            this.r = new ohd(activity);
            this.s = new ohe(activity);
        }
        aheyVar2.b(this);
    }

    private final void g() {
        if (this.l) {
            oix oixVar = this.q;
            if (oixVar != null) {
                oixVar.c(null);
            }
            this.f.c();
            this.g.setText((CharSequence) null);
            this.h.setText((CharSequence) null);
            this.h.setVisibility(8);
        }
    }

    private final void h(CharSequence charSequence) {
        this.h.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            this.h.setVisibility(8);
        } else {
            this.h.setVisibility(0);
        }
    }

    private final boolean i() {
        arfd a = this.e.a();
        if (a == null) {
            return false;
        }
        aswb aswbVar = a.e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        return aswbVar.T;
    }

    private static boolean l(aubs aubsVar) {
        return !adtt.a(aubsVar.k);
    }

    @Override // defpackage.oir
    public final void a(boolean z) {
        if (i()) {
            ic icVar = z ? this.r : this.s;
            if (icVar != null) {
                jw.M(this.j, icVar);
            }
        }
    }

    final void b() {
        this.b.c(2);
        this.t.c();
    }

    @Override // defpackage.ohb
    public final void c() {
        b();
    }

    @Override // defpackage.ohb
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.ohb
    public final void e(WatchNextResponseModel watchNextResponseModel) {
        CharSequence w;
        aqyg aqygVar;
        if (TextUtils.isEmpty(this.o) || TextUtils.isEmpty(watchNextResponseModel.b) || this.o.equals(watchNextResponseModel.b)) {
            aubs aubsVar = watchNextResponseModel.g;
            this.p = aubsVar;
            if (aubsVar == null || !l(aubsVar)) {
                b();
                return;
            }
            if (!this.l) {
                RecyclerView recyclerView = (RecyclerView) this.f.findViewById(R.id.set_list);
                OverScrollLinearLayoutManager overScrollLinearLayoutManager = new OverScrollLinearLayoutManager(null);
                overScrollLinearLayoutManager.ab(1);
                recyclerView.af(overScrollLinearLayoutManager);
                recyclerView.setNestedScrollingEnabled(this.k);
                oiy oiyVar = this.d;
                acra acraVar = this.c;
                ypa ypaVar = (ypa) oiyVar.a.get();
                ypaVar.getClass();
                aahd aahdVar = (aahd) oiyVar.b.get();
                aahdVar.getClass();
                abds abdsVar = (abds) oiyVar.c.get();
                abdsVar.getClass();
                zaw zawVar = (zaw) oiyVar.d.get();
                zawVar.getClass();
                ajoy ajoyVar = (ajoy) oiyVar.e.get();
                ajoyVar.getClass();
                ajpa ajpaVar = (ajpa) oiyVar.f.get();
                ajpaVar.getClass();
                oix oixVar = new oix(ypaVar, aahdVar, abdsVar, zawVar, ajoyVar, ajpaVar, acraVar);
                this.q = oixVar;
                oixVar.f(recyclerView);
                this.q.d(this.f);
                this.h.setVisibility(8);
                this.l = true;
                g();
            }
            aubs aubsVar2 = this.p;
            String str = aubsVar2.g;
            aama aamaVar = watchNextResponseModel.h;
            this.g.setText(zhq.d(str));
            if (aubsVar2 == null) {
                h(null);
                this.q.c(null);
            } else {
                if (aamaVar == null || (!aamaVar.c() && !aamaVar.d())) {
                    w = muf.w(aubsVar2);
                } else {
                    CharSequence[] charSequenceArr = new CharSequence[2];
                    if ((aubsVar2.c & 128) != 0) {
                        aqygVar = aubsVar2.n;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    charSequenceArr[0] = ajcq.b(aqygVar);
                    charSequenceArr[1] = muf.w(aubsVar2);
                    w = ajcq.k(null, charSequenceArr);
                }
                h(w);
                this.q.c(new mkm(aubsVar2, aamaVar));
            }
            this.q.e(this.p);
            aubs aubsVar3 = watchNextResponseModel.g;
            if (aubsVar3 == null || aubsVar3.i.size() == 0) {
                this.f.c();
            }
            boolean k = this.b.k(4);
            int bB = anaf.bB(this.p.w);
            if (bB == 0) {
                bB = 1;
            }
            int i = bB - 1;
            boolean z = i != 2 ? i != 3 ? k : false : true;
            if (this.u.g()) {
                f(z, false);
            }
        }
    }

    public final void f(boolean z, boolean z2) {
        this.b.f(2);
        if (z) {
            this.t.d(true);
        } else {
            this.t.c();
        }
        float f = true != z ? 360.0f : 180.0f;
        if (z2) {
            this.i.animate().rotation(f).start();
        } else {
            this.i.setRotation(f);
        }
    }

    @Override // defpackage.ohb
    public final void j(fnt fntVar) {
        if (fntVar == null) {
            return;
        }
        PlaybackStartDescriptor a = fntVar.a();
        this.o = a.l();
        String k = a.k();
        int a2 = a.a();
        if (!TextUtils.equals(this.m, k)) {
            this.p = null;
            if (TextUtils.isEmpty(k)) {
                b();
            }
            g();
            oix oixVar = this.q;
            if (oixVar != null) {
                oixVar.a();
            }
        } else {
            if (this.n == a2) {
                return;
            }
            if (this.l) {
                aswb aswbVar = this.e.a().e;
                if (aswbVar == null) {
                    aswbVar = aswb.a;
                }
                if (aswbVar.Z) {
                    oix oixVar2 = this.q;
                    String l = a.l();
                    ajpd ajpdVar = oixVar2.e;
                    if (oixVar2.g && !amkq.b(oixVar2.d.a, l) && ajpdVar != null) {
                        oixVar2.d.a(l);
                        Integer num = (Integer) oixVar2.b.get(l);
                        if (num != null && num.intValue() >= 0 && num.intValue() < ajpdVar.size() && (ajpdVar.get(num.intValue()) instanceof aubw)) {
                            oixVar2.b(num.intValue(), true);
                        }
                    }
                } else {
                    this.f.c();
                }
            }
        }
        this.m = k;
        this.n = a2;
    }

    @Override // defpackage.oiq
    public final void k() {
        if (this.l) {
            this.f.c();
        }
    }

    @Override // defpackage.ohi
    public final void pg(boolean z) {
        aubs aubsVar;
        if (!z || (aubsVar = this.p) == null || !l(aubsVar)) {
            b();
        } else {
            f(this.b.k(4), true);
        }
    }
}
