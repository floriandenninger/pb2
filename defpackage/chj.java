package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class chj implements chh {
    private final clt a;
    private float b = -1.0f;

    public chj(List list) {
        this.a = (clt) list.get(0);
    }

    @Override // defpackage.chh
    public final float a() {
        return this.a.b();
    }

    @Override // defpackage.chh
    public final float b() {
        return this.a.c();
    }

    @Override // defpackage.chh
    public final clt c() {
        return this.a;
    }

    @Override // defpackage.chh
    public final boolean d(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // defpackage.chh
    public final boolean e() {
        return false;
    }

    @Override // defpackage.chh
    public final boolean f(float f) {
        return !this.a.e();
    }
}
