package defpackage;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import com.google.android.libraries.youtube.ads.player.ui.AdCountdownTextView;
import com.google.android.libraries.youtube.ads.player.ui.AdCountdownView;
import com.google.android.libraries.youtube.ads.player.ui.SkipAdButton;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xif implements xkl {
    private final xht a;
    private final SkipAdButton b;

    public xif(xht xhtVar, SkipAdButton skipAdButton) {
        this.a = xhtVar;
        skipAdButton.getClass();
        this.b = skipAdButton;
        j(3, false);
    }

    @Override // defpackage.xkl
    public final void a(boolean z, boolean z2, boolean z3, boolean z4) {
        SkipAdButton skipAdButton = this.b;
        yny.z(skipAdButton, yny.k((z4 && z3 && z2 && z) ? skipAdButton.n : skipAdButton.m), ViewGroup.MarginLayoutParams.class);
        AdCountdownView adCountdownView = this.a.a;
        yny.z(adCountdownView, yny.k((z4 && z3 && z2 && z) ? adCountdownView.j : adCountdownView.i), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.xkl
    public final void b() {
    }

    @Override // defpackage.xkl
    public final void c(int i) {
        AdCountdownView adCountdownView = this.a.a;
        if (adCountdownView.e || adCountdownView.h != xfn.POST_ROLL) {
            return;
        }
        adCountdownView.c.d(R.string.ad_will_end_in_multiline, i);
    }

    @Override // defpackage.xkl
    public final void d(int i) {
        AdCountdownView adCountdownView = this.a.a;
        if (adCountdownView.e) {
            adCountdownView.c.d(R.string.skip_ad_in_multiline, i);
        }
    }

    @Override // defpackage.xkl
    public final void e(xcf xcfVar) {
        int i = xcfVar.c;
        boolean z = false;
        if (i > 1 && xcfVar.b < i) {
            z = true;
        }
        SkipAdButton skipAdButton = this.b;
        skipAdButton.f.setText(z ? skipAdButton.d : skipAdButton.c);
        AdCountdownView adCountdownView = this.a.a;
        adCountdownView.g = z;
        adCountdownView.b(adCountdownView.e);
    }

    @Override // defpackage.xkl
    public final void f(xfn xfnVar) {
        AdCountdownView adCountdownView = this.a.a;
        xfn xfnVar2 = xfn.POST_ROLL;
        boolean z = xfnVar != xfnVar2;
        boolean z2 = xfnVar == xfnVar2;
        xkq xkqVar = adCountdownView.b;
        xkqVar.e = z2;
        xkqVar.a();
        adCountdownView.f = z;
        if (!adCountdownView.e && xfnVar == xfn.POST_ROLL) {
            xkh xkhVar = adCountdownView.c;
            AdCountdownTextView adCountdownTextView = xkhVar.c;
            adCountdownTextView.setPadding(16, adCountdownTextView.getPaddingTop(), 16, xkhVar.c.getPaddingBottom());
        }
        adCountdownView.h = xfnVar;
    }

    @Override // defpackage.xkl
    public final void g(float f, int i) {
        AdCountdownView adCountdownView = this.a.a;
        Resources resources = adCountdownView.getResources();
        int i2 = adCountdownView.l;
        int i3 = adCountdownView.k;
        float f2 = i * resources.getDisplayMetrics().density;
        adCountdownView.d.getLayoutParams().width = (int) (i2 * f);
        int i4 = (int) (f * i3);
        adCountdownView.d.getLayoutParams().height = i4;
        aong aongVar = (aong) aoyq.a.createBuilder();
        aongVar.copyOnWrite();
        aoyq.a((aoyq) aongVar.instance);
        aongVar.copyOnWrite();
        aoyq.e((aoyq) aongVar.instance);
        aoyq aoyqVar = (aoyq) aongVar.build();
        xkh xkhVar = adCountdownView.c;
        ajct c = ajct.c(6);
        if (c != null) {
            xkhVar.c.setTypeface(c.b(xkhVar.a, 0), 0);
        }
        xkhVar.d.b(aoyqVar);
        xkhVar.d.a();
        xkh xkhVar2 = adCountdownView.c;
        int i5 = (int) f2;
        xkhVar2.b.getLayoutParams().width = 0;
        xkhVar2.c.getLayoutParams().height = i4;
        xkhVar2.b.getLayoutParams().height = i4;
        AdCountdownTextView adCountdownTextView = xkhVar2.c;
        adCountdownTextView.setPadding(i5, adCountdownTextView.getPaddingTop(), i5, xkhVar2.c.getPaddingBottom());
    }

    @Override // defpackage.xkl
    public final void k(float f) {
        xkh xkhVar = this.a.a.c;
        xkhVar.d.c(xko.a(f, xkhVar.h, xkhVar.i));
        xkhVar.e.setColor(xko.a(f, xkhVar.f, xkhVar.g));
        xkhVar.d.a();
        SkipAdButton skipAdButton = this.b;
        skipAdButton.k.setColor(xko.a(f, skipAdButton.i, skipAdButton.j));
        skipAdButton.b.c(xko.a(f, skipAdButton.g, skipAdButton.h));
        skipAdButton.a.a();
        skipAdButton.b.a();
        SkipAdButton.a(skipAdButton.e.getDrawable(), f);
    }

    @Override // defpackage.xkl
    public final void l(xki xkiVar, boolean z, int i) {
        if (!z) {
            AdCountdownView adCountdownView = this.a.a;
            aami aamiVar = xkiVar.b;
            if (aamiVar != null) {
                xkq xkqVar = adCountdownView.b;
                xkqVar.a = aamiVar;
                xkqVar.a();
                return;
            }
            return;
        }
        xht xhtVar = this.a;
        aami aamiVar2 = xkiVar.b;
        AdCountdownView adCountdownView2 = xhtVar.a;
        aong aongVar = (aong) aoyq.a.createBuilder();
        aongVar.copyOnWrite();
        aoyq.a((aoyq) aongVar.instance);
        aone createBuilder = aoys.a.createBuilder();
        aone createBuilder2 = aoyr.a.createBuilder();
        if (i == 0) {
            i = 6;
        }
        createBuilder2.copyOnWrite();
        aoyr aoyrVar = (aoyr) createBuilder2.instance;
        aoyrVar.c = i - 1;
        aoyrVar.b |= 1;
        aoyr aoyrVar2 = (aoyr) createBuilder2.build();
        createBuilder.copyOnWrite();
        aoys aoysVar = (aoys) createBuilder.instance;
        aoyrVar2.getClass();
        aoysVar.c = aoyrVar2;
        aoysVar.b |= 1;
        aongVar.copyOnWrite();
        aoyq aoyqVar = (aoyq) aongVar.instance;
        aoys aoysVar2 = (aoys) createBuilder.build();
        aoysVar2.getClass();
        aoyqVar.d = aoysVar2;
        aoyqVar.b |= 2;
        aongVar.copyOnWrite();
        aoyq.e((aoyq) aongVar.instance);
        aone createBuilder3 = aowu.a.createBuilder();
        if (aamiVar2.e() != null) {
            avgg e = aamiVar2.e();
            createBuilder3.copyOnWrite();
            aowu aowuVar = (aowu) createBuilder3.instance;
            e.getClass();
            aowuVar.c = e;
            aowuVar.b |= 1;
        }
        aongVar.copyOnWrite();
        aoyq aoyqVar2 = (aoyq) aongVar.instance;
        aowu aowuVar2 = (aowu) createBuilder3.build();
        aowuVar2.getClass();
        aoyqVar2.f = aowuVar2;
        aoyqVar2.b |= 32;
        aone createBuilder4 = aowu.a.createBuilder();
        aone createBuilder5 = aowv.a.createBuilder();
        aone createBuilder6 = aowk.a.createBuilder();
        createBuilder6.copyOnWrite();
        aowk aowkVar = (aowk) createBuilder6.instance;
        aowkVar.b |= 4;
        aowkVar.e = true;
        aowk aowkVar2 = (aowk) createBuilder6.build();
        createBuilder5.copyOnWrite();
        aowv aowvVar = (aowv) createBuilder5.instance;
        aowkVar2.getClass();
        aowvVar.c = aowkVar2;
        aowvVar.b |= 1;
        createBuilder4.copyOnWrite();
        aowu aowuVar3 = (aowu) createBuilder4.instance;
        aowv aowvVar2 = (aowv) createBuilder5.build();
        aowvVar2.getClass();
        aowuVar3.d = aowvVar2;
        aowuVar3.b |= 2;
        adCountdownView2.c.c((aoyq) aongVar.build());
        adCountdownView2.b.c((aowu) createBuilder4.build());
        adCountdownView2.b.a();
    }

    @Override // defpackage.xkl
    public final void i(auvf auvfVar) {
        aoyq aoyqVar;
        SkipAdButton skipAdButton = this.b;
        xkp xkpVar = skipAdButton.b;
        aowk aowkVar = null;
        if (auvfVar == null) {
            aoyqVar = null;
        } else {
            aoyqVar = auvfVar.d;
            if (aoyqVar == null) {
                aoyqVar = aoyq.a;
            }
        }
        xkpVar.b(aoyqVar);
        xkr xkrVar = skipAdButton.a;
        if (auvfVar != null && (auvfVar.b & 1) != 0) {
            auvg auvgVar = auvfVar.c;
            if (auvgVar == null) {
                auvgVar = auvg.a;
            }
            aowkVar = auvgVar.b;
            if (aowkVar == null) {
                aowkVar = aowk.a;
            }
        }
        xkrVar.d = aowkVar;
        skipAdButton.b.a();
        skipAdButton.a.a();
        if (auvfVar == null || (auvfVar.b & 16) == 0) {
            return;
        }
        avjw avjwVar = auvfVar.f;
        if (avjwVar == null) {
            avjwVar = avjw.a;
        }
        skipAdButton.l = avjwVar;
    }

    @Override // defpackage.xkl
    public final void h(aoxw aoxwVar) {
        aoyq aoyqVar;
        aowu aowuVar;
        AdCountdownView adCountdownView = this.a.a;
        aowk aowkVar = null;
        if (aoxwVar == null) {
            aoyqVar = null;
        } else if ((aoxwVar.b & 4) != 0) {
            aoxv aoxvVar = aoxwVar.d;
            if (aoxvVar == null) {
                aoxvVar = aoxv.a;
            }
            aoyqVar = aoxvVar.b;
            if (aoyqVar == null) {
                aoyqVar = aoyq.a;
            }
        } else {
            aoyqVar = aoxwVar.f;
            if (aoyqVar == null) {
                aoyqVar = aoyq.a;
            }
        }
        xkq xkqVar = adCountdownView.b;
        if (aoxwVar == null) {
            aowuVar = null;
        } else {
            aowuVar = aoxwVar.e;
            if (aowuVar == null) {
                aowuVar = aowu.a;
            }
        }
        xkqVar.c(aowuVar);
        xkr xkrVar = adCountdownView.a;
        if (aoxwVar != null && (aoxwVar.b & 1) != 0) {
            aoxx aoxxVar = aoxwVar.c;
            if (aoxxVar == null) {
                aoxxVar = aoxx.a;
            }
            aowkVar = aoxxVar.b;
            if (aowkVar == null) {
                aowkVar = aowk.a;
            }
        }
        xkrVar.d = aowkVar;
        adCountdownView.c.c(aoyqVar);
        adCountdownView.a.a();
        adCountdownView.b.a();
    }

    @Override // defpackage.xkl
    public final void j(int i, boolean z) {
        if (z) {
            if (i != 3) {
                this.b.setVisibility(8);
                this.a.c(8);
                return;
            }
        } else {
            if (i == 0) {
                if (this.b.c()) {
                    this.b.setVisibility(0);
                    SkipAdButton skipAdButton = this.b;
                    if (skipAdButton.c()) {
                        avjw avjwVar = skipAdButton.l;
                        AlphaAnimation alphaAnimation = new AlphaAnimation(avjwVar.f, avjwVar.g);
                        alphaAnimation.setStartOffset(skipAdButton.l.c);
                        alphaAnimation.setFillAfter(skipAdButton.l.h);
                        alphaAnimation.setDuration(skipAdButton.l.b);
                        skipAdButton.startAnimation(alphaAnimation);
                    }
                } else {
                    this.b.setVisibility(8);
                }
                this.a.c(0);
                this.a.b(true);
                return;
            }
            if (i == 1) {
                this.b.setVisibility(0);
                this.a.c(8);
                return;
            } else if (i == 2) {
                this.b.setVisibility(8);
                this.a.b(false);
                this.a.c(0);
                return;
            } else if (i != 3) {
                return;
            }
        }
        this.b.setVisibility(8);
        this.a.c(8);
        this.a.a();
    }
}
