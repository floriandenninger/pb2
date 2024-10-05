package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class kgh implements axpg {
    public final /* synthetic */ axpg a;
    private final /* synthetic */ int b;

    public /* synthetic */ kgh(axpg axpgVar, int i) {
        this.b = i;
        this.a = axpgVar;
    }

    @Override // defpackage.axpg
    public final Object get() {
        int i = this.b;
        if (i == 0) {
            return (aicw) this.a.get();
        }
        if (i != 1) {
            return i != 2 ? (ce) this.a.get() : (aicw) this.a.get();
        }
        return ((Map) this.a.get()).entrySet();
    }
}
