package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class msb extends kwy {
    private final ajoi o;

    public msb(Context context, ajjz ajjzVar, int i, gma gmaVar, aahd aahdVar, ajuw ajuwVar, ajut ajutVar) {
        super(context, ajjzVar, ajuwVar, i, ajutVar);
        this.o = new ajoi(aahdVar, gmaVar);
    }

    @Override // defpackage.ajom
    public final View a() {
        return this.c;
    }

    @Override // defpackage.kwy, defpackage.ajom
    public final void b(ajos ajosVar) {
        super.b(ajosVar);
        this.o.c();
    }

    @Override // defpackage.ajom
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void oB(ajok ajokVar, aubz aubzVar) {
        apxf apxfVar;
        aqyg aqygVar;
        aqyg aqygVar2;
        ajoi ajoiVar = this.o;
        acra acraVar = ajokVar.a;
        aqyg aqygVar3 = null;
        if ((aubzVar.b & 32) != 0) {
            apxfVar = aubzVar.j;
            if (apxfVar == null) {
                apxfVar = apxf.a;
            }
        } else {
            apxfVar = null;
        }
        ajoiVar.a(acraVar, apxfVar, ajokVar.e());
        if ((aubzVar.b & 2) != 0) {
            aqygVar = aubzVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        k(ajcq.b(aqygVar));
        if ((aubzVar.b & 128) != 0) {
            aqygVar2 = aubzVar.k;
            if (aqygVar2 == null) {
                aqygVar2 = aqyg.a;
            }
        } else {
            aqygVar2 = null;
        }
        d(ajcq.b(aqygVar2));
        auda audaVar = aubzVar.e;
        if (audaVar == null) {
            audaVar = auda.a;
        }
        audb audbVar = audaVar.c;
        if (audbVar == null) {
            audbVar = audb.a;
        }
        if ((audbVar.b & 1) == 0) {
            if (aubzVar.f.size() > 0) {
                g((avgg) aubzVar.f.get(0));
            }
        } else {
            auda audaVar2 = aubzVar.e;
            if (audaVar2 == null) {
                audaVar2 = auda.a;
            }
            audb audbVar2 = audaVar2.c;
            if (audbVar2 == null) {
                audbVar2 = audb.a;
            }
            avgg avggVar = audbVar2.c;
            if (avggVar == null) {
                avggVar = avgg.a;
            }
            g(avggVar);
        }
        if (aubzVar.g.size() <= 0) {
            if ((aubzVar.b & 16) != 0 && (aqygVar3 = aubzVar.i) == null) {
                aqygVar3 = aqyg.a;
            }
            Spanned b = ajcq.b(aqygVar3);
            j(b, b);
            return;
        }
        i(aubzVar.g);
    }
}
