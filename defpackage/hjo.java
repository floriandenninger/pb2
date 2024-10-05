package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hjo extends hjp {
    final /* synthetic */ TextTrackView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjo(TextTrackView textTrackView, Context context) {
        super(textTrackView, context, R.string.accessibility_right_trim_handle);
        this.a = textTrackView;
    }

    @Override // defpackage.hjp
    protected final long a() {
        TextTrackView textTrackView = this.a;
        return textTrackView.f(textTrackView.e.getX() - this.a.g);
    }

    @Override // defpackage.hjp
    protected final void b(long j) {
        long max = Math.max(100L, j);
        this.a.i(r0.c(max));
        this.a.r(max, hjq.END, false);
    }

    @Override // defpackage.hjp
    protected final void c(long j) {
        long min = Math.min(j, this.a.g());
        this.a.i(r0.c(min));
        this.a.r(min, hjq.END, false);
        performAccessibilityAction(this.a.e, 64, null);
        this.a.e.sendAccessibilityEvent(4);
    }
}
