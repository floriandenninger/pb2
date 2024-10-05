package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dqq implements dte {
    public Map a = null;
    private final Map b;

    /* JADX INFO: Access modifiers changed from: protected */
    public dqq(dqp dqpVar) {
        this.b = dqpVar.a;
    }

    @Override // defpackage.dte
    public final int a() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dte
    public dha b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dte
    public final dqn c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dte
    public final dqo d() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dte
    public final Object e(String str) {
        Map map = this.b;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // defpackage.dte
    public final void f() {
    }

    @Override // defpackage.dte
    public final void g(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dte
    public final boolean h() {
        Map map = this.b;
        if (map == null || !map.containsKey("is_full_span")) {
            return false;
        }
        return ((Boolean) this.b.get("is_full_span")).booleanValue();
    }

    @Override // defpackage.dte
    public final boolean i() {
        Map map = this.b;
        if (map == null || !map.containsKey("is_sticky")) {
            return false;
        }
        return ((Boolean) this.b.get("is_sticky")).booleanValue();
    }

    @Override // defpackage.dte
    public boolean j() {
        throw null;
    }

    @Override // defpackage.dte
    public boolean k() {
        return false;
    }

    @Override // defpackage.dte
    public void l() {
    }

    @Override // defpackage.dte
    public void m() {
    }

    @Override // defpackage.dte
    public void n() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dte
    public final void o() {
    }
}
