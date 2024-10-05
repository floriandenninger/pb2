package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class erx implements ajom {
    final Context a;
    final fvd b;
    final ftm c;
    final ajoi d;
    public final View e;
    public final TextView f;
    public final WrappingTextView g;
    protected final TextView h;
    boolean i;
    public Object j;
    private final ajjz k;
    private final ajjv l;
    private final ajop m;
    private final ajuw n;
    private final Runnable o;
    private final TextView p;
    private final TextView q;
    private final ImageView r;
    private final ImageView s;
    private final View t;
    private TextView u;

    public erx(Context context, ajjz ajjzVar, gma gmaVar, ajoy ajoyVar, ajuw ajuwVar, ftn ftnVar, fvf fvfVar, byte[] bArr, byte[] bArr2) {
        this.a = context;
        ajjzVar.getClass();
        this.k = ajjzVar;
        this.m = gmaVar;
        this.n = ajuwVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_channel_item, (ViewGroup) null);
        this.e = inflate;
        this.f = (TextView) inflate.findViewById(R.id.channel_name);
        this.p = (TextView) inflate.findViewById(R.id.video_count);
        this.q = (TextView) inflate.findViewById(R.id.subscriber_count);
        this.r = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.s = (ImageView) inflate.findViewById(R.id.contextual_menu_anchor);
        this.g = (WrappingTextView) inflate.findViewById(R.id.channel_byline);
        this.t = inflate.findViewById(R.id.channel_subscribe_button_container);
        this.h = (TextView) inflate.findViewById(R.id.purchase_button);
        ajju b = ajjzVar.c().b();
        b.b(R.drawable.missing_avatar);
        this.l = b.a();
        TextView textView = (TextView) inflate.findViewById(R.id.subscribe_button);
        fvd b2 = fvfVar.b(inflate.findViewById(R.id.subscription_notification_view));
        this.b = b2;
        this.c = ftnVar.a(textView, b2);
        if (gmaVar.b == null) {
            gmaVar.c(inflate);
        }
        this.d = ajoyVar.c(gmaVar);
        this.o = new Runnable() { // from class: erw
            @Override // java.lang.Runnable
            public final void run() {
                erx erxVar = erx.this;
                if (erxVar.j == null || erxVar.g.getLineCount() < 2 || erxVar.g.getLineCount() + erxVar.f.getLineCount() < 4) {
                    return;
                }
                erxVar.g.a(erx.p(erxVar.h(erxVar.j), null));
            }
        };
    }

    public static final amru p(CharSequence charSequence, CharSequence charSequence2) {
        amrp h = amru.h(2);
        if (!TextUtils.isEmpty(charSequence)) {
            h.h(charSequence);
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            h.h(charSequence2);
        }
        return h.g();
    }

    private final auzj q(auzj auzjVar, acra acraVar) {
        View a;
        if (auzjVar != null) {
            aone builder = auzjVar.toBuilder();
            fkc.o(this.a, builder, this.f.getText());
            auzjVar = (auzj) builder.build();
        }
        this.c.i(auzjVar, acraVar);
        if (!this.i && (a = this.b.a()) != null) {
            int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(R.dimen.channel_subscribe_button_vertical_padding);
            int dimensionPixelOffset2 = this.a.getResources().getDimensionPixelOffset(R.dimen.channel_subscribe_button_horizontal_padding);
            int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.notification_bell_min_size) - dimensionPixelOffset2;
            a.setPaddingRelative(dimensionPixelOffset2, dimensionPixelOffset, 0, dimensionPixelOffset);
            if (a instanceof TextView) {
                TextView textView = (TextView) a;
                if (textView.getMinWidth() > dimensionPixelSize) {
                    textView.setMinWidth(dimensionPixelSize);
                }
            }
            if (a.getMinimumWidth() > dimensionPixelSize) {
                a.setMinimumWidth(dimensionPixelSize);
            }
            this.i = true;
        }
        whu.I(this.t, auzjVar != null);
        return auzjVar;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.d.c();
        this.c.d();
    }

    public abstract apxf d(Object obj);

    public abstract atdf e(Object obj);

    public abstract auzj f(Object obj);

    public abstract avgg g(Object obj);

    public abstract CharSequence h(Object obj);

    public abstract CharSequence i(Object obj);

    public abstract CharSequence j(Object obj);

    public abstract CharSequence k(Object obj);

    public abstract CharSequence l(Object obj);

    public abstract Object m(Object obj, auzj auzjVar);

    public abstract List n(Object obj);

    public abstract byte[] o(Object obj);

    @Override // defpackage.ajom
    public void oB(ajok ajokVar, Object obj) {
        apjw apjwVar;
        Spanned spanned;
        aqyg aqygVar;
        this.j = obj;
        byte[] o = o(obj);
        atdc atdcVar = null;
        if (o != null) {
            ajokVar.a.u(new acqx(o), null);
        }
        this.f.setText(k(obj));
        auzj f = f(obj);
        acra acraVar = ajokVar.a;
        if ((Build.VERSION.SDK_INT < 26 && zev.f(this.a)) || f == null) {
            q(null, acraVar);
            whu.G(this.p, l(obj));
            whu.G(this.q, j(obj));
            whu.I(this.g, false);
        } else {
            Object m = m(obj, q(f, acraVar));
            this.g.a(p(h(m), i(m)));
            this.g.post(this.o);
            whu.I(this.p, false);
            whu.I(this.q, false);
            whu.I(this.g, !r0.a.isEmpty());
        }
        whu.I(this.h, false);
        this.k.k(this.r, g(obj), this.l);
        Iterator it = n(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                apjwVar = null;
                break;
            }
            apjt apjtVar = (apjt) it.next();
            if ((apjtVar.b & 2) != 0) {
                apjwVar = apjtVar.d;
                if (apjwVar == null) {
                    apjwVar = apjw.a;
                }
            }
        }
        if (apjwVar != null) {
            if ((apjwVar.b & 1) != 0) {
                aqygVar = apjwVar.c;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            spanned = ajcq.b(aqygVar);
        } else {
            spanned = null;
        }
        if (!TextUtils.isEmpty(spanned)) {
            if (this.u == null) {
                this.u = (TextView) ((ViewStub) this.e.findViewById(R.id.live_badge)).inflate();
            }
            whu.G(this.u, spanned);
        } else {
            TextView textView = this.u;
            if (textView != null) {
                whu.I(textView, false);
            }
        }
        acra acraVar2 = ajokVar.a;
        atdf e = e(obj);
        ajuw ajuwVar = this.n;
        View view = this.e;
        ImageView imageView = this.s;
        if (e != null && (e.b & 1) != 0 && (atdcVar = e.c) == null) {
            atdcVar = atdc.a;
        }
        ajuwVar.e(view, imageView, atdcVar, obj, acraVar2);
        this.m.e(ajokVar);
        this.d.a(ajokVar.a, d(obj), ajokVar.e());
    }
}
