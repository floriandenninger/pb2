package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.libraries.youtube.livecreation.ui.view.NetworkOperationView;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;
import com.google.android.libraries.youtube.proto.lite.util.ParcelableMessageLite;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
import com.google.protos.youtube.api.innertube.MultiMessageConfirmDialogRendererOuterClass;
import com.google.protos.youtube.api.innertube.OpenDialogCommandOuterClass$OpenDialogCommand;
import com.google.protos.youtube.api.innertube.StartStreamEndpointOuterClass$StartStreamEndpoint;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acgf extends acha implements View.OnClickListener, aclq, abuq, abxv {
    public acra a;
    private NetworkOperationView aA;
    private ImageButton aB;
    private ImageButton aC;
    private ImageButton aD;
    private View aE;
    private WaitingIndicatorView aF;
    private View aG;
    private TextView aH;
    private TextView aI;
    private View aJ;
    private TextView aK;
    private ProgressBar aL;
    private ImageButton aM;
    private TextView aN;
    private TextView aO;
    private ImageButton aP;
    private Button aQ;
    private Button aR;
    private View aS;
    private Button aT;
    private ViewGroup aU;
    private ImageView aV;
    private TextView aW;
    private ViewGroup aX;
    private ImageView aY;
    private TextView aZ;
    public abya ae;
    public acge af;
    public abrx ag;
    public ajjz ah;
    public ajwn ai;
    public aays aj;
    public acfm ak;
    public akch al;
    public SharedPreferences am;
    public View an;
    public ImageView ao;
    public TextView ap;
    public String aq;
    public Bitmap ar;
    public Bitmap as;
    public boolean at;
    public String av;
    public agcm aw;
    public axze ax;
    private FrameLayout ay;
    private RelativeLayout az;
    public Handler b;
    private ImageButton ba;
    private Executor bb;
    private anhy bc;
    private anhy bd;
    private boolean be;
    private int bf;
    private CharSequence bg;
    private atey bh;
    private apxf bi;
    private boolean bj;
    private afwx bk;
    private int bm;
    private boolean bn;
    public aahd c;
    public Executor d;
    public acfh e;
    public int au = 0;
    private final Runnable bl = new acfx(this, 2);
    private int bo = 0;

    private static String aV(apmg apmgVar) {
        apxf apxfVar = apmgVar.n;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        if (!apxfVar.pY(StartStreamEndpointOuterClass$StartStreamEndpoint.startStreamEndpoint)) {
            return null;
        }
        apxf apxfVar2 = apmgVar.n;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        StartStreamEndpointOuterClass$StartStreamEndpoint startStreamEndpointOuterClass$StartStreamEndpoint = (StartStreamEndpointOuterClass$StartStreamEndpoint) apxfVar2.pX(StartStreamEndpointOuterClass$StartStreamEndpoint.startStreamEndpoint);
        if (TextUtils.isEmpty(startStreamEndpointOuterClass$StartStreamEndpoint.b)) {
            return null;
        }
        return startStreamEndpointOuterClass$StartStreamEndpoint.b;
    }

    private final void aW() {
        int i;
        int i2 = this.bo;
        if (i2 == 1) {
            this.bo = 1;
            this.aA.a(1);
            this.aA.setVisibility(0);
            this.az.setVisibility(8);
            acge acgeVar = this.af;
            if (acgeVar != null) {
                acgeVar.v(this.bh.q);
                return;
            }
            return;
        }
        if (i2 == 2) {
            be();
            synchronized (this) {
                if (this.at) {
                    this.aE.setVisibility(8);
                } else {
                    if (this.ar == null && (i = this.au) != 1 && i != 3) {
                        if (i == 0) {
                            aF();
                            aY();
                        }
                    }
                    if (!this.bj || bg()) {
                        aO();
                    } else {
                        bf();
                    }
                }
            }
            return;
        }
        aN();
        aL();
        aF();
        aH();
    }

    private final void aX() {
        this.at = true;
        final ci C = C();
        this.d.execute(new Runnable() { // from class: acfr
            @Override // java.lang.Runnable
            public final void run() {
                acgf acgfVar = acgf.this;
                Activity activity = C;
                Bitmap a = acgfVar.ag.a(acgfVar.aq);
                if (a == null) {
                    acgfVar.at = false;
                    return;
                }
                synchronized (acgfVar) {
                    acgfVar.as = a;
                    acgfVar.ar = a;
                }
                activity.runOnUiThread(new acfx(acgfVar, 1));
            }
        });
    }

    private final void aY() {
        if (TextUtils.isEmpty(this.aq)) {
            return;
        }
        this.aF.b(3);
        this.b.postDelayed(new acfx(this, 0), 300L);
    }

    private final void aZ() {
        if (this.aC == null || TextUtils.isEmpty(this.bg)) {
            return;
        }
        this.aC.setContentDescription(this.bg);
    }

    private final void ba() {
        if (!bi() || TextUtils.isEmpty(this.av)) {
            return;
        }
        this.ap.setText(this.av);
        this.ap.setVisibility(0);
    }

    private final void bb() {
        apxf apxfVar;
        amrz k;
        this.bj = false;
        Object tag = this.aQ.getTag();
        if (tag instanceof apmg) {
            apmg apmgVar = (apmg) tag;
            int i = apmgVar.b;
            if ((i & 8192) != 0) {
                apxfVar = apmgVar.n;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            } else if ((i & 16384) != 0) {
                apxfVar = apmgVar.o;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            } else {
                apxfVar = apmgVar.p;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            }
        } else {
            apxfVar = null;
        }
        if (apxfVar != null) {
            this.a.D(new acqx(apxfVar.c));
            atey ateyVar = this.bh;
            Boolean valueOf = Boolean.valueOf(this.bn);
            int i2 = abvk.b;
            if (ateyVar.q) {
                k = amrz.l("com.google.android.libraries.youtube.innertube.endpoint.tag", ateyVar, "ARG_IS_PORTRAIT", valueOf);
            } else {
                k = amrz.k("com.google.android.libraries.youtube.innertube.endpoint.tag", ateyVar);
            }
            this.c.c(apxfVar, k);
            return;
        }
        acge acgeVar = this.af;
        if (acgeVar != null) {
            acgeVar.aF();
        }
    }

    private final void bc(boolean z) {
        this.bn = z;
        bd(this.aU, this.aW, this.aV, !z);
        bd(this.aX, this.aZ, this.aY, z);
    }

    private final void bd(ViewGroup viewGroup, TextView textView, ImageView imageView, boolean z) {
        int color = qR().getResources().getColor(z ? R.color.lc_button_style_orientation_background : R.color.lc_button_style_orientation_background_selected);
        textView.setTextColor(color);
        imageView.setColorFilter(color);
        viewGroup.setSelected(z);
    }

    private final void be() {
        this.bo = 2;
        this.aA.a(2);
        this.aA.setVisibility(8);
        this.az.setVisibility(0);
    }

    private final void bf() {
        if (this.aS != null) {
            this.aE.setVisibility(8);
            this.aG.setVisibility(8);
            this.aS.setVisibility(0);
            this.bj = true;
        }
    }

    private final boolean bg() {
        return qX().getConfiguration().orientation == 2;
    }

    private final boolean bh() {
        int h = this.ax.h();
        if (this.bh.r) {
            if (h <= 0) {
                return this.ax.n();
            }
            if (this.bm < h) {
                return true;
            }
        }
        return false;
    }

    private final boolean bi() {
        return (this.bh.b & 65536) != 0;
    }

    private static final apmg bj(atey ateyVar) {
        ateyVar.getClass();
        atew atewVar = ateyVar.i;
        if (atewVar == null) {
            atewVar = atew.a;
        }
        apmg apmgVar = atewVar.b;
        return apmgVar == null ? apmg.a : apmgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final View bk(ViewGroup viewGroup) {
        atex atexVar;
        aqyg aqygVar;
        apmg apmgVar;
        atdc atdcVar;
        aqyg aqygVar2;
        int i;
        aqyg aqygVar3;
        int i2;
        final int i3 = 1;
        boolean z = 0;
        boolean z2 = false;
        View inflate = C().getLayoutInflater().inflate(true != this.bh.q ? R.layout.lc_choose_thumbnail_fragment : R.layout.lc_screencast_choose_thumbnail_fragment, viewGroup, false);
        this.az = (RelativeLayout) inflate.findViewById(R.id.choose_thumbnail_content);
        this.aA = (NetworkOperationView) inflate.findViewById(R.id.choose_thumbnail_network_operation);
        if ((this.bh.b & 1) != 0) {
            TextView textView = (TextView) inflate.findViewById(R.id.thumbnail_capture_text_view);
            aqyg aqygVar4 = this.bh.c;
            if (aqygVar4 == null) {
                aqygVar4 = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar4));
        }
        TextView textView2 = (TextView) inflate.findViewById(R.id.stream_orientation_text_view);
        int i4 = 8;
        aqyg aqygVar5 = null;
        if (this.bh.q) {
            textView2.setVisibility(8);
            View inflate2 = ((ViewStub) inflate.findViewById(R.id.orientation_selector)).inflate();
            inflate2.setVisibility(0);
            this.aU = (ViewGroup) inflate2.findViewById(R.id.landscape_button);
            this.aX = (ViewGroup) inflate2.findViewById(R.id.portrait_button);
            this.aV = (ImageView) inflate2.findViewById(R.id.landscape_button_icon);
            this.aY = (ImageView) inflate2.findViewById(R.id.portrait_button_icon);
            this.aW = (TextView) inflate2.findViewById(R.id.landscape_button_text);
            this.aZ = (TextView) inflate2.findViewById(R.id.portrait_button_text);
            this.aU.setOnClickListener(this);
            this.aX.setOnClickListener(this);
            this.ba = (ImageButton) inflate2.findViewById(R.id.help_button);
            bc(this.bn);
            atey ateyVar = this.bh;
            if ((ateyVar.b & 16777216) != 0) {
                aulq aulqVar = ateyVar.s;
                if (aulqVar == null) {
                    aulqVar = aulq.a;
                }
                if (aulqVar.pY(ButtonRendererOuterClass.buttonRenderer)) {
                    aulq aulqVar2 = this.bh.s;
                    if (aulqVar2 == null) {
                        aulqVar2 = aulq.a;
                    }
                    apmg apmgVar2 = (apmg) aulqVar2.pX(ButtonRendererOuterClass.buttonRenderer);
                    int i5 = apmgVar2.b;
                    if ((i5 & 32768) != 0 || (i5 & 16384) != 0 || (i5 & 8192) != 0) {
                        this.ba.setVisibility(0);
                        this.ba.setTag(apmgVar2);
                        this.ba.setOnClickListener(this);
                    }
                }
            }
        } else if (!bh()) {
            int i6 = this.bh.b;
            if ((i6 & 8) != 0 || (i6 & 4) != 0) {
                if (bg()) {
                    atexVar = this.bh.f;
                    if (atexVar == null) {
                        atexVar = atex.a;
                    }
                } else {
                    atexVar = this.bh.e;
                    if (atexVar == null) {
                        atexVar = atex.a;
                    }
                }
                if (atexVar != null) {
                    int i7 = atexVar.b & 1;
                    if (i7 != 0) {
                        if (i7 != 0) {
                            aqygVar = atexVar.c;
                            if (aqygVar == null) {
                                aqygVar = aqyg.a;
                            }
                        } else {
                            aqygVar = null;
                        }
                        textView2.setText(ajcq.b(aqygVar));
                        textView2.setVisibility(0);
                    }
                    if ((atexVar.b & 2) != 0) {
                        acfh acfhVar = this.e;
                        arfs arfsVar = atexVar.d;
                        if (arfsVar == null) {
                            arfsVar = arfs.a;
                        }
                        arfr b = arfr.b(arfsVar.c);
                        if (b == null) {
                            b = arfr.UNKNOWN;
                        }
                        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(aii.a(C(), acfhVar.a(b)), (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
            }
        }
        this.aB = (ImageButton) inflate.findViewById(R.id.back_arrow_button);
        this.aC = (ImageButton) inflate.findViewById(R.id.switch_camera_button);
        this.aD = (ImageButton) inflate.findViewById(R.id.share_event_button);
        this.aB.setOnClickListener(this);
        this.aC.setOnClickListener(this);
        aZ();
        this.aE = inflate.findViewById(R.id.thumbnail_capture_root);
        this.an = inflate.findViewById(R.id.viewport_container);
        WaitingIndicatorView waitingIndicatorView = (WaitingIndicatorView) inflate.findViewById(R.id.countdown_view);
        this.aF = waitingIndicatorView;
        waitingIndicatorView.c = this;
        View findViewById = inflate.findViewById(R.id.stream_schedule_info_container);
        this.aH = (TextView) inflate.findViewById(R.id.schedule_header);
        this.aI = (TextView) inflate.findViewById(R.id.schedule_info);
        if ((this.bh.b & 2) != 0) {
            findViewById.setVisibility(0);
            TextView textView3 = this.aH;
            aqyg aqygVar6 = this.bh.d;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
            textView3.setText(ajcq.b(aqygVar6));
            this.aH.setVisibility(0);
        }
        if ((this.bh.b & 65536) != 0) {
            findViewById.setVisibility(0);
            TextView textView4 = this.aI;
            aqyg aqygVar7 = this.bh.o;
            if (aqygVar7 == null) {
                aqygVar7 = aqyg.a;
            }
            textView4.setText(ajcq.b(aqygVar7));
            this.aI.setVisibility(0);
            atey ateyVar2 = this.bh;
            if ((ateyVar2.b & 131072) != 0) {
                acfh acfhVar2 = this.e;
                arfs arfsVar2 = ateyVar2.p;
                if (arfsVar2 == null) {
                    arfsVar2 = arfs.a;
                }
                arfr b2 = arfr.b(arfsVar2.c);
                if (b2 == null) {
                    b2 = arfr.UNKNOWN;
                }
                int a = acfhVar2.a(b2);
                if (a != 0) {
                    Resources qX = qX();
                    int dimensionPixelSize = qX.getDimensionPixelSize(R.dimen.lc_thumbnail_schedule_info_drawable_dimensions);
                    this.aI.setCompoundDrawablesRelativeWithIntrinsicBounds(new BitmapDrawable(qX, Bitmap.createScaledBitmap(BitmapFactory.decodeResource(qX, a), dimensionPixelSize, dimensionPixelSize, true)), (Drawable) null, (Drawable) null, (Drawable) null);
                }
            }
        }
        this.aG = inflate.findViewById(R.id.thumbnail_preview_root);
        this.ao = (ImageView) inflate.findViewById(R.id.thumbnail_preview);
        this.aN = (TextView) inflate.findViewById(R.id.thumbnail_title);
        atey ateyVar3 = this.bh;
        if ((ateyVar3.b & 16384) != 0) {
            aqyg aqygVar8 = ateyVar3.m;
            if (aqygVar8 == null) {
                aqygVar8 = aqyg.a;
            }
            Spanned b3 = ajcq.b(aqygVar8);
            this.aN.setText(b3);
            this.aN.setContentDescription(P(R.string.lc_title_cd, b3.toString()));
        }
        this.aO = (TextView) inflate.findViewById(R.id.thumbnail_channel);
        atey ateyVar4 = this.bh;
        if ((ateyVar4.b & 32768) != 0) {
            TextView textView5 = this.aO;
            aqyg aqygVar9 = ateyVar4.n;
            if (aqygVar9 == null) {
                aqygVar9 = aqyg.a;
            }
            textView5.setText(ajcq.b(aqygVar9));
        }
        this.aJ = inflate.findViewById(R.id.thumbnail_overlay);
        this.aK = (TextView) inflate.findViewById(R.id.thumbnail_uploading_title);
        this.aL = (ProgressBar) inflate.findViewById(R.id.thumbnail_uploading_spinner);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.thumbnail_reupload_button);
        this.aM = imageButton;
        imageButton.setOnClickListener(this);
        this.aP = (ImageButton) inflate.findViewById(R.id.edit_menu_button);
        atey ateyVar5 = this.bh;
        if ((ateyVar5.b & 64) != 0) {
            aulq aulqVar3 = ateyVar5.g;
            if (aulqVar3 == null) {
                aulqVar3 = aulq.a;
            }
            apmgVar = (apmg) aulqVar3.pX(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apmgVar = null;
        }
        atey ateyVar6 = this.bh;
        if ((ateyVar6.b & 128) != 0) {
            aulq aulqVar4 = ateyVar6.h;
            if (aulqVar4 == null) {
                aulqVar4 = aulq.a;
            }
            atdcVar = (atdc) aulqVar4.pX(MenuRendererOuterClass.menuRenderer);
        } else {
            atdcVar = null;
        }
        if (apmgVar != null && atdcVar != null) {
            if ((apmgVar.b & 32) != 0) {
                this.aP.setVisibility(0);
                if ((apmgVar.b & 65536) != 0) {
                    ImageButton imageButton2 = this.aP;
                    aots aotsVar = apmgVar.r;
                    if (aotsVar == null) {
                        aotsVar = aots.a;
                    }
                    imageButton2.setContentDescription(aotsVar.c);
                }
                this.a.n(new acqx(apmgVar.t));
                acfh acfhVar3 = this.e;
                arfs arfsVar3 = apmgVar.g;
                if (arfsVar3 == null) {
                    arfsVar3 = arfs.a;
                }
                arfr b4 = arfr.b(arfsVar3.c);
                if (b4 == null) {
                    b4 = arfr.UNKNOWN;
                }
                int a2 = acfhVar3.a(b4);
                if (a2 != 0) {
                    this.aP.setImageResource(a2);
                    this.ai.d(this.aP, atdcVar, this, this.a);
                }
            }
            aulq aulqVar5 = this.bh.k;
            if (aulqVar5 == null) {
                aulqVar5 = aulq.a;
            }
            if (aulqVar5.pY(ButtonRendererOuterClass.buttonRenderer)) {
                aulq aulqVar6 = this.bh.k;
                if (aulqVar6 == null) {
                    aulqVar6 = aulq.a;
                }
                apmg apmgVar3 = (apmg) aulqVar6.pX(ButtonRendererOuterClass.buttonRenderer);
                this.a.u(new acqx(apmgVar3.t), null);
                if ((apmgVar3.b & 65536) != 0) {
                    ImageButton imageButton3 = this.aD;
                    aots aotsVar2 = apmgVar3.r;
                    if (aotsVar2 == null) {
                        aotsVar2 = aots.a;
                    }
                    imageButton3.setContentDescription(aotsVar2.c);
                }
                int i8 = apmgVar3.b;
                if ((i8 & 8192) != 0 || (i8 & 16384) != 0) {
                    this.aD.setOnClickListener(this);
                    this.aD.setTag(apmgVar3);
                }
                if ((apmgVar3.b & 32) != 0) {
                    acfh acfhVar4 = this.e;
                    arfs arfsVar4 = apmgVar3.g;
                    if (arfsVar4 == null) {
                        arfsVar4 = arfs.a;
                    }
                    arfr b5 = arfr.b(arfsVar4.c);
                    if (b5 == null) {
                        b5 = arfr.UNKNOWN;
                    }
                    this.aD.setImageResource(acfhVar4.a(b5));
                    this.aD.setVisibility(0);
                }
            }
        }
        this.aR = (Button) inflate.findViewById(R.id.finish_scheduling_button);
        apmg bj = bj(this.bh);
        this.a.u(new acqx(bj.t), null);
        this.aQ = (Button) inflate.findViewById(R.id.start_stream_button);
        if (!this.bh.q || (adyu.cv() && this.ak.d())) {
            Button button = this.aQ;
            if ((bj.b & 256) != 0) {
                aqygVar2 = bj.i;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            button.setText(ajcq.b(aqygVar2));
            Context qR = qR();
            Button button2 = this.aQ;
            if (bj.c != 1 || (i = anaf.aJ(((Integer) bj.d).intValue())) == 0) {
                i = 1;
            }
            adyu.cm(qR, button2, i);
            this.aQ.setTag(bj);
            this.aQ.setOnClickListener(this);
            this.aQ.setVisibility(0);
        } else {
            this.aQ.setVisibility(8);
        }
        this.ap = (TextView) inflate.findViewById(R.id.viewers_waiting_text_view);
        ba();
        aulq aulqVar7 = this.bh.j;
        if (aulqVar7 == null) {
            aulqVar7 = aulq.a;
        }
        if (aulqVar7.pY(ButtonRendererOuterClass.buttonRenderer)) {
            aulq aulqVar8 = this.bh.j;
            if (aulqVar8 == null) {
                aulqVar8 = aulq.a;
            }
            apmg apmgVar4 = (apmg) aulqVar8.pX(ButtonRendererOuterClass.buttonRenderer);
            this.a.u(new acqx(apmgVar4.t), null);
            Button button3 = this.aR;
            if ((apmgVar4.b & 256) != 0) {
                aqygVar3 = apmgVar4.i;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            button3.setText(ajcq.b(aqygVar3));
            Context qR2 = qR();
            Button button4 = this.aR;
            if (apmgVar4.c != 1 || (i2 = anaf.aJ(((Integer) apmgVar4.d).intValue())) == 0) {
                i2 = 1;
            }
            adyu.cm(qR2, button4, i2);
            this.aR.setTag(apmgVar4);
            this.aR.setOnClickListener(this);
            this.aR.setVisibility(0);
            this.aQ.setEnabled(true);
        }
        if (bh()) {
            this.aS = inflate.findViewById(R.id.confirm_portrait_root);
            this.aT = (Button) inflate.findViewById(R.id.confirm_portrait_button);
            TextView textView6 = (TextView) inflate.findViewById(R.id.rotate_device_text_view);
            if (textView6 != null) {
                atey ateyVar7 = this.bh;
                if ((ateyVar7.b & 4) != 0) {
                    atex atexVar2 = ateyVar7.e;
                    if (atexVar2 == null) {
                        atexVar2 = atex.a;
                    }
                    if ((atexVar2.b & 1) != 0) {
                        atex atexVar3 = this.bh.e;
                        if (atexVar3 == null) {
                            atexVar3 = atex.a;
                        }
                        aqygVar5 = atexVar3.c;
                        if (aqygVar5 == null) {
                            aqygVar5 = aqyg.a;
                        }
                    }
                    textView6.setText(ajcq.b(aqygVar5));
                }
            }
            Button button5 = this.aT;
            if (button5 != null) {
                button5.setOnClickListener(this);
                adyu.cm(qR(), this.aT, 14);
            }
        }
        ImageButton imageButton4 = this.aC;
        if (!this.bh.q && this.bf > 1) {
            i4 = 0;
        }
        imageButton4.setVisibility(i4);
        this.aA.c(new View.OnClickListener(this) { // from class: acft
            public final /* synthetic */ acgf a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (i3 == 0) {
                    acgf acgfVar = this.a;
                    acgfVar.aL();
                    acge acgeVar = acgfVar.af;
                    if (acgeVar != null) {
                        acgeVar.aE();
                        return;
                    }
                    return;
                }
                acgf acgfVar2 = this.a;
                acgfVar2.aN();
                acgfVar2.aF();
                acgfVar2.aH();
            }
        });
        NetworkOperationView networkOperationView = this.aA;
        final boolean z3 = z2 ? 1 : 0;
        networkOperationView.b(new View.OnClickListener(this) { // from class: acft
            public final /* synthetic */ acgf a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (z3 == 0) {
                    acgf acgfVar = this.a;
                    acgfVar.aL();
                    acge acgeVar = acgfVar.af;
                    if (acgeVar != null) {
                        acgeVar.aE();
                        return;
                    }
                    return;
                }
                acgf acgfVar2 = this.a;
                acgfVar2.aN();
                acgfVar2.aF();
                acgfVar2.aH();
            }
        });
        aQ(this.au);
        View findViewById2 = inflate.findViewById(R.id.orientation_text);
        if (this.ax.m()) {
            aosc a3 = this.aw.a();
            if (a3 != null) {
                z = a3.f;
            }
        } else {
            z = this.am.getBoolean("PREF_HAS_SEEN_ORIENTATION_TOOLTIP", false);
        }
        int i9 = !z;
        if (aS() && i9 != 0) {
            akch akchVar = this.al;
            akci a4 = akchVar.a();
            a4.c = O(R.string.lc_hint_orientation);
            a4.i(1);
            a4.c(2);
            a4.h(0.6f);
            a4.a = findViewById2;
            a4.l();
            a4.f = new acfz(this);
            akchVar.c(a4.a());
        }
        return inflate;
    }

    public static acgf n(atey ateyVar, String str, int i, boolean z, int i2) {
        acgf acgfVar = new acgf();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ARG_GO_LIVE_SCREEN_RENDERER", new ParcelableMessageLite(ateyVar));
        bundle.putString("ARG_VIDEO_ID", str);
        bundle.putInt("ARG_CAMERA_COUNT", i);
        bundle.putBoolean("ARG_NEEDS_THUMBNAIL", z);
        bundle.putInt("ARG_PORTRAIT_STREAM_COUNT", i2);
        acgfVar.af(bundle);
        return acgfVar;
    }

    @Override // defpackage.ce
    public final void X() {
        super.X();
        this.bj = false;
        this.b.removeCallbacks(this.bl);
        aL();
    }

    @Override // defpackage.ce
    public final void Z() {
        super.Z();
        aG();
        aP();
        acfm.a(C());
    }

    @Override // defpackage.abuq
    public final void a(String str) {
        if (str != null) {
            this.aq = str;
        }
        acge acgeVar = this.af;
        if (acgeVar != null) {
            acgeVar.E(this.aq);
        }
    }

    public final void aF() {
        if (this.ar != null || this.be) {
            return;
        }
        this.aF.a();
        acge acgeVar = this.af;
        if (acgeVar != null) {
            acgeVar.az(this.an);
        }
        this.be = true;
    }

    public final void aG() {
        aQ(this.au);
        if (this.bh.q) {
            be();
            aO();
        } else {
            aW();
            ba();
        }
    }

    public final void aH() {
        if (TextUtils.isEmpty(this.aq)) {
            return;
        }
        be();
        if (av()) {
            aF();
            aY();
        }
    }

    public final void aI() {
        if (this.bj) {
            this.bj = false;
            aO();
            return;
        }
        acge acgeVar = this.af;
        if (acgeVar != null) {
            acgeVar.v(this.bh.q);
        }
        aL();
        acge acgeVar2 = this.af;
        if (acgeVar2 != null) {
            acgeVar2.aE();
        }
    }

    public final void aJ(final Bitmap bitmap) {
        if (acfm.b(this)) {
            this.ar = bitmap;
            if (this.bh.q) {
                this.aC.setVisibility(8);
            }
            this.af.v(this.bh.q);
            aL();
            aO();
            aR(abrx.f(bitmap));
            anhy anhyVar = this.bc;
            if (anhyVar != null) {
                anhyVar.cancel(false);
            }
            anhy anhyVar2 = this.bd;
            if (anhyVar2 != null) {
                anhyVar2.cancel(false);
            }
            this.bc = anaf.T(new anfy() { // from class: acfw
                @Override // defpackage.anfy
                public final anhy a() {
                    acgf acgfVar = acgf.this;
                    Bitmap bitmap2 = bitmap;
                    acgfVar.as = null;
                    if (acgfVar.ag.e(bitmap2, acgfVar.aq)) {
                        acgfVar.as = bitmap2;
                    }
                    return null;
                }
            }, this.bb);
        }
    }

    @Override // defpackage.aclq
    public final void aK() {
        if (this.O == null || !av()) {
            return;
        }
        int[] iArr = new int[2];
        this.an.getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        this.O.getLocationInWindow(iArr2);
        int i = iArr[0];
        int i2 = iArr2[0];
        int i3 = iArr[1];
        int i4 = iArr2[1];
        this.an.getWidth();
        if (!this.af.aN(i - i2, i3 - i4, this.an.getHeight(), new acfu(this))) {
            zga.b("Failed to capture thumbnail.");
            if (acfm.b(this)) {
                aQ(1);
                this.af.v(this.bh.q);
                aL();
                aO();
            }
            whu.K(C(), R.string.lc_thumbnail_capture_fail, 0);
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new acgd(this));
        this.an.startAnimation(alphaAnimation);
    }

    public final void aL() {
        this.aF.c();
        this.be = false;
    }

    public final void aM(String str) {
        this.bg = str;
        aZ();
    }

    public final void aN() {
        this.bo = 0;
        this.aA.a(0);
        this.aA.setVisibility(8);
        this.az.setVisibility(0);
        acge acgeVar = this.af;
        if (acgeVar != null) {
            acgeVar.az(this.an);
        }
    }

    public final void aO() {
        this.aF.c();
        this.aE.setVisibility(8);
        View view = this.aS;
        if (view != null) {
            view.setVisibility(8);
        }
        this.aG.setVisibility(0);
        Bitmap bitmap = this.ar;
        if (bitmap != null) {
            this.ao.setImageBitmap(bitmap);
        } else {
            avgg avggVar = this.bh.l;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            if (ahbw.L(avggVar)) {
                avgg avggVar2 = this.bh.l;
                if (avggVar2 == null) {
                    avggVar2 = avgg.a;
                }
                final Uri B = ahbw.B(avggVar2);
                this.d.execute(new Runnable() { // from class: acfs
                    @Override // java.lang.Runnable
                    public final void run() {
                        acgf acgfVar = acgf.this;
                        acgfVar.ag.d(acgfVar.aq, acgfVar.ah, B, abvp.a, new acgc(acgfVar));
                    }
                });
            }
        }
        String string = this.m.getString("ARG_TITLE");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.aN.setText(string);
    }

    public final void aP() {
        if (bi() && !TextUtils.isEmpty(this.aq) && acfm.b(this)) {
            aayr a = this.aj.a();
            a.e();
            a.d(this.aq);
            a.v();
            if (this.bk == null) {
                this.bk = new acfy(this);
            }
            aays aaysVar = this.aj;
            aaysVar.a.e(a, this.bk);
            this.b.removeCallbacks(this.bl);
            this.b.postDelayed(this.bl, 5000L);
        }
    }

    public final void aQ(int i) {
        this.au = i;
        acge acgeVar = this.af;
        if (acgeVar != null) {
            acgeVar.aj(i);
        }
        if (acfm.b(this)) {
            TypedValue typedValue = new TypedValue();
            qX().getValue(R.dimen.lc_thumbnail_preview_uploading_overlay_opacity, typedValue, true);
            float f = typedValue.getFloat();
            if (i == 1) {
                this.aO.setVisibility(0);
                this.aN.setVisibility(0);
                this.aJ.setAlpha(1.0f);
                this.aJ.setVisibility(0);
                this.aM.setVisibility(8);
                this.aP.setVisibility(8);
                this.aL.setVisibility(8);
                this.aK.setVisibility(8);
                this.aQ.setEnabled(true);
                this.aR.setEnabled(true);
                return;
            }
            if (i == 3 || (this.bh.q && i == 0)) {
                this.aQ.setEnabled(true);
                this.aR.setEnabled(true);
                this.aO.setVisibility(0);
                this.aN.setVisibility(0);
                this.aJ.setVisibility(8);
                this.aM.setVisibility(8);
                this.aP.setVisibility(0);
                this.aL.setVisibility(8);
                this.aK.setVisibility(8);
                return;
            }
            if (i == 0) {
                this.aO.setVisibility(0);
                this.aN.setVisibility(0);
                this.aJ.setVisibility(8);
                this.aM.setVisibility(8);
                this.aP.setVisibility(8);
                this.aL.setVisibility(8);
                this.aK.setVisibility(8);
                return;
            }
            if (i == 2) {
                this.aJ.setAlpha(f);
                this.aJ.setVisibility(0);
                this.aM.setVisibility(8);
                this.aP.setVisibility(8);
                this.aK.setText(O(R.string.lc_thumbnail_preview_uploading_title));
                this.aK.setVisibility(0);
                this.aL.setVisibility(0);
                this.aO.setVisibility(8);
                this.aN.setVisibility(8);
                if (this.aR.getVisibility() == 0) {
                    this.aR.setEnabled(false);
                    return;
                } else {
                    this.aQ.setEnabled(false);
                    return;
                }
            }
            if (i == 4) {
                this.aJ.setAlpha(f);
                this.aJ.setVisibility(0);
                this.aM.setVisibility(0);
                this.aP.setVisibility(8);
                this.aL.setVisibility(8);
                this.aK.setText(O(R.string.lc_thumbnail_upload_failed));
                this.aK.setVisibility(0);
                this.aO.setVisibility(8);
                this.aN.setVisibility(8);
                this.aQ.setEnabled(true);
                this.aR.setEnabled(true);
            }
        }
    }

    final void aR(byte[] bArr) {
        aQ(2);
        this.ae.k(this.ae.l(this.aq, null, null, null, null, null, null, null, null, 0, 0, abxq.a, null, abxq.a, bArr), new acga(this));
    }

    public final boolean aS() {
        return this.bh.q;
    }

    @Override // defpackage.abuq
    public final void b(String str) {
        if (str != null) {
            this.aq = str;
        }
        if (this.bf > 1) {
            this.aC.setVisibility(0);
        }
        aQ(0);
        this.ar = null;
        q();
        this.ao.setImageBitmap(null);
        this.aG.setVisibility(8);
        this.aE.setVisibility(0);
        acge acgeVar = this.af;
        if (acgeVar != null) {
            acgeVar.az(this.an);
        }
        this.aF.a();
        aY();
    }

    @Override // defpackage.abxv
    public final void c(arqx arqxVar) {
        if (acfm.b(this)) {
            this.af.D(arqxVar);
        }
    }

    @Override // defpackage.abxv
    public final void d(int i, aqdt aqdtVar, assu assuVar) {
        if (acfm.b(this)) {
            Toast.makeText(C(), R.string.lc_error_load_broadcast, 0).show();
        }
    }

    @Override // defpackage.acri
    protected final apxf kx() {
        return null;
    }

    @Override // defpackage.ce
    public final void lY() {
        super.lY();
        this.af = null;
    }

    @Override // defpackage.acri
    protected final acra mM() {
        return this.a;
    }

    @Override // defpackage.ce
    public final void mQ(Bundle bundle) {
        Bitmap bitmap;
        bundle.putString("STATE_VIDEO_ID", this.aq);
        apxf apxfVar = this.bi;
        if (apxfVar != null) {
            bundle.putParcelable("SHARE_NAVIGATION_ENDPOINT", new ParcelableMessageLite(apxfVar));
        }
        bundle.putInt("NETWORK_OPERATION_MODE", this.bo);
        boolean z = false;
        if (this.at || ((bitmap = this.ar) != null && this.as == bitmap)) {
            z = true;
        }
        bundle.putBoolean("THUMBNAIL_SAVED", z);
        bundle.putInt("STATE_UPLOAD_THUMBNAIL_STATUS", this.au);
        bundle.putString("STATE_VIEWERS_WAITING", this.av);
        bundle.putBoolean("STATE_IS_PORTRAIT", this.bn);
    }

    @Override // defpackage.ce
    public final void mR(Bundle bundle) {
        super.mR(bundle);
        this.bb = anaf.E(this.d);
        Bundle bundle2 = this.m;
        this.bf = bundle2.getInt("ARG_CAMERA_COUNT");
        this.bm = bundle2.getInt("ARG_PORTRAIT_STREAM_COUNT", 0);
        ParcelableMessageLite parcelableMessageLite = (ParcelableMessageLite) bundle2.getParcelable("ARG_GO_LIVE_SCREEN_RENDERER");
        if (parcelableMessageLite != null) {
            this.bh = (atey) parcelableMessageLite.a(atey.a);
        }
        if (!bundle2.getBoolean("ARG_NEEDS_THUMBNAIL", true)) {
            this.au = 3;
            this.bo = 2;
        }
        this.aq = bundle2.getString("ARG_VIDEO_ID");
        if (bi() || this.aq == null) {
            apmg bj = bj(this.bh);
            String aV = aV(bj);
            if (aV == null) {
                apxf apxfVar = bj.p;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
                if (apxfVar.pY(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand)) {
                    apxf apxfVar2 = bj.p;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                    OpenDialogCommandOuterClass$OpenDialogCommand openDialogCommandOuterClass$OpenDialogCommand = (OpenDialogCommandOuterClass$OpenDialogCommand) apxfVar2.pX(OpenDialogCommandOuterClass$OpenDialogCommand.openDialogCommand);
                    if ((1 & openDialogCommandOuterClass$OpenDialogCommand.b) != 0) {
                        aulq aulqVar = openDialogCommandOuterClass$OpenDialogCommand.c;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                        if (aulqVar.pY(MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer)) {
                            aulq aulqVar2 = openDialogCommandOuterClass$OpenDialogCommand.c;
                            if (aulqVar2 == null) {
                                aulqVar2 = aulq.a;
                            }
                            athg athgVar = (athg) aulqVar2.pX(MultiMessageConfirmDialogRendererOuterClass.multiMessageConfirmDialogRenderer);
                            if ((athgVar.b & 2) != 0) {
                                aulq aulqVar3 = athgVar.d;
                                if (aulqVar3 == null) {
                                    aulqVar3 = aulq.a;
                                }
                                if (aulqVar3.pY(ButtonRendererOuterClass.buttonRenderer)) {
                                    aulq aulqVar4 = athgVar.d;
                                    if (aulqVar4 == null) {
                                        aulqVar4 = aulq.a;
                                    }
                                    aV = aV((apmg) aulqVar4.pX(ButtonRendererOuterClass.buttonRenderer));
                                }
                            }
                        }
                    }
                }
                aV = null;
            }
            this.aq = aV;
        }
        if (bundle2.getBoolean("ARG_RESUME_PREVIOUS_STREAM") && bundle == null) {
            ParcelableMessageLite parcelableMessageLite2 = (ParcelableMessageLite) bundle2.getParcelable("ARG_NAVIGATION_ENDPOINT");
            if (parcelableMessageLite2 != null) {
                this.bi = (apxf) parcelableMessageLite2.a(apxf.a);
            }
            this.au = bundle2.getInt("ARG_UPLOAD_THUMBNAIL_STATUS", 0);
            this.bo = 2;
            aX();
            return;
        }
        if (bundle != null) {
            this.aq = bundle.getString("STATE_VIDEO_ID");
            ParcelableMessageLite parcelableMessageLite3 = (ParcelableMessageLite) bundle.getParcelable("SHARE_NAVIGATION_ENDPOINT");
            if (parcelableMessageLite3 != null) {
                this.bi = (apxf) parcelableMessageLite3.a(apxf.a);
            }
            this.au = bundle.getInt("STATE_UPLOAD_THUMBNAIL_STATUS", 0);
            this.bo = bundle.getInt("NETWORK_OPERATION_MODE");
            if (bundle.getBoolean("THUMBNAIL_SAVED")) {
                aX();
            }
            this.av = bundle.getString("STATE_VIEWERS_WAITING", null);
            this.bn = bundle.getBoolean("STATE_IS_PORTRAIT");
        }
    }

    @Override // defpackage.acri, defpackage.ce
    public final View mg(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.mg(layoutInflater, viewGroup, bundle);
        FrameLayout frameLayout = new FrameLayout(C());
        this.ay = frameLayout;
        this.ay.addView(bk(frameLayout));
        return this.ay;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apxf apxfVar;
        apxf apxfVar2;
        if (this.O == null) {
            return;
        }
        if (view == this.aB) {
            aI();
            return;
        }
        ImageButton imageButton = this.aC;
        if (view == imageButton) {
            acge acgeVar = this.af;
            if (acgeVar != null) {
                acgeVar.aG(imageButton);
                return;
            }
            return;
        }
        ImageButton imageButton2 = this.aD;
        if (view == imageButton2) {
            Object tag = imageButton2.getTag();
            if (tag instanceof apmg) {
                apmg apmgVar = (apmg) tag;
                if ((apmgVar.b & 16384) != 0) {
                    apxfVar2 = apmgVar.o;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                } else {
                    apxfVar2 = apmgVar.n;
                    if (apxfVar2 == null) {
                        apxfVar2 = apxf.a;
                    }
                }
                this.c.c(apxfVar2, null);
                if ((apmgVar.b & 1048576) != 0) {
                    this.a.I(3, new acqx(apmgVar.t), null);
                    return;
                }
                return;
            }
            return;
        }
        if (view == this.aQ) {
            if (bg() || !bh()) {
                bb();
                return;
            } else {
                bf();
                return;
            }
        }
        if (view != this.aT || !bh()) {
            if (view == this.aR) {
                acge acgeVar2 = this.af;
                if (acgeVar2 != null) {
                    acgeVar2.ah();
                    return;
                }
                return;
            }
            if (view == this.aM) {
                aR(abrx.f(this.ar));
                return;
            }
            if (view == this.aU) {
                bc(false);
                return;
            }
            if (view == this.aX) {
                bc(true);
                return;
            }
            ImageButton imageButton3 = this.ba;
            if (view == imageButton3) {
                apmg apmgVar2 = (apmg) imageButton3.getTag();
                int i = apmgVar2.b;
                if ((32768 & i) != 0) {
                    apxfVar = apmgVar2.p;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                } else if ((i & 16384) != 0) {
                    apxfVar = apmgVar2.o;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                } else {
                    apxfVar = apmgVar2.n;
                    if (apxfVar == null) {
                        apxfVar = apxf.a;
                    }
                }
                this.c.c(apxfVar, null);
                return;
            }
            return;
        }
        bb();
    }

    @Override // defpackage.ce, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aL();
        if (!this.bj || !bg()) {
            View bk = bk(this.ay);
            this.ay.removeAllViews();
            this.ay.addView(bk);
            if (av()) {
                aW();
                this.ai.h();
                return;
            }
            return;
        }
        this.aS.setVisibility(8);
        bb();
    }

    @Override // defpackage.acri
    protected final acsc p() {
        return this.bh.q ? acsb.b(66881) : acsb.b(26110);
    }

    public final void q() {
        this.bd = anaf.T(new anfy() { // from class: acfv
            @Override // defpackage.anfy
            public final anhy a() {
                acgf acgfVar = acgf.this;
                try {
                    abrx abrxVar = acgfVar.ag;
                    String str = acgfVar.aq;
                    yjk.e();
                    try {
                        abrxVar.b(str).delete();
                        return null;
                    } catch (SecurityException e) {
                        zga.d("Failed to delete thumbnail.", e);
                        return null;
                    }
                } catch (Exception e2) {
                    zga.d("Failed to delete thumbnail due to exception.", e2);
                    return null;
                }
            }
        }, this.bb);
    }
}
