package defpackage;

import com.google.android.youtube.R;
import j$.time.Duration;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class evn implements aikb {
    private static final Duration b = Duration.ofSeconds(10);
    public Duration a = b;
    private final aivo c;

    public evn(aivo aivoVar) {
        this.c = aivoVar;
    }

    @Override // defpackage.aikb
    public final int a() {
        return this.a.getSeconds() == 10 ? R.drawable.quantum_ic_replay_10_white_24 : this.a.getSeconds() == 30 ? R.drawable.quantum_ic_replay_30_white_24 : R.drawable.quantum_ic_fast_rewind_white_36;
    }

    @Override // defpackage.aikb
    public final int b() {
        return R.string.accessibility_rewind;
    }

    @Override // defpackage.aikb
    public final ammv c() {
        return ammv.j(acrb.BACKGROUND_PLAYBACK_NOTIFICATION_SEEK_BACK_BUTTON);
    }

    @Override // defpackage.aikb
    public final String d() {
        return "SEEK_BACK_NOTIFICATION_ACTION_PLUGIN";
    }

    @Override // defpackage.aikb
    public final /* synthetic */ Set e() {
        return ahbn.d(this);
    }

    @Override // defpackage.aikb
    public final void f() {
        this.c.g(-this.a.toMillis());
    }

    @Override // defpackage.aikb
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.aikb
    public final /* synthetic */ void h(aika aikaVar) {
    }

    @Override // defpackage.aikb
    public final /* synthetic */ boolean i(String str) {
        return ahbn.e(this, str);
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
