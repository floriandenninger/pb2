package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rxp extends rxk {
    public rxp(Context context) {
        super(context, rzc.b());
        l(new rzf());
        this.b = new rxs(1);
        this.c = new rxq(0);
    }

    @Override // defpackage.rxk
    protected final ryv a() {
        rzb rzbVar = ((rzf) this.a).a;
        Object obj = null;
        if (rzbVar.a() <= 0) {
            return null;
        }
        Object obj2 = rzbVar.b.isEmpty() ? null : rzbVar.b.get(0);
        if (!rzbVar.b.isEmpty()) {
            obj = rzbVar.b.get(r0.size() - 1);
        }
        return new ryv(obj2, obj);
    }
}
