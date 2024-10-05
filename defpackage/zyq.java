package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import com.google.android.libraries.youtube.edit.ui.DurationMsSeekBar;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zyq extends View.AccessibilityDelegate {
    final /* synthetic */ DurationMsSeekBar a;

    public zyq(DurationMsSeekBar durationMsSeekBar) {
        this.a = durationMsSeekBar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        String string;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SeekBar.class.getName());
        Resources resources = this.a.getResources();
        Object[] objArr = new Object[1];
        DurationMsSeekBar durationMsSeekBar = this.a;
        int progress = durationMsSeekBar.getProgress();
        int round = Math.round(progress / 100.0f);
        if (durationMsSeekBar.k(progress)) {
            int i = round / 10;
            string = durationMsSeekBar.getResources().getQuantityString(R.plurals.shorts_a11y_duration_seconds, i, Integer.valueOf(i));
        } else {
            string = durationMsSeekBar.getResources().getString(R.string.shorts_a11y_duration_seconds_to_nearest_tenth, Float.valueOf(round / 10.0f));
        }
        objArr[0] = string;
        accessibilityNodeInfo.setContentDescription(resources.getString(R.string.shorts_a11y_duration_ms_seek_bar_stop_recording_at, objArr));
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
        if (i == 4096) {
            DurationMsSeekBar durationMsSeekBar = this.a;
            durationMsSeekBar.setProgress(durationMsSeekBar.getProgress() + 100);
            return true;
        }
        if (i == 8192) {
            this.a.setProgress(r2.getProgress() - 100);
            return true;
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
