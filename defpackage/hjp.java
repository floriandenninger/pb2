package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class hjp extends View.AccessibilityDelegate {
    private final Context a;
    final /* synthetic */ TextTrackView b;
    private final int c;

    public hjp(TextTrackView textTrackView, Context context, int i) {
        this.b = textTrackView;
        this.a = context;
        this.c = i;
    }

    protected abstract long a();

    protected abstract void b(long j);

    protected abstract void c(long j);

    protected final String d(long j) {
        return fkc.r(this.a, j, this.b.g());
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setContentDescription(this.b.getResources().getString(R.string.a11y_object_selected_at, accessibilityNodeInfo.getContentDescription(), d(a())));
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        if (view.isEnabled()) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        String string;
        if (!view.isEnabled()) {
            return false;
        }
        long g = this.b.g() / 20;
        if (i == 4096) {
            c(a() + g);
        } else if (i == 8192) {
            b(a() - g);
        } else {
            return super.performAccessibilityAction(view, i, bundle);
        }
        TextTrackView textTrackView = this.b;
        uzu uzuVar = textTrackView.f;
        Resources resources = textTrackView.getResources();
        Object[] objArr = new Object[2];
        if (this.b.c != null) {
            string = this.a.getResources().getString(this.c, this.b.c.a);
        } else {
            string = this.a.getResources().getString(this.c, "");
        }
        objArr[0] = string;
        objArr[1] = d(a());
        uzuVar.b(view, resources.getString(R.string.a11y_object_moved_to, objArr));
        return true;
    }
}
