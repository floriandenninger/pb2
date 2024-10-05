package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.trim.ShortsVideoTrimView2;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class hrl extends View.AccessibilityDelegate {
    final /* synthetic */ ShortsVideoTrimView2 c;

    public hrl(ShortsVideoTrimView2 shortsVideoTrimView2) {
        this.c = shortsVideoTrimView2;
    }

    protected abstract long a();

    protected abstract String b(long j);

    protected abstract String c();

    protected abstract void d(long j);

    protected abstract void e(long j);

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setContentDescription(this.c.getResources().getString(R.string.a11y_object_selected_at, accessibilityNodeInfo.getContentDescription(), b(TimeUnit.MICROSECONDS.toMillis(a()))));
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
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
        long g = this.c.g() / 20;
        if (i == 4096) {
            e(a() + g);
        } else if (i == 8192) {
            d(a() - g);
        } else {
            return super.performAccessibilityAction(view, i, bundle);
        }
        this.c.z();
        ShortsVideoTrimView2 shortsVideoTrimView2 = this.c;
        shortsVideoTrimView2.e.b(view, shortsVideoTrimView2.getResources().getString(R.string.a11y_object_moved_to, c(), b(TimeUnit.MICROSECONDS.toMillis(a()))));
        return true;
    }
}
