package defpackage;

import android.view.accessibility.CaptioningManager;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aisk implements abdr {
    private final anhy a;
    private final aipt b;

    public aisk(anhy anhyVar, aipt aiptVar) {
        anhyVar.getClass();
        this.a = anhyVar;
        aiptVar.getClass();
        this.b = aiptVar;
    }

    @Override // defpackage.abdr
    public final void no(abdu abduVar) {
        CaptioningManager captioningManager = null;
        if (this.a.isDone()) {
            try {
                ammv ammvVar = (ammv) anaf.W(this.a);
                if (ammvVar.h()) {
                    captioningManager = (CaptioningManager) ammvVar.c();
                }
            } catch (ExecutionException e) {
                zga.d("Exception getting CaptioningManager", e);
            }
        }
        abduVar.B = aisf.k(this.b, captioningManager);
    }
}
