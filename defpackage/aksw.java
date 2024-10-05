package defpackage;

import android.content.Context;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aksw {
    public final long a;
    public final aksr b;
    public final Handler c;
    public final aksp d;
    public final Thread e = new aksv(this);

    public aksw(Context context, aktq aktqVar, aksp akspVar, aksr aksrVar) {
        this.b = aksrVar;
        this.d = akspVar;
        this.c = new Handler(context.getMainLooper());
        this.a = (aktqVar.get().i == null ? avdk.a : r2).b;
    }
}
