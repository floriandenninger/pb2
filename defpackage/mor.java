package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mor extends kwy {
    private final ajop o;
    private final ajoi p;
    private final TextView q;

    public mor(Context context, ajjz ajjzVar, gma gmaVar, aahd aahdVar, ajuw ajuwVar, ajut ajutVar) {
        super(context, ajjzVar, ajuwVar, R.layout.grid_narrow_playlist_item, ajutVar);
        this.o = gmaVar;
        gmaVar.c(this.c);
        this.p = new ajoi(aahdVar, gmaVar);
        this.q = (TextView) this.c.findViewById(R.id.title);
    }

    @Override // defpackage.ajom
    public final View a() {
        return ((gma) this.o).b;
    }

    @Override // defpackage.kwy, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.p.c();
    }

    @Override // defpackage.ajom
    public final /* synthetic */ void oB(ajok ajokVar, Object obj) {
        aqyg aqygVar;
        aqyg aqygVar2;
        aqyg aqygVar3;
        aqyg aqygVar4;
        arcp arcpVar = (arcp) obj;
        arcpVar.getClass();
        ajoi ajoiVar = this.p;
        acra acraVar = ajokVar.a;
        apxf apxfVar = arcpVar.j;
        if (apxfVar == null) {
            apxfVar = apxf.a;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        atdf atdfVar = null;
        ajokVar.a.u(new acqx(arcpVar.l), null);
        if ((arcpVar.b & 4) != 0) {
            aqygVar = arcpVar.e;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        k(ajcq.b(aqygVar));
        if ((arcpVar.b & 16) != 0) {
            aqygVar2 = arcpVar.g;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        d(ajcq.b(aqygVar2));
        if (m(arcpVar.d)) {
            i(arcpVar.d);
        } else {
            if ((arcpVar.b & 64) != 0) {
                aqygVar3 = arcpVar.i;
                if (aqygVar3 == null) {
                    aqygVar3 = aqyg.a;
                }
            } else {
                aqygVar3 = null;
            }
            CharSequence b = ajcq.b(aqygVar3);
            if ((arcpVar.b & 32) != 0) {
                aqygVar4 = arcpVar.h;
                if (aqygVar4 == null) {
                    aqygVar4 = aqyg.a;
                }
            } else {
                aqygVar4 = null;
            }
            j(b, ajcq.b(aqygVar4));
        }
        if ((arcpVar.b & 2) != 0) {
            auda audaVar = arcpVar.c;
            if (audaVar == null) {
                audaVar = auda.a;
            }
            if ((audaVar.b & 2) != 0) {
                auda audaVar2 = arcpVar.c;
                if (audaVar2 == null) {
                    audaVar2 = auda.a;
                }
                aucz auczVar = audaVar2.d;
                if (auczVar == null) {
                    auczVar = aucz.a;
                }
                avgg avggVar = auczVar.b;
                if (avggVar == null) {
                    avggVar = avgg.a;
                }
                g(avggVar);
            } else {
                auda audaVar3 = arcpVar.c;
                if (audaVar3 == null) {
                    audaVar3 = auda.a;
                }
                if ((audaVar3.b & 1) != 0) {
                    auda audaVar4 = arcpVar.c;
                    if (audaVar4 == null) {
                        audaVar4 = auda.a;
                    }
                    audb audbVar = audaVar4.c;
                    if (audbVar == null) {
                        audbVar = audb.a;
                    }
                    avgg avggVar2 = audbVar.c;
                    if (avggVar2 == null) {
                        avggVar2 = avgg.a;
                    }
                    g(avggVar2);
                }
            }
        }
        View view = ((gma) this.o).b;
        if ((arcpVar.b & 256) != 0 && (atdfVar = arcpVar.k) == null) {
            atdfVar = atdf.a;
        }
        f(view, atdfVar, arcpVar, ajokVar.a);
        this.o.e(ajokVar);
        TextView textView = this.q;
        int i = arcpVar.f;
        textView.setMaxLines(i != 0 ? i : 1);
    }
}
