package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.libraries.youtube.rendering.ui.badge.DurationBadgeView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.CounterfactualRendererOuterClass;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.SubscribeWithContextRendererOuterClass;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class mlc implements ajom, ajog {
    public avgg A;
    public ftx B;
    private etq C;
    private final ohg D;
    private final c E;
    private final ajoy F;
    private final List a;
    private gag b;
    private final View c;
    private final ViewStub d;
    private gnz e;
    private jru f;
    public final Context g;
    public final ajjz h;
    public final View i;
    public final TextView j;
    protected final TextView k;
    public final TextView l;
    protected final TextView m;
    protected final TextView n;
    public TextView o;
    public ftp p;
    public fuf q;
    protected frh r;
    protected lab s;
    protected mvy t;
    protected mvy u;
    protected gaf v;
    public msl w;
    public final ImageView x;
    public final View y;
    public int z;

    public mlc(Context context, ajjz ajjzVar, aahd aahdVar, ajop ajopVar, int i, ViewGroup viewGroup, ohg ohgVar, ajoy ajoyVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this(context, ajjzVar, ajopVar, LayoutInflater.from(context).inflate(i, viewGroup, false), aahdVar, (ajut) null, ohgVar, ajoyVar, cVar, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static final void B(ajok ajokVar, avwi avwiVar) {
        ajokVar.f("VideoPresenterConstants.VIDEO_ID", avwiVar.c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void A(CharSequence charSequence) {
        TextView textView = this.j;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C(aulq aulqVar, ajok ajokVar, ajyw ajywVar, ajnv ajnvVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3 = null;
        auzr auzrVar = aulqVar.pY(SubscribeWithContextRendererOuterClass.subscribeWithContextRenderer) ? (auzr) aulqVar.pX(SubscribeWithContextRendererOuterClass.subscribeWithContextRenderer) : null;
        if (auzrVar != null && this.C == null) {
            KeyEvent.Callback findViewById = this.i.findViewById(R.id.subscribe_section);
            if (findViewById instanceof ViewStub) {
                findViewById = (ViewGroup) ((ViewStub) findViewById).inflate();
            }
            if (findViewById instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) findViewById;
                Context context = (Context) ajywVar.a.get();
                context.getClass();
                ftn ftnVar = (ftn) ajywVar.b.get();
                ftnVar.getClass();
                fvf fvfVar = (fvf) ajywVar.c.get();
                fvfVar.getClass();
                viewGroup.getClass();
                this.C = new etq(context, ftnVar, fvfVar, viewGroup, null);
            }
        }
        etq etqVar = this.C;
        if (etqVar != null) {
            acra acraVar = ajokVar.a;
            if (auzrVar == null) {
                etqVar.c.setVisibility(8);
            } else {
                aulq aulqVar2 = auzrVar.c;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                auzj auzjVar = (auzj) ahbj.n(aulqVar2, SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
                if (auzjVar == null) {
                    etqVar.c.setVisibility(8);
                } else {
                    etqVar.c.setVisibility(0);
                    acraVar.u(new acqx(auzrVar.g), null);
                    if ((auzrVar.b & 2) != 0) {
                        aqygVar = auzrVar.d;
                        if (aqygVar == null) {
                            aqygVar = aqyg.a;
                        }
                    } else {
                        aqygVar = null;
                    }
                    etqVar.d = ajcq.d(aqygVar, etqVar.a);
                    if ((auzrVar.b & 4) != 0) {
                        aqygVar2 = auzrVar.e;
                        if (aqygVar2 == null) {
                            aqygVar2 = aqyg.a;
                        }
                    } else {
                        aqygVar2 = null;
                    }
                    etqVar.e = ajcq.d(aqygVar2, etqVar.a);
                    if ((8 & auzrVar.b) != 0 && (aqygVar3 = auzrVar.f) == null) {
                        aqygVar3 = aqyg.a;
                    }
                    etqVar.f = ajcq.d(aqygVar3, etqVar.a);
                    boolean z = auzjVar.l;
                    etqVar.b(z, z, false);
                    etqVar.b.c(etqVar);
                    etqVar.b.i(auzjVar, acraVar);
                }
            }
        }
        if (aulqVar.pY(CounterfactualRendererOuterClass.counterfactualRenderer)) {
            ajnvVar.oB(ajokVar, (aqgn) aulqVar.pX(CounterfactualRendererOuterClass.counterfactualRenderer));
        }
    }

    @Override // defpackage.ajom
    public void b(ajos ajosVar) {
        View view;
        jru jruVar = this.f;
        if (jruVar != null) {
            jruVar.a();
        }
        frh frhVar = this.r;
        if (frhVar != null && (view = frhVar.f) != null) {
            view.animate().cancel();
        }
        etq etqVar = this.C;
        if (etqVar != null) {
            etqVar.b.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void l(CharSequence charSequence, List list, boolean z) {
        TextView textView = this.m;
        if (textView != null) {
            fkc.j(textView, charSequence);
        }
        boolean z2 = false;
        if (z) {
            whu.I(this.n, false);
            return;
        }
        if (this.m == null && !TextUtils.isEmpty(charSequence)) {
            this.a.add(0, charSequence);
        }
        this.a.addAll(list);
        if (!this.a.isEmpty()) {
            TextView textView2 = this.n;
            if (textView2 instanceof WrappingTextView) {
                ((WrappingTextView) textView2).a(this.a);
                Iterator it = this.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (!TextUtils.isEmpty((CharSequence) it.next())) {
                        z2 = true;
                        break;
                    }
                }
                whu.I(this.n, z2);
            } else if (!list.isEmpty()) {
                fkc.j(this.n, (CharSequence) list.get(0));
            }
        }
        this.a.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        l(charSequence, Arrays.asList(charSequence2), z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void n(CharSequence charSequence) {
        fkc.j(this.k, charSequence);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void o(CharSequence charSequence, CharSequence charSequence2) {
        fkc.j(this.l, charSequence);
        if (this.l == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.l.setContentDescription(charSequence2);
        TextView textView = this.l;
        if (textView instanceof DurationBadgeView) {
            ((DurationBadgeView) textView).a();
        }
    }

    @Override // defpackage.ajog
    public void oh(Map map) {
        ImageView imageView = this.x;
        if (imageView != null) {
            map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_VIEW_KEY", imageView);
            map.put("VideoPresenterConstants.VIDEO_THUMBNAIL_DETAILS_KEY", this.A);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void p(CharSequence charSequence, CharSequence charSequence2, List list, avrx avrxVar) {
        fkc.m(this.l, charSequence, charSequence2, list, avrxVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void r(atdu atduVar) {
        gaf gafVar = this.v;
        if (gafVar == null) {
            return;
        }
        gafVar.f(atduVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(ajok ajokVar, jsi jsiVar) {
        ViewStub viewStub = this.d;
        if (viewStub == null) {
            return;
        }
        if (this.f == null) {
            this.f = this.D.b(viewStub, jsiVar);
        }
        this.f.b(ajokVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(avft avftVar) {
        View view = this.c;
        if (view == null) {
            return;
        }
        if (this.e == null) {
            this.e = new gnz((ViewStub) view);
        }
        this.e.a(avftVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void u(apke apkeVar) {
        mvy mvyVar = this.t;
        if (mvyVar == null) {
            return;
        }
        mvyVar.a(apkeVar);
        TextView textView = this.j;
        if (textView != null) {
            textView.setMaxLines(apkeVar != null ? this.z - 1 : this.z);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void v(apkf apkfVar) {
        TextView textView;
        lab labVar = this.s;
        if (labVar == null) {
            return;
        }
        labVar.a(apkfVar);
        if (apkfVar == null || (textView = this.n) == null) {
            return;
        }
        textView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w(apkh apkhVar) {
        gag gagVar = this.b;
        if (gagVar == null) {
            return;
        }
        gagVar.a(apkhVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void x(avfp avfpVar, int i) {
        int i2;
        ftp ftpVar = this.p;
        if (ftpVar == null) {
            return;
        }
        if (ftpVar.b.getResources().getConfiguration().orientation == 2 || avfpVar == null) {
            ViewStub viewStub = ftpVar.d;
            if (viewStub != null) {
                viewStub.setVisibility(8);
                return;
            }
            return;
        }
        ImageView imageView = (ImageView) ftpVar.c();
        arfs arfsVar = avfpVar.c;
        if (arfsVar == null) {
            arfsVar = arfs.a;
        }
        if ((avfpVar.b & 2) != 0) {
            ajut ajutVar = ftpVar.a;
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            i2 = ajutVar.a(b);
        } else {
            i2 = 0;
        }
        if (i2 != 0) {
            imageView.setImageResource(i2);
        } else {
            imageView.setImageDrawable(null);
        }
        imageView.setVisibility(i);
        ftpVar.c = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void y(avgg avggVar) {
        this.h.h(this.x, avggVar);
        this.A = avggVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void z(avgg avggVar, ajjv ajjvVar) {
        this.h.k(this.x, avggVar, ajjvVar);
        this.A = avggVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(CharSequence charSequence, CharSequence charSequence2, avfv[] avfvVarArr, avrx avrxVar) {
        fkc.m(this.l, charSequence, charSequence2, avfvVarArr == null ? null : Arrays.asList(avfvVarArr), avrxVar);
    }

    public mlc(Context context, ajjz ajjzVar, aahd aahdVar, ajop ajopVar, int i, ohg ohgVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this(context, ajjzVar, aahdVar, ajopVar, i, (ViewGroup) null, ohgVar, (ajoy) null, cVar, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    public mlc(Context context, ajjz ajjzVar, ajop ajopVar, View view, aahd aahdVar, ohg ohgVar, ajoy ajoyVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this(context, ajjzVar, ajopVar, view, aahdVar, (ajut) null, ohgVar, ajoyVar, cVar, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null, (byte[]) null);
    }

    public mlc(Context context, ajjz ajjzVar, ajop ajopVar, View view, aahd aahdVar, ajut ajutVar, ohg ohgVar, ajoy ajoyVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        context.getClass();
        this.g = context;
        ajjzVar.getClass();
        this.h = ajjzVar;
        this.D = ohgVar;
        this.F = ajoyVar;
        this.E = cVar;
        ajopVar.getClass();
        ajopVar.c(view);
        view.getClass();
        this.i = view;
        TextView textView = (TextView) view.findViewById(R.id.title);
        this.j = textView;
        this.k = (TextView) view.findViewById(R.id.description);
        this.l = (TextView) view.findViewById(R.id.duration);
        this.m = (TextView) fav.p(view, R.id.author, TextView.class);
        this.n = (TextView) fav.p(view, R.id.details, TextView.class);
        this.x = (ImageView) view.findViewById(R.id.thumbnail);
        this.y = view.findViewById(R.id.contextual_menu_anchor);
        this.z = textView == null ? 0 : textView.getMaxLines();
        this.c = view.findViewById(R.id.resume_playback_overlay);
        this.d = (ViewStub) view.findViewById(R.id.offline_badge);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.standalone_ypc_badge);
        gaf gafVar = null;
        this.b = viewStub == null ? null : new gag(viewStub, 1);
        ViewStub viewStub2 = (ViewStub) view.findViewById(R.id.standalone_red_badge);
        this.s = (viewStub2 == null || cVar == null) ? null : cVar.g(viewStub2);
        ViewStub viewStub3 = (ViewStub) view.findViewById(R.id.standalone_collection_bottom_badge);
        this.u = viewStub3 == null ? null : new mvy(viewStub3, context, aahdVar, ajutVar);
        ViewStub viewStub4 = (ViewStub) view.findViewById(R.id.text_badge);
        this.r = viewStub4 == null ? null : new frh(viewStub4);
        ViewStub viewStub5 = (ViewStub) view.findViewById(R.id.tap_to_watch_overlay);
        this.p = viewStub5 == null ? null : new ftp(viewStub5, context, ajutVar);
        ViewStub viewStub6 = (ViewStub) view.findViewById(R.id.view_count_overlay);
        this.q = viewStub6 == null ? null : new fuf(viewStub6, context);
        ViewStub viewStub7 = (ViewStub) view.findViewById(R.id.standalone_collection_badge);
        this.t = viewStub7 == null ? null : new mvy(viewStub7, context, aahdVar, ajutVar);
        ViewStub viewStub8 = (ViewStub) view.findViewById(R.id.privacy_badge);
        this.w = viewStub8 == null ? null : new msl(viewStub8, context);
        ViewStub viewStub9 = (ViewStub) view.findViewById(R.id.trending_position_overlay);
        this.B = viewStub9 == null ? null : new ftx(viewStub9, aahdVar);
        ViewStub viewStub10 = (ViewStub) view.findViewById(R.id.metadata_badge);
        if (viewStub10 != null && ajoyVar != null) {
            gafVar = ajoyVar.J(context, viewStub10);
        }
        this.v = gafVar;
        this.a = amkq.aO();
    }
}
