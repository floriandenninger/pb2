package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.accessibility.AccessibilityManager;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gej {
    public boolean a;
    public double b;
    public RecyclerView c;
    public lo d;

    public final void a(apxf apxfVar, ajwi ajwiVar, aahd aahdVar, final gdz gdzVar, Context context, int i) {
        if (ajwiVar == null || context == null) {
            return;
        }
        RecyclerView recyclerView = ajwiVar.K;
        this.c = recyclerView;
        if (recyclerView == null) {
            return;
        }
        this.b = i * 5;
        AccessibilityManager a = zev.a(context);
        gei geiVar = new gei(this, a, aahdVar, apxfVar, gdzVar);
        this.d = geiVar;
        this.c.aD(geiVar);
        if (a != null) {
            a.addAccessibilityStateChangeListener(new AccessibilityManager.AccessibilityStateChangeListener() { // from class: geh
                @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
                public final void onAccessibilityStateChanged(boolean z) {
                    gej gejVar = gej.this;
                    gdz gdzVar2 = gdzVar;
                    if (gejVar.a && z) {
                        gdzVar2.b();
                    }
                }
            });
        }
    }
}
