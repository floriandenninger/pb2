package defpackage;

import android.app.Activity;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteButton;
import com.google.android.apps.youtube.app.common.tutorial.ClingTutorialView;
import com.google.android.apps.youtube.app.common.tutorial.ClingView;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nkr implements fwn, ypd {
    public final fwo a;
    public ViewGroup b;
    public ClingTutorialView c;
    private final Activity d;
    private final jcm e;
    private final azrw f;
    private final azrw g;
    private final ono h;

    public nkr(Activity activity, ono onoVar, fwo fwoVar, jcm jcmVar, azrw azrwVar, azrw azrwVar2) {
        this.d = activity;
        this.h = onoVar;
        fwoVar.getClass();
        this.a = fwoVar;
        jcmVar.getClass();
        this.e = jcmVar;
        this.f = azrwVar;
        this.g = azrwVar2;
    }

    @Override // defpackage.fwk
    public final int c() {
        return 5500;
    }

    @Override // defpackage.fwk
    public final void d() {
        ClingTutorialView clingTutorialView = this.c;
        if (clingTutorialView != null) {
            clingTutorialView.b();
            this.b.removeView(this.c);
        }
    }

    @Override // defpackage.fwk
    public final void e() {
        if (this.b == null) {
            ViewGroup viewGroup = (ViewGroup) this.d.getWindow().findViewById(R.id.accessibility_layer_container);
            if (viewGroup == null) {
                viewGroup = (ViewGroup) this.d.getWindow().getDecorView();
            }
            this.b = viewGroup;
        }
        ClingTutorialView clingTutorialView = this.c;
        if (clingTutorialView == null) {
            ClingTutorialView clingTutorialView2 = (ClingTutorialView) this.d.getLayoutInflater().inflate(R.layout.tutorial_view, this.b).findViewById(R.id.tutorial_view);
            this.c = clingTutorialView2;
            clingTutorialView2.d = new nkq(this);
            ClingTutorialView clingTutorialView3 = this.c;
            Spanned fromHtml = Html.fromHtml(this.d.getString(R.string.dial_screen_tutorial));
            TextView textView = clingTutorialView3.b;
            if (textView != null) {
                textView.setText(fromHtml);
            }
            clingTutorialView = this.c;
            clingTutorialView.c = 1000;
        }
        if (this.b.indexOfChild(clingTutorialView) < 0) {
            this.b.addView(this.c);
        }
        this.e.b().ifPresent(new Consumer() { // from class: nkp
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                nkr nkrVar = nkr.this;
                MediaRouteButton mediaRouteButton = (MediaRouteButton) obj;
                ClingTutorialView clingTutorialView4 = nkrVar.c;
                ViewGroup viewGroup2 = nkrVar.b;
                ClingView clingView = clingTutorialView4.a;
                if (clingView == null) {
                    return;
                }
                View view = clingView.b;
                if (view != null) {
                    view.getViewTreeObserver().removeOnGlobalLayoutListener(clingView.d);
                }
                clingView.b = mediaRouteButton;
                viewGroup2.getClass();
                clingView.a = viewGroup2;
                View view2 = clingView.b;
                if (view2 != null) {
                    view2.getViewTreeObserver().addOnGlobalLayoutListener(clingView.d);
                }
                clingView.postInvalidate();
                clingTutorialView4.postInvalidate();
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer.CC.$default$andThen(this, consumer);
            }
        });
        ClingTutorialView clingTutorialView4 = this.c;
        if (clingTutorialView4.getVisibility() == 0) {
            clingTutorialView4.setAnimation(null);
            return;
        }
        clingTutorialView4.setVisibility(0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(clingTutorialView4.c);
        clingTutorialView4.startAnimation(alphaAnimation);
    }

    @Override // defpackage.fwn
    public final boolean f() {
        boolean z;
        ono onoVar;
        Optional b = this.e.b();
        if (b.isPresent() && ((MediaRouteButton) b.get()).isShown()) {
            if (bpw.i() != null) {
                Iterator it = bpw.i().iterator();
                while (it.hasNext()) {
                    if (((addy) this.g.get()).L((bpv) it.next())) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        return (!z || (onoVar = this.h) == null) ? z : (!((fzb) onoVar.a.get()).q() || onoVar.b.l() || onoVar.b.i()) ? false : true;
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adli.class};
        }
        if (i == 0) {
            this.a.d();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
