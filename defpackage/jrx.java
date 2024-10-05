package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jrx implements ajom, ypd {
    public final PlaylistThumbnailView a;
    public agng b;
    private final Context c;
    private final ypa d;
    private final ajop e;
    private final ajjz f;
    private final azrw g;
    private final ysy h;
    private final agsg i;
    private final ajuw j;
    private final jti k;
    private final View.OnClickListener l;
    private final View m;
    private final TextView n;
    private final TextView o;
    private final TextView p;
    private final OfflineArrowView q;
    private final jrw r;
    private final View s;

    public jrx(Context context, ypa ypaVar, gma gmaVar, ajjz ajjzVar, azrw azrwVar, ysy ysyVar, agsg agsgVar, final aahd aahdVar, ajuw ajuwVar, jti jtiVar, ViewGroup viewGroup) {
        this.c = context;
        this.d = ypaVar;
        this.e = gmaVar;
        this.f = ajjzVar;
        this.g = azrwVar;
        this.h = ysyVar;
        this.i = agsgVar;
        this.j = ajuwVar;
        this.k = jtiVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.offline_playlist_item, viewGroup, false);
        this.m = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.title);
        textView.getClass();
        this.n = textView;
        textView.setMaxLines(2);
        TextView textView2 = (TextView) inflate.findViewById(R.id.owner);
        textView2.getClass();
        this.o = textView2;
        TextView textView3 = (TextView) inflate.findViewById(R.id.details);
        textView3.getClass();
        this.p = textView3;
        PlaylistThumbnailView playlistThumbnailView = (PlaylistThumbnailView) inflate.findViewById(R.id.playlist_thumbnail);
        playlistThumbnailView.getClass();
        this.a = playlistThumbnailView;
        this.r = new jrw(this);
        this.q = (OfflineArrowView) inflate.findViewById(R.id.offline_arrow);
        this.s = inflate.findViewById(R.id.contextual_menu_anchor);
        gmaVar.c(inflate);
        this.l = new View.OnClickListener() { // from class: jrv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jrx jrxVar = jrx.this;
                aahd aahdVar2 = aahdVar;
                agng agngVar = jrxVar.b;
                if (agngVar != null) {
                    aahdVar2.c(fia.a(agngVar.a), null);
                }
            }
        };
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.e).b;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.d.m(this);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{agkn.class, agkq.class};
        }
        if (i == 0) {
            agkn agknVar = (agkn) obj;
            agng agngVar = this.b;
            if (agngVar == null || !agngVar.a.equals(agknVar.a)) {
                return null;
            }
            d(null);
            return null;
        }
        if (i == 1) {
            agnh agnhVar = ((agkq) obj).a;
            agng agngVar2 = this.b;
            if (agngVar2 == null || !agngVar2.a.equals(agnhVar.a.a)) {
                return null;
            }
            d(agnhVar);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        agni e;
        atde atdeVar;
        agng agngVar = (agng) obj;
        this.d.g(this);
        this.b = agngVar;
        agnb agnbVar = agngVar.c;
        this.n.setText(agngVar.b);
        whu.G(this.o, agnbVar == null ? null : agnbVar.b);
        this.a.c.setText(Integer.toString(agngVar.f));
        Uri a = agngVar.a();
        if (a != null) {
            zag.b(this.f.b(), a, this.a.b, this.r);
        } else {
            this.a.b.setImageDrawable(null);
        }
        agsl i = ((agof) this.g.get()).a().i();
        String str = agngVar.a;
        aone createBuilder = atdc.a.createBuilder();
        if (!ammx.e(str) && (e = i.e(str)) != null && (atdeVar = (atde) this.k.g(agni.class, atde.class, e, null)) != null) {
            aone createBuilder2 = atda.a.createBuilder();
            createBuilder2.copyOnWrite();
            atda atdaVar = (atda) createBuilder2.instance;
            atdaVar.d = atdeVar;
            atdaVar.b |= 2;
            createBuilder.aE(createBuilder2);
        }
        this.j.e(this.m, this.s, (atdc) createBuilder.build(), agngVar, ajokVar.a);
        agnh d = i.d(str);
        if (d != null) {
            d(d);
        }
        this.e.e(ajokVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.agnh r10) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jrx.d(agnh):void");
    }
}
