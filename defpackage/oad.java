package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBarWrapper;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oad implements oan, fgp, adue, xjj {
    public static final long a = TimeUnit.SECONDS.toMillis(1);
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public final aadw D;
    public final yzr E;
    private final Context F;
    private final nnb G;
    private final nne H;
    private final ViewGroup I;

    /* renamed from: J, reason: collision with root package name */
    private final ViewGroup f248J;
    private final View K;
    private final ImageView L;
    private final gpe M;
    private final boolean N;
    private final boolean O;
    private int P;
    public int b;
    public final azrw c;
    public final View d;
    public final int e;
    public final int f;
    public final TextView g;
    public final oac h;
    public final oak i;
    public final oas j;
    public final adul k;
    public final xjl l;
    public final fgq m;
    public final aioc n;
    public final ayqw o;
    public final ayqw p;
    public final ypa q;
    public final nzz r;
    public final Runnable s;
    public final azqw t;
    public final azqw u;
    public final azqw v;
    public final boolean w;
    public adub x;
    public boolean y;
    public CharSequence z;

    public oad(Context context, azrw azrwVar, final acra acraVar, final nnd nndVar, final nnb nnbVar, nne nneVar, ahfg ahfgVar, xin xinVar, ahep ahepVar, xcl xclVar, ogx ogxVar, aadw aadwVar, aioc aiocVar, adul adulVar, xjl xjlVar, ypa ypaVar, fgq fgqVar, ajoy ajoyVar, boolean z, gpe gpeVar, oam oamVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        oaf oafVar = new oaf();
        oag oagVar = new oag();
        fmt fmtVar = ((InlineTimeBarWrapper) oamVar.c()).a;
        Context context2 = (Context) ogxVar.b.get();
        context2.getClass();
        aadw aadwVar2 = (aadw) ogxVar.c.get();
        aadwVar2.getClass();
        aioc aiocVar2 = (aioc) ogxVar.a.get();
        aiocVar2.getClass();
        ypa ypaVar2 = (ypa) ogxVar.d.get();
        ypaVar2.getClass();
        fmtVar.getClass();
        oas oasVar = new oas(context2, aadwVar2, aiocVar2, ypaVar2, fmtVar);
        View b = oamVar.b();
        ImageView imageView = (ImageView) b.findViewById(R.id.floaty_play_pause_button);
        ProgressBar progressBar = (ProgressBar) b.findViewById(R.id.progress_bar);
        nzu nzuVar = new nzu(azrwVar, acraVar);
        imageView.getClass();
        progressBar.getClass();
        adlt adltVar = (adlt) ajoyVar.a.get();
        adltVar.getClass();
        oak oakVar = new oak(imageView, progressBar, nzuVar, adltVar);
        oakVar.g = new oai(oakVar.c, oakVar.d, oakVar);
        oakVar.d();
        this.b = -1;
        this.y = false;
        this.F = context;
        this.G = nnbVar;
        this.H = nneVar;
        this.D = aadwVar;
        this.c = azrwVar;
        this.j = oasVar;
        this.i = oakVar;
        this.n = aiocVar;
        this.k = adulVar;
        this.l = xjlVar;
        this.q = ypaVar;
        this.m = fgqVar;
        this.N = z;
        this.M = gpeVar;
        this.O = evr.aF(aadwVar);
        this.o = new ayqw();
        this.p = new ayqw();
        this.r = new nzz(this);
        this.s = new nzx(this);
        asvu asvuVar = aadwVar.b().e;
        this.w = (asvuVar == null ? asvu.a : asvuVar).ac;
        View b2 = oamVar.b();
        this.d = b2;
        ViewGroup viewGroup = (ViewGroup) b2.findViewById(R.id.floaty_bar_controls_view);
        this.I = viewGroup;
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: nzt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acra acraVar2 = acra.this;
                nnd nndVar2 = nndVar;
                acraVar2.I(3, new acqx(acsb.c(35989)), null);
                nndVar2.q();
            }
        });
        viewGroup.findViewById(R.id.floaty_close_button).setOnClickListener(new View.OnClickListener() { // from class: nzs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acra acraVar2 = acra.this;
                nnb nnbVar2 = nnbVar;
                acraVar2.I(3, new acqx(acsb.c(34699)), null);
                nnbVar2.f();
            }
        });
        Resources resources = context.getResources();
        this.f = resources.getDimensionPixelSize(R.dimen.floaty_bar_height);
        this.e = resources.getDimensionPixelSize(R.dimen.floaty_bar_height) + resources.getDimensionPixelOffset(R.dimen.floaty_bar_start_bottom_padding);
        this.g = (TextView) viewGroup.findViewById(R.id.floaty_title);
        this.h = new oac((TextView) viewGroup.findViewById(R.id.floaty_subtitle));
        this.f248J = (ViewGroup) viewGroup.findViewById(R.id.controls_layout);
        this.K = viewGroup.findViewById(R.id.play_pause_layout);
        this.L = (ImageView) viewGroup.findViewById(R.id.floaty_close_button);
        viewGroup.setTag(viewGroup.getId(), new Object[]{oafVar, oagVar});
        oagVar.b = this;
        xinVar.c(oafVar);
        ahfgVar.a(oagVar);
        oagVar.a.add(ahepVar);
        oak oakVar2 = oagVar.c;
        if (oakVar2 != null) {
            oakVar2.a(ahepVar);
        }
        oafVar.b = true;
        oafVar.a = new xlb(acraVar, xclVar);
        oafVar.a.c(oakVar.e);
        this.E = new yzr((YouTubeTextView) viewGroup.findViewById(R.id.ad_badge));
        oagVar.d = true;
        oagVar.c = oakVar;
        int i = 0;
        while (true) {
            aeb aebVar = oagVar.a;
            if (i < aebVar.b) {
                oakVar.a((ahep) aebVar.b(i));
                i++;
            } else {
                oamVar.d(this);
                this.t = azqv.aq(false);
                this.u = azqy.ap();
                this.v = azqv.aq(false);
                oZ(2, adulVar.i);
                return;
            }
        }
    }

    public static boolean g(Context context) {
        return yjk.X(context);
    }

    private final boolean h() {
        return this.O ? this.M.f : this.N;
    }

    @Override // defpackage.xjj
    public final /* synthetic */ void a(xae xaeVar) {
    }

    @Override // defpackage.xjj
    public final void b(xag xagVar) {
        String string = this.d.getResources().getString(R.string.advertisement_assurance);
        if (!TextUtils.equals(this.B, string)) {
            this.B = string;
            if (this.b == 1) {
                f(string);
            }
        }
        if (TextUtils.equals(null, null) || this.b != 1) {
            return;
        }
        this.h.b(null);
    }

    public final int c(boolean z, boolean z2) {
        if (z) {
            return 1;
        }
        return !z2 ? 2 : 4;
    }

    public final void d() {
        if (this.b != 0) {
            return;
        }
        f(this.z);
        if (this.x.j == 2) {
            this.h.b(this.A);
        }
    }

    @Override // defpackage.ofd
    public final void e(int i, int i2) {
    }

    public final void f(CharSequence charSequence) {
        this.g.setText(charSequence);
    }

    @Override // defpackage.fgp
    public final void oQ(fhg fhgVar) {
        if (fhgVar == fhg.WATCH_WHILE_MINIMIZED) {
            this.I.sendAccessibilityEvent(8);
        }
    }

    @Override // defpackage.fgp
    public final /* synthetic */ void oR(fhg fhgVar, fhg fhgVar2) {
        fav.g(this, fhgVar2);
    }

    @Override // defpackage.oex
    public final void oY(ofa ofaVar, ofa ofaVar2) {
    }

    @Override // defpackage.adue
    public final void oZ(int i, adub adubVar) {
        this.x = adubVar;
        atax ataxVar = this.D.b().n;
        if (ataxVar == null) {
            ataxVar = atax.a;
        }
        boolean z = ataxVar.k;
        if (z) {
            if (adubVar.a == 4) {
                this.i.c(true);
                PlayerResponseModel playerResponseModel = adubVar.k.a;
                if (playerResponseModel != null) {
                    f(playerResponseModel.x());
                }
            } else {
                this.i.c(false);
                f(adubVar.b);
                oac oacVar = this.h;
                adub adubVar2 = this.x;
                int i2 = adubVar2.e;
                int i3 = adubVar2.d;
                oacVar.b((i2 >= i3 || i3 == 0) ? "" : this.F.getString(R.string.floaty_bar_queue_status, String.valueOf(i2 + 1), String.valueOf(this.x.d)));
            }
        }
        fhg g = this.m.g();
        int i4 = adubVar.j;
        if (i4 != 0) {
            if (i4 == 1 && z && !g.f() && adubVar.d > 0) {
                this.H.r(1, 1);
                return;
            }
            return;
        }
        if (z && g.k()) {
            this.G.f();
        }
    }

    @Override // defpackage.obo
    public final void pa(obp obpVar) {
        float m = obpVar.m();
        float n = obpVar.n();
        this.I.setAlpha(m);
        this.f248J.setAlpha(n);
        this.j.a.setAlpha(n * m);
        if (this.f248J.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            if (h()) {
                Rect t = obpVar.t();
                if (this.O) {
                    yny.z(this.f248J, yny.s(0, t.height(), 0, 0), ViewGroup.MarginLayoutParams.class);
                } else {
                    yny.z(this.f248J, yny.v(t.height()), ViewGroup.MarginLayoutParams.class);
                }
            } else {
                Rect t2 = obpVar.t();
                if (this.O) {
                    yny.z(this.f248J, yny.s(t2.width(), 0, 0, 0), ViewGroup.MarginLayoutParams.class);
                } else {
                    yny.z(this.f248J, yny.r(t2.width()), ViewGroup.MarginLayoutParams.class);
                }
            }
            int dimensionPixelSize = this.F.getResources().getDimensionPixelSize(true != h() ? R.dimen.floaty_bar_button_top_margin : R.dimen.floaty_box_button_top_margin);
            if (this.P == dimensionPixelSize) {
                return;
            }
            this.P = dimensionPixelSize;
            yny.z(this.K, yny.v(dimensionPixelSize), ViewGroup.MarginLayoutParams.class);
            yny.z(this.L, yny.v(dimensionPixelSize), ViewGroup.MarginLayoutParams.class);
        }
    }
}
