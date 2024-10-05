package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ntj implements nqb {
    public View a;
    public int c;
    public int d;
    public nqr f;
    private final Context g;
    private final ajut h;
    private final Typeface i;
    private final int j;
    private View k;
    private YouTubeTextView l;
    private YouTubeTextView m;
    private YouTubeTextView n;
    private ImageView o;
    private msl p;
    private CharSequence q;
    private CharSequence r;
    private CharSequence s;
    private arfs t;
    private apkc u;
    private int v;
    private int w;
    private Typeface z;
    public boolean b = true;
    public int e = R.attr.ytTextAppearanceTitle2;
    private int x = R.attr.ytTextAppearanceTitle2;
    private int y = R.attr.ytTextAppearanceBody1a;

    public ntj(Context context, ajut ajutVar) {
        this.g = context;
        this.h = ajutVar;
        this.i = ajct.YOUTUBE_SANS_BOLD.a(context);
        this.j = wbs.Q(context, R.attr.ytTextSecondary);
    }

    private final void t() {
        String str;
        String str2;
        if (TextUtils.isEmpty(this.q)) {
            str = null;
        } else {
            String valueOf = String.valueOf(this.q);
            CharSequence charSequence = this.r;
            String str3 = "";
            if (charSequence != null) {
                String valueOf2 = String.valueOf(charSequence);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 2);
                sb.append(". ");
                sb.append(valueOf2);
                str2 = sb.toString();
            } else {
                str2 = "";
            }
            CharSequence charSequence2 = this.s;
            if (charSequence2 != null) {
                String valueOf3 = String.valueOf(charSequence2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf3).length() + 2);
                sb2.append(". ");
                sb2.append(valueOf3);
                str3 = sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
            sb3.append(valueOf);
            sb3.append(str2);
            sb3.append(str3);
            str = sb3.toString();
        }
        View view = this.k;
        if (view != null) {
            view.setContentDescription(str);
        }
    }

    private final void u() {
        msl mslVar = this.p;
        if (mslVar == null) {
            return;
        }
        mslVar.a(TextUtils.isEmpty(this.r) ? null : this.u);
    }

    @Override // defpackage.nqb
    public final View a() {
        return this.a;
    }

    @Override // defpackage.nqb
    public final View b() {
        if (this.k == null) {
            View inflate = LayoutInflater.from(this.g).inflate(R.layout.playlist_engagement_panel_header, (ViewGroup) null);
            this.k = inflate;
            this.l = (YouTubeTextView) inflate.findViewById(R.id.title);
            this.m = (YouTubeTextView) this.k.findViewById(R.id.subtitle);
            this.n = (YouTubeTextView) this.k.findViewById(R.id.position);
            this.o = (ImageView) this.k.findViewById(R.id.icon);
            this.p = new msl((ImageView) this.k.findViewById(R.id.privacy), this.g);
            k(this.q);
            j(this.r);
            o(this.s);
            n(this.t);
            q(this.u);
            r(this.y, this.v);
            p(this.x, this.w);
        }
        return this.k;
    }

    @Override // defpackage.nqb
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.nqb
    public final void d() {
    }

    @Override // defpackage.nqb
    public final void e(boolean z) {
    }

    @Override // defpackage.nqb
    public final void f(boolean z) {
        throw null;
    }

    @Override // defpackage.nqb
    public final void g(auwh auwhVar) {
    }

    @Override // defpackage.nqb
    public final void h(nqe nqeVar) {
    }

    @Override // defpackage.nqb
    public final void i(nqc nqcVar) {
    }

    @Override // defpackage.nqb
    public final void j(CharSequence charSequence) {
        this.r = charSequence;
        u();
        YouTubeTextView youTubeTextView = this.m;
        if (youTubeTextView != null) {
            whu.G(youTubeTextView, charSequence);
            t();
        }
        this.z = TextUtils.isEmpty(charSequence) ? null : this.i;
        s();
    }

    @Override // defpackage.nqb
    public final void k(CharSequence charSequence) {
        this.q = charSequence;
        YouTubeTextView youTubeTextView = this.l;
        if (youTubeTextView != null) {
            whu.G(youTubeTextView, charSequence);
            t();
        }
    }

    @Override // defpackage.nqb
    public final boolean l() {
        return this.b;
    }

    @Override // defpackage.nqb
    public final void m(nqr nqrVar) {
        if (this.f == nqrVar) {
            return;
        }
        this.f = nqrVar;
    }

    public final void n(arfs arfsVar) {
        int i;
        this.t = arfsVar;
        if (this.o == null) {
            return;
        }
        if (arfsVar != null) {
            ajut ajutVar = this.h;
            arfr b = arfr.b(arfsVar.c);
            if (b == null) {
                b = arfr.UNKNOWN;
            }
            i = ajutVar.a(b);
        } else {
            i = 0;
        }
        whu.I(this.o, i != 0);
        if (i != 0) {
            this.o.setImageResource(i);
        }
    }

    public final void o(CharSequence charSequence) {
        this.s = charSequence;
        YouTubeTextView youTubeTextView = this.n;
        if (youTubeTextView != null) {
            whu.G(youTubeTextView, charSequence);
            t();
        }
    }

    public final void p(int i, int i2) {
        this.x = i;
        this.w = i2;
        YouTubeTextView youTubeTextView = this.n;
        if (youTubeTextView != null) {
            Context context = this.g;
            youTubeTextView.setTextAppearance(context, wbs.R(context, i));
            this.n.setTextColor(this.j);
            if (this.w != 0) {
                jm.r(this.n, this.g.getResources().getDimensionPixelSize(this.w));
            }
        }
    }

    public final void q(apkc apkcVar) {
        this.u = apkcVar;
        u();
    }

    public final void r(int i, int i2) {
        this.y = i;
        this.v = i2;
        YouTubeTextView youTubeTextView = this.m;
        if (youTubeTextView != null) {
            Context context = this.g;
            youTubeTextView.setTextAppearance(context, wbs.R(context, i));
            this.m.setTextColor(this.j);
            if (i2 != 0) {
                jm.r(this.m, this.g.getResources().getDimensionPixelSize(i2));
            }
        }
    }

    public final void s() {
        YouTubeTextView youTubeTextView = this.l;
        if (youTubeTextView != null) {
            Context context = this.g;
            youTubeTextView.setTextAppearance(context, wbs.R(context, this.e));
            Typeface typeface = this.z;
            if (typeface != null) {
                this.l.setTypeface(typeface);
            }
            if (this.c != 0) {
                this.l.setTextSize(0, this.g.getResources().getDimension(this.c));
            }
            if (this.d != 0) {
                jm.r(this.l, this.g.getResources().getDimensionPixelSize(this.d));
            }
        }
    }
}
