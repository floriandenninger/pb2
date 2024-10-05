package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hsb extends vw {
    public hsg d;
    public ammv e;
    private final Context f;
    private final Executor g;
    private final Executor h;

    public hsb(Context context, Executor executor, Executor executor2) {
        this.f = context;
        this.g = executor;
        this.h = executor2;
        hsf a = hsg.a();
        a.b(amru.q());
        this.d = a.a();
        this.e = amlr.a;
    }

    @Override // defpackage.vw
    public final int b() {
        return ((amvj) this.d.a).c;
    }

    @Override // defpackage.vw
    public final /* synthetic */ wv f(ViewGroup viewGroup, int i) {
        hsl hslVar;
        if (this.e.h()) {
            hslVar = new hsl(this.f, ammv.j(new zdf()), ammv.j(new zde(ViewConfiguration.get(this.f))));
        } else {
            hslVar = new hsl(this.f, amlr.a, amlr.a);
        }
        return new wv(hslVar);
    }

    @Override // defpackage.vw
    public final /* synthetic */ void o(final wv wvVar, int i) {
        final hsn hsnVar = (hsn) this.d.a.get(i);
        final hsl C = wvVar.C();
        Executor executor = this.g;
        Executor executor2 = this.h;
        C.a.setBackground(C.getContext().getDrawable(R.drawable.reel_edit_carousel_thumbnail_loading_background));
        C.a.setImageDrawable(null);
        C.d.setVisibility(8);
        C.c.setVisibility(0);
        C.b.setVisibility(true == hsnVar.c ? 0 : 8);
        if (C.g.h() && !((ayqx) C.g.c()).e()) {
            ((ayqx) C.g.c()).qc();
        }
        C.g = ammv.j(ayqj.C(new Callable() { // from class: hsk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return hsn.this.b.get();
            }
        }).M(azre.b(executor)).I(azre.b(executor2)).W(new ayrs() { // from class: hsj
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                String i2;
                hsl hslVar = hsl.this;
                hsn hsnVar2 = hsnVar;
                ammv ammvVar = (ammv) obj;
                hslVar.a(ammvVar);
                if (ammvVar.h()) {
                    ammv ammvVar2 = hsnVar2.a;
                    if (!ammvVar2.h() || ((Long) ammvVar2.c()).longValue() <= 0) {
                        hslVar.d.setVisibility(8);
                        return;
                    }
                    hslVar.d.setVisibility(0);
                    if (((Long) ammvVar2.c()).longValue() >= TimeUnit.SECONDS.toMillis(1L)) {
                        i2 = zhq.i((int) TimeUnit.MILLISECONDS.toSeconds(((Long) ammvVar2.c()).longValue()));
                    } else {
                        i2 = zhq.i(0L);
                    }
                    hslVar.d.setText(i2);
                }
            }
        }, new ayrs() { // from class: hsi
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                hsl.this.a(amlr.a);
            }
        }));
        if (this.e.h()) {
            zdh zdhVar = new zdh() { // from class: hrz
                @Override // defpackage.zdh
                public final void b(MotionEvent motionEvent) {
                    hsb hsbVar = hsb.this;
                    int a = wvVar.a();
                    ammv ammvVar = hsbVar.d.b;
                    if (!ammvVar.h() || ((Integer) ammvVar.c()).intValue() == a) {
                        return;
                    }
                    ((hse) hsbVar.e.c()).b(a);
                    hsbVar.oc(((Integer) ammvVar.c()).intValue());
                    hsbVar.oc(a);
                }
            };
            if (C.f.h()) {
                ((zde) C.f.c()).c = zdhVar;
            }
            hsa hsaVar = new hsa(this, wvVar);
            if (C.f.h()) {
                ((zde) C.f.c()).b = hsaVar;
            }
        }
    }

    @Override // defpackage.vw
    public final /* bridge */ /* synthetic */ void p(wv wvVar) {
        hsl C = wvVar.C();
        C.d.setText("");
        C.d.setVisibility(8);
        C.a.setImageDrawable(null);
        C.a.setBackground(null);
        C.c.setVisibility(8);
        C.b.setVisibility(8);
        if (C.g.h() && !((ayqx) C.g.c()).e()) {
            ((ayqx) C.g.c()).qc();
        }
        if (C.e.h()) {
            ((zde) C.f.c()).c = null;
            ((zde) C.f.c()).b = null;
        }
    }

    public final boolean w(int i) {
        return i >= 0 && i < ((amvj) this.d.a).c;
    }
}
