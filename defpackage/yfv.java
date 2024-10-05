package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class yfv implements ajom {
    public final ajjz a;
    public final Activity b;
    public final aahd c;
    public final ajtf d;
    public final ajyg e;
    public final ViewGroup f;
    public final ygc g;
    public final acqz h;
    public final ajrv i;
    public ajyc j = null;
    public asjh k;
    public int l;
    private final FrameLayout m;
    private yfu n;
    private yfu o;
    private yfu p;
    private final ajun q;

    public yfv(Activity activity, ajjz ajjzVar, ajyg ajygVar, aahd aahdVar, ajtd ajtdVar, ygc ygcVar, ajun ajunVar, acqz acqzVar, ajrv ajrvVar, ViewGroup viewGroup, byte[] bArr, byte[] bArr2) {
        this.b = activity;
        this.a = ajjzVar;
        this.c = aahdVar;
        this.e = ajygVar;
        this.f = viewGroup;
        this.g = ygcVar;
        this.q = ajunVar;
        this.h = acqzVar;
        this.i = ajrvVar;
        int orElse = wbs.W(activity, R.attr.ytStaticWhite).orElse(0);
        ajte ajteVar = ajtdVar.a;
        ajteVar.g(orElse);
        ajteVar.e(orElse);
        this.d = ajteVar.a();
        FrameLayout frameLayout = new FrameLayout(activity);
        this.m = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
    }

    public static avgg d(asjh asjhVar, boolean z) {
        if (asjhVar.d != 14) {
            return null;
        }
        avgl avglVar = ((avgm) asjhVar.e).c;
        if (avglVar == null) {
            avglVar = avgl.a;
        }
        if (z) {
            avgg avggVar = avglVar.d;
            return avggVar == null ? avgg.a : avggVar;
        }
        avgg avggVar2 = avglVar.c;
        return avggVar2 == null ? avgg.a : avggVar2;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.m;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.k = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        asjh asjhVar = this.k;
        return (asjhVar == null || asjhVar.p) ? false : true;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        asjh asjhVar = (asjh) obj;
        this.k = asjhVar;
        this.l = this.b.getResources().getConfiguration().orientation;
        int dj = amkq.dj(this.k.h);
        if (dj == 0) {
            dj = 1;
        }
        int i = dj - 1;
        int i2 = i != 1 ? i != 2 ? R.layout.interstitial_promo_view : R.layout.interstitial_edunitube_view : R.layout.onboarding_interstitial_promo_view;
        if (this.j == null) {
            Object d = ajokVar.d("overlay_controller_param", null);
            if (d instanceof ajyc) {
                this.j = (ajyc) d;
            }
        }
        this.m.removeAllViews();
        if (this.l == 1) {
            yfu yfuVar = this.p;
            if (yfuVar == null || i2 != yfuVar.b) {
                this.p = new yfu(this, i2, this.q, null, null);
            }
            this.n = this.p;
        } else {
            yfu yfuVar2 = this.o;
            if (yfuVar2 == null || i2 != yfuVar2.b) {
                this.o = new yfu(this, i2, this.q, null, null);
            }
            this.n = this.o;
        }
        this.n.d(asjhVar);
        this.m.addView(this.n.a);
    }
}
