package defpackage;

import android.app.PendingIntent;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnu implements View.OnClickListener {
    final /* synthetic */ bof a;
    private final /* synthetic */ int b;

    public bnu(bof bofVar, int i) {
        this.b = i;
        this.a = bofVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        PendingIntent sessionActivity;
        PlaybackStateCompat playbackStateCompat;
        int i = this.b;
        if (i == 0) {
            hd hdVar = this.a.C;
            if (hdVar == null || (sessionActivity = ((hb) hdVar.a).a.getSessionActivity()) == null) {
                return;
            }
            try {
                sessionActivity.send();
                this.a.dismiss();
                return;
            } catch (PendingIntent.CanceledException unused) {
                Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                return;
            }
        }
        if (i == 1) {
            this.a.dismiss();
            return;
        }
        int i2 = 0;
        if (i == 2) {
            bof bofVar = this.a;
            boolean z = !bofVar.O;
            bofVar.O = z;
            if (z) {
                bofVar.o.setVisibility(0);
            }
            this.a.m();
            this.a.r(true);
            return;
        }
        int id = view.getId();
        if (id == 16908313 || id == 16908314) {
            if (this.a.d.m()) {
                bpw.o(id == 16908313 ? 2 : 1);
            }
            this.a.dismiss();
            return;
        }
        if (id != R.id.mr_control_playback_ctrl) {
            if (id == R.id.mr_close) {
                this.a.dismiss();
                return;
            }
            return;
        }
        bof bofVar2 = this.a;
        if (bofVar2.C == null || (playbackStateCompat = bofVar2.E) == null) {
            return;
        }
        int i3 = playbackStateCompat.a;
        if (i3 != 3 || !bofVar2.w()) {
            if (i3 != 3 || !this.a.y()) {
                if (i3 != 3 && this.a.x()) {
                    this.a.C.b().a.play();
                    i2 = R.string.mr_controller_play;
                }
            } else {
                this.a.C.b().a.stop();
                i2 = R.string.mr_controller_stop;
            }
        } else {
            this.a.C.b().a.pause();
            i2 = R.string.mr_controller_pause;
        }
        AccessibilityManager accessibilityManager = this.a.V;
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || i2 == 0) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
        obtain.setPackageName(this.a.e.getPackageName());
        obtain.setClassName(getClass().getName());
        obtain.getText().add(this.a.e.getString(i2));
        this.a.V.sendAccessibilityEvent(obtain);
    }
}
