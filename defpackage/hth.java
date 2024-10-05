package defpackage;

import android.os.CountDownTimer;
import android.widget.ProgressBar;
import com.google.android.youtube.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hth extends CountDownTimer {
    final /* synthetic */ htl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hth(htl htlVar, long j) {
        super(j, 10L);
        this.a = htlVar;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.a.aK();
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        htl htlVar = this.a;
        double d = j;
        double d2 = htlVar.a;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = 1.0d - (1.0d - (d / d2));
        int integer = htlVar.qX().getInteger(R.integer.reel_camera_time_progress_bar_max);
        ProgressBar progressBar = this.a.ap;
        double d4 = 1.0d - (d3 * d3);
        double d5 = integer;
        Double.isNaN(d5);
        progressBar.setProgress((int) (d4 * d5));
    }
}
