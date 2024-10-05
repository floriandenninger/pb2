package defpackage;

import android.view.View;
import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ose extends orq implements brm {
    ory ae;
    public osm af;

    @Override // defpackage.bsd
    public final void aG(boolean z) {
        ory oryVar = this.ae;
        if (oryVar == null) {
            return;
        }
        int a = oryVar.a();
        int b = this.ae.b();
        this.ae = null;
        if (z) {
            if (a == 0) {
                if (b == 0) {
                    this.af.d(false);
                    return;
                }
                a = 0;
            }
            this.af.d(true);
            this.af.e((a * 60) + b);
        }
    }

    @Override // defpackage.bsd
    protected final View aL() {
        ory oryVar = new ory(qR());
        this.ae = oryVar;
        oryVar.e(orz.a, orz.b);
        int a = this.af.a();
        this.ae.c(a / 60);
        this.ae.d(a % 60);
        return this.ae;
    }

    @Override // defpackage.brm
    public final Preference ol(CharSequence charSequence) {
        return null;
    }
}
