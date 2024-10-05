package defpackage;

import com.google.android.youtube.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aikm implements aikb {
    private final aivq a;
    private final aivo b;
    private final /* synthetic */ int c;

    public aikm(aivq aivqVar, aivo aivoVar, int i) {
        this.c = i;
        this.a = aivqVar;
        this.b = aivoVar;
    }

    @Override // defpackage.aikb
    public final int a() {
        return this.c != 0 ? this.a.d ? R.drawable.quantum_ic_skip_next_white_36 : R.drawable.ic_notifications_menu_next_video_disabled : this.a.c ? R.drawable.quantum_ic_skip_previous_white_36 : R.drawable.ic_notifications_menu_previous_video_disabled;
    }

    @Override // defpackage.aikb
    public final int b() {
        return this.c != 0 ? R.string.playback_control_next : R.string.playback_control_previous;
    }

    @Override // defpackage.aikb
    public final /* synthetic */ ammv c() {
        return this.c != 0 ? amlr.a : amlr.a;
    }

    @Override // defpackage.aikb
    public final String d() {
        return this.c != 0 ? this.a.d ? "com.google.android.libraries.youtube.player.action.controller_notification_next" : "noop" : this.a.c ? "com.google.android.libraries.youtube.player.action.controller_notification_prev" : "noop";
    }

    @Override // defpackage.aikb
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.aikb
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.aikb
    public final /* synthetic */ void h(aika aikaVar) {
    }

    @Override // defpackage.aikb
    public final boolean j() {
        return true;
    }

    @Override // defpackage.aikb
    public final boolean k() {
        return true;
    }

    @Override // defpackage.aikb
    public final Set e() {
        return this.c != 0 ? amsx.r("com.google.android.libraries.youtube.player.action.controller_notification_next") : amsx.r("com.google.android.libraries.youtube.player.action.controller_notification_prev");
    }

    @Override // defpackage.aikb
    public final boolean i(String str) {
        if (this.c != 0) {
            if (!"com.google.android.libraries.youtube.player.action.controller_notification_next".equals(str)) {
                return false;
            }
            this.b.k();
            return true;
        }
        if (!"com.google.android.libraries.youtube.player.action.controller_notification_prev".equals(str)) {
            return false;
        }
        this.b.l();
        return true;
    }
}
