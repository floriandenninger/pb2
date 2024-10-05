package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.playlist.PlaylistHeaderActionBarView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;
import j$.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jlz implements ypd {
    private final TextView A;
    private final TextView B;
    private final TextView C;
    private final ImageView D;
    private final LinearLayout E;
    private final PlaylistHeaderActionBarView F;
    private final TextView G;
    private final TextView H;
    private final FrameLayout I;
    public final kyo a;
    public final agyr b;
    public final azrw c;
    public final acra d;
    public final asno e;
    public final String f;
    public final View g;
    public final ImageView h;
    public final ImageView i;
    public final TextView j;
    public final OfflineArrowView k;
    public jsh l;
    public agng m;
    public Boolean n;
    public boolean o;
    public boolean p;
    final ajyf q;
    final TextView r;
    final FrameLayout s;
    public final ogx t;
    public final ajyw u;
    private final Activity v;
    private final ajjz w;
    private final aaea x;
    private final ImageView y;
    private final TextView z;

    public jlz(Activity activity, ajjz ajjzVar, kyo kyoVar, agyr agyrVar, ogx ogxVar, ajyw ajywVar, azrw azrwVar, aaea aaeaVar, ajyg ajygVar, acra acraVar, asno asnoVar, ViewGroup viewGroup, String str, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        FrameLayout frameLayout;
        this.v = activity;
        this.w = ajjzVar;
        this.a = kyoVar;
        this.b = agyrVar;
        this.t = ogxVar;
        this.u = ajywVar;
        this.c = azrwVar;
        this.x = aaeaVar;
        this.d = acraVar;
        this.e = asnoVar;
        zhq.m(str);
        this.f = str;
        View findViewById = viewGroup.findViewById(R.id.thumbnail_layout);
        this.g = findViewById;
        this.y = findViewById != null ? (ImageView) findViewById.findViewById(R.id.thumbnail) : null;
        this.z = (TextView) viewGroup.findViewById(R.id.playlist_title);
        this.A = (TextView) viewGroup.findViewById(R.id.playlist_channel);
        TextView textView = (TextView) viewGroup.findViewById(R.id.playlist_description);
        this.B = textView;
        this.C = (TextView) viewGroup.findViewById(R.id.playlist_size);
        this.D = (ImageView) viewGroup.findViewById(R.id.private_playlist_indicator);
        this.h = (ImageView) viewGroup.findViewById(R.id.like_button);
        this.i = (ImageView) viewGroup.findViewById(R.id.share_button);
        this.j = (TextView) viewGroup.findViewById(R.id.offline_sync_button);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.playlist_data);
        this.E = linearLayout;
        PlaylistHeaderActionBarView playlistHeaderActionBarView = (PlaylistHeaderActionBarView) viewGroup.findViewById(R.id.actions_bar);
        this.F = playlistHeaderActionBarView;
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.playlist_tvshow_metadata);
        this.G = textView2;
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.action_button);
        this.H = textView3;
        FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.footer);
        this.I = frameLayout2;
        this.k = (OfflineArrowView) viewGroup.findViewById(R.id.offline_button);
        TextView textView4 = (TextView) viewGroup.findViewById(R.id.play_button_label);
        this.r = textView4;
        FrameLayout frameLayout3 = (FrameLayout) viewGroup.findViewById(R.id.play_button_container);
        this.s = frameLayout3;
        ajyf a = ajygVar.a(textView4);
        this.q = a;
        if (z) {
            frameLayout = frameLayout3;
            linearLayout.setPaddingRelative(activity.getResources().getDimensionPixelSize(R.dimen.start_end_padding), linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
            g(playlistHeaderActionBarView, R.dimen.playlist_header_action_bar_start_padding_compact);
            g(textView2, R.dimen.start_end_padding);
            g(textView, R.dimen.start_end_padding);
            g(textView3, R.dimen.start_end_padding);
            g(frameLayout2, R.dimen.start_end_padding);
        } else {
            frameLayout = frameLayout3;
        }
        viewGroup.findViewById(R.id.edit_button).setVisibility(8);
        viewGroup.findViewById(R.id.shuffle_button_container).setVisibility(8);
        viewGroup.findViewById(R.id.shuffle_button_label).setVisibility(8);
        linearLayout.setBackground(null);
        aong aongVar = (aong) apmg.a.createBuilder();
        aong aongVar2 = (aong) arfs.a.createBuilder();
        arfr arfrVar = arfr.PLAY_ARROW;
        aongVar2.copyOnWrite();
        arfs arfsVar = (arfs) aongVar2.instance;
        arfsVar.c = arfrVar.pV;
        arfsVar.b |= 1;
        aongVar.copyOnWrite();
        apmg apmgVar = (apmg) aongVar.instance;
        arfs arfsVar2 = (arfs) aongVar2.build();
        arfsVar2.getClass();
        apmgVar.g = arfsVar2;
        apmgVar.b |= 32;
        aongVar.copyOnWrite();
        apmg apmgVar2 = (apmg) aongVar.instance;
        apmgVar2.d = 35;
        apmgVar2.c = 1;
        aqyg g = ajcq.g("PLAY");
        aongVar.copyOnWrite();
        apmg apmgVar3 = (apmg) aongVar.instance;
        g.getClass();
        apmgVar3.i = g;
        apmgVar3.b |= 256;
        aone createBuilder = atrr.a.createBuilder();
        createBuilder.copyOnWrite();
        atrr atrrVar = (atrr) createBuilder.instance;
        atrrVar.b |= 2;
        atrrVar.d = str;
        atrr atrrVar2 = (atrr) createBuilder.build();
        aong aongVar3 = (aong) apxf.a.createBuilder();
        aongVar3.e(atrs.a, atrrVar2);
        apxf apxfVar = (apxf) aongVar3.build();
        aongVar.copyOnWrite();
        apmg apmgVar4 = (apmg) aongVar.instance;
        apxfVar.getClass();
        apmgVar4.o = apxfVar;
        apmgVar4.b |= 16384;
        a.b((apmg) aongVar.build(), acraVar);
        Drawable background = textView4.getBackground();
        textView4.setBackground(null);
        FrameLayout frameLayout4 = frameLayout;
        frameLayout4.setBackground(background);
        frameLayout4.setOnClickListener(new jlw(this, 3));
    }

    private final void g(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(this.v.getResources().getDimensionPixelSize(i));
        }
    }

    public final void a(Boolean bool) {
        this.n = bool;
        jsh jshVar = this.l;
        if (jshVar != null) {
            jshVar.d(bool);
        } else {
            zga.b("downloadButtonController is not properly initiated when sync.");
        }
    }

    public final void b(agng agngVar) {
        this.p = true;
        this.m = agngVar;
        whu.G(this.z, agngVar.b);
        TextView textView = this.A;
        agnb agnbVar = agngVar.c;
        whu.G(textView, agnbVar == null ? null : agnbVar.b);
        whu.G(this.B, null);
        d();
        ImageView imageView = this.y;
        if (imageView != null && agngVar.a() != null) {
            this.w.l(agngVar.a(), yki.c(this.v, new jly(this, imageView)));
        }
        this.h.setEnabled(true);
        ImageView imageView2 = this.h;
        agnb agnbVar2 = agngVar.c;
        boolean z = false;
        if (agnbVar2 != null && !agnbVar2.e && !agngVar.a.startsWith("BL")) {
            z = true;
        }
        whu.I(imageView2, z);
        whu.I(this.i, true ^ agngVar.i);
        whu.I(this.D, agngVar.i);
    }

    public final void c(boolean z) {
        this.o = z;
        this.h.setSelected(z);
    }

    public final void d() {
        this.m.getClass();
        if (!evr.V(this.x) || this.m.g == 0) {
            TextView textView = this.C;
            Resources resources = this.v.getResources();
            int i = this.m.f;
            textView.setText(resources.getQuantityString(R.plurals.playlist_size, i, Integer.valueOf(i)));
            return;
        }
        this.C.setText(mcy.ab(this.v.getResources(), this.m.g, (int) Collection.EL.stream(((agof) this.c.get()).a().i().l(this.f)).filter(ghv.q).count()));
    }

    public final void e() {
        jsh jshVar = this.l;
        if (jshVar != null) {
            jshVar.a();
        } else {
            zga.b("downloadButtonController is not properly initiated when update.");
        }
        int a = ((agof) this.c.get()).a().i().a(this.f);
        if (this.j != null) {
            whu.G(this.j, a > 0 ? this.v.getResources().getQuantityString(R.plurals.download_new_videos_button_text, a, Integer.valueOf(a)) : null);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{ghf.class, agkm.class, agkn.class, agko.class, agkq.class, agkr.class, agks.class, agla.class, aglb.class};
            case 0:
                ghf ghfVar = (ghf) obj;
                agng agngVar = this.m;
                if (agngVar == null || !agngVar.a.equals(ghfVar.b())) {
                    return null;
                }
                c(ghfVar.a() == asno.LIKE);
                return null;
            case 1:
                if (!((agkm) obj).a.equals(this.f)) {
                    return null;
                }
                e();
                return null;
            case 2:
                if (!((agkn) obj).a.equals(this.f)) {
                    return null;
                }
                e();
                return null;
            case 3:
                if (!((agko) obj).a.equals(this.f)) {
                    return null;
                }
                e();
                return null;
            case 4:
                if (!((agkq) obj).a.d().equals(this.f)) {
                    return null;
                }
                e();
                return null;
            case 5:
                if (!((agkr) obj).a.equals(this.f)) {
                    return null;
                }
                e();
                return null;
            case 6:
                a(null);
                agnh agnhVar = ((agks) obj).a;
                if (!agnhVar.d().equals(this.f)) {
                    return null;
                }
                b(agnhVar.a);
                e();
                return null;
            case 7:
                d();
                return null;
            case 8:
                d();
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
