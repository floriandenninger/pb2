package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class sky {
    public final sjw a;
    public final ske b;

    private sky(Context context, ske skeVar) {
        Boolean bool;
        Throwable th = new Throwable();
        sjv sjvVar = new sjv(null);
        sjvVar.a();
        if (context != null) {
            sjvVar.a = context;
            sjvVar.c = ammv.j(th);
            sjvVar.a();
            Context context2 = sjvVar.a;
            if (context2 == null || (bool = sjvVar.d) == null) {
                StringBuilder sb = new StringBuilder();
                if (sjvVar.a == null) {
                    sb.append(" context");
                }
                if (sjvVar.d == null) {
                    sb.append(" googlerOverridesCheckbox");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            this.a = new sjw(context2, sjvVar.b, sjvVar.c, bool.booleanValue());
            this.b = skeVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public static sky a(Context context, skd skdVar) {
        context.getClass();
        skdVar.getClass();
        return new sky(context.getApplicationContext(), new ske(skdVar));
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + "}";
    }
}
