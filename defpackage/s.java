package defpackage;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public final class s {

    @Deprecated
    public final Set a;

    @Deprecated
    public final boolean b;

    @Deprecated
    public final int c;

    private s(int i, Set set, boolean z) {
        this.c = i;
        this.a = set;
        this.b = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s a(String str) {
        int i;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (str.startsWith("integer")) {
            i = 1;
        } else {
            if (!str.startsWith("decimal")) {
                throw new IllegalArgumentException("Samples must start with 'integer' or 'decimal'");
            }
            i = 2;
        }
        boolean z = true;
        boolean z2 = false;
        for (String str2 : x.e.split(str.substring(7).trim())) {
            if (str2.equals("…") || str2.equals("...")) {
                z = false;
                z2 = true;
            } else if (!z2) {
                String[] split = x.f.split(str2);
                int length = split.length;
                if (length == 1) {
                    q qVar = new q(split[0]);
                    b(i, qVar);
                    linkedHashSet.add(new r(qVar, qVar));
                } else if (length == 2) {
                    q qVar2 = new q(split[0]);
                    q qVar3 = new q(split[1]);
                    b(i, qVar2);
                    b(i, qVar3);
                    linkedHashSet.add(new r(qVar2, qVar3));
                } else {
                    String valueOf = String.valueOf(str2);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Ill-formed number range: ".concat(valueOf) : new String("Ill-formed number range: "));
                }
            } else {
                String valueOf2 = String.valueOf(str2);
                throw new IllegalArgumentException(valueOf2.length() != 0 ? "Can only have … at the end of samples: ".concat(valueOf2) : new String("Can only have … at the end of samples: "));
            }
        }
        return new s(i, Collections.unmodifiableSet(linkedHashSet), z);
    }

    private static void b(int i, q qVar) {
        if ((i == 1) == (qVar.b == 0)) {
            return;
        }
        String valueOf = String.valueOf(qVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Ill-formed number range: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    @Deprecated
    public final String toString() {
        StringBuilder sb = new StringBuilder("@");
        boolean z = true;
        sb.append((this.c != 1 ? "DECIMAL" : "INTEGER").toLowerCase(Locale.ENGLISH));
        for (r rVar : this.a) {
            if (!z) {
                sb.append(",");
            }
            sb.append(' ');
            sb.append(rVar);
            z = false;
        }
        if (!this.b) {
            sb.append(", …");
        }
        return sb.toString();
    }
}
