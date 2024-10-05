package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anjx {
    private static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static anjw a(String str) {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            anjw anjwVar = (anjw) it.next();
            if (anjwVar.a()) {
                return anjwVar;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
