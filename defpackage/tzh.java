package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tzh {
    public final Context a;
    private final twn b;
    private final shf c;
    private final uak d;
    private final uaj e;
    private final ubo f;
    private final tyu g;

    public tzh(Context context, twn twnVar, shf shfVar, uak uakVar, uaj uajVar, ubo uboVar, tyu tyuVar) {
        this.a = context;
        this.b = twnVar;
        this.c = shfVar;
        this.d = uakVar;
        this.e = uajVar;
        this.f = uboVar;
        this.g = tyuVar;
        tyo.j(context);
    }

    public final tzf a(aoic aoicVar) {
        return new tzj(this, this.c, aoicVar, 0, null, this.b, this.d, this.e, this.f, this.g);
    }

    public final tzf b(aohx aohxVar) {
        return new tzj(this, this.c, null, 0, aohxVar, this.b, this.d, this.e, this.f, this.g);
    }

    public final tzf c(int i) {
        return new tzj(this, this.c, null, i, null, this.b, this.d, this.e, this.f, this.g);
    }
}
