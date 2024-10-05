package defpackage;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahui implements AccessibilityManager.AccessibilityStateChangeListener {
    private final Context a;
    private final azqv b = azqv.aq(ahuh.b(false));
    private Boolean c;
    private boolean d;

    public ahui(Context context) {
        this.a = context;
    }

    public final aypn a() {
        return this.b.n();
    }

    public final void b() {
        boolean e = e();
        ahuh ahuhVar = (ahuh) this.b.ar();
        if (ahuhVar == null || e != ahuhVar.a) {
            onAccessibilityStateChanged(e);
        }
    }

    public final void c() {
        if (this.d) {
            this.d = false;
            zev.h(this.a, this);
        }
    }

    public final void d() {
        boolean booleanValue;
        if (this.d) {
            return;
        }
        this.d = true;
        zev.g(this.a, this);
        Boolean bool = this.c;
        if (bool == null) {
            Boolean bool2 = (Boolean) ynm.f(anaf.O(false), false);
            this.c = bool2;
            booleanValue = bool2.booleanValue();
        } else {
            booleanValue = bool.booleanValue();
        }
        if (booleanValue) {
            azqv azqvVar = this.b;
            ahug ahugVar = new ahug(ahuh.b(true));
            ahugVar.e(true);
            azqvVar.c(ahugVar.a());
            return;
        }
        this.b.c(ahuh.b(e()));
    }

    protected final boolean e() {
        return zev.e(this.a);
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        this.b.c(ahuh.b(e()));
    }
}
