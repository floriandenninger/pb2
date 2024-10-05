package defpackage;

import android.os.Handler;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class akkq {
    private static final Set d = EnumSet.allOf(akkp.class);
    public final akiv a;
    public final Set b;
    public boolean c;
    private final Handler e;

    public akkq(akiv akivVar, Handler handler) {
        akivVar.getClass();
        this.a = akivVar;
        handler.getClass();
        this.e = handler;
        this.b = EnumSet.noneOf(akkp.class);
    }

    public final void a(akkp... akkpVarArr) {
        this.b.addAll(Arrays.asList(akkpVarArr));
        if (!this.c && this.b.containsAll(d)) {
            this.e.post(new akko(this));
            this.c = true;
        }
    }
}
