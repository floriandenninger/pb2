package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kgc implements ajom, aida {
    public apxf a;
    private final ajjz b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final View.OnClickListener h;
    private aidb i;
    private acra j;
    private byte[] k;
    private final /* synthetic */ int l;

    public kgc(Context context, ajjz ajjzVar, final aahd aahdVar, ViewGroup viewGroup, int i, byte[] bArr) {
        this.l = i;
        this.b = ajjzVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.app_related_end_screen_playlist_item, viewGroup, false);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.g = (TextView) inflate.findViewById(R.id.title);
        this.f = (TextView) inflate.findViewById(R.id.metadata);
        this.e = (TextView) inflate.findViewById(R.id.video_count);
        final byte[] bArr2 = null;
        this.h = new View.OnClickListener(aahdVar, bArr2) { // from class: kfz
            public final /* synthetic */ aahd a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kgc kgcVar = kgc.this;
                aahd aahdVar2 = this.a;
                apxf apxfVar = kgcVar.a;
                if (apxfVar != null) {
                    aahdVar2.c(apxfVar, null);
                }
            }
        };
    }

    private final void f(int i) {
        acra acraVar;
        if (i == 2) {
            this.c.setOnClickListener(this.h);
            jw.V(this.c, 0);
            byte[] bArr = this.k;
            if (bArr == null || (acraVar = this.j) == null) {
                return;
            }
            acraVar.u(new acqx(bArr), null);
            return;
        }
        this.c.setOnClickListener(null);
        this.c.setClickable(false);
        jw.V(this.c, 4);
    }

    private final void g(int i) {
        acra acraVar;
        if (i == 2) {
            jw.V(this.c, 0);
            this.c.setOnClickListener(this.h);
            byte[] bArr = this.k;
            if (bArr == null || (acraVar = this.j) == null) {
                return;
            }
            acraVar.u(new acqx(bArr), null);
            return;
        }
        this.c.setOnClickListener(null);
        this.c.setClickable(false);
        jw.V(this.c, 4);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.l != 0 ? this.c : this.c;
    }

    @Override // defpackage.aida
    public final void nW(float f, boolean z) {
    }

    @Override // defpackage.ajom
    public final void b(ajos ajosVar) {
        if (this.l != 0) {
            aidb aidbVar = this.i;
            if (aidbVar != null) {
                aidbVar.b(this);
                return;
            }
            return;
        }
        aidb aidbVar2 = this.i;
        if (aidbVar2 != null) {
            aidbVar2.b(this);
        }
    }

    @Override // defpackage.aida
    public final void d(int i, int i2, int i3) {
        if (this.l != 0) {
            g(i2);
        } else {
            f(i2);
        }
    }

    public kgc(Context context, ajjz ajjzVar, final aahd aahdVar, ViewGroup viewGroup, int i) {
        this.l = i;
        this.b = ajjzVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.app_related_end_screen_video_item, viewGroup, false);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.e = (TextView) inflate.findViewById(R.id.title);
        this.g = (TextView) inflate.findViewById(R.id.metadata);
        this.f = (TextView) inflate.findViewById(R.id.duration);
        this.h = new View.OnClickListener() { // from class: kgb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kgc kgcVar = kgc.this;
                aahd aahdVar2 = aahdVar;
                apxf apxfVar = kgcVar.a;
                if (apxfVar != null) {
                    aahdVar2.c(apxfVar, null);
                }
            }
        };
    }

    @Override // defpackage.ajom
    public final /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        Spanned b;
        aqyg aqygVar3;
        Spanned b2;
        if (this.l == 0) {
            aqsz aqszVar = (aqsz) obj;
            this.j = ajokVar.a;
            this.k = aqszVar.k.I();
            ajjz ajjzVar = this.b;
            ImageView imageView = this.d;
            avgg avggVar = aqszVar.d;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            ajjzVar.h(imageView, avggVar);
            TextView textView = this.e;
            if ((aqszVar.b & 8) != 0) {
                aqygVar = aqszVar.f;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            textView.setText(ajcq.b(aqygVar));
            TextView textView2 = this.e;
            textView2.setContentDescription(textView2.getText());
            TextView textView3 = this.g;
            int i = aqszVar.b;
            int i2 = i & 32;
            if (i2 != 0) {
                if (i2 != 0) {
                    aqygVar3 = aqszVar.h;
                    if (aqygVar3 == null) {
                        aqygVar3 = aqyg.a;
                    }
                } else {
                    aqygVar3 = null;
                }
                b = ajcq.b(aqygVar3);
            } else {
                if ((i & 16) != 0) {
                    aqygVar2 = aqszVar.g;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                } else {
                    aqygVar2 = null;
                }
                b = ajcq.b(aqygVar2);
            }
            textView3.setText(b);
            TextView textView4 = this.g;
            textView4.setContentDescription(textView4.getText());
            fkc.m(this.f, null, null, aqszVar.e, null);
            this.f.setImportantForAccessibility(2);
            apxf apxfVar = aqszVar.j;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
            this.a = apxfVar;
            Object c = ajokVar.c("visibility_change_listener");
            if (c != null) {
                aidb aidbVar = (aidb) c;
                this.i = aidbVar;
                if (aidbVar != null) {
                    aidbVar.a(this);
                }
                f(this.i.a);
                float f = this.i.b;
                return;
            }
            return;
        }
        aqsy aqsyVar = (aqsy) obj;
        this.j = ajokVar.a;
        this.k = aqsyVar.i.I();
        ajjz ajjzVar2 = this.b;
        ImageView imageView2 = this.d;
        avgg avggVar2 = aqsyVar.d;
        if (avggVar2 == null) {
            avggVar2 = avgg.a;
        }
        ajjzVar2.h(imageView2, avggVar2);
        TextView textView5 = this.g;
        aqyg aqygVar4 = aqsyVar.c;
        if (aqygVar4 == null) {
            aqygVar4 = aqyg.a;
        }
        textView5.setText(ajcq.b(aqygVar4));
        TextView textView6 = this.g;
        textView6.setContentDescription(textView6.getText());
        TextView textView7 = this.f;
        if ((aqsyVar.b & 64) != 0) {
            aqyg aqygVar5 = aqsyVar.f;
            if (aqygVar5 == null) {
                aqygVar5 = aqyg.a;
            }
            b2 = ajcq.b(aqygVar5);
        } else {
            aqyg aqygVar6 = aqsyVar.g;
            if (aqygVar6 == null) {
                aqygVar6 = aqyg.a;
            }
            b2 = ajcq.b(aqygVar6);
        }
        textView7.setText(b2);
        TextView textView8 = this.f;
        textView8.setContentDescription(textView8.getText());
        TextView textView9 = this.e;
        aqyg aqygVar7 = aqsyVar.h;
        if (aqygVar7 == null) {
            aqygVar7 = aqyg.a;
        }
        textView9.setText(ajcq.b(aqygVar7));
        this.e.setImportantForAccessibility(2);
        apxf apxfVar2 = aqsyVar.e;
        if (apxfVar2 == null) {
            apxfVar2 = apxf.a;
        }
        this.a = apxfVar2;
        Object c2 = ajokVar.c("visibility_change_listener");
        if (c2 != null) {
            aidb aidbVar2 = (aidb) c2;
            this.i = aidbVar2;
            if (aidbVar2 != null) {
                aidbVar2.a(this);
            }
            g(this.i.a);
            float f2 = this.i.b;
        }
    }
}
