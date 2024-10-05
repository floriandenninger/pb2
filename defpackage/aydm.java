package defpackage;

import io.grpc.Status;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aydm extends axzm {
    public static final Logger a = Logger.getLogger(aydm.class.getName());
    private static final aydk f;
    private static final Class g;
    public final boolean b;
    public final amkz c;
    public aycd d;
    public Map e;

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:2|3)|(2:5|6)|7|8|9|10|11|12|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        defpackage.aydm.a.logp(java.util.logging.Level.FINE, "io.grpc.auth.GoogleAuthLibraryCallCredentials", "loadGoogleCredentialsClass", "Failed to load GoogleCredentials", (java.lang.Throwable) r0);
     */
    static {
        /*
            java.lang.Class<aydm> r0 = defpackage.aydm.class
            java.lang.String r1 = r0.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            defpackage.aydm.a = r1
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 0
            java.lang.String r2 = "com.google.auth.oauth2.ServiceAccountCredentials"
            r3 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r3, r0)     // Catch: java.lang.ClassNotFoundException -> L2f
            aydk r3 = new aydk     // Catch: java.lang.NoSuchMethodException -> L1e java.lang.ClassNotFoundException -> L20
            r3.<init>(r2, r0)     // Catch: java.lang.NoSuchMethodException -> L1e java.lang.ClassNotFoundException -> L20
            goto L30
        L1e:
            r0 = move-exception
            goto L21
        L20:
            r0 = move-exception
        L21:
            r7 = r0
            java.util.logging.Logger r2 = defpackage.aydm.a
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.String r4 = "io.grpc.auth.GoogleAuthLibraryCallCredentials"
            java.lang.String r5 = "createJwtHelperOrNull"
            java.lang.String r6 = "Failed to create JWT helper. This is unexpected"
            r2.logp(r3, r4, r5, r6, r7)
        L2f:
            r3 = r1
        L30:
            defpackage.aydm.f = r3
            java.lang.String r0 = "amlc"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L3f
            java.lang.Class<amkz> r1 = defpackage.amkz.class
            java.lang.Class r1 = r0.asSubclass(r1)
            goto L4e
        L3f:
            r0 = move-exception
            r7 = r0
            java.util.logging.Logger r2 = defpackage.aydm.a
            java.util.logging.Level r3 = java.util.logging.Level.FINE
            java.lang.String r4 = "io.grpc.auth.GoogleAuthLibraryCallCredentials"
            java.lang.String r5 = "loadGoogleCredentialsClass"
            java.lang.String r6 = "Failed to load GoogleCredentials"
            r2.logp(r3, r4, r5, r6, r7)
        L4e:
            defpackage.aydm.g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aydm.<clinit>():void");
    }

    public aydm(amkz amkzVar) {
        amkz amkzVar2;
        aydk aydkVar = f;
        Class cls = g;
        boolean isInstance = cls != null ? cls.isInstance(amkzVar) : false;
        if (aydkVar != null && aydkVar.a.isInstance(amkzVar)) {
            try {
                amkzVar2 = (amkz) aydkVar.a.cast(amkzVar);
            } catch (IllegalAccessException e) {
                e = e;
            } catch (InvocationTargetException e2) {
                e = e2;
            }
            try {
                if (((Collection) aydkVar.d.invoke(amkzVar2, new Object[0])).size() != 0) {
                    amkzVar = amkzVar2;
                } else {
                    Object invoke = aydkVar.b.invoke(null, new Object[0]);
                    for (aydl aydlVar : aydkVar.e) {
                        aydlVar.b.invoke(invoke, aydlVar.a.invoke(amkzVar2, new Object[0]));
                    }
                    amkzVar = (amkz) aydkVar.c.invoke(invoke, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException e3) {
                e = e3;
                amkzVar = amkzVar2;
                a.logp(Level.WARNING, "io.grpc.auth.GoogleAuthLibraryCallCredentials$JwtHelper", "tryServiceAccountToJwt", "Failed converting service account credential to JWT. This is unexpected", e);
                this.b = isInstance;
                this.c = amkzVar;
            }
        }
        this.b = isInstance;
        this.c = amkzVar;
    }

    public static URI w(String str, aych aychVar) {
        String valueOf = String.valueOf(aychVar.c);
        try {
            URI uri = new URI("https", str, valueOf.length() != 0 ? "/".concat(valueOf) : new String("/"), null, null);
            return uri.getPort() == 443 ? x(uri) : uri;
        } catch (URISyntaxException e) {
            throw Status.i.withDescription("Unable to construct service URI for auth").c(e).asException();
        }
    }

    private static URI x(URI uri) {
        try {
            return new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), -1, uri.getPath(), uri.getQuery(), uri.getFragment());
        } catch (URISyntaxException e) {
            throw Status.i.withDescription("Unable to construct service URI after removing port").c(e).asException();
        }
    }
}
