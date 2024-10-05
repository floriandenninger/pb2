package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class koj extends ahus implements fxh, ypd {
    private static final long q = TimeUnit.SECONDS.toMillis(4);
    public final koi a;
    public final koi b;
    public final koi c;
    public koi d;
    public final azrw e;
    public final Runnable f;
    public final azrw g;
    public final boolean h;
    public fnd i;
    public boolean j;
    public koi k;
    public boolean l;
    public String m;
    public String n;
    public FrameLayout o;
    public ahef p;
    private final ajla r;
    private boolean s;
    private View t;
    private View u;
    private View v;

    public koj(Context context, azrw azrwVar, ajla ajlaVar, fxj fxjVar, azrw azrwVar2, aadw aadwVar) {
        super(context);
        koi a = new koh().a();
        this.a = a;
        koh kohVar = new koh();
        kohVar.b = 0;
        this.b = kohVar.a();
        koh kohVar2 = new koh();
        kohVar2.c = 0;
        this.c = kohVar2.a();
        koh kohVar3 = new koh();
        kohVar3.b();
        this.d = kohVar3.a();
        this.f = new Runnable() { // from class: kog
            @Override // java.lang.Runnable
            public final void run() {
                koj.this.kV();
            }
        };
        this.s = false;
        this.j = false;
        this.k = a;
        this.l = false;
        this.m = "";
        this.n = "";
        azrwVar.getClass();
        this.e = azrwVar;
        ajlaVar.getClass();
        this.r = ajlaVar;
        this.g = azrwVar2;
        this.h = evr.bj(aadwVar);
        fxjVar.f(this);
    }

    private final void m() {
        View view = this.u;
        if (view == null || this.t == null || this.v == null) {
            return;
        }
        view.setVisibility(this.k.a);
        this.t.setVisibility(this.k.b);
        this.v.setVisibility(this.k.c);
        this.o.setBackgroundColor(this.k.d);
        this.o.setOnClickListener(this.k.e);
        this.o.setClickable(this.k.e != null);
    }

    @Override // defpackage.ahuy
    public final View a(Context context) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(context, R.layout.watch_in_vr_overlay, null);
        this.o = frameLayout;
        this.t = frameLayout.findViewById(R.id.watch_in_vr_chip);
        this.u = this.o.findViewById(R.id.magic_window_edu);
        this.v = this.o.findViewById(R.id.magic_window_mid_ui_edu);
        TextView textView = (TextView) this.o.findViewById(R.id.message_view);
        View findViewById = this.o.findViewById(R.id.close_button);
        View findViewById2 = this.o.findViewById(R.id.cardboard_button);
        ImageView imageView = (ImageView) this.o.findViewById(R.id.magic_window_edu_image);
        imageView.setContentDescription(this.m);
        ((TextView) this.o.findViewById(R.id.magic_window_edu_text)).setText(this.m);
        ((TextView) this.o.findViewById(R.id.magic_window_mid_ui_edu_text)).setText(this.m);
        if (!this.n.isEmpty()) {
            this.r.g(imageView, Uri.parse(this.n));
        }
        koi koiVar = this.k;
        koi koiVar2 = this.d;
        if (koiVar == koiVar2 && koiVar2.e == null) {
            koh kohVar = new koh();
            kohVar.b();
            kohVar.d = wbs.Q(this.o.getContext(), R.attr.yt10PercentLayer);
            final int i = 1;
            kohVar.e = new View.OnClickListener(this) { // from class: kof
                public final /* synthetic */ koj a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i2 = i;
                    if (i2 == 0) {
                        ((ahos) this.a.e.get()).g();
                        return;
                    }
                    if (i2 == 1) {
                        koj kojVar = this.a;
                        kojVar.o.removeCallbacks(kojVar.f);
                        kojVar.kV();
                    } else {
                        koj kojVar2 = this.a;
                        kojVar2.o.removeCallbacks(kojVar2.f);
                        kojVar2.kV();
                    }
                }
            };
            koi a = kohVar.a();
            this.d = a;
            this.k = a;
        }
        final int i2 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: kof
            public final /* synthetic */ koj a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                if (i22 == 0) {
                    ((ahos) this.a.e.get()).g();
                    return;
                }
                if (i22 == 1) {
                    koj kojVar = this.a;
                    kojVar.o.removeCallbacks(kojVar.f);
                    kojVar.kV();
                } else {
                    koj kojVar2 = this.a;
                    kojVar2.o.removeCallbacks(kojVar2.f);
                    kojVar2.kV();
                }
            }
        };
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(onClickListener);
        }
        if (findViewById != null) {
            final int i3 = 2;
            findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: kof
                public final /* synthetic */ koj a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i22 = i3;
                    if (i22 == 0) {
                        ((ahos) this.a.e.get()).g();
                        return;
                    }
                    if (i22 == 1) {
                        koj kojVar = this.a;
                        kojVar.o.removeCallbacks(kojVar.f);
                        kojVar.kV();
                    } else {
                        koj kojVar2 = this.a;
                        kojVar2.o.removeCallbacks(kojVar2.f);
                        kojVar2.kV();
                    }
                }
            });
        }
        m();
        return this.o;
    }

    @Override // defpackage.aivf
    public final ViewGroup.LayoutParams c() {
        return new aivh(-1, -1, false);
    }

    @Override // defpackage.ahuy
    public final void d(Context context, View view) {
        if (ab(1)) {
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.watch_in_vr_overlay_margin_bottom);
            View view2 = this.t;
            if (view2 != null) {
                yny.z(view2, yny.k(dimensionPixelOffset), ViewGroup.MarginLayoutParams.class);
            }
        }
    }

    @Override // defpackage.fxh
    public final void e(Configuration configuration) {
        Z(1);
    }

    public final void k(koi koiVar) {
        this.k = koiVar;
        m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ahus
    public final void kW(int i) {
        if (i == 2) {
            this.s = true;
            if (this.k != this.c) {
                this.o.postOnAnimationDelayed(this.f, q);
            }
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        String str;
        VideoStreamingData videoStreamingData;
        boolean z = false;
        if (i == -1) {
            return new Class[]{ahef.class, aheg.class};
        }
        if (i != 0) {
            if (i == 1) {
                aheg ahegVar = (aheg) obj;
                boolean z2 = this.j;
                if (ahegVar != null && ahegVar.g() <= 3000) {
                    z = true;
                }
                this.j = z;
                if (z2 == z) {
                    return null;
                }
                Y();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        ahef ahefVar = (ahef) obj;
        if (ahefVar == null || ahefVar.c() == null) {
            return null;
        }
        this.p = ahefVar;
        if (this.h) {
            aign c = ahefVar != null ? ahefVar.c() : null;
            ahef ahefVar2 = this.p;
            PlayerResponseModel b = ahefVar2 != null ? ahefVar2.b() : null;
            String U = (b == null || c == null || c.g() || c == aign.ENDED || !b.c().am() || (!b.c().aE() && ((videoStreamingData = b.c) == null || !videoStreamingData.H()))) ? null : b.c().U();
            fnd fndVar = this.i;
            if (fndVar != null && !TextUtils.equals(U, fndVar.a)) {
                fne fneVar = (fne) this.g.get();
                fnd fndVar2 = this.i;
                fndVar2.getClass();
                fneVar.a(fndVar2);
                this.i = null;
            }
            if (this.i == null && U != null) {
                this.i = fnd.a(U);
            }
            if (this.i != null) {
                fne fneVar2 = (fne) this.g.get();
                fnd fndVar3 = this.i;
                fndVar3.getClass();
                fneVar2.b(fndVar3);
            }
        }
        if (ahefVar.c() != aign.VIDEO_PLAYING || !this.j) {
            if (!ahefVar.c().a(aign.VIDEO_REQUESTED, aign.ENDED, aign.INTERSTITIAL_REQUESTED)) {
                return null;
            }
            k(this.a);
            kV();
            Y();
            return null;
        }
        this.l = ((ahos) this.e.get()).j();
        PlayerResponseModel b2 = ahefVar.b();
        koi koiVar = this.a;
        if (b2 != null) {
            if (b2.c().am()) {
                this.m = b2.c().U();
                atyi atyiVar = b2.c().c;
                if ((atyiVar.c & 1) != 0) {
                    awaz awazVar = atyiVar.v;
                    if (awazVar == null) {
                        awazVar = awaz.a;
                    }
                    str = awazVar.l;
                } else {
                    str = "";
                }
                this.n = str;
                koiVar = this.d;
            } else if (b2.c().al()) {
                atyi atyiVar2 = b2.c().c;
                if ((atyiVar2.c & 1) != 0) {
                    awaz awazVar2 = atyiVar2.v;
                    if (awazVar2 == null) {
                        awazVar2 = awaz.a;
                    }
                    if (awazVar2.g) {
                        koiVar = this.b;
                    }
                }
            }
        }
        k(koiVar);
        kX();
        Y();
        return null;
    }

    @Override // defpackage.ahuy
    public final boolean nt() {
        VideoStreamingData videoStreamingData;
        ahef ahefVar = this.p;
        if ((ahefVar != null && this.j) || this.s) {
            VideoStreamingData videoStreamingData2 = null;
            PlayerResponseModel b = ahefVar != null ? ahefVar.b() : null;
            ahef ahefVar2 = this.p;
            boolean z = ahefVar2 != null && ahefVar2.c().g();
            if (this.k != this.a && this.l && !z) {
                if (b != null && (videoStreamingData = b.c) != null) {
                    videoStreamingData2 = videoStreamingData;
                }
                boolean z2 = videoStreamingData2 != null && videoStreamingData2.H();
                return this.k == this.b ? z2 || (videoStreamingData2 != null && videoStreamingData2.w()) : z2;
            }
        }
        return false;
    }
}
