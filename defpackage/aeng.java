package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aeng implements aeny {
    private final ArrayList a = new ArrayList();
    private int b = 0;

    protected abstract float a(int i, List list);

    @Override // defpackage.aeny
    public final float b() {
        int size = this.a.size();
        return c(a(this.b, this.a.subList(Math.max(0, size - e(this.b)), size)));
    }

    protected abstract float c(float f);

    protected abstract float d(float f);

    protected abstract int e(int i);

    @Override // defpackage.aeny
    public final void f(float f) {
        if (this.a.size() >= 10) {
            this.a.remove(0);
        }
        this.a.add(Float.valueOf(d(f)));
        this.b++;
    }

    @Override // defpackage.aeny
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.aeny
    public final void h() {
        this.b = 0;
    }

    @Override // defpackage.aeny
    public final /* synthetic */ boolean i() {
        return false;
    }

    @Override // defpackage.aeny
    public /* synthetic */ int j() {
        throw null;
    }
}
