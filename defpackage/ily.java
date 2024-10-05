package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ReelPlayerOverlayRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelVodLinkRendererOuterClass;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ily extends aivc implements ikq, ikm {
    private final ima A;
    private final View B;
    private final View C;
    private final ImageView D;
    private final LinearLayout E;
    private final Animation F;
    private final ImageView G;
    private final ImageView H;
    private final String I;

    /* renamed from: J, reason: collision with root package name */
    private final String f223J;
    private final acqz K;
    private final View L;
    private final View M;
    private final View N;
    private final View O;
    private final boolean P;
    private View Q;
    public final ikn a;
    public final ikr b;
    public final ika c;
    public final ilr d;
    public final ReelPlayerProgressPresenter e;
    public final ilb f;
    public final View g;
    public final View h;
    public final ainy i;
    public final imk j;
    public final ikt k;
    public final View l;
    public final View m;
    public final View n;
    public final ilc o;
    public final ilw p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public List z;

    public ily(Context context, ajjz ajjzVar, ainy ainyVar, acqz acqzVar, imk imkVar, ika ikaVar, ikr ikrVar, final ilb ilbVar, aiqn aiqnVar, ilw ilwVar, byte[] bArr, byte[] bArr2) {
        super(context);
        this.y = true;
        this.i = ainyVar;
        this.K = acqzVar;
        this.b = ikrVar;
        this.f = ilbVar;
        this.c = ikaVar;
        ilr ilrVar = new ilr();
        this.d = ilrVar;
        this.j = imkVar;
        this.p = ilwVar;
        boolean e = zev.e(context);
        this.P = e;
        ikrVar.u = this;
        ikrVar.f = ilrVar;
        ikrVar.e = this;
        LayoutInflater.from(context).inflate(R.layout.reel_player_overlay2, this);
        View findViewById = findViewById(R.id.reel_loading_spinner);
        findViewById.getClass();
        ilrVar.a = findViewById;
        ilrVar.c = findViewById(R.id.reel_error_scrim);
        ilrVar.b = findViewById(R.id.reel_error_group);
        ilrVar.d = findViewById(R.id.reel_error_icon);
        ilrVar.e = (TextView) findViewById(R.id.reel_error_message);
        ImageView imageView = (ImageView) findViewById(R.id.reel_frame0_image_view);
        imageView.getClass();
        ilbVar.e = imageView;
        ilbVar.g = new ikz(new ColorDrawable(imageView.getContext().getResources().getColor(R.color.yt_black4)));
        ilbVar.h = new ajkj(ilbVar.a, ilbVar.d, new ajjw() { // from class: iku
            @Override // defpackage.ajjw
            public final zaa a() {
                return ilb.this.g;
            }
        }, imageView, true);
        ImageView imageView2 = (ImageView) findViewById(R.id.reel_player_pause_frame_image_view);
        imageView2.getClass();
        ilbVar.f = imageView2;
        View findViewById2 = findViewById(R.id.reel_player_overlay_layout);
        this.C = findViewById2;
        ReelPlayerProgressPresenter reelPlayerProgressPresenter = (ReelPlayerProgressPresenter) findViewById(R.id.reel_progress_bar);
        this.e = reelPlayerProgressPresenter;
        reelPlayerProgressPresenter.setAlpha(0.0f);
        this.A = new ima(findViewById2, ajjzVar);
        amsj amsjVar = (amsj) aiqnVar.i.get();
        amsjVar.getClass();
        amsj amsjVar2 = (amsj) aiqnVar.j.get();
        amsjVar2.getClass();
        ilp ilpVar = (ilp) aiqnVar.a.get();
        ilpVar.getClass();
        ajjz ajjzVar2 = (ajjz) aiqnVar.k.get();
        ajjzVar2.getClass();
        aahd aahdVar = (aahd) aiqnVar.d.get();
        aahdVar.getClass();
        ggy ggyVar = (ggy) aiqnVar.m.get();
        acqz acqzVar2 = (acqz) aiqnVar.e.get();
        acqzVar2.getClass();
        ftn ftnVar = (ftn) aiqnVar.o.get();
        ftnVar.getClass();
        ajyw ajywVar = (ajyw) aiqnVar.q.get();
        amsj amsjVar3 = (amsj) aiqnVar.h.get();
        amsjVar3.getClass();
        ajut ajutVar = (ajut) aiqnVar.b.get();
        ajutVar.getClass();
        ajoy ajoyVar = (ajoy) aiqnVar.n.get();
        ajoyVar.getClass();
        ajdw ajdwVar = (ajdw) aiqnVar.g.get();
        ajdwVar.getClass();
        ((ajfh) aiqnVar.l.get()).getClass();
        yqw yqwVar = (yqw) aiqnVar.f.get();
        axze axzeVar = (axze) aiqnVar.p.get();
        axzeVar.getClass();
        aaea aaeaVar = (aaea) aiqnVar.c.get();
        aaeaVar.getClass();
        ikn iknVar = new ikn(amsjVar, amsjVar2, ilpVar, ajjzVar2, aahdVar, ggyVar, acqzVar2, ftnVar, ajywVar, amsjVar3, ajutVar, ajoyVar, ajdwVar, yqwVar, axzeVar, aaeaVar, this, this, null, null, null, null, null, null);
        this.a = iknVar;
        iknVar.t = ilwVar;
        this.o = iknVar;
        this.k = new ikt((ViewGroup) findViewById(R.id.reel_player_overlay_tap_feedback));
        this.F = AnimationUtils.loadAnimation(getContext(), R.anim.reel_seek_feedback_anim);
        this.B = findViewById(R.id.reel_video_link);
        this.G = (ImageView) findViewById(R.id.reel_seek_feedback_prev);
        this.H = (ImageView) findViewById(R.id.reel_seek_feedback_next);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.reel_control_group);
        this.E = linearLayout;
        this.I = context.getString(R.string.reel_accessibility_play_video);
        this.f223J = context.getString(R.string.reel_accessibility_pause_video);
        this.Q = findViewById(R.id.reel_player_overlay_v2_scrims);
        whu.I(linearLayout, e);
        View findViewById3 = findViewById(R.id.reel_back_button);
        this.m = findViewById3;
        View findViewById4 = findViewById(R.id.reel_close_button);
        this.n = findViewById4;
        final int i = 1;
        findViewById3.setOnClickListener(new View.OnClickListener(this) { // from class: ilu
            public final /* synthetic */ ily a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ijo ijoVar;
                aukf aK;
                aukq aukqVar;
                switch (i) {
                    case 0:
                        this.a.d();
                        return;
                    case 1:
                        this.a.d();
                        return;
                    case 2:
                        ilw ilwVar2 = this.a.p;
                        if (ilwVar2 == null || (aK = (ijoVar = (ijo) ilwVar2).aK()) == null || (aK.b & 128) == 0) {
                            return;
                        }
                        aulq aulqVar = aK.j;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                        if (aulqVar.pY(ReelVodLinkRendererOuterClass.reelVodLinkRenderer)) {
                            aulq aulqVar2 = aK.j;
                            if (aulqVar2 == null) {
                                aulqVar2 = aulq.a;
                            }
                            aukqVar = (aukq) aulqVar2.pX(ReelVodLinkRendererOuterClass.reelVodLinkRenderer);
                        } else {
                            aukqVar = null;
                        }
                        if (aukqVar != null) {
                            int i2 = aukqVar.b;
                            if ((i2 & 16) != 0) {
                                if ((i2 & 64) != 0) {
                                    ijoVar.aI().I(3, new acqx(aukqVar.h), null);
                                }
                                aahd aahdVar2 = ijoVar.ax;
                                apxf apxfVar = aukqVar.g;
                                if (apxfVar == null) {
                                    apxfVar = apxf.a;
                                }
                                aahdVar2.c(apxfVar, null);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        this.a.f();
                        return;
                    case 4:
                        this.a.e();
                        return;
                    case 5:
                        this.a.c.bm();
                        return;
                    case 6:
                        this.a.k();
                        return;
                    default:
                        ily ilyVar = this.a;
                        if (ilyVar.i.d()) {
                            ilyVar.i.a();
                            return;
                        } else {
                            ilyVar.i.b();
                            return;
                        }
                }
            }
        });
        final int i2 = 0;
        findViewById4.setOnClickListener(new View.OnClickListener(this) { // from class: ilu
            public final /* synthetic */ ily a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ijo ijoVar;
                aukf aK;
                aukq aukqVar;
                switch (i2) {
                    case 0:
                        this.a.d();
                        return;
                    case 1:
                        this.a.d();
                        return;
                    case 2:
                        ilw ilwVar2 = this.a.p;
                        if (ilwVar2 == null || (aK = (ijoVar = (ijo) ilwVar2).aK()) == null || (aK.b & 128) == 0) {
                            return;
                        }
                        aulq aulqVar = aK.j;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                        if (aulqVar.pY(ReelVodLinkRendererOuterClass.reelVodLinkRenderer)) {
                            aulq aulqVar2 = aK.j;
                            if (aulqVar2 == null) {
                                aulqVar2 = aulq.a;
                            }
                            aukqVar = (aukq) aulqVar2.pX(ReelVodLinkRendererOuterClass.reelVodLinkRenderer);
                        } else {
                            aukqVar = null;
                        }
                        if (aukqVar != null) {
                            int i22 = aukqVar.b;
                            if ((i22 & 16) != 0) {
                                if ((i22 & 64) != 0) {
                                    ijoVar.aI().I(3, new acqx(aukqVar.h), null);
                                }
                                aahd aahdVar2 = ijoVar.ax;
                                apxf apxfVar = aukqVar.g;
                                if (apxfVar == null) {
                                    apxfVar = apxf.a;
                                }
                                aahdVar2.c(apxfVar, null);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        this.a.f();
                        return;
                    case 4:
                        this.a.e();
                        return;
                    case 5:
                        this.a.c.bm();
                        return;
                    case 6:
                        this.a.k();
                        return;
                    default:
                        ily ilyVar = this.a;
                        if (ilyVar.i.d()) {
                            ilyVar.i.a();
                            return;
                        } else {
                            ilyVar.i.b();
                            return;
                        }
                }
            }
        });
        final int i3 = 2;
        findViewById(R.id.reel_video_link).setOnClickListener(new View.OnClickListener(this) { // from class: ilu
            public final /* synthetic */ ily a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ijo ijoVar;
                aukf aK;
                aukq aukqVar;
                switch (i3) {
                    case 0:
                        this.a.d();
                        return;
                    case 1:
                        this.a.d();
                        return;
                    case 2:
                        ilw ilwVar2 = this.a.p;
                        if (ilwVar2 == null || (aK = (ijoVar = (ijo) ilwVar2).aK()) == null || (aK.b & 128) == 0) {
                            return;
                        }
                        aulq aulqVar = aK.j;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                        if (aulqVar.pY(ReelVodLinkRendererOuterClass.reelVodLinkRenderer)) {
                            aulq aulqVar2 = aK.j;
                            if (aulqVar2 == null) {
                                aulqVar2 = aulq.a;
                            }
                            aukqVar = (aukq) aulqVar2.pX(ReelVodLinkRendererOuterClass.reelVodLinkRenderer);
                        } else {
                            aukqVar = null;
                        }
                        if (aukqVar != null) {
                            int i22 = aukqVar.b;
                            if ((i22 & 16) != 0) {
                                if ((i22 & 64) != 0) {
                                    ijoVar.aI().I(3, new acqx(aukqVar.h), null);
                                }
                                aahd aahdVar2 = ijoVar.ax;
                                apxf apxfVar = aukqVar.g;
                                if (apxfVar == null) {
                                    apxfVar = apxf.a;
                                }
                                aahdVar2.c(apxfVar, null);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        this.a.f();
                        return;
                    case 4:
                        this.a.e();
                        return;
                    case 5:
                        this.a.c.bm();
                        return;
                    case 6:
                        this.a.k();
                        return;
                    default:
                        ily ilyVar = this.a;
                        if (ilyVar.i.d()) {
                            ilyVar.i.a();
                            return;
                        } else {
                            ilyVar.i.b();
                            return;
                        }
                }
            }
        });
        View findViewById5 = findViewById(R.id.reel_prev_video_button);
        this.L = findViewById5;
        View findViewById6 = findViewById(R.id.reel_next_video_button);
        this.M = findViewById6;
        final int i4 = 3;
        findViewById5.setOnClickListener(new View.OnClickListener(this) { // from class: ilu
            public final /* synthetic */ ily a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ijo ijoVar;
                aukf aK;
                aukq aukqVar;
                switch (i4) {
                    case 0:
                        this.a.d();
                        return;
                    case 1:
                        this.a.d();
                        return;
                    case 2:
                        ilw ilwVar2 = this.a.p;
                        if (ilwVar2 == null || (aK = (ijoVar = (ijo) ilwVar2).aK()) == null || (aK.b & 128) == 0) {
                            return;
                        }
                        aulq aulqVar = aK.j;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                        if (aulqVar.pY(ReelVodLinkRendererOuterClass.reelVodLinkRenderer)) {
                            aulq aulqVar2 = aK.j;
                            if (aulqVar2 == null) {
                                aulqVar2 = aulq.a;
                            }
                            aukqVar = (aukq) aulqVar2.pX(ReelVodLinkRendererOuterClass.reelVodLinkRenderer);
                        } else {
                            aukqVar = null;
                        }
                        if (aukqVar != null) {
                            int i22 = aukqVar.b;
                            if ((i22 & 16) != 0) {
                                if ((i22 & 64) != 0) {
                                    ijoVar.aI().I(3, new acqx(aukqVar.h), null);
                                }
                                aahd aahdVar2 = ijoVar.ax;
                                apxf apxfVar = aukqVar.g;
                                if (apxfVar == null) {
                                    apxfVar = apxf.a;
                                }
                                aahdVar2.c(apxfVar, null);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        this.a.f();
                        return;
                    case 4:
                        this.a.e();
                        return;
                    case 5:
                        this.a.c.bm();
                        return;
                    case 6:
                        this.a.k();
                        return;
                    default:
                        ily ilyVar = this.a;
                        if (ilyVar.i.d()) {
                            ilyVar.i.a();
                            return;
                        } else {
                            ilyVar.i.b();
                            return;
                        }
                }
            }
        });
        final int i5 = 4;
        findViewById6.setOnClickListener(new View.OnClickListener(this) { // from class: ilu
            public final /* synthetic */ ily a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ijo ijoVar;
                aukf aK;
                aukq aukqVar;
                switch (i5) {
                    case 0:
                        this.a.d();
                        return;
                    case 1:
                        this.a.d();
                        return;
                    case 2:
                        ilw ilwVar2 = this.a.p;
                        if (ilwVar2 == null || (aK = (ijoVar = (ijo) ilwVar2).aK()) == null || (aK.b & 128) == 0) {
                            return;
                        }
                        aulq aulqVar = aK.j;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                        if (aulqVar.pY(ReelVodLinkRendererOuterClass.reelVodLinkRenderer)) {
                            aulq aulqVar2 = aK.j;
                            if (aulqVar2 == null) {
                                aulqVar2 = aulq.a;
                            }
                            aukqVar = (aukq) aulqVar2.pX(ReelVodLinkRendererOuterClass.reelVodLinkRenderer);
                        } else {
                            aukqVar = null;
                        }
                        if (aukqVar != null) {
                            int i22 = aukqVar.b;
                            if ((i22 & 16) != 0) {
                                if ((i22 & 64) != 0) {
                                    ijoVar.aI().I(3, new acqx(aukqVar.h), null);
                                }
                                aahd aahdVar2 = ijoVar.ax;
                                apxf apxfVar = aukqVar.g;
                                if (apxfVar == null) {
                                    apxfVar = apxf.a;
                                }
                                aahdVar2.c(apxfVar, null);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        this.a.f();
                        return;
                    case 4:
                        this.a.e();
                        return;
                    case 5:
                        this.a.c.bm();
                        return;
                    case 6:
                        this.a.k();
                        return;
                    default:
                        ily ilyVar = this.a;
                        if (ilyVar.i.d()) {
                            ilyVar.i.a();
                            return;
                        } else {
                            ilyVar.i.b();
                            return;
                        }
                }
            }
        });
        View findViewById7 = findViewById(R.id.reel_prev_reel_button);
        this.N = findViewById7;
        final int i6 = 5;
        findViewById7.setOnClickListener(new View.OnClickListener(this) { // from class: ilu
            public final /* synthetic */ ily a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ijo ijoVar;
                aukf aK;
                aukq aukqVar;
                switch (i6) {
                    case 0:
                        this.a.d();
                        return;
                    case 1:
                        this.a.d();
                        return;
                    case 2:
                        ilw ilwVar2 = this.a.p;
                        if (ilwVar2 == null || (aK = (ijoVar = (ijo) ilwVar2).aK()) == null || (aK.b & 128) == 0) {
                            return;
                        }
                        aulq aulqVar = aK.j;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                        if (aulqVar.pY(ReelVodLinkRendererOuterClass.reelVodLinkRenderer)) {
                            aulq aulqVar2 = aK.j;
                            if (aulqVar2 == null) {
                                aulqVar2 = aulq.a;
                            }
                            aukqVar = (aukq) aulqVar2.pX(ReelVodLinkRendererOuterClass.reelVodLinkRenderer);
                        } else {
                            aukqVar = null;
                        }
                        if (aukqVar != null) {
                            int i22 = aukqVar.b;
                            if ((i22 & 16) != 0) {
                                if ((i22 & 64) != 0) {
                                    ijoVar.aI().I(3, new acqx(aukqVar.h), null);
                                }
                                aahd aahdVar2 = ijoVar.ax;
                                apxf apxfVar = aukqVar.g;
                                if (apxfVar == null) {
                                    apxfVar = apxf.a;
                                }
                                aahdVar2.c(apxfVar, null);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        this.a.f();
                        return;
                    case 4:
                        this.a.e();
                        return;
                    case 5:
                        this.a.c.bm();
                        return;
                    case 6:
                        this.a.k();
                        return;
                    default:
                        ily ilyVar = this.a;
                        if (ilyVar.i.d()) {
                            ilyVar.i.a();
                            return;
                        } else {
                            ilyVar.i.b();
                            return;
                        }
                }
            }
        });
        View findViewById8 = findViewById(R.id.reel_next_reel_button);
        this.O = findViewById8;
        final int i7 = 6;
        findViewById8.setOnClickListener(new View.OnClickListener(this) { // from class: ilu
            public final /* synthetic */ ily a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ijo ijoVar;
                aukf aK;
                aukq aukqVar;
                switch (i7) {
                    case 0:
                        this.a.d();
                        return;
                    case 1:
                        this.a.d();
                        return;
                    case 2:
                        ilw ilwVar2 = this.a.p;
                        if (ilwVar2 == null || (aK = (ijoVar = (ijo) ilwVar2).aK()) == null || (aK.b & 128) == 0) {
                            return;
                        }
                        aulq aulqVar = aK.j;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                        if (aulqVar.pY(ReelVodLinkRendererOuterClass.reelVodLinkRenderer)) {
                            aulq aulqVar2 = aK.j;
                            if (aulqVar2 == null) {
                                aulqVar2 = aulq.a;
                            }
                            aukqVar = (aukq) aulqVar2.pX(ReelVodLinkRendererOuterClass.reelVodLinkRenderer);
                        } else {
                            aukqVar = null;
                        }
                        if (aukqVar != null) {
                            int i22 = aukqVar.b;
                            if ((i22 & 16) != 0) {
                                if ((i22 & 64) != 0) {
                                    ijoVar.aI().I(3, new acqx(aukqVar.h), null);
                                }
                                aahd aahdVar2 = ijoVar.ax;
                                apxf apxfVar = aukqVar.g;
                                if (apxfVar == null) {
                                    apxfVar = apxf.a;
                                }
                                aahdVar2.c(apxfVar, null);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        this.a.f();
                        return;
                    case 4:
                        this.a.e();
                        return;
                    case 5:
                        this.a.c.bm();
                        return;
                    case 6:
                        this.a.k();
                        return;
                    default:
                        ily ilyVar = this.a;
                        if (ilyVar.i.d()) {
                            ilyVar.i.a();
                            return;
                        } else {
                            ilyVar.i.b();
                            return;
                        }
                }
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.reel_play_pause_button);
        this.D = imageView3;
        final int i8 = 7;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: ilu
            public final /* synthetic */ ily a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ijo ijoVar;
                aukf aK;
                aukq aukqVar;
                switch (i8) {
                    case 0:
                        this.a.d();
                        return;
                    case 1:
                        this.a.d();
                        return;
                    case 2:
                        ilw ilwVar2 = this.a.p;
                        if (ilwVar2 == null || (aK = (ijoVar = (ijo) ilwVar2).aK()) == null || (aK.b & 128) == 0) {
                            return;
                        }
                        aulq aulqVar = aK.j;
                        if (aulqVar == null) {
                            aulqVar = aulq.a;
                        }
                        if (aulqVar.pY(ReelVodLinkRendererOuterClass.reelVodLinkRenderer)) {
                            aulq aulqVar2 = aK.j;
                            if (aulqVar2 == null) {
                                aulqVar2 = aulq.a;
                            }
                            aukqVar = (aukq) aulqVar2.pX(ReelVodLinkRendererOuterClass.reelVodLinkRenderer);
                        } else {
                            aukqVar = null;
                        }
                        if (aukqVar != null) {
                            int i22 = aukqVar.b;
                            if ((i22 & 16) != 0) {
                                if ((i22 & 64) != 0) {
                                    ijoVar.aI().I(3, new acqx(aukqVar.h), null);
                                }
                                aahd aahdVar2 = ijoVar.ax;
                                apxf apxfVar = aukqVar.g;
                                if (apxfVar == null) {
                                    apxfVar = apxf.a;
                                }
                                aahdVar2.c(apxfVar, null);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        this.a.f();
                        return;
                    case 4:
                        this.a.e();
                        return;
                    case 5:
                        this.a.c.bm();
                        return;
                    case 6:
                        this.a.k();
                        return;
                    default:
                        ily ilyVar = this.a;
                        if (ilyVar.i.d()) {
                            ilyVar.i.a();
                            return;
                        } else {
                            ilyVar.i.b();
                            return;
                        }
                }
            }
        });
        this.l = findViewById(R.id.reel_player_header_container);
        this.g = findViewById(R.id.reel_player_no_nav_top);
        this.h = findViewById(R.id.reel_player_no_nav_bottom);
        etx.L(findViewById2, new Runnable() { // from class: ils
            @Override // java.lang.Runnable
            public final void run() {
                ily ilyVar = ily.this;
                etx.M(ilyVar.m, ilyVar.y);
            }
        });
    }

    public static void j(final View view, final float f, long j, long j2) {
        view.animate().alpha(f).setStartDelay(j2).setDuration(j).withStartAction(new hgc(view, 4)).withEndAction(new Runnable() { // from class: ilv
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(f == 0.0f ? 4 : 0);
            }
        });
    }

    @Override // defpackage.ikm
    public final void a() {
        ijo ijoVar = (ijo) this.p;
        aukf aK = ijoVar.aK();
        if (aK != null) {
            int i = aK.b;
            if ((i & 16) == 0 || (i & 64) == 0) {
                return;
            }
            atdf atdfVar = aK.g;
            if (atdfVar == null) {
                atdfVar = atdf.a;
            }
            if ((atdfVar.b & 1) != 0) {
                atdf atdfVar2 = aK.g;
                if (atdfVar2 == null) {
                    atdfVar2 = atdf.a;
                }
                atdc atdcVar = atdfVar2.c;
                if (atdcVar == null) {
                    atdcVar = atdc.a;
                }
                ijoVar.r(atdcVar);
            }
        }
    }

    @Override // defpackage.ikm
    public final void b() {
        int i;
        ijo ijoVar = (ijo) this.p;
        aukf aK = ijoVar.aK();
        if (aK == null || (i = aK.b & 524288) == 0) {
            return;
        }
        boolean z = i != 0;
        aulq aulqVar = aK.u;
        if (aulqVar == null) {
            aulqVar = aulq.a;
        }
        apmg V = etx.V(z, aulqVar);
        aahd aahdVar = ijoVar.ax;
        apxf apxfVar = V.o;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aahdVar.a(apxfVar);
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new ViewGroup.LayoutParams(-1, -1);
    }

    @Override // defpackage.ikq
    public final void d() {
        ilw ilwVar = this.p;
        if (ilwVar != null) {
            ilwVar.aQ();
        }
    }

    @Override // defpackage.ikq
    public final void e() {
        if (this.c.bj() == 2) {
            this.F.setAnimationListener(new ahrc(this.H, 1));
            this.H.clearAnimation();
            this.H.startAnimation(this.F);
        }
    }

    @Override // defpackage.ikq
    public final void f() {
        if (this.c.bk() == 1) {
            return;
        }
        this.F.setAnimationListener(new ahrc(this.G, 1));
        this.G.clearAnimation();
        this.G.startAnimation(this.F);
    }

    public final int g() {
        return this.h.getHeight();
    }

    public final int h() {
        return this.g.getHeight();
    }

    public final void i(boolean z) {
        long j = true != z ? 0L : 800L;
        if (!z) {
            long j2 = j;
            j(this.C, 1.0f, 250L, j2);
            j(this.Q, 1.0f, 250L, j2);
            j(this.e, true != this.v ? 1.0f : 0.0f, 200L, j);
            return;
        }
        if (((ijo) this.p).ae.q()) {
            return;
        }
        long j3 = j;
        j(this.C, 0.0f, 250L, j3);
        j(this.Q, 0.0f, 250L, j3);
        j(this.e, true != this.v ? 0.0f : 1.0f, 200L, j);
    }

    public final void k() {
        this.c.bl();
    }

    public final void l() {
        this.G.clearAnimation();
        this.H.clearAnimation();
        this.G.setVisibility(4);
        this.H.setVisibility(4);
        this.f.h();
        this.f.b();
        this.d.c();
        this.j.g();
        this.z = null;
    }

    public final void m(String str, arsd arsdVar, long j, boolean z, boolean z2, ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        n(str, arsdVar, j, false, z, z2, reelWatchEndpointOuterClass$ReelWatchEndpoint);
    }

    public final void n(String str, arsd arsdVar, long j, boolean z, boolean z2, boolean z3, ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        aukf aukfVar = null;
        if (arsdVar != null) {
            aukg aukgVar = arsdVar.d;
            if (aukgVar == null) {
                aukgVar = aukg.a;
            }
            if ((aukgVar.b & 1) != 0) {
                aukg aukgVar2 = arsdVar.d;
                if (aukgVar2 == null) {
                    aukgVar2 = aukg.a;
                }
                aukfVar = aukgVar2.c;
                if (aukfVar == null) {
                    aukfVar = aukf.a;
                }
            }
        }
        o(str, aukfVar, j, z, z2, etx.ac(arsdVar), z3, reelWatchEndpointOuterClass$ReelWatchEndpoint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0292  */
    /* JADX WARN: Type inference failed for: r19v0, types: [ily] */
    /* JADX WARN: Type inference failed for: r1v23, types: [android.widget.FrameLayout$LayoutParams] */
    /* JADX WARN: Type inference failed for: r1v35, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [imk] */
    /* JADX WARN: Type inference failed for: r5v2, types: [ime] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(java.lang.String r20, defpackage.aukf r21, long r22, boolean r24, boolean r25, boolean r26, boolean r27, com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint r28) {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ily.o(java.lang.String, aukf, long, boolean, boolean, boolean, boolean, com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint):void");
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        ilw ilwVar = this.p;
        if (z) {
            ijo ijoVar = (ijo) ilwVar;
            ijoVar.al.c(ijoVar.bh);
            ijoVar.bh = 0;
        } else {
            ijo ijoVar2 = (ijo) ilwVar;
            if (ijoVar2.bh == 0) {
                ijoVar2.bh = ijoVar2.al.b();
            }
        }
    }

    public final void p(aukf aukfVar, final boolean z) {
        if (aukfVar == null) {
            return;
        }
        this.x = true;
        final ikn iknVar = this.a;
        aukc aukcVar = null;
        if ((aukfVar.b & 134217728) != 0) {
            aulq aulqVar = aukfVar.C;
            if (aulqVar == null) {
                aulqVar = aulq.a;
            }
            if (aulqVar.pY(ReelPlayerOverlayRendererOuterClass.reelPlayerAgeGateRenderer)) {
                aulq aulqVar2 = aukfVar.C;
                if (aulqVar2 == null) {
                    aulqVar2 = aulq.a;
                }
                aukcVar = (aukc) aulqVar2.pX(ReelPlayerOverlayRendererOuterClass.reelPlayerAgeGateRenderer);
            }
        }
        if (aukcVar == null) {
            return;
        }
        View findViewById = iknVar.c.findViewById(R.id.reel_age_gate_group);
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.reel_age_gate_icon);
        TextView textView = (TextView) findViewById.findViewById(R.id.reel_age_gate_description);
        YouTubeButton youTubeButton = (YouTubeButton) findViewById.findViewById(R.id.reel_age_gate_watch_button);
        YouTubeButton youTubeButton2 = (YouTubeButton) findViewById.findViewById(R.id.reel_age_gate_skip_button);
        int i = 0;
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            youTubeButton.setLayoutDirection(0);
        } else {
            youTubeButton.setLayoutDirection(1);
        }
        if ((aukcVar.b & 1) != 0) {
            ajut ajutVar = iknVar.i;
            arfs arfsVar = aukcVar.c;
            if (arfsVar == null) {
                arfsVar = arfs.a;
            }
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            imageView.setImageResource(ajutVar.a(b));
        }
        if ((aukcVar.b & 2) != 0) {
            aqyg aqygVar = aukcVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
            textView.setText(ajcq.b(aqygVar));
        }
        boolean z2 = (aukcVar.b & 8) != 0;
        aulq aulqVar3 = aukcVar.f;
        if (aulqVar3 == null) {
            aulqVar3 = aulq.a;
        }
        final apmg V = etx.V(z2, aulqVar3);
        if (V != null) {
            aqyg aqygVar2 = V.i;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
            Spanned b2 = ajcq.b(aqygVar2);
            youTubeButton2.setText(b2);
            youTubeButton2.setContentDescription(b2);
            if (z && (V.b & 1048576) != 0) {
                iknVar.c(V.t);
            }
            youTubeButton2.setOnClickListener(new View.OnClickListener() { // from class: ikd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ikn iknVar2 = ikn.this;
                    ily ilyVar = this;
                    boolean z3 = z;
                    apmg apmgVar = V;
                    if (z3 && (apmgVar.b & 1048576) != 0) {
                        iknVar2.h.mM().I(3, new acqx(apmgVar.t), null);
                    }
                    ilyVar.k();
                }
            });
        }
        boolean z3 = (aukcVar.b & 4) != 0;
        aulq aulqVar4 = aukcVar.e;
        if (aulqVar4 == null) {
            aulqVar4 = aulq.a;
        }
        apmg V2 = etx.V(z3, aulqVar4);
        if (V2 != null) {
            aqyg aqygVar3 = V2.i;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
            Spanned b3 = ajcq.b(aqygVar3);
            youTubeButton.setText(b3);
            youTubeButton.setContentDescription(b3);
            if (z && (1048576 & V2.b) != 0) {
                iknVar.c(V2.t);
            }
            if ((V2.b & 32768) != 0) {
                youTubeButton.setOnClickListener(new ike(iknVar, V2, i));
            }
        }
        if ((aukcVar.b & 16) != 0 && z) {
            iknVar.c(aukcVar.g);
        }
        whu.I(findViewById, true);
        whu.I(iknVar.c.findViewById(R.id.reel_loading_spinner), false);
        whu.I(iknVar.e, false);
    }

    public final void q() {
        this.D.setImageResource(true != this.i.d() ? R.drawable.quantum_ic_play_arrow_white_36 : R.drawable.quantum_ic_pause_white_36);
        this.D.setContentDescription(this.i.d() ? this.f223J : this.I);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d6, code lost:
    
        if (r1.equals(defpackage.asno.LIKE) == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(final android.view.MotionEvent r15) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ily.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
