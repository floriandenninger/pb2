package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ghi implements ajom, ypd {
    public ajvo a;
    private final Context b;
    private final ajop c;
    private final ypa d;
    private final FrameLayout e;
    private final YouTubeTextView f;
    private final View.OnClickListener g;
    private final Drawable h;
    private ProgressBar i;
    private View j;
    private View k;
    private int l;

    public ghi(Context context, ajpe ajpeVar, ypa ypaVar) {
        this(context, ajpeVar, ypaVar, null, null);
    }

    private final void i() {
        whu.I(this.f, false);
    }

    private final void j() {
        View view = this.j;
        if (view != null) {
            whu.I(view, false);
        }
        View view2 = this.k;
        if (view2 != null) {
            whu.I(view2, false);
        }
    }

    private final void k() {
        ProgressBar progressBar = this.i;
        if (progressBar != null) {
            whu.I(progressBar, false);
        }
    }

    private final void l(View view, ajtv ajtvVar, View.OnClickListener onClickListener) {
        ((TextView) view.findViewById(R.id.error_message_text)).setText(ajtvVar.c());
        View findViewById = view.findViewById(R.id.error_retry_button);
        whu.I(findViewById, ajtvVar.d());
        if (true != ajtvVar.d()) {
            onClickListener = null;
        }
        findViewById.setOnClickListener(onClickListener);
        ImageView imageView = (ImageView) view.findViewById(R.id.error_icon);
        if (imageView != null) {
            imageView.setImageDrawable(aii.a(this.b, 1 != ajtvVar.a() ? R.drawable.quantum_ic_error_outline_grey600_48 : R.drawable.quantum_ic_cloud_off_grey600_48));
        }
        whu.I(view, true);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((ajpe) this.c).a;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.d.m(this);
    }

    public final void d(ajtr ajtrVar) {
        if (!ajtrVar.b()) {
            k();
            j();
            whu.I(this.f, true);
            return;
        }
        h();
    }

    @Override // defpackage.ajom
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, ajvo ajvoVar) {
        acsc c;
        ajvo ajvoVar2;
        Object obj = ajvoVar.b;
        if (obj != null && ((ajvoVar2 = this.a) == null || ajvoVar2.b != obj)) {
            this.d.m(this);
            this.d.i(this, obj);
        }
        this.a = ajvoVar;
        this.c.d(ajvoVar.c);
        this.f.setText(R.string.load_more_label);
        yny.z(this.e, yny.n(-2), ViewGroup.LayoutParams.class);
        this.l = ajokVar.b("position", -1);
        ajtx ajtxVar = ajvoVar.a;
        if (ajtxVar instanceof ajtr) {
            d((ajtr) ajtxVar);
        } else if (ajtxVar instanceof ajtw) {
            ajtw ajtwVar = (ajtw) ajtxVar;
            h();
            acra acraVar = ajokVar.a;
            if (this.a != null && acraVar != null && ajtwVar.b().h() && ((ajcd.NEXT.a((ajce) ajtwVar.b().c()) || ajcd.RELOAD.a((ajce) ajtwVar.b().c())) && ((ajce) ajtwVar.b().c()).d().length > 0)) {
                aone createBuilder = awav.a.createBuilder();
                aomf x = aomf.x(((ajce) ajtwVar.b().c()).d());
                createBuilder.copyOnWrite();
                awav awavVar = (awav) createBuilder.instance;
                awavVar.b |= 1;
                awavVar.c = x;
                awav awavVar2 = (awav) createBuilder.build();
                int ordinal = ((ajce) ajtwVar.b().c()).a().ordinal();
                if (ordinal == 1) {
                    c = acsb.c(66790);
                } else if (ordinal == 3) {
                    c = acsb.c(113855);
                }
                acraVar.o(adyu.ce(acraVar.i(this.a, c)), adyu.ce(awavVar2));
            }
        } else if (ajtxVar instanceof ajtv) {
            g((ajtv) ajtxVar);
        }
        this.c.e(ajokVar);
    }

    public final void g(ajtv ajtvVar) {
        i();
        k();
        j();
        if (ajtvVar.a() == 1) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.e.getLayoutParams();
        if (this.l >= 2 || !ajcd.RELOAD.a(ajtvVar.b())) {
            if (this.j == null) {
                this.j = ((ViewStub) this.e.findViewById(R.id.error_compact_view_stub)).inflate();
            }
            if (layoutParams != null) {
                layoutParams.height = -2;
            }
            l(this.j, ajtvVar, this.g);
            return;
        }
        if (this.k == null) {
            this.k = ((ViewStub) this.e.findViewById(R.id.error_full_view_stub)).inflate();
        }
        if (layoutParams != null) {
            layoutParams.height = -1;
        }
        l(this.k, ajtvVar, this.g);
    }

    public final void h() {
        if (this.i == null) {
            ProgressBar progressBar = (ProgressBar) ((ViewStub) this.e.findViewById(R.id.load_progress_stub)).inflate();
            this.i = progressBar;
            Drawable drawable = this.h;
            if (drawable != null) {
                progressBar.setIndeterminateDrawable(drawable);
            }
        }
        i();
        j();
        whu.I(this.i, true);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ajtr.class, ajtv.class, ajtw.class};
        }
        if (i == 0) {
            d((ajtr) obj);
            return null;
        }
        if (i == 1) {
            g((ajtv) obj);
            return null;
        }
        if (i == 2) {
            h();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public ghi(Context context, ajpe ajpeVar, ypa ypaVar, ViewGroup viewGroup, Drawable drawable) {
        this.l = -1;
        this.b = context;
        this.c = ajpeVar;
        this.d = ypaVar;
        this.h = drawable;
        FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.loading_status_view, viewGroup, viewGroup != null);
        this.e = frameLayout;
        this.f = (YouTubeTextView) frameLayout.findViewById(R.id.link_item);
        ajpeVar.c(frameLayout);
        this.g = new View.OnClickListener() { // from class: ghh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ajvp ajvpVar;
                ajvo ajvoVar = ghi.this.a;
                if (ajvoVar == null || (ajvpVar = ajvoVar.d) == null) {
                    return;
                }
                ajvpVar.ln();
            }
        };
    }
}
