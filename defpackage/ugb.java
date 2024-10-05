package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;
import com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ugb extends vw {
    public Object d;
    public amru e;
    public final tyo g;
    private final Context h;
    private final ued i;
    private final ammv j;
    private final ufh k;
    private final aot l;
    private final ujx m;
    private final ammv n;
    private final boolean o;
    private final ufu p;
    private final int r;
    private final ywt t;
    private final List q = new ArrayList();
    private final tyo u = new ufy(this);
    public amru f = amru.q();
    private final aox s = new aox() { // from class: ufv
        @Override // defpackage.aox
        public final void a(Object obj) {
            ugb ugbVar = ugb.this;
            amru amruVar = (amru) obj;
            uqq.j();
            oz a = pc.a(new ufz(ugbVar, amruVar));
            ugbVar.f = amruVar;
            a.a(ugbVar);
        }
    };

    public ugb(Context context, ugd ugdVar, aot aotVar, uht uhtVar, aoso aosoVar, ujx ujxVar, int i, ammv ammvVar, ammv ammvVar2) {
        context.getClass();
        this.h = context;
        ued uedVar = ugdVar.a;
        uedVar.getClass();
        this.i = uedVar;
        tyo tyoVar = ugdVar.f;
        tyoVar.getClass();
        this.g = tyoVar;
        ufh ufhVar = ugdVar.b;
        ufhVar.getClass();
        this.k = ufhVar;
        this.j = ammvVar;
        ugdVar.c.getClass();
        this.o = ugdVar.d;
        this.l = aotVar;
        this.m = ujxVar;
        this.n = ammvVar2;
        uje ujeVar = ugdVar.e;
        ujeVar.getClass();
        aosoVar.getClass();
        this.p = new ufu(ufhVar, ujeVar, aosoVar, ujxVar, uhtVar);
        this.t = new ywt(context);
        this.r = i;
    }

    @Override // defpackage.vw
    public final int b() {
        return this.q.size() + this.f.size();
    }

    @Override // defpackage.vw
    public final int c(int i) {
        return i < this.q.size() ? 0 : 1;
    }

    @Override // defpackage.vw
    public final wv f(ViewGroup viewGroup, int i) {
        if (i == 0) {
            AccountParticle accountParticle = (AccountParticle) LayoutInflater.from(new ContextThemeWrapper(viewGroup.getContext(), R.style.OneGoogle_EnlargedDiscs)).inflate(R.layout.account_list_item, viewGroup, false);
            jw.Y(accountParticle, jw.i(accountParticle) + accountParticle.getResources().getDimensionPixelSize(R.dimen.account_particle_avatar_margin_start) + this.r, accountParticle.getPaddingTop(), jw.h(accountParticle) + this.r, accountParticle.getPaddingBottom());
            return new ufs(accountParticle, this.g, this.i, this.j, this.o, this.n, null, null, null, null);
        }
        Context context = this.h;
        ujx ujxVar = this.m;
        ywt ywtVar = this.t;
        ugq ugqVar = new ugq(context, ujxVar, viewGroup, new ugp(ywtVar.a(ugv.COLOR_ON_SURFACE), ywtVar.a(ugv.TEXT_PRIMARY), ywtVar.a(ugv.COLOR_PRIMARY_GOOGLE), ywtVar.a(ugv.COLOR_ON_PRIMARY_GOOGLE)));
        int i2 = this.r;
        View view = ugqVar.a;
        jw.Y(view, jw.i(view) + i2, ugqVar.a.getPaddingTop(), jw.h(ugqVar.a) + i2, ugqVar.a.getPaddingBottom());
        return ugqVar;
    }

    @Override // defpackage.vw
    public final void o(wv wvVar, int i) {
        if (wvVar instanceof ufs) {
            ufs ufsVar = (ufs) wvVar;
            final ufu ufuVar = this.p;
            final Object obj = this.q.get(i);
            ujx ujxVar = ufuVar.e;
            AccountParticle accountParticle = ufsVar.t;
            accountParticle.m = true;
            accountParticle.a(ujxVar);
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: uft
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ufu ufuVar2 = ufu.this;
                    Object obj2 = obj;
                    ufuVar2.b.a(ufuVar2.a.a(), ufuVar2.c);
                    ufuVar2.e.e(tgc.c(), view);
                    uht uhtVar = ufuVar2.f;
                    ExpressSignInLayout expressSignInLayout = uhtVar.a;
                    uhtVar.b.b.g(obj2);
                    expressSignInLayout.post(new uhk(expressSignInLayout, 1));
                    ufuVar2.b.a(ufuVar2.a.a(), ufuVar2.d);
                }
            };
            ufsVar.t.i.a(obj);
            ammv ammvVar = ufsVar.u;
            ufsVar.E();
            ammv ammvVar2 = ufsVar.v;
            ufsVar.a.setOnClickListener(onClickListener);
            AccountParticle accountParticle2 = (AccountParticle) ufsVar.a;
            accountParticle2.k.setAlpha(1.0f);
            accountParticle2.l.setAlpha(1.0f);
            AccountParticleDisc accountParticleDisc = accountParticle2.j;
            accountParticleDisc.setAlpha(1.0f);
            accountParticleDisc.a.setColorFilter((ColorFilter) null);
            accountParticle2.findViewById(R.id.og_account_deactivated_help_tooltip).setVisibility(8);
            return;
        }
        if (wvVar instanceof ugq) {
            final ugq ugqVar = (ugq) wvVar;
            final ugn ugnVar = (ugn) this.f.get(i - this.q.size());
            ugqVar.x.a = ammv.j(Integer.valueOf(ugnVar.c));
            ugqVar.x.a(ugqVar.w);
            ugqVar.t.setImageDrawable(tyo.R(ugnVar.a, ugqVar.v));
            ugqVar.u.setText(ugnVar.b);
            ugqVar.a.setOnClickListener(new View.OnClickListener() { // from class: ugo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ugq ugqVar2 = ugq.this;
                    ugn ugnVar2 = ugnVar;
                    ugqVar2.w.e(tgc.c(), view);
                    ugnVar2.d.onClick(view);
                }
            });
        }
    }

    @Override // defpackage.vw
    public final void p(wv wvVar) {
        if (wvVar instanceof ufs) {
            ufs ufsVar = (ufs) wvVar;
            ufsVar.t.b(this.p.e);
            ufsVar.t.m = false;
            return;
        }
        if (wvVar instanceof ugq) {
            ugq ugqVar = (ugq) wvVar;
            ugqVar.x.b(ugqVar.w);
            ugqVar.x.a = amlr.a;
        }
    }

    @Override // defpackage.vw
    public final void r() {
        this.k.b(this.u);
        this.d = this.k.a();
        this.e = amru.o(((ufn) this.k).d());
        this.l.g(this.s);
        w();
    }

    @Override // defpackage.vw
    public final void t() {
        this.l.k(this.s);
        this.k.c(this.u);
        this.q.clear();
    }

    public final void w() {
        uqq.j();
        ArrayList arrayList = new ArrayList(this.q);
        ArrayList arrayList2 = new ArrayList(this.e);
        Object obj = this.d;
        if (obj != null) {
            arrayList2.remove(obj);
        }
        oz a = pc.a(new uga(arrayList, arrayList2));
        this.q.clear();
        this.q.addAll(arrayList2);
        a.a(this);
    }
}
