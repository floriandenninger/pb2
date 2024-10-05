package defpackage;

import android.app.Activity;
import android.view.ContextThemeWrapper;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class igq implements afwx {
    private final Activity a;
    private final aahd b;
    private final zaw c;
    private final azrw d;
    private final Object e = this;

    public igq(Activity activity, aahd aahdVar, zaw zawVar, azrw azrwVar) {
        this.a = activity;
        this.b = aahdVar;
        this.c = zawVar;
        this.d = azrwVar;
    }

    @Override // defpackage.cnk
    public final void kY(cnq cnqVar) {
        this.c.e(cnqVar);
    }

    @Override // defpackage.cnl
    public final /* bridge */ /* synthetic */ void kZ(Object obj) {
        asmt asmtVar;
        boolean z;
        aqvu aqvuVar;
        arqh arqhVar = (arqh) obj;
        if (arqhVar == null) {
            return;
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.a, R.style.ReelTheme_Dialog_Alert);
        boolean z2 = !this.a.isFinishing();
        if (z2) {
            z2 = !this.a.isDestroyed();
        }
        arqk arqkVar = arqhVar.f;
        if (arqkVar == null) {
            arqkVar = arqk.a;
        }
        if (arqkVar.b == 171313147) {
            arqk arqkVar2 = arqhVar.f;
            if (arqkVar2 == null) {
                arqkVar2 = arqk.a;
            }
            if (arqkVar2.b == 171313147) {
                asmtVar = (asmt) arqkVar2.c;
            } else {
                asmtVar = asmt.a;
            }
        } else {
            asmtVar = null;
        }
        boolean z3 = false;
        if (!z2 || asmtVar == null) {
            z = true;
        } else {
            ((ajrc) this.d.get()).a(asmtVar, amlr.a, this.e);
            z = false;
        }
        arqk arqkVar3 = arqhVar.f;
        if (arqkVar3 == null) {
            arqkVar3 = arqk.a;
        }
        if (arqkVar3.b == 85374086) {
            arqk arqkVar4 = arqhVar.f;
            if (arqkVar4 == null) {
                arqkVar4 = arqk.a;
            }
            if (arqkVar4.b == 85374086) {
                aqvuVar = (aqvu) arqkVar4.c;
            } else {
                aqvuVar = aqvu.a;
            }
        } else {
            aqvuVar = null;
        }
        if (!z2 || aqvuVar == null) {
            z3 = z;
        } else {
            ajdj.c(contextThemeWrapper, aqvuVar, this.b, this.e);
        }
        if (z2 && arqhVar.g.size() > 0) {
            this.b.d(arqhVar.g, null);
        } else if (z3) {
            whu.K(this.a.getApplicationContext(), R.string.video_is_flagged, 1);
        }
    }

    @Override // defpackage.afwx
    public final /* synthetic */ void lK() {
    }
}
