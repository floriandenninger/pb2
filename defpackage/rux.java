package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeProvider;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rux extends AccessibilityNodeProvider {
    final /* synthetic */ rvd a;

    public rux(rvd rvdVar) {
        this.a = rvdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r8 != 2) goto L19;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r17) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rux.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        if (i == -1) {
            return this.a.b.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 64) {
            rvd rvdVar = this.a;
            if (rvdVar.k == i) {
                return false;
            }
            if (i != -1) {
                rvdVar.b.removeCallbacks(rvdVar.a);
            }
            rvd rvdVar2 = this.a;
            rvdVar2.k = i;
            rvdVar2.a(32768, i);
            return true;
        }
        if (i2 != 128) {
            return false;
        }
        rvd rvdVar3 = this.a;
        if (rvdVar3.k != i) {
            return false;
        }
        if (i == -3 || i == -2) {
            rvdVar3.b.postDelayed(rvdVar3.a, 0L);
        }
        rvd rvdVar4 = this.a;
        rvdVar4.k = -1;
        rvdVar4.a(65536, i);
        return true;
    }
}
