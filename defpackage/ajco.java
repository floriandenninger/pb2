package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajco {
    public final Context a;
    public final aqyg b;
    public final ajck c;

    public ajco(Context context, aqyg aqygVar, ajck ajckVar) {
        this.a = context;
        this.b = aqygVar;
        this.c = ajckVar;
    }

    public static ajcn a() {
        return new ajcn();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajco) {
            ajco ajcoVar = (ajco) obj;
            Context context = this.a;
            if (context != null ? context.equals(ajcoVar.a) : ajcoVar.a == null) {
                aqyg aqygVar = this.b;
                if (aqygVar != null ? aqygVar.equals(ajcoVar.b) : ajcoVar.b == null) {
                    ajck ajckVar = this.c;
                    ajck ajckVar2 = ajcoVar.c;
                    if (ajckVar != null ? ajckVar.equals(ajckVar2) : ajckVar2 == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 73 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("FormattedStringDecorator{context=");
        sb.append(valueOf);
        sb.append(", formattedString=");
        sb.append(valueOf2);
        sb.append(", commandSpanFactory=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        Context context = this.a;
        int hashCode = ((context == null ? 0 : context.hashCode()) ^ 1000003) * 1000003;
        aqyg aqygVar = this.b;
        int hashCode2 = (hashCode ^ (aqygVar == null ? 0 : aqygVar.hashCode())) * 1000003;
        ajck ajckVar = this.c;
        return hashCode2 ^ (ajckVar != null ? ajckVar.hashCode() : 0);
    }
}
