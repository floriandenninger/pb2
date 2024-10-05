package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alxo {
    public final Intent a;

    public alxo() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static alxo a(Intent intent) {
        return new alxo(intent);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alxo) {
            return this.a.equals(((alxo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
        sb.append("SelectorContext{intent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public alxo(Intent intent) {
        if (intent == null) {
            throw new NullPointerException("Null intent");
        }
        this.a = intent;
    }
}
