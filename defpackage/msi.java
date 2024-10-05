package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.embeddedplayer.service.ui.watchlaterbutton.service.c;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;
import com.google.android.youtube.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class msi extends mlc implements lsy, lsw {
    private final View C;
    private final Resources D;
    private final ajuw E;
    private final ajyf F;
    private final ajoi G;
    private final ajop H;
    private final shf I;

    /* renamed from: J, reason: collision with root package name */
    private final ajos f241J;
    private final View K;
    private final FrameLayout L;
    private final TextView M;
    private final Drawable N;
    private final Drawable O;
    private final akbu P;
    private final Handler Q;
    private final float R;
    private final FrameLayout S;
    private View T;
    private final TextView U;
    private final TextView V;
    private final ImageView W;
    private View X;
    private ViewStub Y;
    private Integer Z;
    public final View a;
    private Integer aa;
    private CharSequence ab;
    private zeq ac;
    private List ad;
    private lsz ae;
    private zes af;
    private jyh ag;
    private final ohg ah;
    public final SwipeLayout b;
    public final acsf c;
    public aqkm d;
    public ajok e;
    public audj f;

    public msi(Context context, ajjz ajjzVar, gma gmaVar, aahd aahdVar, shf shfVar, ajyg ajygVar, ajuw ajuwVar, ajos ajosVar, akbu akbuVar, ohg ohgVar, ohg ohgVar2, acsf acsfVar, c cVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(context, ajjzVar, aahdVar, gmaVar, R.layout.playlist_video_item, ohgVar, cVar, null, null, null, null, null);
        this.H = gmaVar;
        this.E = ajuwVar;
        this.G = new ajoi(aahdVar, gmaVar, new ajof() { // from class: mse
            @Override // defpackage.ajof
            public final boolean h(View view) {
                msi msiVar = msi.this;
                if (!msiVar.c.b(msiVar.f)) {
                    return false;
                }
                acsf acsfVar2 = msiVar.c;
                acra acraVar = msiVar.e.a;
                audj audjVar = msiVar.f;
                amkq.E(acsfVar2.b(audjVar));
                acraVar.I(3, adyu.ce(acsfVar2.c(audjVar)), null);
                return false;
            }
        });
        this.I = shfVar;
        Resources resources = this.g.getResources();
        this.D = resources;
        this.f241J = ajosVar;
        this.P = akbuVar;
        this.ah = ohgVar2;
        this.c = acsfVar;
        View view = this.i;
        this.a = view;
        this.b = (SwipeLayout) view.findViewById(R.id.swipe_layout);
        View findViewById = view.findViewById(R.id.playlist_video_item);
        this.K = findViewById;
        this.V = (TextView) view.findViewById(R.id.contributor_name);
        this.W = (ImageView) view.findViewById(R.id.contributor_avatar);
        View findViewById2 = view.findViewById(R.id.video_info_view);
        this.L = (FrameLayout) findViewById2.findViewById(R.id.body_start_container);
        this.M = (TextView) findViewById2.findViewById(R.id.index);
        TextView textView = (TextView) findViewById2.findViewById(R.id.offer_button);
        this.U = textView;
        this.C = findViewById2.findViewById(R.id.thumbnail_layout);
        this.S = (FrameLayout) findViewById2.findViewById(R.id.drag_handle_container);
        this.F = ajygVar.a(textView);
        this.Y = (ViewStub) view.findViewById(R.id.drag_handle);
        TextView textView2 = this.j;
        this.R = textView2 != null ? textView2.getTextSize() : 0.0f;
        this.N = findViewById.getBackground();
        ColorDrawable colorDrawable = new ColorDrawable(wbs.W(context, R.attr.ytGeneralBackgroundA).orElse(0));
        this.O = colorDrawable;
        colorDrawable.setAlpha(resources.getInteger(R.integer.list_item_dragging_background_alpha));
        this.Q = new Handler(Looper.getMainLooper());
        gmaVar.c(findViewById);
    }

    private static apkf d(audj audjVar) {
        apkd apkdVar = audjVar.m;
        if (apkdVar == null) {
            apkdVar = apkd.a;
        }
        if ((apkdVar.b & 2) == 0) {
            return null;
        }
        apkd apkdVar2 = audjVar.m;
        if (apkdVar2 == null) {
            apkdVar2 = apkd.a;
        }
        apkf apkfVar = apkdVar2.d;
        return apkfVar == null ? apkf.a : apkfVar;
    }

    private static final int e(View view, int i) {
        int marginStart = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginStart();
        yny.z(view, yny.h(yny.r(i), yny.q(i)), ViewGroup.MarginLayoutParams.class);
        return marginStart;
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.a;
    }

    @Override // defpackage.mlc, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        lsz lszVar = this.ae;
        if (lszVar != null) {
            lsz.h(lszVar.g, this);
            lsz.h(this.ae.e, this);
            this.ae.b.remove(this);
            this.ae = null;
        }
        View view = this.X;
        if (view != null) {
            view.setOnTouchListener(null);
            this.X.setOnClickListener(null);
        }
        zes zesVar = this.af;
        if (zesVar != null) {
            zesVar.c();
        }
        Integer num = this.Z;
        if (num != null) {
            e(this.X, num.intValue());
            this.Z = null;
        }
        Integer num2 = this.aa;
        if (num2 != null) {
            e(this.L, num2.intValue());
            this.aa = null;
        }
        this.G.c();
        muf.i(this.ac, this.b, this.ad, ajosVar);
        this.ac = null;
        this.d = null;
        jyh jyhVar = this.ag;
        if (jyhVar != null) {
            jyhVar.b.m(jyhVar);
            jyhVar.b.m(jyhVar.d);
            fjg fjgVar = jyhVar.j;
            if (fjgVar != null) {
                jyhVar.d.b(fjgVar);
            }
            fjl fjlVar = jyhVar.i;
            if (fjlVar != null) {
                jyhVar.c.b(fjlVar);
            }
            jyhVar.f.setTextColor(wbs.W(jyhVar.a, R.attr.ytTextSecondary).orElse(0));
            jyhVar.f.setMaxLines(1);
            jyhVar.e.getViewTreeObserver().removeOnGlobalLayoutListener(jyhVar.h);
            whu.I(jyhVar.e, true);
            whu.I(jyhVar.g, false);
            jyhVar.k = null;
            jyhVar.l = null;
            this.ag = null;
        }
        TextView textView = this.j;
        if (textView != null) {
            textView.setTextSize(0, this.R);
        }
        this.e = null;
        this.f = null;
    }

    @Override // defpackage.lsy
    public final void c(ajom ajomVar, ajpd ajpdVar, int i) {
        if (ajomVar != this) {
            return;
        }
        this.K.setBackground(this.O);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0385  */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.graphics.drawable.Drawable] */
    @Override // defpackage.ajom
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void oB(defpackage.ajok r28, java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msi.oB(ajok, java.lang.Object):void");
    }

    @Override // defpackage.lsw
    public final void oD(ajom ajomVar, ajpd ajpdVar, int i, int i2) {
        if (ajomVar != this) {
            return;
        }
        this.K.setBackground(this.N);
    }
}
