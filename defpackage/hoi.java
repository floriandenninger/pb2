package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hoi extends View.AccessibilityDelegate {
    final /* synthetic */ hoj a;

    /* JADX INFO: Access modifiers changed from: protected */
    public hoi(hoj hojVar) {
        this.a = hojVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        Resources resources = this.a.a.getResources();
        hoj hojVar = this.a;
        accessibilityNodeInfo.setContentDescription(resources.getString(R.string.a11y_object_selected_at, accessibilityNodeInfo.getContentDescription(), fkc.r(hojVar.a, hojVar.y.j(), this.a.v)));
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (!view.isEnabled()) {
            return false;
        }
        hoj hojVar = this.a;
        long j = hojVar.v / 20;
        if (i == 4096) {
            hojVar.s(hojVar.y.j() + j);
        } else if (i == 8192) {
            hojVar.s(hojVar.y.j() - j);
        } else {
            return super.performAccessibilityAction(view, i, bundle);
        }
        hoj hojVar2 = this.a;
        hojVar2.l(hojVar2.t);
        return true;
    }
}
