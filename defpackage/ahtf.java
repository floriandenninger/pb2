package defpackage;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahtf implements ahto, ahyd {
    private final Vibrator a;
    private final VibrationEffect b;
    private final VibrationEffect c;
    private boolean d;

    public ahtf(Vibrator vibrator) {
        VibrationEffect vibrationEffect;
        this.a = vibrator;
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = VibrationEffect.createOneShot(10L, 96);
            vibrationEffect = VibrationEffect.createOneShot(25L, PrivateKeyType.INVALID);
        } else {
            vibrationEffect = null;
            this.b = null;
        }
        this.c = vibrationEffect;
    }

    private final void d(VibrationEffect vibrationEffect, long j) {
        if (!this.a.hasVibrator() || Build.VERSION.SDK_INT == 26) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT <= 26) {
                this.a.vibrate(j);
            } else {
                if (vibrationEffect == null) {
                    return;
                }
                this.a.vibrate(vibrationEffect);
            }
        } catch (Exception e) {
            zga.d("Failed to execute markers haptics vibrate.", e);
        }
    }

    @Override // defpackage.ahyd
    public final void a() {
        d(this.c, 25L);
    }

    @Override // defpackage.ahto
    public final /* synthetic */ void b(ahyo ahyoVar) {
    }

    @Override // defpackage.ahto
    public final void nr(ahyo ahyoVar, boolean z) {
        if (ahyoVar != ahyo.TIMESTAMP_MARKER) {
            return;
        }
        this.d = z;
    }

    @Override // defpackage.ahto
    public final void nx(TimelineMarker timelineMarker, TimelineMarker timelineMarker2, ahyo ahyoVar, int i) {
        if ((ahyoVar == ahyo.CHAPTER || ahyoVar == ahyo.TIMESTAMP_MARKER) && i == 2 && timelineMarker2 != null) {
            if (ahyoVar != ahyo.TIMESTAMP_MARKER || this.d) {
                d(this.b, 10L);
            }
        }
    }
}
