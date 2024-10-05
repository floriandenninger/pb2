package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.google.protos.youtube.api.innertube.PlaylistEditEndpointOuterClass$PlaylistEditEndpoint;
import com.google.protos.youtube.api.innertube.SharePlaylistEndpointOuterClass$SharePlaylistEndpoint;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lwp implements ypd {
    private TextView A;
    private boolean B;
    private final akht C;
    public final Activity a;
    public final String b;
    public final View c;
    public final acra d;
    public SwitchCompat e;
    public TextView f;
    public View g;
    public TextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public gno l;
    public TextView m;
    public gno n;
    public AlertDialog o;
    public boolean p;
    public ajpd q;
    public aucj r;
    private final aahd s;
    private final ajoy t;
    private final ajjz u;
    private final float v;
    private RecyclerView w;
    private View x;
    private View y;
    private TextView z;

    public lwp(Activity activity, aahd aahdVar, ajoy ajoyVar, String str, View view, akht akhtVar, ajjz ajjzVar, acra acraVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        activity.getClass();
        this.a = activity;
        aahdVar.getClass();
        this.s = aahdVar;
        ajoyVar.getClass();
        this.t = ajoyVar;
        str.getClass();
        this.b = str;
        view.getClass();
        this.c = view;
        ajjzVar.getClass();
        this.u = ajjzVar;
        acraVar.getClass();
        this.d = acraVar;
        akhtVar.getClass();
        this.C = akhtVar;
        TypedValue typedValue = new TypedValue();
        view.getContext().getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        this.v = typedValue.getFloat();
    }

    public final void a() {
        apxf apxfVar;
        if (this.r == null) {
            return;
        }
        e(3);
        this.j.setText(this.a.getString(com.google.android.youtube.R.string.collab_playlist_link_loading));
        aahd aahdVar = this.s;
        auch auchVar = this.r.g;
        if (auchVar == null) {
            auchVar = auch.a;
        }
        apmg apmgVar = auchVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        if ((apmgVar.b & 8192) != 0) {
            auch auchVar2 = this.r.g;
            if (auchVar2 == null) {
                auchVar2 = auch.a;
            }
            apmg apmgVar2 = auchVar2.c;
            if (apmgVar2 == null) {
                apmgVar2 = apmg.a;
            }
            apxfVar = apmgVar2.n;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        aahdVar.c(apxfVar, null);
    }

    public final void b() {
        if (this.B) {
            return;
        }
        this.e = (SwitchCompat) this.c.findViewById(com.google.android.youtube.R.id.collaboration_state_switch);
        this.f = (TextView) this.c.findViewById(com.google.android.youtube.R.id.empty_collaborators_text);
        this.g = this.c.findViewById(com.google.android.youtube.R.id.collaborators_list);
        this.w = (RecyclerView) this.c.findViewById(com.google.android.youtube.R.id.collaborators_avatars);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        linearLayoutManager.ab(0);
        this.w.af(linearLayoutManager);
        ajnq ajnqVar = new ajnq();
        ajnqVar.f(aucb.class, new mrq(this.a, this.u, this.s));
        ajox a = this.t.a(ajnqVar);
        ajpd ajpdVar = new ajpd();
        this.q = ajpdVar;
        a.h(ajpdVar);
        this.w.ac(a);
        this.x = this.c.findViewById(com.google.android.youtube.R.id.get_link_section);
        this.h = (TextView) this.c.findViewById(com.google.android.youtube.R.id.get_link_description);
        this.i = (TextView) this.c.findViewById(com.google.android.youtube.R.id.get_link_button);
        this.y = this.c.findViewById(com.google.android.youtube.R.id.link_sharing_section);
        this.j = (TextView) this.c.findViewById(com.google.android.youtube.R.id.invite_link);
        this.k = (TextView) this.c.findViewById(com.google.android.youtube.R.id.share_link_description);
        TextView textView = (TextView) this.c.findViewById(com.google.android.youtube.R.id.share_link_button);
        this.z = textView;
        this.l = this.C.h(textView);
        this.m = (TextView) this.c.findViewById(com.google.android.youtube.R.id.revoke_links_description);
        TextView textView2 = (TextView) this.c.findViewById(com.google.android.youtube.R.id.revoke_links_button);
        this.A = textView2;
        this.n = this.C.h(textView2);
        this.B = true;
    }

    public final void c(boolean z) {
        aucj aucjVar = this.r;
        if (aucjVar == null) {
            return;
        }
        aucd aucdVar = aucjVar.d;
        if (aucdVar == null) {
            aucdVar = aucd.a;
        }
        apxf apxfVar = aucdVar.e;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        aone builder = ((PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) apxfVar.pX(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint)).toBuilder();
        int i = 0;
        while (true) {
            if (i >= ((PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) builder.instance).c.size()) {
                break;
            }
            auau auauVar = (auau) ((PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) builder.instance).c.get(i);
            int bC = anaf.bC(auauVar.c);
            if (bC != 0 && bC == 32) {
                aone builder2 = auauVar.toBuilder();
                builder2.copyOnWrite();
                auau auauVar2 = (auau) builder2.instance;
                auauVar2.b |= 4194304;
                auauVar2.l = !z;
                auau auauVar3 = (auau) builder2.build();
                builder.copyOnWrite();
                PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) builder.instance;
                auauVar3.getClass();
                aony aonyVar = playlistEditEndpointOuterClass$PlaylistEditEndpoint.c;
                if (!aonyVar.c()) {
                    playlistEditEndpointOuterClass$PlaylistEditEndpoint.c = aonm.mutableCopy(aonyVar);
                }
                playlistEditEndpointOuterClass$PlaylistEditEndpoint.c.set(i, auauVar3);
            } else {
                i++;
            }
        }
        aone builder3 = this.r.toBuilder();
        aucd aucdVar2 = this.r.d;
        if (aucdVar2 == null) {
            aucdVar2 = aucd.a;
        }
        aone builder4 = aucdVar2.toBuilder();
        aucd aucdVar3 = this.r.d;
        if (aucdVar3 == null) {
            aucdVar3 = aucd.a;
        }
        apxf apxfVar2 = aucdVar3.e;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        aong aongVar = (aong) apxfVar2.toBuilder();
        aongVar.e(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.playlistEditEndpoint, (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint) builder.build());
        builder4.copyOnWrite();
        aucd aucdVar4 = (aucd) builder4.instance;
        apxf apxfVar3 = (apxf) aongVar.build();
        apxfVar3.getClass();
        aucdVar4.e = apxfVar3;
        aucdVar4.b |= 8;
        builder3.copyOnWrite();
        aucj aucjVar2 = (aucj) builder3.instance;
        aucd aucdVar5 = (aucd) builder4.build();
        aucdVar5.getClass();
        aucjVar2.d = aucdVar5;
        aucjVar2.b |= 2;
        aucj aucjVar3 = (aucj) builder3.build();
        this.r = aucjVar3;
        aahd aahdVar = this.s;
        aucd aucdVar6 = aucjVar3.d;
        if (aucdVar6 == null) {
            aucdVar6 = aucd.a;
        }
        apxf apxfVar4 = aucdVar6.e;
        if (apxfVar4 == null) {
            apxfVar4 = apxf.a;
        }
        aahdVar.c(apxfVar4, null);
        this.e.setEnabled(false);
    }

    public final void d(boolean z) {
        this.i.setEnabled(z);
        float f = z ? 1.0f : this.v;
        this.x.setAlpha(f);
        this.f.setAlpha(f);
    }

    public final void e(int i) {
        if (i == 1) {
            this.y.setVisibility(8);
            this.x.setVisibility(0);
            this.f.setVisibility(0);
            this.g.setVisibility(8);
            this.q.clear();
            d(false);
            return;
        }
        if (i != 2) {
            this.x.setVisibility(8);
            this.y.setVisibility(0);
            d(true);
        } else {
            this.y.setVisibility(8);
            this.x.setVisibility(0);
            d(true);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{abba.class, abbb.class, abbd.class};
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    abbd abbdVar = (abbd) obj;
                    if (!TextUtils.equals(this.b, abbdVar.a)) {
                        return null;
                    }
                    b();
                    if (abbdVar.b) {
                        return null;
                    }
                    e(3);
                    return null;
                }
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            abbb abbbVar = (abbb) obj;
            if (!TextUtils.equals(this.b, abbbVar.a)) {
                return null;
            }
            b();
            if (abbbVar.c) {
                boolean z = !abbbVar.b;
                this.p = z;
                if (z) {
                    a();
                }
            } else {
                this.e.setChecked(this.p);
                d(this.p);
            }
            this.e.setEnabled(true);
            return null;
        }
        abba abbaVar = (abba) obj;
        if (!TextUtils.equals(this.b, abbaVar.a)) {
            return null;
        }
        b();
        if (!abbaVar.c || this.r == null) {
            e(2);
            return null;
        }
        this.j.setText(abbaVar.b);
        auch auchVar = this.r.i;
        if (auchVar == null) {
            auchVar = auch.a;
        }
        apmg apmgVar = auchVar.c;
        if (apmgVar == null) {
            apmgVar = apmg.a;
        }
        apxf apxfVar = apmgVar.o;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        if (!apxfVar.pY(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.sharePlaylistEndpoint)) {
            return null;
        }
        aone builder = ((SharePlaylistEndpointOuterClass$SharePlaylistEndpoint) apxfVar.pX(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.sharePlaylistEndpoint)).toBuilder();
        String str = abbaVar.b;
        builder.copyOnWrite();
        SharePlaylistEndpointOuterClass$SharePlaylistEndpoint sharePlaylistEndpointOuterClass$SharePlaylistEndpoint = (SharePlaylistEndpointOuterClass$SharePlaylistEndpoint) builder.instance;
        str.getClass();
        sharePlaylistEndpointOuterClass$SharePlaylistEndpoint.b = 2 | sharePlaylistEndpointOuterClass$SharePlaylistEndpoint.b;
        sharePlaylistEndpointOuterClass$SharePlaylistEndpoint.c = str;
        SharePlaylistEndpointOuterClass$SharePlaylistEndpoint sharePlaylistEndpointOuterClass$SharePlaylistEndpoint2 = (SharePlaylistEndpointOuterClass$SharePlaylistEndpoint) builder.build();
        auch auchVar2 = this.r.i;
        if (auchVar2 == null) {
            auchVar2 = auch.a;
        }
        apmg apmgVar2 = auchVar2.c;
        if (apmgVar2 == null) {
            apmgVar2 = apmg.a;
        }
        aong aongVar = (aong) apmgVar2.toBuilder();
        aong aongVar2 = (aong) apxfVar.toBuilder();
        aongVar2.e(SharePlaylistEndpointOuterClass$SharePlaylistEndpoint.sharePlaylistEndpoint, sharePlaylistEndpointOuterClass$SharePlaylistEndpoint2);
        aongVar.copyOnWrite();
        apmg apmgVar3 = (apmg) aongVar.instance;
        apxf apxfVar2 = (apxf) aongVar2.build();
        apxfVar2.getClass();
        apmgVar3.o = apxfVar2;
        apmgVar3.b |= 16384;
        apmg apmgVar4 = (apmg) aongVar.build();
        this.l.b(apmgVar4, this.d);
        aone builder2 = this.r.toBuilder();
        auch auchVar3 = this.r.i;
        if (auchVar3 == null) {
            auchVar3 = auch.a;
        }
        aone builder3 = auchVar3.toBuilder();
        builder3.copyOnWrite();
        auch auchVar4 = (auch) builder3.instance;
        apmgVar4.getClass();
        auchVar4.c = apmgVar4;
        auchVar4.b |= 1;
        builder2.copyOnWrite();
        aucj aucjVar = (aucj) builder2.instance;
        auch auchVar5 = (auch) builder3.build();
        auchVar5.getClass();
        aucjVar.i = auchVar5;
        aucjVar.b |= 1024;
        this.r = (aucj) builder2.build();
        return null;
    }
}
