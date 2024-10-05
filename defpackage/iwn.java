package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.apps.youtube.app.playlist.ui.OnAnimationEndRelativeLayout;
import com.google.android.libraries.youtube.common.ui.TopPeekingScrollView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class iwn extends ivq implements View.OnClickListener, nmn, acqz, ypd {
    private boolean aA;
    private ValueAnimator aB;
    public int ae;
    public int af;
    public int ag = 0;
    public View ah;
    public OnAnimationEndRelativeLayout ai;
    public View aj;
    public TopPeekingScrollView ak;
    public RecyclerView al;
    public ajox am;
    public boolean an;
    public acra ao;
    public fma ap;
    public zim aq;
    public ypa ar;
    public gbh as;
    public gcl at;
    public ohg au;
    public gcp av;
    private int aw;
    private int ax;
    private ci ay;
    private String az;

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        String str = ((AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint) aahg.b(this.m.getByteArray("navigation_endpoint")).pX(AddToPlaylistEndpointOuterClass$AddToPlaylistEndpoint.addToPlaylistEndpoint)).b;
        ohg ohgVar = this.au;
        ci ciVar = this.ay;
        azrw azrwVar = ohgVar.c;
        zaw zawVar = (zaw) ohgVar.d.get();
        zawVar.getClass();
        ajoy ajoyVar = (ajoy) ohgVar.e.get();
        ajoyVar.getClass();
        ajyg ajygVar = (ajyg) ohgVar.b.get();
        ajygVar.getClass();
        ypa ypaVar = (ypa) ohgVar.g.get();
        ypaVar.getClass();
        aahv aahvVar = (aahv) ohgVar.a.get();
        aahvVar.getClass();
        ogx ogxVar = (ogx) ohgVar.f.get();
        ciVar.getClass();
        str.getClass();
        nmo nmoVar = new nmo(azrwVar, zawVar, ajoyVar, ajygVar, ypaVar, aahvVar, ogxVar, ciVar, this, str, null, null);
        abav abavVar = (abav) nmoVar.a.get();
        abar abarVar = new abar(abavVar.f, abavVar.a.c(), null, null, null);
        abarVar.a.add(nmoVar.c);
        abarVar.k();
        ((abav) nmoVar.a.get()).c.e(abarVar, nmoVar);
    }

    @Override // defpackage.ce
    public final void V() {
        super.V();
        this.ar.m(this);
        this.ar.d(new iwm(false));
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        this.ap.b(this.az);
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        this.az = this.ap.a();
    }

    public final void aJ(boolean z) {
        ammv j;
        vw vwVar = this.al.m;
        if (vwVar != null) {
            ajng ajngVar = ((ajox) vwVar).f;
            int a = ajngVar.a();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i < ajngVar.a()) {
                    if (ajngVar.c(i) instanceof auap) {
                        a = i;
                        break;
                    } else if (this.al.getChildAt(i) == null) {
                        j = amlr.a;
                        break;
                    } else {
                        i2 += this.al.getChildAt(i).getHeight();
                        i++;
                    }
                } else {
                    break;
                }
            }
            View childAt = this.al.getChildAt(a);
            j = childAt == null ? amlr.a : ammv.j(Integer.valueOf(i2 + (childAt.getHeight() * (this.al.m.b() - a))));
            int K = j.h() ? yjk.K(qR().getResources().getDisplayMetrics(), 365) : Integer.MAX_VALUE;
            int intValue = ((Integer) j.e(Integer.MAX_VALUE)).intValue();
            int max = Math.max(0, (this.ah.getHeight() - this.ai.getHeight()) - Math.min(K, intValue));
            final int min = Math.min(Math.max(intValue - K, 0), max);
            TopPeekingScrollView topPeekingScrollView = this.ak;
            if (max == topPeekingScrollView.k) {
                return;
            }
            if (z) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.aB = valueAnimator;
                valueAnimator.setIntValues(this.ak.k, max);
                this.aB.setInterpolator(new anq());
                this.aB.setDuration(this.aw);
                this.aB.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: iwf
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        iwn iwnVar = iwn.this;
                        iwnVar.ak.g(((Integer) valueAnimator2.getAnimatedValue()).intValue(), min, false);
                    }
                });
                this.aB.start();
                return;
            }
            topPeekingScrollView.g(max, min, true);
        }
    }

    public final void aK() {
        if (this.am == null || this.aA) {
            return;
        }
        this.al.setVisibility(0);
        this.al.ac(this.am);
        this.am = null;
        this.al.getViewTreeObserver().addOnGlobalLayoutListener(new iwl(this, 0));
    }

    @Override // defpackage.nmn
    public final void aL(boolean z) {
        if (z) {
            dismiss();
        } else {
            super.kv();
        }
    }

    @Override // defpackage.bv
    public final void dismiss() {
        this.aj.animate().alpha(0.0f).setDuration(this.af).start();
        this.ai.animate().translationY(this.ai.getHeight()).setDuration(this.ae).setStartDelay(this.ax).setInterpolator(new LinearInterpolator()).setListener(new iwj(this)).start();
        ValueAnimator valueAnimator = this.aB;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.aA = true;
        ViewPropertyAnimator animate = this.ak.animate();
        int height = this.ah.getHeight();
        int i = this.ak.k;
        animate.translationY(((height - i) - this.ai.getHeight()) + this.ak.getScrollY()).setDuration(this.ax).setInterpolator(new LinearInterpolator()).start();
    }

    @Override // defpackage.ivq, defpackage.bv, defpackage.ce
    public final void ku(Context context) {
        super.ku(context);
        this.ay = (ci) context;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aaci.class};
        }
        if (i == 0) {
            aaci aaciVar = (aaci) obj;
            if (!aaciVar.e().h()) {
                return null;
            }
            this.at.j(this.av.a((atnc) aaciVar.e().c(), null).b());
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.acqz
    public final acra mM() {
        return this.ao;
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        o(2, this.aq.a);
        this.ar.g(this);
        this.ar.d(new iwm(true));
    }

    @Override // defpackage.bv, defpackage.ce
    public final void mS() {
        super.mS();
        Window window = this.d.getWindow();
        window.addFlags(2);
        window.setDimAmount(0.0f);
    }

    @Override // defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.playlist_add_to_fragment, viewGroup, false);
        this.ah = inflate;
        this.aj = inflate.findViewById(R.id.overlay);
        this.ak = (TopPeekingScrollView) this.ah.findViewById(R.id.top_peeking_scroll_view);
        RecyclerView recyclerView = (RecyclerView) this.ah.findViewById(R.id.list);
        this.al = recyclerView;
        recyclerView.af(new LinearLayoutManager());
        this.al.setVisibility(4);
        this.ai = (OnAnimationEndRelativeLayout) this.ah.findViewById(R.id.add_to_playlist_bottom_sheet_close_button);
        int dimensionPixelSize = this.ah.getResources().getDimensionPixelSize(R.dimen.add_to_playlist_close_button_width);
        if (dimensionPixelSize > 0) {
            yny.z(this.ai, yny.x(dimensionPixelSize), ViewGroup.LayoutParams.class);
        }
        this.ai.setOnClickListener(new View.OnClickListener() { // from class: iwg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iwn.this.dismiss();
            }
        });
        this.ai.a = new Runnable() { // from class: iwh
            @Override // java.lang.Runnable
            public final void run() {
                iwn iwnVar = iwn.this;
                iwnVar.an = true;
                iwnVar.aK();
            }
        };
        OnAnimationEndRelativeLayout onAnimationEndRelativeLayout = this.ai;
        whu.E(onAnimationEndRelativeLayout, onAnimationEndRelativeLayout.getBackground());
        this.ah.setOnApplyWindowInsetsListener(new iwi(this));
        this.aj.setOnClickListener(this);
        this.ak.f(qR().getResources().getDisplayMetrics().heightPixels - this.ag);
        TopPeekingScrollView topPeekingScrollView = this.ak;
        topPeekingScrollView.l = this.aj;
        topPeekingScrollView.m = this.al;
        this.aw = qX().getInteger(R.integer.abc_config_activityDefaultDur);
        this.ax = qX().getInteger(R.integer.abc_config_activityShortDur);
        this.ae = qX().getInteger(R.integer.abc_config_activityShortDur);
        this.af = qX().getInteger(android.R.integer.config_shortAnimTime);
        this.as.d((BottomUiContainer) this.ah.findViewById(R.id.bottom_ui_container));
        this.ah.getViewTreeObserver().addOnGlobalLayoutListener(new iwl(this, 1));
        return this.ah;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.aj) {
            dismiss();
        }
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.ah.addOnLayoutChangeListener(new iwk(this, this.ah.getHeight()));
    }
}
