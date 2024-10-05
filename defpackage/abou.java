package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
final class abou extends View.AccessibilityDelegate {
    final /* synthetic */ avhy a;
    final /* synthetic */ abow b;

    public abou(abow abowVar, avhy avhyVar) {
        this.b = abowVar;
        this.a = avhyVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        String valueOf = String.valueOf(this.b.a.r().getHint());
        aqyg aqygVar = this.a.e;
        if (aqygVar == null) {
            aqygVar = aqyg.a;
        }
        String valueOf2 = String.valueOf(ajcq.b(aqygVar));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(" ");
        sb.append(valueOf2);
        accessibilityNodeInfo.setText(sb.toString());
    }
}
