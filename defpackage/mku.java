package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class mku extends mlc {
    private final ImageView C;
    private final TextView D;
    private final TextView E;
    private final View F;
    private final View G;
    public final View a;
    private final ajjz b;
    private final fgn c;
    private final flx d;
    private final ajop e;
    private final ajoi f;

    public mku(Context context, ajjz ajjzVar, fgn fgnVar, ajop ajopVar, View view, aahd aahdVar, flx flxVar) {
        super(context, ajjzVar, ajopVar, view, aahdVar, null, null, null, null, null, null, null, null, null);
        this.c = fgnVar;
        this.e = ajopVar;
        this.d = flxVar;
        this.b = ajjzVar;
        this.f = new ajoi(aahdVar, ajopVar);
        View findViewById = this.i.findViewById(R.id.thumbnail_container);
        this.a = findViewById == null ? this.x : findViewById;
        this.C = (ImageView) view.findViewById(R.id.channel_thumbnail);
        this.G = view.findViewById(R.id.play);
        this.F = view.findViewById(R.id.insets_container);
        this.D = (TextView) view.findViewById(R.id.mdx_queue_button);
        this.E = (TextView) view.findViewById(R.id.mdx_play_hint);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.e.a();
    }

    @Override // defpackage.mlc, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.f.c();
    }

    @Override // defpackage.ajom
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, arhz arhzVar) {
        apxf apxfVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        ajoi ajoiVar = this.f;
        acra acraVar = ajokVar.a;
        avgg avggVar = null;
        if ((arhzVar.b & 256) != 0) {
            apxfVar = arhzVar.i;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.b(acraVar, apxfVar, ajokVar.e(), this);
        ajokVar.a.u(new acqx(arhzVar.h), null);
        arhx arhxVar = arhzVar.g;
        if (arhxVar == null) {
            arhxVar = arhx.a;
        }
        arhw arhwVar = arhxVar.c;
        if (arhwVar == null) {
            arhwVar = arhw.a;
        }
        if ((arhwVar.b & 1) != 0) {
            aqygVar = arhwVar.c;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        A(ajcq.b(aqygVar));
        if ((arhwVar.b & 2) != 0) {
            aqygVar2 = arhwVar.d;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        n(ajcq.b(aqygVar2));
        if ((arhwVar.b & 4) != 0) {
            aqygVar3 = arhwVar.e;
            if (aqygVar3 == null) {
                aqygVar3 = aqyg.a;
            }
        } else {
            aqygVar3 = null;
        }
        CharSequence b = ajcq.b(aqygVar3);
        aqyg aqygVar5 = arhwVar.j;
        if (aqygVar5 == null) {
            aqygVar5 = aqyg.a;
        }
        Spanned b2 = ajcq.b(aqygVar5);
        if (!TextUtils.isEmpty(b2)) {
            if (b != null) {
                ajm a = ajm.a();
                b = TextUtils.concat(a.b(b.toString()), " · ", a.b(b2.toString()));
            } else {
                b = null;
            }
        }
        m(b, null, false);
        TextView textView = this.l;
        if ((arhzVar.b & 16) == 0) {
            jm.t(textView, R.drawable.player_live_dot, 0);
            textView.setText(R.string.live_label);
        } else {
            jm.t(textView, 0, 0);
            if ((arhzVar.b & 16) != 0) {
                aqygVar4 = arhzVar.f;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
            } else {
                aqygVar4 = null;
            }
            o(ajcq.b(aqygVar4), null);
        }
        e(arhzVar);
        ajjz ajjzVar = this.b;
        ImageView imageView = this.C;
        if ((arhwVar.b & 8) != 0 && (avggVar = arhwVar.f) == null) {
            avggVar = avgg.a;
        }
        ajjzVar.h(imageView, avggVar);
        if (this.F != null) {
            Rect a2 = this.c.a();
            this.F.setPadding(a2.left, a2.top, a2.right, a2.bottom);
        }
        this.e.e(ajokVar);
    }

    public final void e(arhz arhzVar) {
        avgg avggVar;
        ajjz ajjzVar = this.b;
        flx flxVar = this.d;
        ImageView imageView = this.x;
        int i = arhzVar.b;
        avgg avggVar2 = null;
        String str = (i & 1024) != 0 ? arhzVar.k : null;
        if ((i & 2) != 0) {
            avgg avggVar3 = arhzVar.c;
            if (avggVar3 == null) {
                avggVar3 = avgg.a;
            }
            avggVar = avggVar3;
        } else {
            avggVar = null;
        }
        fkc.f(ajjzVar, flxVar, imageView, str, avggVar, null);
        if ((arhzVar.b & 2) != 0 && (avggVar2 = arhzVar.c) == null) {
            avggVar2 = avgg.a;
        }
        this.A = avggVar2;
    }

    public final void f(boolean z) {
        this.G.setVisibility(true != z ? 8 : 0);
    }

    public final void g(boolean z, lru lruVar) {
        String string;
        TextView textView = this.D;
        if (textView != null) {
            whu.I(textView, lruVar.a());
        }
        TextView textView2 = this.E;
        if (textView2 != null) {
            whu.I(textView2, z);
            String str = null;
            if (z) {
                if (lruVar.a()) {
                    adlm g = lruVar.a.g();
                    if (g != null && g.k() != null) {
                        str = g.k().c();
                    }
                    TextView textView3 = this.E;
                    if (str == null) {
                        string = this.g.getString(R.string.play_on_screen);
                    } else {
                        string = this.g.getString(R.string.inline_mdx_play_hint, str);
                    }
                    textView3.setText(string);
                    return;
                }
                this.E.setText(this.g.getString(R.string.connecting));
                return;
            }
            this.E.setText((CharSequence) null);
        }
    }
}
