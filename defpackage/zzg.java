package defpackage;

import com.google.android.libraries.youtube.edit.ui.SegmentedControl;
import com.google.android.libraries.youtube.edit.ui.SegmentedControlSegment;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class zzg implements Runnable {
    public final /* synthetic */ SegmentedControl a;
    public final /* synthetic */ SegmentedControlSegment b;
    private final /* synthetic */ int c;

    public /* synthetic */ zzg(SegmentedControl segmentedControl, SegmentedControlSegment segmentedControlSegment, int i) {
        this.c = i;
        this.a = segmentedControl;
        this.b = segmentedControlSegment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c == 0) {
            this.a.e(this.b, true, true);
            return;
        }
        SegmentedControl segmentedControl = this.a;
        SegmentedControlSegment segmentedControlSegment = this.b;
        if (segmentedControl.d == -1) {
            segmentedControl.e(segmentedControlSegment, false, false);
        }
    }
}
