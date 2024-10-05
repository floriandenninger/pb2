package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.apps.youtube.app.ui.SlimVideoBadgeAndSubtitleFlexboxLayout;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class njp extends njq {
    private ayqx A;
    private int B;
    private final c C;
    private final ajyw D;
    private final ajoy E;
    public final aahd a;
    public final ViewGroup b;
    public final ImageView c;
    public final mvy d;
    public final bwd e;
    public final int f;
    public final akcp g;
    public String h;
    public boolean i;
    private final Context m;
    private final Handler n;
    private final TextView o;
    private final TextView p;
    private final TextView q;
    private final SlimVideoBadgeAndSubtitleFlexboxLayout r;
    private final akbd s;
    private final String t;
    private final String u;
    private final Runnable v;
    private final ajut w;
    private final aaea x;
    private final nqp y;
    private final int z;

    public njp(Context context, Handler handler, aahd aahdVar, ajyw ajywVar, c cVar, ajoy ajoyVar, akbd akbdVar, ajut ajutVar, aaea aaeaVar, nqp nqpVar, akcp akcpVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.m = context;
        this.n = handler;
        this.a = aahdVar;
        this.D = ajywVar;
        this.C = cVar;
        this.E = ajoyVar;
        this.s = akbdVar;
        this.w = ajutVar;
        this.x = aaeaVar;
        this.g = akcpVar;
        this.y = nqpVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.slim_video_information_reduced_margins, (ViewGroup) null);
        this.b = viewGroup;
        this.o = (TextView) viewGroup.findViewById(R.id.title);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.expansion_icon);
        this.c = imageView;
        this.p = (TextView) viewGroup.findViewById(R.id.collapsed_subtitle);
        this.q = (TextView) viewGroup.findViewById(R.id.expanded_subtitle);
        ViewStub viewStub = (ViewStub) viewGroup.findViewById(R.id.standalone_collection_badge);
        viewStub.getClass();
        Context context2 = (Context) ajywVar.c.get();
        context2.getClass();
        aahd aahdVar2 = (aahd) ajywVar.a.get();
        aahdVar2.getClass();
        ajut ajutVar2 = (ajut) ajywVar.b.get();
        ajutVar2.getClass();
        this.d = new mvy(viewStub, context2, aahdVar2, ajutVar2);
        SlimVideoBadgeAndSubtitleFlexboxLayout slimVideoBadgeAndSubtitleFlexboxLayout = (SlimVideoBadgeAndSubtitleFlexboxLayout) viewGroup.findViewById(R.id.badge_and_subtitle_container);
        this.r = slimVideoBadgeAndSubtitleFlexboxLayout;
        this.z = slimVideoBadgeAndSubtitleFlexboxLayout.getChildCount();
        this.t = context.getString(R.string.load_more_label);
        this.u = context.getString(R.string.load_less_label);
        bwk bwkVar = new bwk();
        fxy fxyVar = new fxy();
        fxyVar.y(R.id.container);
        bwkVar.f(fxyVar);
        fyj fyjVar = new fyj();
        fyjVar.y(R.id.expansion_icon);
        bwkVar.f(fyjVar);
        bvu bvuVar = new bvu();
        bvuVar.y(R.id.title);
        bvuVar.y(R.id.standalone_collection_badge);
        bvuVar.y(R.id.badge_and_subtitle_container);
        bwkVar.f(bvuVar);
        this.e = bwkVar;
        this.f = context.getResources().getDimensionPixelSize(R.dimen.standalone_collection_badge_expansion_amount);
        this.v = new Runnable() { // from class: njl
            @Override // java.lang.Runnable
            public final void run() {
                View view;
                njp njpVar = njp.this;
                ViewGroup viewGroup2 = njpVar.b;
                mvy mvyVar = njpVar.d;
                int i = njpVar.f;
                zet zetVar = null;
                if (mvyVar.g() && mvyVar.a.isLaidOut() && (view = mvyVar.f) != null) {
                    Rect rect = new Rect();
                    mvyVar.a.getHitRect(rect);
                    viewGroup2.offsetDescendantRectToMyCoords(view, rect);
                    int i2 = -i;
                    rect.inset(i2, i2);
                    zetVar = new zet(rect, mvyVar.a, viewGroup2);
                }
                viewGroup2.setTouchDelegate(zetVar);
            }
        };
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: nji
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                njp njpVar = njp.this;
                if (!njpVar.l.f) {
                    njpVar.j.a.I(3, new acqx(acsb.c(31572)), null);
                } else {
                    njpVar.j.a.I(3, new acqx(acsb.c(31562)), null);
                }
                auwc auwcVar = (auwc) njpVar.k;
                if ((auwcVar.b & 256) == 0) {
                    njpVar.l.h();
                    return;
                }
                aahd aahdVar3 = njpVar.a;
                apxf apxfVar = auwcVar.j;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar3.c(apxfVar, null);
            }
        });
        imageView.setAccessibilityDelegate(new njo());
        this.B = 1;
        View findViewById = viewGroup.findViewById(R.id.channel_navigation_container);
        akbdVar.b(findViewById, akbdVar.a(findViewById, null));
    }

    private final int i(boolean z) {
        aswb aswbVar = this.x.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        if ((aswbVar.f & 16384) == 0) {
            return z ? 4 : 2;
        }
        aswb aswbVar2 = this.x.a().e;
        if (aswbVar2 == null) {
            aswbVar2 = aswb.a;
        }
        int i = aswbVar2.ax;
        return z ? Math.max(i, 4) : i;
    }

    private final Space j() {
        Space space = new Space(this.m);
        FlexboxLayout.LayoutParams layoutParams = new FlexboxLayout.LayoutParams(this.m.getResources().getDimensionPixelSize(R.dimen.under_title_standalone_badge_space_size));
        layoutParams.q();
        space.setLayoutParams(layoutParams);
        return space;
    }

    private final void k() {
        acra acraVar = this.j.a;
        if (this.l.f) {
            acraVar.u(new acqx(acsb.c(31562)), null);
            acraVar.q(new acqx(acsb.c(31572)), null);
        } else {
            acraVar.u(new acqx(acsb.c(31572)), null);
            acraVar.q(new acqx(acsb.c(31562)), null);
        }
    }

    private final void l() {
        int i;
        amru r;
        auwc auwcVar = (auwc) this.k;
        LayoutInflater from = LayoutInflater.from(this.m);
        int childCount = this.r.getChildCount();
        int i2 = this.z;
        if (childCount > i2) {
            this.r.removeViews(i2, childCount - i2);
        }
        SlimVideoBadgeAndSubtitleFlexboxLayout slimVideoBadgeAndSubtitleFlexboxLayout = this.r;
        if (this.l.f) {
            i = -1;
        } else {
            aswb aswbVar = this.x.a().e;
            if (aswbVar == null) {
                aswbVar = aswb.a;
            }
            if ((aswbVar.f & 16777216) != 0) {
                aswb aswbVar2 = this.x.a().e;
                if (aswbVar2 == null) {
                    aswbVar2 = aswb.a;
                }
                i = aswbVar2.aA;
            } else {
                i = 1;
            }
        }
        if (slimVideoBadgeAndSubtitleFlexboxLayout.a != i) {
            slimVideoBadgeAndSubtitleFlexboxLayout.a = i;
            slimVideoBadgeAndSubtitleFlexboxLayout.requestLayout();
        }
        apkd apkdVar = auwcVar.g;
        if (apkdVar == null) {
            apkdVar = apkd.a;
        }
        if ((apkdVar.b & 2) != 0) {
            View inflate = from.inflate(R.layout.standalone_red_badge, (ViewGroup) this.r, false);
            c cVar = this.C;
            ajut ajutVar = (ajut) cVar.b.get();
            ajutVar.getClass();
            Context context = (Context) cVar.a.get();
            context.getClass();
            inflate.getClass();
            lab labVar = new lab(ajutVar, context, inflate);
            apkd apkdVar2 = auwcVar.g;
            if (apkdVar2 == null) {
                apkdVar2 = apkd.a;
            }
            apkf apkfVar = apkdVar2.d;
            if (apkfVar == null) {
                apkfVar = apkf.a;
            }
            labVar.a(apkfVar);
            this.r.addView(inflate);
            this.r.addView(j());
        } else {
            apkd apkdVar3 = auwcVar.g;
            if (apkdVar3 == null) {
                apkdVar3 = apkd.a;
            }
            if ((apkdVar3.b & 8) != 0) {
                View inflate2 = from.inflate(R.layout.metadata_badge, (ViewGroup) this.r, false);
                gaf I = this.E.I(this.m, inflate2);
                apkd apkdVar4 = auwcVar.g;
                if (apkdVar4 == null) {
                    apkdVar4 = apkd.a;
                }
                atdu atduVar = apkdVar4.f;
                if (atduVar == null) {
                    atduVar = atdu.a;
                }
                I.f(atduVar);
                this.r.addView(inflate2);
                this.r.addView(j());
            } else {
                apkd apkdVar5 = auwcVar.g;
                if (apkdVar5 == null) {
                    apkdVar5 = apkd.a;
                }
                if ((apkdVar5.b & 1) != 0) {
                    View inflate3 = from.inflate(R.layout.standalone_ypc_badge, (ViewGroup) this.r, false);
                    inflate3.getClass();
                    gag gagVar = new gag(inflate3, 1);
                    apkd apkdVar6 = auwcVar.g;
                    if (apkdVar6 == null) {
                        apkdVar6 = apkd.a;
                    }
                    apkh apkhVar = apkdVar6.c;
                    if (apkhVar == null) {
                        apkhVar = apkh.a;
                    }
                    gagVar.a(apkhVar);
                    this.r.addView(inflate3);
                    this.r.addView(j());
                }
            }
        }
        for (apjt apjtVar : auwcVar.h) {
            int i3 = apjtVar.b;
            if ((i3 & 1) != 0) {
                TextView textView = (TextView) from.inflate(R.layout.text_badge, (ViewGroup) this.r, false);
                apkj apkjVar = apjtVar.c;
                if (apkjVar == null) {
                    apkjVar = apkj.a;
                }
                aqyg aqygVar = apkjVar.b;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
                textView.setText(ajcq.b(aqygVar));
                this.r.addView(textView);
                this.r.addView(j());
            } else if ((i3 & 256) != 0) {
                ImageView imageView = (ImageView) from.inflate(R.layout.slim_privacy_badge, (ViewGroup) this.r, false);
                Context context2 = this.m;
                imageView.getClass();
                context2.getClass();
                msl mslVar = new msl(imageView, context2);
                apkc apkcVar = apjtVar.e;
                if (apkcVar == null) {
                    apkcVar = apkc.a;
                }
                mslVar.a(apkcVar);
                this.r.addView(imageView);
                this.r.addView(j());
            }
        }
        apkd apkdVar7 = auwcVar.g;
        if (apkdVar7 == null) {
            apkdVar7 = apkd.a;
        }
        if ((apkdVar7.b & 4) == 0) {
            if (this.b.getTouchDelegate() instanceof zeu) {
                this.b.setTouchDelegate(null);
            }
        } else {
            apkd apkdVar8 = auwcVar.g;
            if (apkdVar8 == null) {
                apkdVar8 = apkd.a;
            }
            apke apkeVar = apkdVar8.e;
            if (apkeVar == null) {
                apkeVar = apke.a;
            }
            if (apkeVar == null) {
                r = amru.q();
            } else {
                if ((apkeVar.b & 2) != 0) {
                    aqyg aqygVar2 = apkeVar.d;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                    if (aqygVar2 != null) {
                        Iterator it = aqygVar2.c.iterator();
                        int i4 = 0;
                        while (it.hasNext()) {
                            if ((((aqyi) it.next()).b & 512) != 0 && (i4 = i4 + 1) > 1) {
                                ArrayList arrayList = new ArrayList();
                                aone aoneVar = null;
                                aong aongVar = null;
                                int i5 = 0;
                                while (true) {
                                    aqyg aqygVar3 = apkeVar.d;
                                    if (aqygVar3 == null) {
                                        aqygVar3 = aqyg.a;
                                    }
                                    if (i5 >= aqygVar3.c.size()) {
                                        break;
                                    }
                                    aqyg aqygVar4 = apkeVar.d;
                                    if (aqygVar4 == null) {
                                        aqygVar4 = aqyg.a;
                                    }
                                    aqyi aqyiVar = (aqyi) aqygVar4.c.get(i5);
                                    if ((aqyiVar.b & 512) != 0) {
                                        if (aoneVar != null && aongVar != null) {
                                            aqyg aqygVar5 = (aqyg) aongVar.build();
                                            aoneVar.copyOnWrite();
                                            apke apkeVar2 = (apke) aoneVar.instance;
                                            aqygVar5.getClass();
                                            apkeVar2.d = aqygVar5;
                                            apkeVar2.b |= 2;
                                            arrayList.add((apke) aoneVar.build());
                                        }
                                        aoneVar = apke.a.createBuilder(apkeVar);
                                        aqyg aqygVar6 = apkeVar.d;
                                        if (aqygVar6 == null) {
                                            aqygVar6 = aqyg.a;
                                        }
                                        aongVar = (aong) aqyg.a.createBuilder(aqygVar6);
                                        aongVar.copyOnWrite();
                                        ((aqyg) aongVar.instance).c = aqyg.emptyProtobufList();
                                    }
                                    aongVar.ck(aqyiVar);
                                    i5++;
                                }
                                if (aoneVar != null && aongVar != null) {
                                    aqyg aqygVar7 = (aqyg) aongVar.build();
                                    aoneVar.copyOnWrite();
                                    apke apkeVar3 = (apke) aoneVar.instance;
                                    aqygVar7.getClass();
                                    apkeVar3.d = aqygVar7;
                                    apkeVar3.b |= 2;
                                    arrayList.add((apke) aoneVar.build());
                                }
                                r = amru.o(arrayList);
                            }
                        }
                    }
                }
                r = amru.r(apkeVar);
            }
            this.r.setPadding(0, 0, 0, this.f);
            int size = r.size();
            for (int i6 = 0; i6 < size; i6++) {
                apke apkeVar4 = (apke) r.get(i6);
                View inflate4 = LayoutInflater.from(this.m).inflate(R.layout.standalone_collection_badge, (ViewGroup) this.r, false);
                ((FlexboxLayout.LayoutParams) inflate4.getLayoutParams()).q();
                TextView textView2 = (TextView) inflate4.findViewById(R.id.collection_badge_icon);
                TextView textView3 = (TextView) inflate4.findViewById(R.id.collection_badge_label);
                textView2.setTextSize(0, this.p.getTextSize());
                textView3.setTextSize(0, this.p.getTextSize());
                akbd akbdVar = this.s;
                akbdVar.c(textView3, akbdVar.a(textView3, null));
                ajyw ajywVar = this.D;
                inflate4.getClass();
                Context context3 = (Context) ajywVar.c.get();
                context3.getClass();
                aahd aahdVar = (aahd) ajywVar.a.get();
                aahdVar.getClass();
                ajut ajutVar2 = (ajut) ajywVar.b.get();
                ajutVar2.getClass();
                final mvy mvyVar = new mvy(inflate4, context3, aahdVar, ajutVar2);
                mvyVar.f(apkeVar4, this.j.a);
                this.r.addView(inflate4);
                this.n.post(new Runnable() { // from class: njm
                    @Override // java.lang.Runnable
                    public final void run() {
                        View view;
                        njp njpVar = njp.this;
                        mvy mvyVar2 = mvyVar;
                        ViewGroup viewGroup = njpVar.b;
                        int i7 = njpVar.f;
                        if (mvyVar2.g() && mvyVar2.a.isLaidOut() && (view = mvyVar2.f) != null) {
                            Rect rect = new Rect();
                            mvyVar2.a.getHitRect(rect);
                            viewGroup.offsetDescendantRectToMyCoords(view, rect);
                            int i8 = -i7;
                            rect.inset(i8, i8);
                            TextView textView4 = mvyVar2.a;
                            zeu.b(viewGroup, textView4, new TouchDelegate(rect, textView4));
                        }
                    }
                });
            }
        }
        SlimVideoBadgeAndSubtitleFlexboxLayout slimVideoBadgeAndSubtitleFlexboxLayout2 = this.r;
        whu.I(slimVideoBadgeAndSubtitleFlexboxLayout2, slimVideoBadgeAndSubtitleFlexboxLayout2.getChildCount() > 0);
    }

    private final void n() {
        aqyg aqygVar;
        auwc auwcVar = (auwc) this.k;
        TextView textView = this.o;
        if ((auwcVar.b & 1) != 0) {
            aqygVar = auwcVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView.setText(aahk.a(aqygVar, this.a, false));
        this.o.setMaxLines(i(this.l.f));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.b;
    }

    @Override // defpackage.njq
    protected final void d() {
        ohw ohwVar = this.l;
        if (!ohwVar.g) {
            auwd auwdVar = ohwVar.c;
            if ((auwdVar.b & 2) != 0) {
                ohwVar.b.b(auwdVar.d, ohwVar);
                aahd aahdVar = ohwVar.a;
                apxf apxfVar = ohwVar.c.e;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                aahdVar.c(apxfVar, null);
                ohwVar.g = true;
            }
        }
        acra acraVar = this.j.a;
        auwc auwcVar = (auwc) this.k;
        acraVar.u(new acqx(auwcVar.i), null);
        acraVar.D(new acqx(acsb.c(31572)));
        acraVar.D(new acqx(acsb.c(31562)));
        aqyg aqygVar = auwcVar.c;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        adyu.cd(aqygVar, acraVar);
        if ((auwcVar.b & 512) != 0) {
            int bk = aobq.bk(auwcVar.k);
            this.B = bk != 0 ? bk : 1;
        } else {
            auwb auwbVar = auwcVar.m;
            if (auwbVar == null) {
                auwbVar = auwb.a;
            }
            if ((auwbVar.b & 1) != 0) {
                auwb auwbVar2 = auwcVar.m;
                if (auwbVar2 == null) {
                    auwbVar2 = auwb.a;
                }
                int bk2 = aobq.bk(auwbVar2.c);
                this.B = bk2 != 0 ? bk2 : 1;
            }
        }
        h();
        m();
        auwc auwcVar2 = (auwc) this.k;
        apkd apkdVar = auwcVar2.f;
        if (apkdVar == null) {
            apkdVar = apkd.a;
        }
        if ((apkdVar.b & 4) != 0) {
            aswb aswbVar = this.x.a().e;
            if (aswbVar == null) {
                aswbVar = aswb.a;
            }
            if (aswbVar.bj) {
                this.d.b = this.p.getTextSize();
            }
            mvy mvyVar = this.d;
            apkd apkdVar2 = auwcVar2.f;
            if (apkdVar2 == null) {
                apkdVar2 = apkd.a;
            }
            apke apkeVar = apkdVar2.e;
            if (apkeVar == null) {
                apkeVar = apke.a;
            }
            mvyVar.f(apkeVar, this.j.a);
            this.n.post(this.v);
        } else {
            this.d.a(null);
            this.b.setTouchDelegate(null);
        }
        l();
        apxf apxfVar2 = auwcVar.j;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        String k = oba.k((ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand) apxfVar2.pX(ToggleEngagementPanelCommandOuterClass$ToggleEngagementPanelCommand.toggleEngagementPanelCommand));
        this.h = k;
        if (k != null) {
            this.A = this.y.g().c.A(new ayrv() { // from class: njk
                @Override // defpackage.ayrv
                public final Object a(Object obj) {
                    aqts l;
                    njp njpVar = njp.this;
                    nqg nqgVar = (nqg) ((ammv) obj).f();
                    String str = njpVar.h;
                    boolean z = false;
                    if (str != null && nqgVar != null && (l = nqgVar.l()) != null) {
                        z = str.equals(oba.i(l));
                    }
                    return Boolean.valueOf(z);
                }
            }).n().X(new ayrs() { // from class: njj
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    njp njpVar = njp.this;
                    Boolean bool = (Boolean) obj;
                    if (bool.booleanValue() == njpVar.i) {
                        return;
                    }
                    njpVar.i = bool.booleanValue();
                    bwh.b(njpVar.b, njpVar.e);
                    njpVar.h();
                }
            });
        }
    }

    @Override // defpackage.njq
    protected final void e() {
        bwh.c(this.b);
        this.n.removeCallbacks(this.v);
        auwc auwcVar = (auwc) this.k;
        if (auwcVar != null) {
            auwb auwbVar = auwcVar.m;
            if (auwbVar == null) {
                auwbVar = auwb.a;
            }
            if ((auwbVar.b & 4) != 0) {
                akcp akcpVar = this.g;
                auwb auwbVar2 = auwcVar.m;
                if (auwbVar2 == null) {
                    auwbVar2 = auwb.a;
                }
                akcpVar.g(auwbVar2.e);
            }
        }
        this.h = null;
        Object obj = this.A;
        if (obj != null) {
            azqb.f((AtomicReference) obj);
            this.A = null;
        }
    }

    @Override // defpackage.njq, defpackage.ohu
    public final void oK() {
        bwh.b(this.b, this.e);
        h();
        m();
        l();
    }

    @Override // defpackage.njq, defpackage.ohu
    public final void oL() {
        m();
    }

    public final void h() {
        int i = this.B;
        aqyg aqygVar = null;
        if (i == 0) {
            throw null;
        }
        if (i == 3) {
            auwc auwcVar = (auwc) this.k;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            marginLayoutParams.setMarginEnd(this.m.getResources().getDimensionPixelSize(R.dimen.video_title_margin));
            this.o.setLayoutParams(marginLayoutParams);
            TextView textView = this.o;
            if ((1 & auwcVar.b) != 0 && (aqygVar = auwcVar.c) == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(aahk.a(aqygVar, this.a, false));
            this.o.setMaxLines(i(false));
            this.c.setVisibility(8);
        } else if (i == 4) {
            n();
            auwc auwcVar2 = (auwc) this.k;
            if ((auwcVar2.b & 1024) != 0) {
                ImageView imageView = this.c;
                ajut ajutVar = this.w;
                arfr b = arfr.b(auwcVar2.l);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                imageView.setImageResource(ajutVar.a(b));
            } else {
                auwb auwbVar = auwcVar2.m;
                if (auwbVar == null) {
                    auwbVar = auwb.a;
                }
                if ((auwbVar.b & 2) != 0) {
                    ImageView imageView2 = this.c;
                    ajut ajutVar2 = this.w;
                    auwb auwbVar2 = auwcVar2.m;
                    if (auwbVar2 == null) {
                        auwbVar2 = auwb.a;
                    }
                    arfr b2 = arfr.b(auwbVar2.d);
                    if (b2 == null) {
                        b2 = arfr.UNKNOWN;
                    }
                    imageView2.setImageResource(ajutVar2.a(b2));
                }
            }
            this.c.setContentDescription(this.l.f ? this.u : this.t);
            k();
        } else {
            n();
            boolean z = this.l.f || this.i;
            this.c.setRotation(true != z ? 360.0f : 180.0f);
            this.c.setContentDescription(z ? this.u : this.t);
            k();
        }
        final auwc auwcVar3 = (auwc) this.k;
        auwb auwbVar3 = auwcVar3.m;
        if (auwbVar3 == null) {
            auwbVar3 = auwb.a;
        }
        if ((auwbVar3.b & 4) != 0) {
            this.c.post(new Runnable() { // from class: njn
                @Override // java.lang.Runnable
                public final void run() {
                    njp njpVar = njp.this;
                    auwc auwcVar4 = auwcVar3;
                    akcp akcpVar = njpVar.g;
                    auwb auwbVar4 = auwcVar4.m;
                    if (auwbVar4 == null) {
                        auwbVar4 = auwb.a;
                    }
                    akcpVar.d(auwbVar4.e, njpVar.c);
                }
            });
        }
    }

    private final void m() {
        ohw ohwVar = this.l;
        if (ohwVar == null) {
            return;
        }
        awaq awaqVar = ohwVar.j;
        if (awaqVar != null) {
            if (!ohwVar.f && !ohwVar.g) {
                if ((awaqVar.b.b & 4) != 0) {
                    whu.G(this.p, ajcq.b(awaqVar.getShortViewCount()));
                    whu.I(this.q, false);
                    return;
                }
            } else if ((awaqVar.b.b & 2) != 0) {
                whu.G(this.q, ajcq.b(awaqVar.getViewCount()));
                whu.I(this.p, false);
                return;
            }
        }
        awaj awajVar = ohwVar.i;
        if (awajVar == null) {
            auwc auwcVar = (auwc) this.k;
            aqyg aqygVar = null;
            if (ohwVar.f || ohwVar.g) {
                TextView textView = this.q;
                if ((auwcVar.b & 4) != 0 && (aqygVar = auwcVar.e) == null) {
                    aqygVar = aqyg.a;
                }
                whu.G(textView, ajcq.b(aqygVar));
                whu.I(this.p, false);
                return;
            }
            TextView textView2 = this.p;
            if ((auwcVar.b & 2) != 0 && (aqygVar = auwcVar.d) == null) {
                aqygVar = aqyg.a;
            }
            whu.G(textView2, ajcq.b(aqygVar));
            whu.I(this.q, false);
            return;
        }
        TextView textView3 = this.q;
        aqyg aqygVar2 = awajVar.c;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView3, ajcq.b(aqygVar2));
        whu.I(this.p, false);
    }
}
