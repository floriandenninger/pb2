package defpackage;

import java.net.ProxySelector;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jgc implements amnv {
    private final /* synthetic */ int a;

    public jgc(int i) {
        this.a = i;
    }

    @Override // defpackage.amnv
    public final /* synthetic */ Object get() {
        int i = this.a;
        if (i == 0) {
            return new jga();
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                return i != 4 ? ProxySelector.getDefault() : amnp.c();
            }
            return new ajpe();
        }
        cuq b = cuv.b();
        b.b(1);
        b.a = "chromium-serializer";
        return b.a();
    }
}
