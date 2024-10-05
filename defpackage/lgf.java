package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MetadataBadgeRendererOuterClass;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class lgf implements ajom {
    protected final View a;
    protected final TextView b;
    protected final ImageView c;
    protected final TextView d;
    protected final Context e;
    public apxf f = null;
    private final TextView g;
    private final ViewGroup h;
    private final ViewStub i;
    private final TextView j;
    private final View k;
    private final View.OnClickListener l;
    private final ajjz m;
    private final akbf n;
    private final ajyf o;
    private final ajut p;
    private final gaf q;
    private final ftm r;
    private final fvd s;

    public lgf(Context context, final aahd aahdVar, ajjz ajjzVar, akbf akbfVar, ajyg ajygVar, ajut ajutVar, ftn ftnVar, fvf fvfVar, akbd akbdVar, int i, ViewGroup viewGroup, byte[] bArr) {
        this.e = context;
        ajjzVar.getClass();
        this.m = ajjzVar;
        this.p = ajutVar;
        this.n = akbfVar;
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.a = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.b = (TextView) inflate.findViewById(R.id.subtitle);
        this.c = (ImageView) inflate.findViewById(R.id.avatar);
        this.g = (TextView) inflate.findViewById(R.id.avatar_text);
        this.h = (ViewGroup) inflate.findViewById(R.id.badge_layout);
        ViewStub viewStub = (ViewStub) inflate.findViewById(R.id.title_badge);
        this.i = viewStub;
        TextView textView = (TextView) inflate.findViewById(R.id.subscribe_button);
        this.j = textView;
        View findViewById = inflate.findViewById(R.id.subscription_notification_view);
        this.k = findViewById;
        this.l = new View.OnClickListener() { // from class: lge
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                lgf lgfVar = lgf.this;
                aahd aahdVar2 = aahdVar;
                apxf apxfVar = lgfVar.f;
                if (apxfVar != null) {
                    aahdVar2.c(apxfVar, null);
                }
            }
        };
        this.o = ajygVar.a((TextView) inflate.findViewById(R.id.action_button));
        this.q = new gaf(ajutVar, context, viewStub);
        fvd b = findViewById != null ? fvfVar.b(findViewById) : null;
        this.s = b;
        this.r = ftnVar.a(textView, b);
        if (akbdVar.d()) {
            akbdVar.c(inflate, akbdVar.a(inflate, null));
        } else {
            whu.s(inflate, whu.x(context, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean f(awcw awcwVar) {
        aulq aulqVar = awcwVar.l;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        int cl = anaf.cl(((atdu) aulqVar.pX(MetadataBadgeRendererOuterClass.metadataBadgeRenderer)).d);
        return cl != 0 && cl == 17;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.r.d();
    }

    protected abstract void d(awcw awcwVar);

    @Override // defpackage.ajom
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, awcw awcwVar) {
        apxf apxfVar;
        aqyg aqygVar;
        atdu atduVar;
        avgg avggVar;
        apmg apmgVar;
        avgg avggVar2;
        apkv apkvVar;
        apkv apkvVar2;
        apkv apkvVar3;
        View a;
        auzj auzjVar = null;
        if ((awcwVar.b & 2) != 0) {
            apxfVar = awcwVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        this.f = apxfVar;
        this.a.setOnClickListener(this.l);
        TextView textView = this.d;
        if ((awcwVar.b & 1) != 0) {
            aqygVar = awcwVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(ajcq.b(aqygVar));
        aulq aulqVar = awcwVar.l;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        if (aulqVar.pY(MetadataBadgeRendererOuterClass.metadataBadgeRenderer)) {
            aulq aulqVar2 = awcwVar.l;
            if (aulqVar2 == null) {
                aulqVar2 = aulq.a;
            }
            atduVar = (atdu) aulqVar2.pX(MetadataBadgeRendererOuterClass.metadataBadgeRenderer);
        } else {
            atduVar = null;
        }
        if (f(awcwVar)) {
            zbx zbxVar = new zbx(wbs.Q(this.e, R.attr.ytVerifiedBadgeBackground));
            zbxVar.b(6, 2, zbx.a(this.d.getTextSize(), 2) + 4, 2);
            this.d.setBackground(zbxVar);
            this.i.setVisibility(8);
        } else {
            this.d.setBackground(null);
            this.d.setPadding(0, 0, 0, 0);
            this.q.f(atduVar);
        }
        this.c.setVisibility(8);
        this.g.setVisibility(8);
        this.o.b(null, null);
        Spanned b = ajcq.b(awcwVar.c == 9 ? (aqyg) awcwVar.d : null);
        if (!TextUtils.isEmpty(b)) {
            this.g.setVisibility(0);
            this.g.setText(b);
        } else {
            if (awcwVar.c == 5) {
                avggVar = (avgg) awcwVar.d;
            } else {
                avggVar = avgg.a;
            }
            if (!ahbw.L(avggVar)) {
                if (awcwVar.c == 10) {
                    ajyf ajyfVar = this.o;
                    apmh apmhVar = (apmh) awcwVar.d;
                    if ((apmhVar.b & 1) != 0) {
                        apmgVar = apmhVar.c;
                        if (apmgVar == null) {
                            apmgVar = apmg.a;
                        }
                    } else {
                        apmgVar = null;
                    }
                    ajyfVar.b(apmgVar, ajokVar.a);
                }
            } else {
                ajjz ajjzVar = this.m;
                ImageView imageView = this.c;
                if (awcwVar.c == 5) {
                    avggVar2 = (avgg) awcwVar.d;
                } else {
                    avggVar2 = avgg.a;
                }
                ajjzVar.h(imageView, avggVar2);
                this.c.setVisibility(0);
            }
        }
        awci[] awciVarArr = (awci[]) awcwVar.h.toArray(new awci[0]);
        whu.I(this.h, awciVarArr != null && awciVarArr.length > 0);
        mcy.K(this.e, this.h, this.p, Arrays.asList(awciVarArr), true);
        aulq aulqVar3 = awcwVar.k;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        if (aulqVar3.pY(SubscribeButtonRendererOuterClass.subscribeButtonRenderer)) {
            aulq aulqVar4 = awcwVar.k;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            auzjVar = (auzj) aulqVar4.pX(SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
        }
        if (auzjVar == null) {
            this.s.f();
        } else {
            auzjVar = (auzj) fkc.o(this.e, auzjVar.toBuilder(), this.d.getText()).build();
        }
        this.r.i(auzjVar, ajokVar.a);
        fvd fvdVar = this.s;
        if (fvdVar != null && (a = fvdVar.a()) != null) {
            a.setPaddingRelative(a.getPaddingStart(), 0, 0, 0);
        }
        awcb awcbVar = awcwVar.j;
        if (awcbVar == null) {
            awcbVar = awcb.a;
        }
        int i = awcbVar.b;
        awcb awcbVar2 = awcwVar.i;
        if (awcbVar2 == null) {
            awcbVar2 = awcb.a;
        }
        int i2 = awcbVar2.b;
        if (i == 118483990) {
            if (i2 == 118483990) {
                awcb awcbVar3 = awcwVar.j;
                if (awcbVar3 == null) {
                    awcbVar3 = awcb.a;
                }
                if (awcbVar3.b == 118483990) {
                    apkvVar2 = (apkv) awcbVar3.c;
                } else {
                    apkvVar2 = apkv.a;
                }
                awcb awcbVar4 = awcwVar.i;
                if (awcbVar4 == null) {
                    awcbVar4 = awcb.a;
                }
                if (awcbVar4.b == 118483990) {
                    apkvVar3 = (apkv) awcbVar4.c;
                } else {
                    apkvVar3 = apkv.a;
                }
                this.d.setTextColor(this.n.a(apkvVar3.d, apkvVar2.d));
                this.b.setTextColor(this.n.a(apkvVar3.e, apkvVar2.e));
                this.g.setTextColor(this.n.a(apkvVar3.d, apkvVar2.d));
                this.a.setBackgroundColor(this.n.a(apkvVar3.c, apkvVar2.c));
            }
            this.d.setTextColor(wbs.W(this.e, R.attr.ytTextPrimary).orElse(0));
            this.b.setTextColor(wbs.W(this.e, R.attr.ytTextSecondary).orElse(0));
            this.g.setTextColor(wbs.W(this.e, R.attr.ytTextPrimary).orElse(0));
            this.a.setBackgroundColor(wbs.W(this.e, R.attr.ytGeneralBackgroundB).orElse(0));
        } else {
            if (i2 == 118483990) {
                awcb awcbVar5 = awcwVar.i;
                if (awcbVar5 == null) {
                    awcbVar5 = awcb.a;
                }
                if (awcbVar5.b == 118483990) {
                    apkvVar = (apkv) awcbVar5.c;
                } else {
                    apkvVar = apkv.a;
                }
                this.d.setTextColor(apkvVar.d);
                this.b.setTextColor(apkvVar.e);
                this.g.setTextColor(apkvVar.d);
                this.a.setBackgroundColor(apkvVar.c);
            }
            this.d.setTextColor(wbs.W(this.e, R.attr.ytTextPrimary).orElse(0));
            this.b.setTextColor(wbs.W(this.e, R.attr.ytTextSecondary).orElse(0));
            this.g.setTextColor(wbs.W(this.e, R.attr.ytTextPrimary).orElse(0));
            this.a.setBackgroundColor(wbs.W(this.e, R.attr.ytGeneralBackgroundB).orElse(0));
        }
        d(awcwVar);
    }
}
