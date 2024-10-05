package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView;
import com.google.android.libraries.youtube.livecreation.ui.view.StreamStatusView;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import com.google.protos.youtube.api.innertube.LiveChatEndpointOuterClass$LiveChatEndpoint;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acif extends achg implements View.OnClickListener, achq, ackq, abvc, abuy, abwu, abwx, abwt, abwr, abtl {
    public static final SwipeDismissBehavior a = new acic();
    public int aA;
    public atgf aB;
    public boolean aC;
    public boolean aD;
    boolean aF;
    public boolean aG;
    public Runnable aH;
    public agcm aI;
    public abwl aJ;
    public axze aK;
    private View aL;
    private TextView aM;
    private View aN;
    private StreamStatusView aO;
    private Button aP;
    private ImageButton aQ;
    private byte[] aR;
    private LinearLayout aS;
    private ackt aT;
    private allo aU;
    private int aV;
    private NetworkOperationView aW;
    private TextView aX;
    private LinearLayout aY;
    private View aZ;
    public aseb ae;
    public acfh af;
    public aksl ag;
    public abwz ah;
    public akch ai;
    public shf aj;
    public ajdw ak;
    public afsy al;
    public aahv am;
    public View an;
    public ViewGroup ao;
    public TextView ap;
    public WaitingIndicatorView aq;
    public TextView ar;
    public ImageView as;
    public ImageView at;
    acht au;
    public View av;
    public ChooseFilterView aw;
    public abwy ax;
    public boolean ay;
    public boolean az;
    public aahd b;
    private TextView ba;
    private Chronometer bb;
    private TextView bc;
    private aakv bd;
    private String be;
    private boolean bf;
    private aqrf bg;
    private String bh;
    private String bi;
    private String bj;
    private String bk;
    private boolean bl;
    private boolean bm;
    private String bo;
    private boolean bp;
    private boolean bq;
    public acra c;
    public Handler d;
    public acih e;
    private abww bn = abww.GOOD;
    public boolean aE = true;

    public static acif aH(String str, boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, String str2, String str3, atgf atgfVar, long j, long j2) {
        zhq.m(str);
        acif acifVar = new acif();
        Bundle bundle = new Bundle();
        bundle.putString("ARG_VIDEO_ID", str);
        bundle.putBoolean("ARG_IS_MIC_SUPPORTED", z);
        bundle.putBoolean("ARG_IS_MIC_ENABLED", z2);
        bundle.putInt("ARG_CAMERA_COUNT", i);
        bundle.putBoolean("ARG_LIVE_STREAM_IS_PORTRAIT", z3);
        bundle.putBoolean("ARG_DID_START_BROADCAST", z4);
        bundle.putBoolean("ARG_IS_COSTREAM", z5);
        bundle.putString("ARG_STREAM_URL", str2);
        bundle.putString("ARG_STREAM_KEY", str3);
        if (atgfVar != null) {
            amkq.cn(bundle, "ARG_STREAM_RENDERER", atgfVar);
        }
        bundle.putLong("ARG_TIMER_START_STREAM", j);
        bundle.putLong("ARG_TIMER_DURATION_STREAM", j2);
        acifVar.af(bundle);
        return acifVar;
    }

    private final void aP() {
        aQ();
        this.an.setAlpha(0.0f);
        this.aW.setVisibility(8);
    }

    private final void aQ() {
        this.aq.c();
        this.aN.setVisibility(8);
    }

    private final void aR(boolean z) {
        if (z) {
            C().getWindow().addFlags(128);
        } else {
            C().getWindow().clearFlags(128);
        }
    }

    private final void aS(CharSequence charSequence) {
        TextView textView = this.ar;
        if (textView != null) {
            textView.setText(charSequence);
            this.ar.post(new acia(this, 1));
            aU(this.aU);
        }
    }

    private final void aT(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.aY.setContentDescription(qX().getString(R.string.lc_stream_status_cd, str, str2));
    }

    private static void aU(allo alloVar) {
        if (alloVar != null) {
            allj alljVar = alloVar.f;
            alljVar.getViewTreeObserver().addOnGlobalLayoutListener(new acie(alljVar));
            alloVar.h();
        }
    }

    private final void aV() {
        if (this.aN.isShown()) {
            return;
        }
        this.aq.a();
        this.aN.setVisibility(0);
    }

    private final void aW(int i) {
        this.aX.setText(i);
        aV();
        this.an.setAlpha(0.0f);
        this.aW.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aX() {
        /*
            r7 = this;
            ci r0 = r7.C()
            if (r0 == 0) goto L60
            abww r1 = r7.bn
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3c
            int r1 = r1.ordinal()
            if (r1 == r3) goto L21
            r4 = 2
            if (r1 == r4) goto L19
            int r1 = r7.aV
            r4 = 0
            goto L29
        L19:
            r1 = 2131100435(0x7f060313, float:1.7813251E38)
            int r1 = defpackage.aih.d(r0, r1)
            goto L28
        L21:
            r1 = 2131100460(0x7f06032c, float:1.7813302E38)
            int r1 = defpackage.aih.d(r0, r1)
        L28:
            r4 = 1
        L29:
            android.view.Window r5 = r0.getWindow()
            r5.setStatusBarColor(r1)
            com.google.android.libraries.youtube.livecreation.ui.view.StreamStatusView r1 = r7.aO
            if (r1 == 0) goto L3d
            abww r5 = r7.bn
            java.lang.String r6 = r7.bo
            r1.c(r5, r6)
            goto L3d
        L3c:
            r4 = 0
        L3d:
            boolean r1 = r7.bm
            android.view.Window r0 = r0.getWindow()
            r5 = 134217728(0x8000000, float:3.85186E-34)
            if (r1 == 0) goto L56
            if (r3 == r4) goto L4e
            r1 = 5894(0x1706, float:8.259E-42)
            r2 = 5894(0x1706, float:8.259E-42)
            goto L52
        L4e:
            r1 = 5890(0x1702, float:8.254E-42)
            r2 = 5890(0x1702, float:8.254E-42)
        L52:
            r0.addFlags(r5)
            goto L59
        L56:
            r0.clearFlags(r5)
        L59:
            android.view.View r0 = r0.getDecorView()
            r0.setSystemUiVisibility(r2)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acif.aX():void");
    }

    private final void aY(atgf atgfVar) {
        if (atgfVar == null) {
            return;
        }
        if ((atgfVar.b & 16) != 0) {
            apxf apxfVar = atgfVar.f;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            if (apxfVar.pY(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint) && (((LiveChatEndpointOuterClass$LiveChatEndpoint) apxfVar.pX(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint)).b & 2) != 0) {
                asrc asrcVar = ((LiveChatEndpointOuterClass$LiveChatEndpoint) apxfVar.pX(LiveChatEndpointOuterClass$LiveChatEndpoint.liveChatEndpoint)).d;
                if (asrcVar == null) {
                    asrcVar = asrc.a;
                }
                a(asrcVar);
            } else {
                apxf apxfVar2 = atgfVar.f;
                if (apxfVar2 == null) {
                    apxfVar2 = apxf.a;
                }
                b(apxfVar2);
            }
        }
        if ((atgfVar.b & 1) != 0) {
            TextView textView = this.ap;
            aqyg aqygVar = atgfVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
        }
        atgd atgdVar = atgfVar.d;
        if (atgdVar == null) {
            atgdVar = atgd.a;
        }
        if (atgdVar.b == 65153809) {
            apmg apmgVar = (apmg) atgdVar.c;
            this.aR = apmgVar.t.I();
            this.c.D(new acqx(this.aR));
            if ((apmgVar.b & 32) != 0) {
                arfs arfsVar = apmgVar.g;
                if (arfsVar == null) {
                    arfsVar = arfs.a;
                }
                arfr b = arfr.b(arfsVar.c);
                if (b == null) {
                    b = arfr.UNKNOWN;
                }
                if (b != arfr.UNKNOWN) {
                    ImageButton imageButton = this.aQ;
                    arfs arfsVar2 = apmgVar.g;
                    if (arfsVar2 == null) {
                        arfsVar2 = arfs.a;
                    }
                    arfr b2 = arfr.b(arfsVar2.c);
                    if (b2 == null) {
                        b2 = arfr.UNKNOWN;
                    }
                    StateListDrawable stateListDrawable = new StateListDrawable();
                    int[] iArr = {-16842910};
                    int[] iArr2 = new int[0];
                    int a2 = this.af.a(b2);
                    if (a2 != 0) {
                        Drawable a3 = aii.a(qR(), a2);
                        a3.setAlpha(qX().getInteger(R.integer.lc_close_icon_inactive_alpha));
                        stateListDrawable.addState(iArr, a3);
                        Drawable a4 = aii.a(qR(), a2);
                        a4.setAlpha(qX().getInteger(R.integer.lc_close_icon_active_alpha));
                        stateListDrawable.addState(iArr2, a4);
                    }
                    imageButton.setImageDrawable(stateListDrawable);
                    this.aQ.setVisibility(0);
                    if ((apmgVar.b & 65536) != 0) {
                        ImageButton imageButton2 = this.aQ;
                        aots aotsVar = apmgVar.r;
                        if (aotsVar == null) {
                            aotsVar = aots.a;
                        }
                        imageButton2.setContentDescription(aotsVar.c);
                    }
                }
            }
            if ((apmgVar.b & 256) != 0) {
                Button button = this.aP;
                aqyg aqygVar2 = apmgVar.i;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
                button.setText(ajcq.b(aqygVar2));
                this.aP.setVisibility(0);
            }
        }
        atgj atgjVar = atgfVar.e;
        if (atgjVar == null) {
            atgjVar = atgj.a;
        }
        atgi atgiVar = atgjVar.b;
        if (atgiVar == null) {
            atgiVar = atgi.a;
        }
        if (atgiVar.b.size() != 0) {
            Context qR = qR();
            atgj atgjVar2 = atgfVar.e;
            if (atgjVar2 == null) {
                atgjVar2 = atgj.a;
            }
            atgi atgiVar2 = atgjVar2.b;
            if (atgiVar2 == null) {
                atgiVar2 = atgi.a;
            }
            this.aT = new ackt(qR, this, atgiVar2, this.aS, this.af, this.b, this.c);
        }
        if (atgfVar.g.size() <= 1 || !((aulq) atgfVar.g.get(1)).pY(ElementRendererOuterClass.elementRenderer)) {
            return;
        }
        this.bg = (aqrf) ((aulq) atgfVar.g.get(1)).pX(ElementRendererOuterClass.elementRenderer);
        aO(astk.LIVESTREAM_CONNECTION_STATE_NEVER_CONNECTED);
        aM();
    }

    @Override // defpackage.abwu
    public final void A(abwl abwlVar) {
        this.aJ = abwlVar;
        aQ();
        this.an.setAlpha(0.0f);
        this.aG = false;
        this.aL.setVisibility(8);
        this.aM.setVisibility(8);
        this.aW.setVisibility(0);
        this.e.N(true);
    }

    @Override // defpackage.ce
    public final void S(Bundle bundle) {
        super.S(bundle);
        this.e.R(this.ax.j.a());
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        this.bq = false;
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        aX();
        if (this.ap.getVisibility() == 0) {
            this.ap.setVisibility(8);
        }
    }

    @Override // defpackage.abvc
    public final void a(asrc asrcVar) {
        c(true);
        acht achtVar = this.au;
        achtVar.ao = asrcVar;
        achtVar.an = null;
        if (achtVar.at()) {
            achtVar.a.p();
            achtVar.o();
        }
    }

    public final void aI() {
        this.bp = false;
        aL(true);
        aR(true);
    }

    public final void aJ() {
        if (this.bp) {
            return;
        }
        final int i = 1;
        this.bp = true;
        mh mhVar = new mh(C(), 2132083833);
        mhVar.f(R.string.lc_confirm_stop_streaming);
        mhVar.k(android.R.string.ok, new DialogInterface.OnClickListener(this) { // from class: achw
            public final /* synthetic */ acif a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                if (i != 0) {
                    this.a.ax.s(false);
                } else {
                    this.a.aI();
                }
            }
        });
        final int i2 = 0;
        mhVar.h(android.R.string.cancel, new DialogInterface.OnClickListener(this) { // from class: achw
            public final /* synthetic */ acif a;

            {
                this.a = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i22) {
                if (i2 != 0) {
                    this.a.ax.s(false);
                } else {
                    this.a.aI();
                }
            }
        });
        mhVar.j(new DialogInterface.OnCancelListener() { // from class: achu
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                acif.this.aI();
            }
        });
        mhVar.q();
    }

    public final void aK(final boolean z, final int i) {
        if (this.an.isShown()) {
            this.aH = new Runnable() { // from class: achv
                @Override // java.lang.Runnable
                public final void run() {
                    acif.this.aK(z, i);
                }
            };
            if (this.aG) {
                if (z != this.bf || acfm.c(C())) {
                    this.aL.setVisibility(8);
                    this.aM.setVisibility(8);
                    return;
                }
                int rotation = C().getWindowManager().getDefaultDisplay().getRotation();
                int i2 = zas.b;
                int i3 = i != -1 ? i * 90 : -1;
                int i4 = ((4 - rotation) % 4) * 90;
                this.aM.setCompoundDrawablesRelativeWithIntrinsicBounds(0, true != this.bf ? R.drawable.quantum_ic_screen_lock_landscape_white_48 : R.drawable.quantum_ic_screen_lock_portrait_white_48, 0, 0);
                this.aM.setRotation(i4 - i3);
                this.aL.setVisibility(0);
                this.aM.setVisibility(0);
            }
        }
    }

    public final void aL(boolean z) {
        this.bm = z;
        aX();
    }

    public final void aM() {
        aqrf aqrfVar = this.bg;
        if (aqrfVar == null) {
            return;
        }
        ajds a2 = ajds.a(aqrfVar);
        this.ak.oB(new ajok(), a2);
        this.ao.removeAllViews();
        this.ao.addView(this.ak.a());
    }

    public final void aN() {
        aV();
        this.aX.setText("");
        this.an.setAlpha(0.0f);
        this.aW.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aO(defpackage.astk r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.bk
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L6a
            aqrf r0 = r4.bg
            if (r0 != 0) goto Lf
            goto L6c
        Lf:
            byte[] r0 = defpackage.ajdx.a(r0)
            if (r0 != 0) goto L16
            goto L6c
        L16:
            aomw r2 = defpackage.aomw.b()     // Catch: defpackage.aoob -> L5f
            awos r3 = defpackage.awos.a     // Catch: defpackage.aoob -> L5f
            aonm r0 = defpackage.aonm.parseFrom(r3, r0, r2)     // Catch: defpackage.aoob -> L5f
            awos r0 = (defpackage.awos) r0     // Catch: defpackage.aoob -> L5f
            awqd r2 = r0.c     // Catch: defpackage.aoob -> L5f
            if (r2 != 0) goto L28
            awqd r2 = defpackage.awqd.a     // Catch: defpackage.aoob -> L5f
        L28:
            aonk r3 = defpackage.awob.b     // Catch: defpackage.aoob -> L5f
            java.lang.Object r2 = r2.pX(r3)     // Catch: defpackage.aoob -> L5f
            awob r2 = (defpackage.awob) r2     // Catch: defpackage.aoob -> L5f
            awog r2 = r2.e     // Catch: defpackage.aoob -> L5f
            if (r2 != 0) goto L36
            awog r2 = defpackage.awog.a     // Catch: defpackage.aoob -> L5f
        L36:
            aonk r3 = defpackage.awrb.b     // Catch: defpackage.aoob -> L5f
            boolean r2 = r2.pY(r3)     // Catch: defpackage.aoob -> L5f
            if (r2 == 0) goto L6c
            awqd r0 = r0.c     // Catch: defpackage.aoob -> L5f
            if (r0 != 0) goto L44
            awqd r0 = defpackage.awqd.a     // Catch: defpackage.aoob -> L5f
        L44:
            aonk r2 = defpackage.awob.b     // Catch: defpackage.aoob -> L5f
            java.lang.Object r0 = r0.pX(r2)     // Catch: defpackage.aoob -> L5f
            awob r0 = (defpackage.awob) r0     // Catch: defpackage.aoob -> L5f
            awog r0 = r0.e     // Catch: defpackage.aoob -> L5f
            if (r0 != 0) goto L52
            awog r0 = defpackage.awog.a     // Catch: defpackage.aoob -> L5f
        L52:
            aonk r2 = defpackage.awrb.b     // Catch: defpackage.aoob -> L5f
            java.lang.Object r0 = r0.pX(r2)     // Catch: defpackage.aoob -> L5f
            awrb r0 = (defpackage.awrb) r0     // Catch: defpackage.aoob -> L5f
            java.lang.String r0 = r0.c     // Catch: defpackage.aoob -> L5f
            r4.bk = r0     // Catch: defpackage.aoob -> L5f
            goto L6a
        L5f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = "Error parsing Element ProtoBytes. \n"
            defpackage.zga.c(r2, r0)
            goto L6c
        L6a:
            java.lang.String r1 = r4.bk
        L6c:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L73
            return
        L73:
            auyz r0 = defpackage.auyz.a
            aone r0 = r0.createBuilder()
            r0.copyOnWrite()
            aonm r2 = r0.instance
            auyz r2 = (defpackage.auyz) r2
            r1.getClass()
            int r3 = r2.b
            r3 = r3 | 1
            r2.b = r3
            r2.c = r1
            r0.copyOnWrite()
            aonm r1 = r0.instance
            auyz r1 = (defpackage.auyz) r1
            int r5 = r5.f
            r1.d = r5
            int r5 = r1.b
            r5 = r5 | 2
            r1.b = r5
            r0.copyOnWrite()
            aonm r5 = r0.instance
            auyz r5 = (defpackage.auyz) r5
            int r1 = r5.b
            r1 = r1 | 4
            r5.b = r1
            r1 = 0
            r5.e = r1
            r0.copyOnWrite()
            aonm r5 = r0.instance
            auyz r5 = (defpackage.auyz) r5
            int r2 = r5.b
            r2 = r2 | 8
            r5.b = r2
            r5.f = r1
            aonm r5 = r0.build()
            auyz r5 = (defpackage.auyz) r5
            auyw r0 = new auyw
            aone r5 = r5.toBuilder()
            r0.<init>(r5)
            auyy r5 = r0.b()
            aakv r0 = r4.bd
            aalc r0 = r0.c()
            r0.d(r5)
            ayph r5 = r0.b()
            r5.Q()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acif.aO(astk):void");
    }

    @Override // defpackage.abvc
    public final void b(apxf apxfVar) {
        c(true);
        acht achtVar = this.au;
        achtVar.an = apxfVar;
        achtVar.ao = null;
        if (achtVar.at()) {
            achtVar.a.p();
            achtVar.o();
        }
    }

    @Override // defpackage.abvc
    public final void c(boolean z) {
        this.aE = z;
        View view = this.au.O;
        if (view != null) {
            view.setAlpha(true != z ? 0.0f : 1.0f);
            whu.I(this.aZ, !z);
        }
    }

    @Override // defpackage.abwr
    public final boolean d() {
        return acfm.b(this);
    }

    @Override // defpackage.abwt
    public final void g(int i, String str) {
        if (i == 24) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "WARNING: Stream has a CID match, message=".concat(valueOf);
            }
            this.aU.p(str);
            aU(this.aU);
            return;
        }
        if (i == 25) {
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                "ERROR: Stream has a CID match, message=".concat(valueOf2);
            }
            this.aU.p(str);
            aU(this.aU);
            return;
        }
        String valueOf3 = String.valueOf(str);
        if (valueOf3.length() != 0) {
            "Stream CID status is OK, message=".concat(valueOf3);
        }
        this.aU.d();
    }

    @Override // defpackage.abwt
    public final void h(int i, aqyg aqygVar) {
        if (i == 35) {
            String.valueOf(String.valueOf(aqygVar)).length();
            aS(aahk.a(aqygVar, this.b, false));
        } else if (i == 36) {
            String.valueOf(String.valueOf(aqygVar)).length();
            aS(aahk.a(aqygVar, this.b, false));
        } else {
            String.valueOf(String.valueOf(aqygVar)).length();
            this.aU.d();
        }
    }

    @Override // defpackage.achg, defpackage.ce
    public final void ku(Context context) {
        Bundle bundle = this.m;
        this.be = bundle.getString("ARG_VIDEO_ID");
        this.ay = bundle.getBoolean("ARG_IS_MIC_ENABLED", false);
        this.az = bundle.getBoolean("ARG_IS_MIC_SUPPORTED", false);
        this.aA = bundle.getInt("ARG_CAMERA_COUNT");
        this.bf = bundle.getBoolean("ARG_LIVE_STREAM_IS_PORTRAIT");
        this.aC = bundle.getBoolean("ARG_DID_START_BROADCAST", false);
        this.bl = bundle.getBoolean("ARG_IS_COSTREAM", false);
        this.aD = bundle.getBoolean("IS_FLASH_TORCH_ENABLED", false);
        nbq.d().b();
        super.ku(context);
        String string = bundle.getString("ARG_STREAM_URL");
        String string2 = bundle.getString("ARG_STREAM_KEY");
        if (bundle.containsKey("ARG_STREAM_RENDERER")) {
            this.aB = (atgf) amkq.ck(bundle, "ARG_STREAM_RENDERER", atgf.a, aomw.b());
        }
        long j = bundle.getLong("ARG_TIMER_START_STREAM");
        long j2 = bundle.getLong("ARG_TIMER_DURATION_STREAM");
        this.bd = this.am.a(this.al.c());
        this.ax = this.ah.a(this, this.be, this.bf, this.aC, this.bl, null, null, string, string2, j, j2, this.ay, false, false, false, false, true, 0);
    }

    @Override // defpackage.acri
    protected final apxf kx() {
        return null;
    }

    @Override // defpackage.abwt
    public final void l(abww abwwVar, String str) {
        this.bn = abwwVar;
        this.bo = str;
        aX();
    }

    @Override // defpackage.abwt
    public final void m(String str) {
        this.bj = str;
        StreamStatusView streamStatusView = this.aO;
        if (streamStatusView != null) {
            streamStatusView.d(str);
        }
    }

    @Override // defpackage.ce
    public final void mD() {
        super.mD();
        aQ();
        this.ax.s(true);
        aL(false);
        aR(false);
    }

    @Override // defpackage.acri
    protected final acra mM() {
        return this.c;
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        atgf atgfVar = this.aB;
        if (atgfVar != null) {
            amkq.cn(bundle, "STATE_STREAM_RENDERER", atgfVar);
        }
        bundle.putString("STATE_SUPER_CHAT_TOTAL_STRING", this.bj);
        bundle.putString("STATE_VIEWERS_COUNT_STRING", this.bh);
        bundle.putString("STATE_THUMBSUP_COUNT_STRING", this.bi);
        bundle.putBoolean("IS_FLASH_TORCH_ENABLED", this.aD);
        bundle.putBoolean("IS_MIC_ENABLED", this.ay);
        Bundle bundle2 = new Bundle();
        abwy abwyVar = this.ax;
        bundle2.putString("STATE_STREAM_URL", abwyVar.D);
        bundle2.putString("STATE_STREAM_KEY", abwyVar.E);
        aqyg aqygVar = abwyVar.F;
        if (aqygVar != null) {
            amkq.cn(bundle2, "ERROR_MESSAGE_FORMATTED_STRING", aqygVar);
        }
        Integer num = abwyVar.A;
        if (num != null) {
            bundle2.putInt("STATE_WEBRTC_VIDEO_WIDTH", num.intValue());
        }
        Integer num2 = abwyVar.B;
        if (num2 != null) {
            bundle2.putInt("STATE_WEBRTC_VIDEO_HEIGHT", num2.intValue());
        }
        bundle2.putString("STATE_LIVESTREAM_DONE_ERROR_MESSAGE", abwyVar.G);
        bundle2.putLong("STATE_TIMER_BASE", abwyVar.I);
        bundle2.putLong("STATE_TIMER_DURATION", abwyVar.f26J);
        bundle2.putInt("STATE_QUALITY_LEVEL", abwyVar.K);
        bundle2.putLong("STATE_SPEED_TEST_BITRATE", abwyVar.C);
        bundle2.putBoolean("STATE_DID_STREAM", abwyVar.L);
        Bundle bundle3 = new Bundle();
        abxc abxcVar = abwyVar.i;
        bundle3.putInt("state_machine_state", abxcVar.a);
        bundle3.putInt("state_machine_retry_state", abxcVar.c);
        bundle3.putInt("state_machine_state_flow", abxcVar.b);
        bundle3.putInt("state_machine_error_code", abxcVar.d);
        bundle3.putBoolean("state_machine_stream_occurred", abxcVar.h);
        bundle3.putBoolean("state_machine_stop_requested", abxcVar.f);
        bundle3.putBoolean("state_machine_stop_request_completed", abxcVar.e);
        bundle3.putBoolean("state_machine_ingestion_failed", abxcVar.g);
        bundle3.putBoolean("state_machine_stream_went_live", abxcVar.i);
        bundle3.putBoolean("state_machine_bandwidth_check_pending", abxcVar.j);
        bundle2.putBundle("STATE_CONTROLLER_BUNDLE", bundle3);
        bundle.putBundle("STATE_LIVE_STREAM_CONTROLLER_BUNDLE", bundle2);
    }

    @Override // defpackage.ce
    public final void mS() {
        super.mS();
        aL(true);
        aR(true);
        this.ax.p();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x022f  */
    @Override // defpackage.acri, defpackage.ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View mg(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acif.mg(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // defpackage.abwt
    public final void n(String str, String str2, avhy avhyVar) {
        this.bh = str;
        StreamStatusView streamStatusView = this.aO;
        if (streamStatusView != null) {
            streamStatusView.f(str);
        }
        this.bi = str2;
        StreamStatusView streamStatusView2 = this.aO;
        if (streamStatusView2 != null) {
            streamStatusView2.e(str2);
        }
        if (this.aO != null && avhyVar != null) {
            akch akchVar = this.ai;
            akci a2 = akchVar.a();
            aqyg aqygVar = avhyVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            a2.c = ajcq.b(aqygVar);
            a2.i(2);
            a2.c(2);
            a2.h(avhyVar.i);
            a2.a = this.aO.a;
            a2.l();
            akchVar.c(a2.a());
        }
        this.bh = str;
        this.bi = str2;
        aT(str, str2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.O == null) {
            return;
        }
        if (view == this.aP || view == this.aQ) {
            aJ();
        } else if (view == this.aO) {
            throw null;
        }
    }

    @Override // defpackage.acri
    protected final acsc p() {
        return acsb.b(26109);
    }

    @Override // defpackage.abwu
    public final void q(int i) {
        StringBuilder sb = new StringBuilder(37);
        sb.append("Create ingestion failure: ");
        sb.append(i);
        zga.b(sb.toString());
        if (acfm.b(this)) {
            aP();
            this.e.K(i, null, null, null, this.aC);
        } else {
            aP();
        }
    }

    @Override // defpackage.abwu
    public final void s(int i, String str, String str2, atgf atgfVar) {
        if (acfm.b(this)) {
            this.aB = atgfVar;
            this.e.J(i, str, str2, atgfVar);
            aY(atgfVar);
        }
    }

    @Override // defpackage.abwu
    public final void t() {
        this.e.ag();
    }

    @Override // defpackage.abwu
    public final void u(int i, atfw atfwVar, String str, aqyg aqygVar, boolean z) {
        this.e.K(i, atfwVar, str, aqygVar, z);
    }

    @Override // defpackage.abwu
    public final void v() {
        if (acfm.b(this)) {
            this.aL.setVisibility(8);
            this.aM.setVisibility(8);
            aN();
            this.e.L();
        }
    }

    @Override // defpackage.abwu
    public final void w() {
        if (acfm.b(this)) {
            if (this.bl) {
                this.aO.a();
                this.bb.start();
            }
            this.ba.setVisibility(0);
            this.bb.setVisibility(0);
            this.bc.setVisibility(8);
            this.aC = true;
            this.aP.setEnabled(true);
            this.aQ.setEnabled(true);
        }
    }

    @Override // defpackage.abwu
    public final void x(long j) {
        boolean z;
        if (acfm.b(this)) {
            this.aP.setEnabled(this.aC);
            this.aQ.setEnabled(this.aC);
            this.e.O();
            aQ();
            ackt acktVar = this.aT;
            int i = 1;
            if (acktVar != null && acktVar.a.b.size() != 0) {
                if (acktVar.e.getChildCount() <= 0) {
                    int i2 = 0;
                    for (atgh atghVar : acktVar.a.b) {
                        if (atghVar != null && (atghVar.b & i) != 0) {
                            atgg atggVar = atghVar.c;
                            if (atggVar == null) {
                                atggVar = atgg.a;
                            }
                            atgg atggVar2 = atggVar;
                            int dimension = (int) acktVar.e.getResources().getDimension(R.dimen.lc_24dp_image_button_container_size);
                            acks acksVar = new acks(acktVar.c, acktVar.b, atggVar2, acktVar.f, acktVar.d, acktVar.g, dimension, dimension);
                            ViewGroup viewGroup = acksVar.d;
                            acktVar.e.addView(viewGroup);
                            int dimension2 = (int) acktVar.e.getResources().getDimension(R.dimen.lc_24dp_image_button_margin);
                            yny.A(viewGroup, new umy(14), yny.h(yny.y(-2, -2), yny.s(dimension2, dimension2, dimension2, dimension2)), ViewGroup.MarginLayoutParams.class);
                            atge atgeVar = acksVar.a.d;
                            if (atgeVar == null) {
                                atgeVar = atge.a;
                            }
                            if (atgeVar.b == 142774990 ? ((acif) acksVar.c).aF : acksVar.b(acksVar.b)) {
                                acksVar.d.setVisibility(0);
                                byte[] bArr = acksVar.f;
                                if (bArr != null) {
                                    acksVar.e.u(new acqx(bArr), null);
                                }
                                i2++;
                            }
                        }
                        i = 1;
                    }
                    int i3 = i2 - 1;
                    acktVar.e.setWeightSum(i3);
                    int i4 = 0;
                    for (int i5 = 0; i5 < acktVar.e.getChildCount(); i5++) {
                        View childAt = acktVar.e.getChildAt(i5);
                        if (childAt.getVisibility() == 0) {
                            ((LinearLayout.LayoutParams) childAt.getLayoutParams()).weight = i4 == i3 ? 0 : 1;
                            i4++;
                        }
                    }
                }
                acktVar.e.setVisibility(0);
            }
            this.an.setAlpha(1.0f);
            byte[] bArr2 = this.aR;
            if (bArr2 != null) {
                this.c.u(new acqx(bArr2), null);
            }
            this.aW.setVisibility(8);
            if (this.bq || TextUtils.isEmpty(this.ap.getText())) {
                z = true;
                this.aG = true;
                Runnable runnable = this.aH;
                if (runnable != null) {
                    runnable.run();
                }
            } else {
                this.ap.setVisibility(0);
                this.ap.postDelayed(new acia(this, 0), TimeUnit.MILLISECONDS.convert(3L, TimeUnit.SECONDS));
                z = true;
                this.bq = true;
            }
            if (this.bl) {
                this.aP.setEnabled(z);
                this.aQ.setEnabled(z);
            }
            this.e.P(j);
            this.aO.b(j);
            this.aO.g(j);
            if (this.aK.i().P) {
                this.ba.setVisibility(8);
                this.bb.setVisibility(8);
                this.bc.setVisibility(0);
            }
        }
    }

    @Override // defpackage.abwu
    public final void y(boolean z) {
        if (acfm.b(this)) {
            if (z) {
                this.bq = false;
                aW(R.string.lc_reconnecting);
                this.e.aI(true != this.aD ? "off" : "torch");
            } else {
                aW(R.string.lc_going_live);
            }
            this.e.L();
        }
    }

    @Override // defpackage.abwu
    public final void z() {
    }
}
