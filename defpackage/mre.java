package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.FixedAspectRatioFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mre extends ajpc implements ajof, ajdg {
    private final aadw A;
    private final ajun B;
    private final jgp C;
    public atnv a;
    private final Context b;
    private final TextView c;
    private final TextView d;
    private final ImageView e;
    private final ImageView f;
    private final FrameLayout g;
    private final ImageView h;
    private final ajjz i;
    private final FixedAspectRatioFrameLayout j;
    private final ajuw k;
    private final ajop l;
    private final aahd m;
    private final ajoi n;
    private final azrw o;
    private apxf p;
    private final ImageView q;
    private final FrameLayout r;
    private final ImageView s;
    private final aahv t;
    private final mrd u;
    private final ajdh v;
    private final int x;
    private frg y;
    private final int z;

    public mre(Context context, ajjz ajjzVar, final aahd aahdVar, gma gmaVar, ajuw ajuwVar, azrw azrwVar, jgp jgpVar, ajun ajunVar, aahv aahvVar, mrd mrdVar, ajdh ajdhVar, aadw aadwVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.b = context;
        this.i = ajjzVar;
        this.l = gmaVar;
        this.k = ajuwVar;
        this.m = aahdVar;
        this.o = azrwVar;
        this.C = jgpVar;
        this.B = ajunVar;
        this.t = aahvVar;
        this.u = mrdVar;
        this.v = ajdhVar;
        this.A = aadwVar;
        LinearLayout linearLayout = (LinearLayout) View.inflate(context, R.layout.notification_inbox_item, null);
        this.c = (TextView) linearLayout.findViewById(R.id.short_message);
        this.d = (TextView) linearLayout.findViewById(R.id.sent_time);
        this.e = (ImageView) linearLayout.findViewById(R.id.notification_thumbnail);
        this.f = (ImageView) linearLayout.findViewById(R.id.notification_video_thumbnail);
        this.j = (FixedAspectRatioFrameLayout) linearLayout.findViewById(R.id.notification_video_thumbnail_layout);
        this.g = (FrameLayout) linearLayout.findViewById(R.id.button);
        this.r = (FrameLayout) linearLayout.findViewById(R.id.contextual_menu_anchor_container);
        this.q = (ImageView) linearLayout.findViewById(R.id.contextual_menu_anchor);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.close_button);
        this.s = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: mrb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                apxf apxfVar;
                mre mreVar = mre.this;
                aahd aahdVar2 = aahdVar;
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.action.HideEnclosingAction.tag", mreVar.a);
                atnv atnvVar = mreVar.a;
                if (atnvVar.c == 24) {
                    apxfVar = (apxf) atnvVar.d;
                } else {
                    apxfVar = apxf.a;
                }
                aahdVar2.c(apxfVar, hashMap);
            }
        });
        this.h = (ImageView) linearLayout.findViewById(R.id.new_content_indicator);
        this.x = yjk.K(context.getResources().getDisplayMetrics(), 720);
        this.z = context.getResources().getDimensionPixelSize(R.dimen.notification_inbox_vertical_padding);
        gmaVar.c(linearLayout);
        this.n = new ajoi(aahdVar, gmaVar, this);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.l).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.n.c();
        this.g.removeAllViews();
        frg frgVar = this.y;
        if (frgVar != null) {
            frgVar.b(ajosVar);
        }
        this.v.d(this);
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ void d(ajok ajokVar, Object obj) {
        apxf apxfVar;
        aqyg aqygVar;
        atdf atdfVar;
        atdf atdfVar2;
        atdf atdfVar3;
        atdf atdfVar4;
        atdf atdfVar5;
        atdf atdfVar6;
        int i;
        atnv atnvVar = (atnv) obj;
        this.a = atnvVar;
        asvu asvuVar = this.A.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if (asvuVar.ch) {
            int K = yjk.K(this.b.getResources().getDisplayMetrics(), this.b.getResources().getConfiguration().screenWidthDp);
            int i2 = this.x;
            if (K > i2) {
                double d = K - i2;
                Double.isNaN(d);
                i = (int) (d / 2.0d);
            } else {
                i = 0;
            }
            View view = ((gma) this.l).b;
            int i3 = this.z;
            view.setPadding(i, i3, i, i3);
        }
        ajoi ajoiVar = this.n;
        acra acraVar = ajokVar.a;
        arej arejVar = null;
        if ((atnvVar.b & 64) != 0) {
            apxfVar = atnvVar.i;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        TextView textView = this.c;
        aqyg aqygVar2 = atnvVar.g;
        if (aqygVar2 == null) {
            aqygVar2 = aqyg.a;
        }
        whu.G(textView, ajcq.b(aqygVar2));
        TextView textView2 = this.d;
        if ((atnvVar.b & 32) != 0) {
            aqygVar = atnvVar.h;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        whu.G(textView2, ajcq.b(aqygVar));
        ajjz ajjzVar = this.i;
        ImageView imageView = this.f;
        avgg avggVar = atnvVar.f;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        avgg avggVar2 = atnvVar.f;
        if (avggVar2 == null) {
            avggVar2 = avgg.a;
        }
        boolean L = ahbw.L(avggVar2);
        whu.I(this.f, L);
        avgg avggVar3 = atnvVar.f;
        if (avggVar3 == null) {
            avggVar3 = avgg.a;
        }
        float A = ahbw.A(avggVar3);
        if (A != -1.0f) {
            this.j.a = A;
        }
        whu.I(this.j, L);
        ajjz ajjzVar2 = this.i;
        ImageView imageView2 = this.e;
        avgg avggVar4 = atnvVar.e;
        if (avggVar4 == null) {
            avggVar4 = avgg.a;
        }
        ajjzVar2.h(imageView2, avggVar4);
        ImageView imageView3 = this.e;
        avgg avggVar5 = atnvVar.e;
        if (avggVar5 == null) {
            avggVar5 = avgg.a;
        }
        imageView3.setVisibility(true != ahbw.L(avggVar5) ? 8 : 0);
        apxf apxfVar2 = atnvVar.j;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        this.p = apxfVar2;
        aahu c = this.t.c();
        int cc = anaf.cc(atnvVar.k);
        int i4 = 2;
        if (cc == 0 || cc != 2) {
            f();
            ((aaih) c).c().g(atnvVar.m);
        } else {
            c.f(jgs.b(atnvVar.m)).z(ayqr.a()).n(new ayrn() { // from class: mrc
                @Override // defpackage.ayrn
                public final void a(Object obj2, Object obj3) {
                    mre mreVar = mre.this;
                    aakt aaktVar = (aakt) obj2;
                    if (aaktVar == null) {
                        mreVar.g();
                    } else if (!(aaktVar instanceof jgs) || !((jgs) aaktVar).b) {
                        mreVar.f();
                    } else {
                        mreVar.g();
                    }
                }
            }).T();
        }
        this.s.setVisibility(8);
        this.q.setVisibility(4);
        int i5 = atnvVar.c;
        if (i5 == 0) {
            i4 = 3;
        } else if (i5 == 11) {
            i4 = 1;
        } else if (i5 != 24) {
            i4 = 0;
        }
        int i6 = i4 - 1;
        if (i4 != 0) {
            if (i6 == 0) {
                if (i5 == 11) {
                    atdfVar = (atdf) atnvVar.d;
                } else {
                    atdfVar = atdf.a;
                }
                if ((atdfVar.b & 1) != 0) {
                    if (atnvVar.c == 11) {
                        atdfVar2 = (atdf) atnvVar.d;
                    } else {
                        atdfVar2 = atdf.a;
                    }
                    atdc atdcVar = atdfVar2.c;
                    if (atdcVar == null) {
                        atdcVar = atdc.a;
                    }
                    if (atdcVar.f) {
                        if (this.u.a.get(atnvVar.m) != null) {
                            aone builder = atdcVar.toBuilder();
                            builder.copyOnWrite();
                            atdc atdcVar2 = (atdc) builder.instance;
                            atdcVar2.b |= 16;
                            atdcVar2.f = false;
                            atdcVar = (atdc) builder.build();
                        } else {
                            this.u.a.put(atnvVar.m, true);
                        }
                    }
                    this.k.e(this.r, this.q, atdcVar, atnvVar, ajokVar.a);
                }
            } else if (i6 == 1) {
                this.q.setVisibility(8);
                this.s.setVisibility(0);
            }
            aulq aulqVar = atnvVar.n;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                aulq aulqVar2 = atnvVar.n;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                apmg apmgVar = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
                if (this.y == null) {
                    this.y = this.C.e(null, null, R.layout.wide_button);
                }
                this.y.oB(ajokVar, apmgVar);
                this.g.removeAllViews();
                this.g.addView(this.y.b);
                this.g.setVisibility(0);
            } else {
                this.g.setVisibility(8);
            }
            if (ajokVar.b("position", -1) == 1) {
                if (atnvVar.c == 11) {
                    atdfVar3 = (atdf) atnvVar.d;
                } else {
                    atdfVar3 = atdf.a;
                }
                atdc atdcVar3 = atdfVar3.c;
                if (atdcVar3 == null) {
                    atdcVar3 = atdc.a;
                }
                if (!atdcVar3.f) {
                    akbu akbuVar = (akbu) this.o.get();
                    if (atnvVar.c == 11) {
                        atdfVar4 = (atdf) atnvVar.d;
                    } else {
                        atdfVar4 = atdf.a;
                    }
                    atdc atdcVar4 = atdfVar4.c;
                    if (atdcVar4 == null) {
                        atdcVar4 = atdc.a;
                    }
                    atcy atcyVar = atdcVar4.h;
                    if (atcyVar == null) {
                        atcyVar = atcy.a;
                    }
                    if (atcyVar.b == 102716411) {
                        if (atnvVar.c == 11) {
                            atdfVar6 = (atdf) atnvVar.d;
                        } else {
                            atdfVar6 = atdf.a;
                        }
                        atdc atdcVar5 = atdfVar6.c;
                        if (atdcVar5 == null) {
                            atdcVar5 = atdc.a;
                        }
                        atcy atcyVar2 = atdcVar5.h;
                        if (atcyVar2 == null) {
                            atcyVar2 = atcy.a;
                        }
                        if (atcyVar2.b == 102716411) {
                            arejVar = (arej) atcyVar2.c;
                        } else {
                            arejVar = arej.a;
                        }
                    }
                    ImageView imageView4 = this.q;
                    if (atnvVar.c == 11) {
                        atdfVar5 = (atdf) atnvVar.d;
                    } else {
                        atdfVar5 = atdf.a;
                    }
                    atdc atdcVar6 = atdfVar5.c;
                    if (atdcVar6 == null) {
                        atdcVar6 = atdc.a;
                    }
                    akbuVar.b(arejVar, imageView4, atdcVar6, ajokVar.a);
                }
            }
            if ((atnvVar.b & 2097152) != 0 && !this.B.m(atnvVar)) {
                this.B.l(atnvVar);
                aahd aahdVar = this.m;
                apxf apxfVar3 = atnvVar.o;
                if (apxfVar3 == null) {
                    apxfVar3 = apxf.a;
                }
                aahdVar.a(apxfVar3);
            }
            this.v.a(this);
            this.l.e(ajokVar);
            return;
        }
        throw null;
    }

    @Override // defpackage.ajpc
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atnv) obj).l.I();
    }

    public final void f() {
        this.h.setVisibility(4);
    }

    public final void g() {
        this.h.setVisibility(0);
    }

    @Override // defpackage.ajof
    public final boolean h(View view) {
        apxf apxfVar = this.p;
        if (apxfVar != null) {
            this.m.c(apxfVar, null);
        }
        this.h.setVisibility(4);
        if (this.a != null) {
            aaio c = ((aaih) this.t.c()).c();
            String b = jgs.b(this.a.m);
            jgr jgrVar = new jgr();
            jgrVar.c(b);
            jgrVar.d(false);
            c.d(jgrVar.b());
            c.b();
        }
        return false;
    }

    @Override // defpackage.ajdg
    public final void lP() {
        this.k.h();
    }
}
