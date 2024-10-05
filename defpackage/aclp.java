package defpackage;

import android.os.CountDownTimer;
import com.google.android.libraries.youtube.livecreation.ui.view.WaitingIndicatorView;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aclp extends CountDownTimer {
    final /* synthetic */ WaitingIndicatorView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aclp(WaitingIndicatorView waitingIndicatorView, long j) {
        super(j, 1000L);
        this.a = waitingIndicatorView;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.a.b.setVisibility(8);
        aclq aclqVar = this.a.c;
        if (aclqVar != null) {
            aclqVar.aK();
        }
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        this.a.b.setText(String.format("%d", Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j))));
    }
}
