package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gei extends lo {
    final /* synthetic */ AccessibilityManager a;
    final /* synthetic */ aahd b;
    final /* synthetic */ apxf c;
    final /* synthetic */ gdz d;
    final /* synthetic */ gej e;

    public gei(gej gejVar, AccessibilityManager accessibilityManager, aahd aahdVar, apxf apxfVar, gdz gdzVar) {
        this.e = gejVar;
        this.a = accessibilityManager;
        this.b = aahdVar;
        this.c = apxfVar;
        this.d = gdzVar;
    }

    @Override // defpackage.lo
    public final void c(RecyclerView recyclerView, int i, int i2) {
        AccessibilityManager accessibilityManager = this.a;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            double computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            gej gejVar = this.e;
            if (gejVar.a) {
                if (computeVerticalScrollOffset < gejVar.b) {
                    this.d.b();
                }
            } else {
                if (i2 < 0 || computeVerticalScrollOffset < gejVar.b) {
                    return;
                }
                this.b.a(this.c);
            }
        }
    }
}
