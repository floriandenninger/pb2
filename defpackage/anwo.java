package defpackage;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anwo {
    public final antc a;
    public final anwp b;
    public final qms c;
    public final anwy d;
    public final anwy e;
    public final anxe f;

    public anwo(antc antcVar, anwp anwpVar, qms qmsVar, anwy anwyVar, anwy anwyVar2, anxe anxeVar) {
        this.a = antcVar;
        this.b = anwpVar;
        this.c = qmsVar;
        this.d = anwyVar;
        this.e = anwyVar2;
        this.f = anxeVar;
    }

    public final String a() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.a.g().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }
}
