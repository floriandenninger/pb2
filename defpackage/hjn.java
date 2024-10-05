package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.edit.timeline.TextTrackView;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hjn extends hjp {
    final /* synthetic */ TextTrackView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hjn(TextTrackView textTrackView, Context context) {
        super(textTrackView, context, R.string.accessibility_left_trim_handle);
        this.a = textTrackView;
    }

    @Override // defpackage.hjp
    protected final long a() {
        TextTrackView textTrackView = this.a;
        return textTrackView.f(textTrackView.d.getX());
    }

    @Override // defpackage.hjp
    protected final void b(long j) {
        long max = Math.max(0L, j);
        this.a.h(r0.c(max));
        this.a.r(max, hjq.BEGIN, false);
    }

    @Override // defpackage.hjp
    protected final void c(long j) {
        long min = Math.min(j, this.a.g() - 100);
        this.a.h(r0.c(min));
        this.a.r(min, hjq.BEGIN, false);
        performAccessibilityAction(this.a.d, 64, null);
        this.a.d.sendAccessibilityEvent(4);
    }
}
