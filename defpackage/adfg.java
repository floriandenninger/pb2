package defpackage;

import com.google.android.youtube.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adfg implements aikb {
    private final aikk a;
    private final azrw b;
    private final /* synthetic */ int c;

    public adfg(aikk aikkVar, azrw azrwVar, int i) {
        this.c = i;
        this.a = aikkVar;
        this.b = azrwVar;
    }

    private final boolean l() {
        return ((adlt) this.b.get()).o();
    }

    private final boolean m() {
        return ((xhf) this.b.get()).c == 1;
    }

    @Override // defpackage.aikb
    public final /* synthetic */ ammv c() {
        return this.c != 0 ? amlr.a : amlr.a;
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
    public final Set e() {
        return this.c != 0 ? this.a.e() : this.a.e();
    }

    @Override // defpackage.aikb
    public final /* synthetic */ boolean i(String str) {
        return this.c != 0 ? ahbn.e(this, str) : ahbn.e(this, str);
    }

    @Override // defpackage.aikb
    public final boolean j() {
        if (this.c != 0) {
            return !m();
        }
        l();
        return true;
    }

    @Override // defpackage.aikb
    public final boolean k() {
        return this.c != 0 ? !m() : !l();
    }

    @Override // defpackage.aikb
    public final int a() {
        if (this.c == 0) {
            return l() ? R.drawable.ic_notifications_pause_disabled : this.a.a();
        }
        if (m()) {
            return 0;
        }
        return this.a.a();
    }

    @Override // defpackage.aikb
    public final int b() {
        if (this.c == 0) {
            return l() ? R.string.playback_control_play_pause : this.a.b();
        }
        if (m()) {
            return 0;
        }
        return this.a.b();
    }

    @Override // defpackage.aikb
    public final String d() {
        return this.c != 0 ? m() ? "noop" : this.a.d() : l() ? "noop" : this.a.d();
    }
}
