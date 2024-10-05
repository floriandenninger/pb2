package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ackm implements ajoq {
    private final Context a;
    private final ajjz b;
    private final ajut c;
    private final abrx d;
    private final aahd e;
    private final Executor f;
    private final acko g;

    public ackm(Context context, ajjz ajjzVar, ajut ajutVar, abrx abrxVar, aahd aahdVar, Executor executor, acko ackoVar) {
        this.a = context;
        this.b = ajjzVar;
        this.c = ajutVar;
        this.d = abrxVar;
        this.e = aahdVar;
        this.f = executor;
        this.g = ackoVar;
    }

    @Override // defpackage.ajoq
    public final /* bridge */ /* synthetic */ ajom b(ViewGroup viewGroup) {
        return new ackn(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
    }
}
