package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.youtube.R;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mxf implements ajom, lsa {
    protected final Context a;
    public final ajjz b;
    public final aahd c;
    public final ajuw d;
    public final ajut e;
    public final shf f;
    public final lsb g;
    public final akbd h;
    public apju i;
    public jal j;
    public final akpq k;
    public final fvf l;
    public final ohg m;
    public final c n;
    public final ajoy o;
    private final FrameLayout p;
    private mxd q;
    private mxd r;
    private mxd s;
    private mxd t;
    private mxd u;

    public mxf(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar, ajut ajutVar, fvf fvfVar, akpq akpqVar, shf shfVar, lsb lsbVar, ohg ohgVar, ajoy ajoyVar, c cVar, akbd akbdVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.a = context;
        this.b = ajjzVar;
        this.c = aahdVar;
        this.d = ajuwVar;
        this.e = ajutVar;
        this.l = fvfVar;
        this.k = akpqVar;
        this.f = shfVar;
        this.g = lsbVar;
        this.m = ohgVar;
        this.o = ajoyVar;
        this.n = cVar;
        this.h = akbdVar;
        lsbVar.a(this);
        FrameLayout frameLayout = new FrameLayout(context);
        this.p = frameLayout;
        frameLayout.setBackgroundDrawable(new fyl(wbs.W(context, R.attr.ytSeparator).orElse(0), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
    }

    public static apkf f(avzv avzvVar) {
        apkd apkdVar = avzvVar.s;
        if (apkdVar == null) {
            apkdVar = apkd.a;
        }
        if ((apkdVar.b & 2) == 0) {
            return null;
        }
        apkd apkdVar2 = avzvVar.s;
        if (apkdVar2 == null) {
            apkdVar2 = apkd.a;
        }
        apkf apkfVar = apkdVar2.d;
        return apkfVar == null ? apkf.a : apkfVar;
    }

    public static apxf g(avzv avzvVar) {
        apsq apsqVar = avzvVar.d == 33 ? (apsq) avzvVar.e : apsq.a;
        apsr apsrVar = apsqVar.c;
        if (apsrVar == null) {
            apsrVar = apsr.a;
        }
        if ((apsrVar.b & 2) == 0) {
            return null;
        }
        apsr apsrVar2 = apsqVar.c;
        if (apsrVar2 == null) {
            apsrVar2 = apsr.a;
        }
        apxf apxfVar = apsrVar2.d;
        return apxfVar == null ? apxf.a : apxfVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.p;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
    }

    @Override // defpackage.lsa
    public final frh d() {
        mxd mxdVar = this.u;
        if (mxdVar == null) {
            return null;
        }
        return mxdVar.e.r;
    }

    @Override // defpackage.lsa
    public final apju e() {
        return this.i;
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        jal jalVar = (jal) obj;
        if (jalVar.d() != null) {
            ajokVar.a.u(new acqx(jalVar.d()), null);
        }
        aong aongVar = (aong) jalVar.a.toBuilder();
        if (!aongVar.pY(aqwa.b)) {
            aongVar.e(aqwa.b, aqwa.a);
        }
        if (!((aqwa) aongVar.pX(aqwa.b)).d) {
            aone builder = ((aqwa) aongVar.pX(aqwa.b)).toBuilder();
            builder.copyOnWrite();
            aqwa aqwaVar = (aqwa) builder.instance;
            aqwaVar.c |= 1;
            aqwaVar.d = true;
            aongVar.e(aqwa.b, (aqwa) builder.build());
            whl.I(this.c, Collections.unmodifiableList(((aqwe) aongVar.instance).i), jalVar);
        }
        jalVar.c((aqwe) aongVar.build());
        this.j = jalVar;
        this.p.removeAllViews();
        if (this.a.getResources().getConfiguration().orientation != 1) {
            if (this.r == null) {
                this.r = new mxd(this, R.layout.video_feed_entry);
            }
            this.u = this.r;
        } else if (jalVar.e() == 4 && !yjk.aa(this.a)) {
            if (this.s == null) {
                this.s = new mxb(this);
            }
            this.u = this.s;
        } else if (jalVar.e() != 6 || yjk.aa(this.a)) {
            if (this.q == null) {
                this.q = new mxd(this, R.layout.video_feed_entry);
            }
            this.u = this.q;
        } else {
            if (this.t == null) {
                this.t = new mxd(this, R.layout.video_feed_entry_full_bleed);
            }
            this.u = this.t;
        }
        this.u.a(ajokVar);
        this.p.addView(this.u.d);
    }
}
