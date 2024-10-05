package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajcn {
    public Context a;
    public aqyg b;
    public ajck c;

    public ajcn() {
    }

    public ajcn(ajco ajcoVar) {
        this.a = ajcoVar.a;
        this.b = ajcoVar.b;
        this.c = ajcoVar.c;
    }

    public final ajco a() {
        return new ajco(this.a, this.b, this.c);
    }
}
