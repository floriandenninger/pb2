package defpackage;

import com.google.android.youtube.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xhh implements aikb {
    public aika a;
    private final xhf b;

    public xhh(xhf xhfVar) {
        this.b = xhfVar;
    }

    @Override // defpackage.aikb
    public final int a() {
        return R.drawable.quantum_ic_skip_next_white_36;
    }

    @Override // defpackage.aikb
    public final int b() {
        return R.string.playback_control_next;
    }

    @Override // defpackage.aikb
    public final /* synthetic */ ammv c() {
        return amlr.a;
    }

    @Override // defpackage.aikb
    public final String d() {
        return "skip_ad";
    }

    @Override // defpackage.aikb
    public final /* synthetic */ Set e() {
        return ahbn.d(this);
    }

    @Override // defpackage.aikb
    public final void f() {
        this.b.d.d(-1, -1);
    }

    @Override // defpackage.aikb
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.aikb
    public final void h(aika aikaVar) {
        this.a = aikaVar;
    }

    @Override // defpackage.aikb
    public final /* synthetic */ boolean i(String str) {
        return ahbn.e(this, str);
    }

    @Override // defpackage.aikb
    public final boolean j() {
        return this.b.c == 1;
    }

    @Override // defpackage.aikb
    public final boolean k() {
        return true;
    }
}
