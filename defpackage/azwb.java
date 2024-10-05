package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azwb {
    public final Object a;
    public final aztu b;
    public final Object c;
    public final Throwable d;
    public final azvr e;

    public azwb(Object obj, azvr azvrVar, Throwable th) {
        this.a = obj;
        this.e = azvrVar;
        this.b = null;
        this.c = null;
        this.d = th;
    }

    public /* synthetic */ azwb(Object obj, azvr azvrVar, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : azvrVar, (i & 16) != 0 ? null : th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azwb)) {
            return false;
        }
        azwb azwbVar = (azwb) obj;
        if (!azul.c(this.a, azwbVar.a) || !azul.c(this.e, azwbVar.e)) {
            return false;
        }
        aztu aztuVar = azwbVar.b;
        if (!azul.c(null, null)) {
            return false;
        }
        Object obj2 = azwbVar.c;
        return azul.c(null, null) && azul.c(this.d, azwbVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        azvr azvrVar = this.e;
        int hashCode2 = (hashCode + (azvrVar == null ? 0 : azvrVar.hashCode())) * 29791;
        Throwable th = this.d;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.e + ", onCancellation=" + ((Object) null) + ", idempotentResume=" + ((Object) null) + ", cancelCause=" + this.d + ')';
    }
}
