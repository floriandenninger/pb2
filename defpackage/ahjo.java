package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahjo extends ahiy implements View.OnLayoutChangeListener {
    public final ViewGroup i;
    public ahjm j;
    private final Handler k;
    private final float o;
    private final float p;
    private final ArrayList q;
    private float r;
    private float s;
    private boolean t;

    public ahjo(final ViewGroup viewGroup, final Context context, Handler handler, azrw azrwVar, ahkv ahkvVar, final float f, final float f2) {
        super(f, f2, ahku.a(1.0f, 1.0f, ahiy.m), ahkvVar, azrwVar);
        this.k = handler;
        this.i = viewGroup;
        this.o = f;
        this.p = f2;
        this.s = f2;
        this.r = f;
        rJ(f, f2, 0.0f);
        this.q = new ArrayList();
        handler.post(new Runnable() { // from class: ahjd
            @Override // java.lang.Runnable
            public final void run() {
                ahjo ahjoVar = ahjo.this;
                Context context2 = context;
                ViewGroup viewGroup2 = viewGroup;
                float f3 = f;
                float f4 = f2;
                ahjoVar.j = new ahjm(context2, ahjoVar);
                ahjoVar.j.addOnLayoutChangeListener(ahjoVar);
                ahjoVar.j.setVisibility(0);
                viewGroup2.addView(ahjoVar.j, ahjo.s(f3), ahjo.s(f4));
                ahjoVar.j.setTextColor(-1);
                ahjoVar.j.setTextSize(5.0f);
                ahjoVar.j.setTypeface(null, 1);
                ahjoVar.j.invalidate();
            }
        });
    }

    public final void A(float f) {
        this.k.post(new ahjh(this, f));
    }

    public final void g(ahjn ahjnVar) {
        this.q.add(ahjnVar);
    }

    public final void h(int i) {
        this.k.post(new ahji(this, i, 0));
    }

    @Override // defpackage.ahiy, defpackage.ahfr, defpackage.ahim
    public final void i() {
        this.k.post(new ahjj(this, 0));
        super.i();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.s = ahkt.a(this.j.getHeight());
        this.r = ahkt.a(this.j.getWidth());
        this.t = true;
    }

    @Override // defpackage.ahfr, defpackage.ahim
    public final void p(ahjq ahjqVar) {
    }

    @Override // defpackage.ahiy, defpackage.ahfr, defpackage.ahim
    public final void q(ahjq ahjqVar) {
        super.q(ahjqVar);
        if (this.t) {
            this.t = false;
            ArrayList arrayList = this.q;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ahjn) arrayList.get(i)).a(this.r, this.s);
            }
            w(this.r, this.s);
            this.k.post(new ahjj(this, 1));
            rJ(this.r, this.s, 0.0f);
        }
    }

    @Override // defpackage.ahio, defpackage.ahim
    public final void qE(boolean z) {
        this.l = z;
        this.k.post(new ahjk(this, z));
    }

    public final void y(String str) {
        this.k.post(new ahjg(this, str));
    }

    public final void z(int i) {
        this.k.post(new ahji(this, i, 1));
    }

    public final void B(boolean z, boolean z2) {
        this.k.post(new ahjf(this, new FrameLayout.LayoutParams(z ? -2 : s(this.o), z2 ? -2 : s(this.p))));
    }
}
