package defpackage;

import com.google.android.youtube.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aikc implements aikb {
    private final aivo a;

    public aikc(aivo aivoVar) {
        this.a = aivoVar;
    }

    @Override // defpackage.aikb
    public final int a() {
        return R.drawable.quantum_ic_clear_white_24;
    }

    @Override // defpackage.aikb
    public final int b() {
        return R.string.playback_control_stop;
    }

    @Override // defpackage.aikb
    public final /* synthetic */ ammv c() {
        return amlr.a;
    }

    @Override // defpackage.aikb
    public final String d() {
        return "com.google.android.libraries.youtube.player.action.controller_notification_close";
    }

    @Override // defpackage.aikb
    public final /* synthetic */ Set e() {
        return ahbn.d(this);
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
    public final boolean i(String str) {
        if (!"com.google.android.libraries.youtube.player.action.controller_notification_close".equals(str)) {
            return false;
        }
        this.a.b();
        return true;
    }

    @Override // defpackage.aikb
    public final boolean j() {
        return true;
    }

    @Override // defpackage.aikb
    public final boolean k() {
        return true;
    }
}
