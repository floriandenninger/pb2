package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class ugf implements amml {
    public abstract void a(uki ukiVar, ugg uggVar);

    @Override // defpackage.amml
    public final /* synthetic */ Object apply(Object obj) {
        uki ukiVar = (uki) obj;
        ugg uggVar = new ugg();
        uggVar.c(true);
        uggVar.b(false);
        uggVar.a(false);
        uggVar.j = 1;
        uggVar.c(ukiVar.b);
        uggVar.b = ukiVar.c;
        String str = ukiVar.a;
        if (str != null) {
            uggVar.c = str;
            uggVar.d = ukiVar.d;
            uggVar.e = ukiVar.e;
            uggVar.b(ukiVar.g);
            uggVar.a(ukiVar.h);
            uggVar.h = ukiVar.f;
            uggVar.i = ukiVar.i;
            a(ukiVar, uggVar);
            Boolean bool = uggVar.a;
            if (bool == null || uggVar.c == null || uggVar.f == null || uggVar.g == null || uggVar.j == 0) {
                StringBuilder sb = new StringBuilder();
                if (uggVar.a == null) {
                    sb.append(" isMetadataAvailable");
                }
                if (uggVar.c == null) {
                    sb.append(" accountName");
                }
                if (uggVar.f == null) {
                    sb.append(" isG1User");
                }
                if (uggVar.g == null) {
                    sb.append(" isDasherUser");
                }
                if (uggVar.j == 0) {
                    sb.append(" isUnicornUser");
                }
                String valueOf = String.valueOf(sb);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                sb2.append("Missing required properties:");
                sb2.append(valueOf);
                throw new IllegalStateException(sb2.toString());
            }
            return new ugh(bool.booleanValue(), uggVar.b, uggVar.c, uggVar.d, uggVar.e, uggVar.f.booleanValue(), uggVar.g.booleanValue(), uggVar.h, uggVar.i, uggVar.j);
        }
        throw new NullPointerException("Null accountName");
    }
}
