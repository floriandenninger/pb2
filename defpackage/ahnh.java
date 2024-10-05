package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahnh implements aheq, ahhb {
    public final Set a;
    public atzm b;
    private final Context c;
    private final ajjz d;
    private final ViewGroup e;
    private ahng f;
    private boolean g;

    public ahnh(Context context, ajjz ajjzVar, ViewGroup viewGroup) {
        this.c = context;
        ajjzVar.getClass();
        this.d = ajjzVar;
        viewGroup.getClass();
        this.e = viewGroup;
        this.a = new CopyOnWriteArraySet();
    }

    @Override // defpackage.aheq
    public final void kV() {
        ahng ahngVar = this.f;
        if (ahngVar != null) {
            ahngVar.l = true;
            this.b = null;
        }
    }

    @Override // defpackage.aheq
    public final void m(atzm atzmVar, boolean z) {
        aqyg aqygVar;
        if (this.f == null || atzmVar == null) {
            return;
        }
        if (atzmVar.equals(this.b) && this.g == z) {
            return;
        }
        this.b = atzmVar;
        this.g = z;
        ahng ahngVar = this.f;
        aqyg aqygVar2 = null;
        if ((atzmVar.b & 2) != 0) {
            aqygVar = atzmVar.d;
            if (aqygVar == null) {
                aqygVar = aqyg.a;
            }
        } else {
            aqygVar = null;
        }
        String obj = ajcq.b(aqygVar).toString();
        if ((atzmVar.b & 4) != 0 && (aqygVar2 = atzmVar.e) == null) {
            aqygVar2 = aqyg.a;
        }
        String obj2 = ajcq.b(aqygVar2).toString();
        avgg avggVar = atzmVar.j;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        ahngVar.b.l = true;
        ahngVar.a.l(ahbw.B(avggVar), new ahnf(ahngVar));
        ahngVar.e.b(obj);
        ahngVar.e.a(obj2);
        ahki ahkiVar = ahngVar.c;
        ahkiVar.a.b.l = true;
        ahkg ahkgVar = ahkiVar.i;
        if (ahkgVar != null) {
            ((ahmc) ahkgVar).j();
        }
        ahngVar.l = false;
    }

    @Override // defpackage.aheq
    public final void n(final long j, final long j2) {
        ahng ahngVar = this.f;
        if (ahngVar != null) {
            final ahfx ahfxVar = ahngVar.f;
            if (ahfxVar == null) {
                zga.b("Attempting to update progress on a null countdown progress UI component.");
                return;
            }
            ahfw ahfwVar = ahfxVar.k;
            if (ahfwVar != null && !ahfwVar.isIndeterminate()) {
                ahfxVar.j.post(new Runnable() { // from class: ahft
                    @Override // java.lang.Runnable
                    public final void run() {
                        ahfx ahfxVar2 = ahfx.this;
                        long j3 = j;
                        long j4 = j2;
                        ahfw ahfwVar2 = ahfxVar2.k;
                        if (ahfwVar2 == null || ahfwVar2.isIndeterminate()) {
                            return;
                        }
                        ahfwVar2.setMax((int) j4);
                        ahfwVar2.setProgress((int) j3);
                    }
                });
            }
            if (j != j2 || j == 0) {
                return;
            }
            ahngVar.c.g();
        }
    }

    @Override // defpackage.ahhb
    public final void qF(ahkm ahkmVar, ahki ahkiVar) {
        ahng ahngVar = new ahng(this.c, ahkmVar, ahkiVar, this.d, this.e, this);
        this.f = ahngVar;
        ahkiVar.c(ahngVar);
        ahkiVar.k = this.f;
    }

    @Override // defpackage.ahhb
    public final void qG() {
        this.f = null;
    }
}
