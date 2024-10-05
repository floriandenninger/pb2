package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.playlist.ui.PlaylistThumbnailView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mrt implements ajom {
    public final aahd a;
    public jai b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final PlaylistThumbnailView g;
    private final View h;
    private final View i;
    private final ImageView j;
    private final TextView k;
    private final ajjz l;
    private final ajuw m;
    private final ajoi n;

    public mrt(Context context, ajjz ajjzVar, aahd aahdVar, ajuw ajuwVar) {
        ajjzVar.getClass();
        this.l = ajjzVar;
        this.m = ajuwVar;
        aahdVar.getClass();
        this.a = aahdVar;
        View inflate = View.inflate(context, R.layout.playlist_feed_entry, null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.author);
        this.f = (TextView) inflate.findViewById(R.id.video_count);
        this.g = (PlaylistThumbnailView) inflate.findViewById(R.id.playlist_thumbnail);
        this.h = inflate.findViewById(R.id.contextual_menu_anchor);
        View findViewById = inflate.findViewById(R.id.feed_entry);
        this.i = findViewById;
        this.j = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.k = (TextView) inflate.findViewById(R.id.feed_text);
        this.n = new ajoi(aahdVar, inflate);
        findViewById.setOnClickListener(new mrs(this));
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        this.n.c();
    }

    @Override // defpackage.ajom
    public final /* bridge */ /* synthetic */ void oB(ajok ajokVar, Object obj) {
        avgg avggVar;
        aqyg aqygVar;
        auda audaVar;
        avgg avggVar2;
        aqyg aqygVar2;
        apxf apxfVar;
        jai jaiVar = (jai) obj;
        ajoi ajoiVar = this.n;
        acra acraVar = ajokVar.a;
        jaj a = jaiVar.a();
        atdc atdcVar = null;
        if (a.b == null) {
            aubz aubzVar = a.a;
            if ((aubzVar.b & 32) != 0) {
                apxfVar = aubzVar.j;
                if (apxfVar == null) {
                    apxfVar = apxf.a;
                }
            } else {
                apxfVar = null;
            }
            a.b = apxfVar;
        }
        ajoiVar.a(acraVar, a.b, ajokVar.e());
        if (jaiVar.b() != null) {
            ajokVar.a.u(new acqx(jaiVar.b()), null);
        }
        whl.I(this.a, jaiVar.a.i, jaiVar);
        this.b = jaiVar;
        ajjz ajjzVar = this.l;
        ImageView imageView = this.j;
        aqwe aqweVar = jaiVar.a;
        if (aqweVar.c == 1) {
            avggVar = (avgg) aqweVar.d;
        } else {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        TextView textView = this.k;
        if (textView != null) {
            aqwe aqweVar2 = jaiVar.a;
            if ((aqweVar2.b & 8) != 0) {
                aqygVar2 = aqweVar2.f;
                if (aqygVar2 == null) {
                    aqygVar2 = aqyg.a;
                }
            } else {
                aqygVar2 = null;
            }
            textView.setText(ajcq.b(aqygVar2));
        }
        jaj a2 = jaiVar.a();
        TextView textView2 = this.d;
        aqyg aqygVar3 = a2.a.d;
        if (aqygVar3 == null) {
            aqygVar3 = aqyg.a;
        }
        textView2.setText(ajcq.b(aqygVar3));
        TextView textView3 = this.e;
        aubz aubzVar2 = a2.a;
        if ((aubzVar2.b & 128) != 0) {
            aqygVar = aubzVar2.k;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        textView3.setText(ajcq.b(aqygVar));
        TextView textView4 = this.f;
        aqyg aqygVar4 = a2.a.i;
        if (aqygVar4 == null) {
            aqygVar4 = aqyg.a;
        }
        textView4.setText(ajcq.b(aqygVar4));
        this.g.c.setText(String.valueOf(a2.a.h));
        aubz aubzVar3 = a2.a;
        if ((aubzVar3.b & 4) != 0) {
            audaVar = aubzVar3.e;
            if (audaVar == null) {
                audaVar = auda.a;
            }
        } else {
            audaVar = null;
        }
        if (audaVar == null) {
            this.g.d(false);
            this.l.h(this.g.b, a2.a.f.size() > 0 ? (avgg) a2.a.f.get(0) : null);
        } else if ((audaVar.b & 2) == 0) {
            this.g.d(false);
            ajjz ajjzVar2 = this.l;
            ImageView imageView2 = this.g.b;
            if ((audaVar.b & 1) != 0) {
                audb audbVar = audaVar.c;
                if (audbVar == null) {
                    audbVar = audb.a;
                }
                avggVar2 = audbVar.c;
                if (avggVar2 == null) {
                    avggVar2 = avgg.a;
                }
            } else {
                avggVar2 = null;
            }
            ajjzVar2.h(imageView2, avggVar2);
        } else {
            this.g.d(true);
            ajjz ajjzVar3 = this.l;
            ImageView imageView3 = this.g.b;
            aucz auczVar = audaVar.d;
            if (auczVar == null) {
                auczVar = aucz.a;
            }
            avgg avggVar3 = auczVar.b;
            if (avggVar3 == null) {
                avggVar3 = avgg.a;
            }
            ajjzVar3.h(imageView3, avggVar3);
        }
        this.h.setVisibility(0);
        ajuw ajuwVar = this.m;
        View view = this.h;
        if (jaiVar.a() != null) {
            jaj a3 = jaiVar.a();
            atdf atdfVar = a3.a.l;
            if (atdfVar == null) {
                atdfVar = atdf.a;
            }
            if ((atdfVar.b & 1) != 0) {
                atdf atdfVar2 = a3.a.l;
                if (atdfVar2 == null) {
                    atdfVar2 = atdf.a;
                }
                atdcVar = atdfVar2.c;
                if (atdcVar == null) {
                    atdcVar = atdc.a;
                }
            }
        }
        ajuwVar.d(view, atdcVar, jaiVar, ajokVar.a);
    }
}
