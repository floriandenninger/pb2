package defpackage;

import android.os.CountDownTimer;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.camera.CountdownNumeralView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class hfe extends CountDownTimer {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ hfh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hfe(hfh hfhVar, long j, long j2, int i, int i2) {
        super(j, j2);
        this.c = hfhVar;
        this.a = i;
        this.b = i2;
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        hfh hfhVar = this.c;
        hfhVar.m = null;
        hfhVar.g.a();
        this.c.e.setVisibility(4);
        heg hegVar = this.c.r;
        int i = this.a;
        int i2 = this.b;
        hegVar.a.az.setVisibility(0);
        hel helVar = hegVar.a;
        helVar.aF = i2;
        helVar.aS(i, true);
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        CountdownNumeralView countdownNumeralView = this.c.g;
        int i = -1;
        if (countdownNumeralView.b) {
            int i2 = countdownNumeralView.a;
            if (i2 <= 0) {
                countdownNumeralView.a();
            } else {
                StringBuilder sb = new StringBuilder(11);
                sb.append(i2);
                countdownNumeralView.setText(sb.toString());
                i = countdownNumeralView.a;
                countdownNumeralView.a = i - 1;
            }
        }
        hfh hfhVar = this.c;
        if (i <= 0) {
            return;
        }
        hfhVar.l.play(i > 1 ? hfhVar.j : hfhVar.k, 1.0f, 1.0f, 0, 0, 1.0f);
    }
}
