package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azyc extends azyd {
    private volatile azyc _immediate;
    private final Handler b;
    private final String d;
    private final boolean e;
    private final azyc f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public azyc(Handler handler, String str) {
        this(handler, str, false);
        handler.getClass();
    }

    @Override // defpackage.azwj
    public final boolean d(azsv azsvVar) {
        azsvVar.getClass();
        return (this.e && azul.c(Looper.myLooper(), this.b.getLooper())) ? false : true;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof azyc) && ((azyc) obj).b == this.b;
    }

    @Override // defpackage.azxq
    public final /* synthetic */ azxq f() {
        return this.f;
    }

    public final int hashCode() {
        return System.identityHashCode(this.b);
    }

    @Override // defpackage.azwj
    public final void so(azsv azsvVar, Runnable runnable) {
        azsvVar.getClass();
        if (this.b.post(runnable)) {
            return;
        }
        azuj.f(azsvVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        azwv.b.so(azsvVar, runnable);
    }

    @Override // defpackage.azxq, defpackage.azwj
    public final String toString() {
        String e = e();
        if (e != null) {
            return e;
        }
        String str = this.d;
        if (str == null) {
            str = this.b.toString();
        }
        return this.e ? azul.a(str, ".immediate") : str;
    }

    private azyc(Handler handler, String str, boolean z) {
        this.b = handler;
        this.d = str;
        this.e = z;
        this._immediate = true != z ? null : this;
        azyc azycVar = this._immediate;
        if (azycVar == null) {
            azycVar = new azyc(handler, str, true);
            this._immediate = azycVar;
        }
        this.f = azycVar;
    }
}
