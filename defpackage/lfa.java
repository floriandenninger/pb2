package defpackage;

import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lfa extends mlc {
    private final ajuw C;
    private final ajoi D;
    private final View E;
    private final ViewStub F;
    private lad G;
    private final lez H;
    private int I;

    /* renamed from: J, reason: collision with root package name */
    private jru f233J;
    private avwg K;
    private final ohg L;
    protected final ajop a;
    protected final LinearLayout b;
    protected int c;
    public final lez d;
    public final lez e;
    public boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public lfa(android.content.Context r19, defpackage.ajjz r20, defpackage.aahd r21, defpackage.ajuw r22, defpackage.ohg r23, defpackage.ajoy r24, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c r25, defpackage.amnv r26, android.view.ViewGroup r27, byte[] r28, byte[] r29, byte[] r30, byte[] r31, byte[] r32, byte[] r33) {
        /*
            r18 = this;
            r15 = r18
            java.lang.Object r0 = r26.get()
            r14 = r0
            ajop r14 = (defpackage.ajop) r14
            r5 = 2131625601(0x7f0e0681, float:1.8878415E38)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r17 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r14
            r6 = r27
            r7 = r23
            r8 = r24
            r9 = r25
            r20 = r14
            r14 = r16
            r15 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r20.getClass()
            r1 = r20
            r0.a = r1
            r2 = r22
            r0.C = r2
            ajoi r2 = new ajoi
            r2.<init>(r3, r1)
            r0.D = r2
            r1 = r23
            r0.L = r1
            android.view.View r1 = r0.i
            android.content.res.Resources r2 = r19.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.getLayoutDirection()
            r1.setLayoutDirection(r2)
            r2 = 2131431982(0x7f0b122e, float:1.8485709E38)
            android.view.View r2 = r1.findViewById(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r0.b = r2
            r3 = 2131431701(0x7f0b1115, float:1.8485139E38)
            android.view.View r2 = r2.findViewById(r3)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            lev r2 = new lev
            r2.<init>()
            r3 = 2131429928(0x7f0b0a28, float:1.8481543E38)
            r1.setTag(r3, r2)
            lew r2 = new lew
            r2.<init>()
            defpackage.jw.M(r1, r2)
            r2 = 2131428569(0x7f0b04d9, float:1.8478786E38)
            android.view.View r2 = r1.findViewById(r2)
            r0.E = r2
            lez r2 = new lez
            r3 = 2131432107(0x7f0b12ab, float:1.8485962E38)
            r2.<init>(r3, r1)
            r0.H = r2
            lez r2 = new lez
            r3 = 2131427684(0x7f0b0164, float:1.8476991E38)
            r2.<init>(r3, r1)
            r0.d = r2
            lez r2 = new lez
            r3 = 2131428567(0x7f0b04d7, float:1.8478782E38)
            r2.<init>(r3, r1)
            r0.e = r2
            r2 = 2131429915(0x7f0b0a1b, float:1.8481516E38)
            android.view.View r1 = r1.findViewById(r2)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0.F = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lfa.<init>(android.content.Context, ajjz, aahd, ajuw, ohg, ajoy, com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c, amnv, android.view.ViewGroup, byte[], byte[], byte[], byte[], byte[], byte[]):void");
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a.a();
    }

    @Override // defpackage.mlc, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.K = null;
        jru jruVar = this.f233J;
        if (jruVar != null) {
            jruVar.a();
        }
        this.D.c();
    }

    @Override // defpackage.ajom
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, avwg avwgVar) {
        apxf apxfVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        atdc atdcVar;
        apkh apkhVar;
        apkf apkfVar;
        atdu atduVar;
        apke apkeVar;
        int Z;
        this.K = avwgVar;
        ajoi ajoiVar = this.D;
        acra acraVar = ajokVar.a;
        if ((avwgVar.b & 64) != 0) {
            apxfVar = avwgVar.h;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.b(acraVar, apxfVar, ajokVar.e(), this);
        ajokVar.a.u(new acqx(avwgVar.s), null);
        ajok ajokVar2 = new ajok(ajokVar);
        ajokVar2.b = avwgVar.s.I();
        if ((avwgVar.b & 4) != 0) {
            aqygVar = avwgVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        A(ajcq.b(aqygVar));
        aqyg aqygVar3 = avwgVar.e;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        Spanned b = ajcq.b(aqygVar3);
        if (TextUtils.isEmpty(b)) {
            this.f = false;
            this.d.b();
        } else {
            this.f = true;
            this.d.a(b, R.id.author);
        }
        aqyg aqygVar4 = avwgVar.f;
        if (aqygVar4 == null) {
            aqygVar4 = aqyg.a;
        }
        Spanned b2 = ajcq.b(aqygVar4);
        apkd apkdVar = avwgVar.k;
        if (apkdVar == null) {
            apkdVar = apkd.a;
        }
        int i = apkdVar.b & 2;
        avwh avwhVar = avwgVar.q;
        if (avwhVar == null) {
            avwhVar = avwh.a;
        }
        if (i != 0 || TextUtils.isEmpty(b2)) {
            this.e.b();
        } else {
            if (avwhVar != null && (Z = awxr.Z(avwhVar.b)) != 0 && Z == 3) {
                TextView textView = (TextView) a().findViewById(R.id.title);
                textView.getViewTreeObserver().addOnPreDrawListener(new ley(this, textView));
            }
            this.e.a(b2, R.id.details);
        }
        aqyg aqygVar5 = avwgVar.g;
        if (aqygVar5 == null) {
            aqygVar5 = aqyg.a;
        }
        Spanned b3 = ajcq.b(aqygVar5);
        if ((avwgVar.b & 32) != 0) {
            aqygVar2 = avwgVar.g;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        CharSequence i2 = ajcq.i(aqygVar2);
        aony aonyVar = avwgVar.o;
        avrx avrxVar = avwgVar.m;
        if (avrxVar == null) {
            avrxVar = avrx.a;
        }
        p(b3, i2, aonyVar, avrxVar);
        avgg avggVar = avwgVar.c;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        y(avggVar);
        avfv[] avfvVarArr = (avfv[]) avwgVar.o.toArray(new avfv[0]);
        avft avftVar = (avft) mcy.Q(avfvVarArr, laf.c);
        avfk avfkVar = (avfk) mcy.Q(avfvVarArr, laf.b);
        String str = null;
        for (avfv avfvVar : avfvVarArr) {
            if ((avfvVar.b & 8) != 0) {
                avfw avfwVar = avfvVar.e;
                if (avfwVar == null) {
                    avfwVar = avfw.a;
                }
                str = avfwVar.b;
            }
        }
        View view = this.E;
        if (view != null) {
            if (avfkVar == null || avfkVar.b != 1) {
                view.setVisibility(8);
            } else {
                if (this.G == null) {
                    this.G = new lad((ViewStub) view);
                }
                lad ladVar = this.G;
                Spanned b4 = ajcq.b(avfkVar.b == 1 ? (aqyg) avfkVar.c : aqyg.a);
                if (TextUtils.isEmpty(b4)) {
                    ladVar.a.setVisibility(8);
                } else {
                    if (!ladVar.b) {
                        ladVar.c = (TextView) ladVar.a.inflate().findViewById(R.id.text);
                        ladVar.b = true;
                    }
                    ladVar.c.setText(b4);
                    ladVar.a.setVisibility(0);
                    ladVar.c.setVisibility(0);
                }
            }
        }
        t(avftVar);
        if (str != null) {
            this.H.a(str, R.id.watched);
        } else {
            this.H.b();
        }
        acra acraVar2 = ajokVar2.a;
        ajuw ajuwVar = this.C;
        View a = this.a.a();
        View view2 = this.y;
        atdf atdfVar = avwgVar.p;
        if (atdfVar == null) {
            atdfVar = atdf.a;
        }
        if ((atdfVar.b & 1) != 0) {
            atdf atdfVar2 = avwgVar.p;
            if (atdfVar2 == null) {
                atdfVar2 = atdf.a;
            }
            atdcVar = atdfVar2.c;
            if (atdcVar == null) {
                atdcVar = atdc.a;
            }
        } else {
            atdcVar = null;
        }
        ajuwVar.e(a, view2, atdcVar, avwgVar, acraVar2);
        if ((avwgVar.b & 1024) != 0) {
            apkd apkdVar2 = avwgVar.j;
            if (apkdVar2 == null) {
                apkdVar2 = apkd.a;
            }
            apkhVar = apkdVar2.c;
            if (apkhVar == null) {
                apkhVar = apkh.a;
            }
        } else {
            apkhVar = null;
        }
        w(apkhVar);
        if ((avwgVar.b & 2048) != 0) {
            apkd apkdVar3 = avwgVar.k;
            if (apkdVar3 == null) {
                apkdVar3 = apkd.a;
            }
            apkfVar = apkdVar3.d;
            if (apkfVar == null) {
                apkfVar = apkf.a;
            }
        } else {
            apkfVar = null;
        }
        v(apkfVar);
        if ((avwgVar.b & 2048) != 0) {
            apkd apkdVar4 = avwgVar.k;
            if (apkdVar4 == null) {
                apkdVar4 = apkd.a;
            }
            atduVar = apkdVar4.f;
            if (atduVar == null) {
                atduVar = atdu.a;
            }
        } else {
            atduVar = null;
        }
        r(atduVar);
        if ((avwgVar.b & 512) != 0) {
            apkd apkdVar5 = avwgVar.i;
            if (apkdVar5 == null) {
                apkdVar5 = apkd.a;
            }
            apkeVar = apkdVar5.e;
            if (apkeVar == null) {
                apkeVar = apke.a;
            }
        } else {
            apkeVar = null;
        }
        u(apkeVar);
        avwi avwiVar = avwgVar.r;
        if (avwiVar == null) {
            avwiVar = avwi.a;
        }
        if ((avwiVar.b & 1) != 0) {
            avwi avwiVar2 = avwgVar.r;
            if (avwiVar2 == null) {
                avwiVar2 = avwi.a;
            }
            B(ajokVar, avwiVar2);
            ViewStub viewStub = this.F;
            if (viewStub != null) {
                if ((this.K.b & 8) != 0) {
                    super.s(ajokVar, null);
                } else {
                    if (this.f233J == null) {
                        this.f233J = this.L.b(viewStub, null);
                    }
                    this.f233J.b(ajokVar);
                }
            }
        }
        avwh avwhVar2 = avwgVar.q;
        if (avwhVar2 == null) {
            avwhVar2 = avwh.a;
        }
        int Z2 = awxr.Z(avwhVar2.b);
        if (Z2 != 0 && Z2 == 3) {
            int dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.preview_card_video_card_width);
            this.I = dimensionPixelSize;
            this.I = dimensionPixelSize + this.i.getPaddingLeft() + this.i.getPaddingRight();
            this.z = this.g.getResources().getInteger(R.integer.preview_card_video_card_title_max_lines);
            this.c = this.g.getResources().getInteger(R.integer.preview_card_video_description_row_number);
            ((ViewGroup.MarginLayoutParams) this.y.getLayoutParams()).setMarginStart(this.g.getResources().getDimensionPixelSize(R.dimen.preview_card_video_card_menu_start_margin));
            this.j.setMaxLines(this.z);
            ((ViewGroup.MarginLayoutParams) this.j.getLayoutParams()).setMarginEnd(this.g.getResources().getDimensionPixelSize(R.dimen.preview_card_video_card_margin));
            this.i.getViewTreeObserver().addOnGlobalLayoutListener(new lex(this, avwgVar));
        } else {
            avwh avwhVar3 = avwgVar.q;
            if (avwhVar3 == null) {
                avwhVar3 = avwh.a;
            }
            int Z3 = awxr.Z(avwhVar3.b);
            if (Z3 != 0 && Z3 == 4) {
                TypedValue typedValue = new TypedValue();
                this.g.getResources().getValue(R.dimen.big_video_card_width_percent, typedValue, true);
                this.I = (int) (yjk.N(this.g) * typedValue.getFloat());
                int integer = this.g.getResources().getInteger(R.integer.video_card_title_max_lines);
                this.z = integer;
                this.j.setMaxLines(integer);
            } else {
                int dimensionPixelSize2 = this.g.getResources().getDimensionPixelSize(R.dimen.video_card_width);
                this.I = dimensionPixelSize2;
                this.I = dimensionPixelSize2 + this.i.getPaddingLeft() + this.i.getPaddingRight();
                int integer2 = this.g.getResources().getInteger(R.integer.video_card_title_max_lines);
                this.z = integer2;
                this.j.setMaxLines(integer2);
            }
        }
        yny.z(a(), yny.x(this.I), ViewGroup.LayoutParams.class);
        this.a.e(ajokVar2);
    }
}
