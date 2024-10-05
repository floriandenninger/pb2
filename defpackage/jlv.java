package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.playlist.PlaylistHeaderActionBarView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.youtube.R;
import j$.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jlv implements ypd {
    private final ImageView A;
    private final LinearLayout B;
    private final PlaylistHeaderActionBarView C;
    private final TextView D;
    private final TextView E;
    private final FrameLayout F;
    private final FloatingActionButton G;
    private gls H;
    private final jgp I;
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
    public final ogx q;
    public final ajyw r;
    private final Activity s;
    private final ajjz t;
    private final aaea u;
    private final ImageView v;
    private final TextView w;
    private final TextView x;
    private final TextView y;
    private final TextView z;

    public jlv(Activity activity, ajjz ajjzVar, kyo kyoVar, agyr agyrVar, jgp jgpVar, ogx ogxVar, ajyw ajywVar, azrw azrwVar, aaea aaeaVar, acra acraVar, asno asnoVar, ViewGroup viewGroup, String str, boolean z, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6) {
        this.s = activity;
        this.t = ajjzVar;
        this.a = kyoVar;
        this.b = agyrVar;
        this.I = jgpVar;
        this.q = ogxVar;
        this.r = ajywVar;
        this.c = azrwVar;
        this.u = aaeaVar;
        this.d = acraVar;
        this.e = asnoVar;
        zhq.m(str);
        this.f = str;
        View findViewById = viewGroup.findViewById(R.id.thumbnail_layout);
        this.g = findViewById;
        this.v = findViewById != null ? (ImageView) findViewById.findViewById(R.id.thumbnail) : null;
        this.w = (TextView) viewGroup.findViewById(R.id.playlist_title);
        this.x = (TextView) viewGroup.findViewById(R.id.playlist_channel);
        TextView textView = (TextView) viewGroup.findViewById(R.id.playlist_description);
        this.y = textView;
        this.z = (TextView) viewGroup.findViewById(R.id.playlist_size);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.private_playlist_indicator);
        this.A = imageView;
        this.h = (ImageView) viewGroup.findViewById(R.id.like_button);
        this.i = (ImageView) viewGroup.findViewById(R.id.share_button);
        this.j = (TextView) viewGroup.findViewById(R.id.offline_sync_button);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.playlist_data);
        this.B = linearLayout;
        PlaylistHeaderActionBarView playlistHeaderActionBarView = (PlaylistHeaderActionBarView) viewGroup.findViewById(R.id.actions_bar);
        this.C = playlistHeaderActionBarView;
        TextView textView2 = (TextView) viewGroup.findViewById(R.id.playlist_tvshow_metadata);
        this.D = textView2;
        TextView textView3 = (TextView) viewGroup.findViewById(R.id.action_button);
        this.E = textView3;
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.footer);
        this.F = frameLayout;
        this.k = (OfflineArrowView) viewGroup.findViewById(R.id.offline_button);
        this.G = (FloatingActionButton) viewGroup.findViewById(R.id.playlist_fab);
        if (z) {
            linearLayout.setPaddingRelative(activity.getResources().getDimensionPixelSize(R.dimen.start_end_padding), linearLayout.getPaddingTop(), linearLayout.getPaddingEnd(), linearLayout.getPaddingBottom());
            i(playlistHeaderActionBarView, R.dimen.playlist_header_action_bar_start_padding_compact);
            i(textView2, R.dimen.start_end_padding);
            i(textView, R.dimen.start_end_padding);
            i(textView3, R.dimen.start_end_padding);
            i(frameLayout, R.dimen.start_end_padding);
        }
        viewGroup.findViewById(R.id.edit_button).setVisibility(8);
        viewGroup.findViewById(R.id.shuffle_button).setVisibility(8);
        viewGroup.findViewById(R.id.primary_and_secondary_buttons_container).setVisibility(8);
        linearLayout.setBackground(null);
        imageView.setImageResource(R.drawable.quantum_ic_lock_grey600_24);
    }

    private final void i(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(this.s.getResources().getDimensionPixelSize(i));
        }
    }

    public final void a() {
        gls glsVar = this.H;
        if (glsVar != null) {
            glsVar.a(null);
        } else {
            zga.b("playlistHeaderFabController is not properly initiated.");
        }
    }

    public final void b(Boolean bool) {
        this.n = bool;
        jsh jshVar = this.l;
        if (jshVar != null) {
            jshVar.d(bool);
        } else {
            zga.b("downloadButtonController is not properly initiated when sync.");
        }
    }

    public final void c(agng agngVar) {
        this.p = true;
        this.m = agngVar;
        whu.G(this.w, agngVar.b);
        TextView textView = this.x;
        agnb agnbVar = agngVar.c;
        whu.G(textView, agnbVar == null ? null : agnbVar.b);
        whu.G(this.y, null);
        e();
        ImageView imageView = this.v;
        if (imageView != null && agngVar.a() != null) {
            this.t.l(agngVar.a(), yki.c(this.s, new jlu(this, imageView)));
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
        whu.I(this.A, agngVar.i);
    }

    public final void d(boolean z) {
        this.o = z;
        this.h.setSelected(z);
    }

    public final void e() {
        this.m.getClass();
        if (!evr.V(this.u) || this.m.g == 0) {
            TextView textView = this.z;
            Resources resources = this.s.getResources();
            int i = this.m.f;
            textView.setText(resources.getQuantityString(R.plurals.playlist_size, i, Integer.valueOf(i)));
            return;
        }
        this.z.setText(mcy.ab(this.s.getResources(), this.m.g, (int) Collection.EL.stream(((agof) this.c.get()).a().i().l(this.f)).filter(ghv.p).count()));
    }

    public final void g() {
        gls c = this.I.c(this.G);
        this.H = c;
        agsl i = ((agof) this.c.get()).a().i();
        String str = null;
        if (i.l(this.f) != null) {
            Iterator it = i.l(this.f).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                agnv agnvVar = (agnv) it.next();
                if (agnvVar.i() == agnq.PLAYABLE) {
                    str = agnvVar.m();
                    break;
                }
            }
        }
        if (ammx.e(str)) {
            a();
            return;
        }
        String str2 = this.f;
        String string = this.s.getString(R.string.accessibility_playlist_play_all);
        str.getClass();
        string.getClass();
        c.a(new gfm(str2, str, string));
    }

    public final void h() {
        jsh jshVar = this.l;
        if (jshVar != null) {
            jshVar.a();
        } else {
            zga.b("downloadButtonController is not properly initiated when update.");
        }
        int a = ((agof) this.c.get()).a().i().a(this.f);
        if (this.j != null) {
            whu.G(this.j, a > 0 ? this.s.getResources().getQuantityString(R.plurals.download_new_videos_button_text, a, Integer.valueOf(a)) : null);
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
                d(ghfVar.a() == asno.LIKE);
                return null;
            case 1:
                if (!((agkm) obj).a.equals(this.f)) {
                    return null;
                }
                h();
                return null;
            case 2:
                if (!((agkn) obj).a.equals(this.f)) {
                    return null;
                }
                h();
                return null;
            case 3:
                if (!((agko) obj).a.equals(this.f)) {
                    return null;
                }
                h();
                return null;
            case 4:
                if (!((agkq) obj).a.d().equals(this.f)) {
                    return null;
                }
                h();
                return null;
            case 5:
                if (!((agkr) obj).a.equals(this.f)) {
                    return null;
                }
                h();
                return null;
            case 6:
                b(null);
                agnh agnhVar = ((agks) obj).a;
                if (!agnhVar.d().equals(this.f)) {
                    return null;
                }
                c(agnhVar.a);
                h();
                return null;
            case 7:
                e();
                g();
                return null;
            case 8:
                e();
                g();
                return null;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }
}
