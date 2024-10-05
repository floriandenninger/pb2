package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azxh extends CancellationException implements azwg {
    public final azxg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azxh(String str, Throwable th, azxg azxgVar) {
        super(str);
        str.getClass();
        azxgVar.getClass();
        this.a = azxgVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.azwg
    public final /* bridge */ /* synthetic */ Throwable a() {
        if (!azwq.a) {
            return null;
        }
        String message = getMessage();
        message.getClass();
        return new azxh(message, this, this.a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof azxh) {
            azxh azxhVar = (azxh) obj;
            return azul.c(azxhVar.getMessage(), getMessage()) && azul.c(azxhVar.a, this.a) && azul.c(azxhVar.getCause(), getCause());
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (azwq.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = ((message.hashCode() * 31) + this.a.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
