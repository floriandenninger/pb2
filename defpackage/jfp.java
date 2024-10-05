package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.mdx.watch.MdxWatchDrawerLayout;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.youtube.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jfp implements jgf, obq, jfy, nzb, ypd {
    public final ypa a;
    public final adlt b;
    public final jfg c;
    public final jgg d;
    public final jfq e;
    public final gje f;
    public final oja g;
    public final obr h;
    public final azrw i;
    public final azrs j;
    public final aypy k;
    public int l;
    public final jex m;
    public MdxWatchDrawerLayout n;
    public ViewGroup o;
    public boolean p;
    public final jfn q;
    public final jfo r;
    public final jfm s;
    private final Context t;
    private final jgf u;
    private final nnf v;
    private final fzi w;
    private final oau x;

    public jfp(Context context, ypa ypaVar, adlt adltVar, azrw azrwVar, jfg jfgVar, jgf jgfVar, nnf nnfVar, fzi fziVar, jgg jggVar, jfq jfqVar, gje gjeVar, oja ojaVar, oau oauVar, obr obrVar, azrw azrwVar2) {
        azrh aN = azrh.aN(Optional.empty());
        this.j = aN;
        this.k = aN.aj(ivh.r);
        this.t = context;
        this.a = ypaVar;
        this.b = adltVar;
        this.c = jfgVar;
        this.u = jgfVar;
        this.v = nnfVar;
        this.w = fziVar;
        this.d = jggVar;
        this.e = jfqVar;
        this.f = gjeVar;
        this.g = ojaVar;
        this.x = oauVar;
        this.h = obrVar;
        this.i = azrwVar2;
        this.q = new jfn(this);
        this.r = new jfo(this);
        this.s = new jfm(this);
        this.m = (jex) azrwVar.get();
        fziVar.b(fzh.MDX_QUEUE, aih.d(context, R.color.mdx_status_bar_color));
    }

    public final void b() {
        ViewGroup viewGroup = this.o;
        if (viewGroup == null) {
            return;
        }
        this.v.d(this.b.g() != null ? this.h.e() : false, viewGroup.getHeight());
    }

    @Override // defpackage.nzb
    public final void c(int i) {
        MdxWatchDrawerLayout mdxWatchDrawerLayout = this.n;
        if (mdxWatchDrawerLayout == null) {
            return;
        }
        int dimensionPixelOffset = i + this.t.getResources().getDimensionPixelOffset(R.dimen.mdx_queue_header_and_player_gap);
        View view = mdxWatchDrawerLayout.f;
        if (view == null || mdxWatchDrawerLayout.i == dimensionPixelOffset) {
            return;
        }
        view.setPaddingRelative(0, 0, 0, dimensionPixelOffset);
        int g = mdxWatchDrawerLayout.g(mdxWatchDrawerLayout.h, dimensionPixelOffset);
        mdxWatchDrawerLayout.i = dimensionPixelOffset;
        mdxWatchDrawerLayout.h();
        mdxWatchDrawerLayout.j(g, true);
    }

    public final void e(boolean z) {
        View findViewById;
        ojb ojbVar = this.g.a;
        if (ojbVar == null || (findViewById = ((DefaultWatchPanelViewController) ojbVar).o.findViewById(R.id.scrim_for_mdx_expanded_queue)) == null) {
            return;
        }
        findViewById.setVisibility(true != z ? 8 : 0);
    }

    public final void g(float f) {
        this.w.a(fzh.MDX_QUEUE, f);
    }

    @Override // defpackage.jfy
    public final boolean h() {
        MdxWatchDrawerLayout mdxWatchDrawerLayout;
        return this.p && (mdxWatchDrawerLayout = this.n) != null && mdxWatchDrawerLayout.a().a();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adjb.class};
        }
        if (i == 0) {
            if (((adjb) obj) != adjb.CONNECTED_ONLY) {
                return null;
            }
            pk();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.obq
    public final void o(int i) {
        adlm g;
        if (i == 0 && (g = this.b.g()) != null && !g.w().isEmpty()) {
            final oau oauVar = this.x;
            if (oauVar.f) {
                final int i2 = 1;
                if (oauVar.e.i.j == 1) {
                    ((ainy) oauVar.c.get()).a();
                    final int i3 = 0;
                    new AlertDialog.Builder(oauVar.a).setTitle(R.string.mdx_floaty_bar_clear_queue_dialog_title).setMessage(R.string.mdx_floaty_bar_clear_queue_dialog_message).setPositiveButton(R.string.mdx_floaty_bar_clear_queue_dialog_confirm_button_text, new DialogInterface.OnClickListener() { // from class: oat
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            if (i2 == 0) {
                                oau oauVar2 = oauVar;
                                ((ainy) oauVar2.c.get()).b();
                                oauVar2.d.r(1, 1);
                                dialogInterface.dismiss();
                                return;
                            }
                            oau oauVar3 = oauVar;
                            ((ainy) oauVar3.c.get()).L();
                            adlm g2 = oauVar3.b.g();
                            if (g2 != null) {
                                g2.C();
                            }
                            dialogInterface.dismiss();
                        }
                    }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: oat
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i4) {
                            if (i3 == 0) {
                                oau oauVar2 = oauVar;
                                ((ainy) oauVar2.c.get()).b();
                                oauVar2.d.r(1, 1);
                                dialogInterface.dismiss();
                                return;
                            }
                            oau oauVar3 = oauVar;
                            ((ainy) oauVar3.c.get()).L();
                            adlm g2 = oauVar3.b.g();
                            if (g2 != null) {
                                g2.C();
                            }
                            dialogInterface.dismiss();
                        }
                    }).setCancelable(false).create().show();
                }
            }
        }
        b();
    }

    @Override // defpackage.jgf
    public final void pk() {
        this.u.pk();
    }

    @Override // defpackage.jgf
    public final void pl(boolean z) {
        boolean z2 = z & (!h());
        MdxWatchDrawerLayout mdxWatchDrawerLayout = this.n;
        if (mdxWatchDrawerLayout != null) {
            mdxWatchDrawerLayout.c();
        }
        this.u.pl(z2);
    }
}
