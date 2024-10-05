package defpackage;

import android.os.Handler;
import java.security.SecureRandom;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aipw {
    public final shf a;
    public final Executor b;
    public final Handler c;
    public final SecureRandom d;
    public final aaxn e;
    public final String f;
    public final aifk g;
    public final acpl h;
    public aipy i;
    public final ahbv j;

    public aipw(shf shfVar, Executor executor, Handler handler, SecureRandom secureRandom, aaxn aaxnVar, String str, ahbv ahbvVar, aifk aifkVar, acpl acplVar) {
        shfVar.getClass();
        this.a = shfVar;
        executor.getClass();
        this.b = executor;
        handler.getClass();
        this.c = handler;
        secureRandom.getClass();
        this.d = secureRandom;
        aaxnVar.getClass();
        this.e = aaxnVar;
        zhq.m(str);
        this.f = str;
        ahbvVar.getClass();
        this.j = ahbvVar;
        this.g = aifkVar;
        this.h = acplVar;
    }

    public static final boolean a(aryb arybVar) {
        return (arybVar == null || arybVar.c.isEmpty() || arybVar.d <= 0 || arybVar.e == 0) ? false : true;
    }

    public static final boolean b(byte[] bArr) {
        return bArr != null && bArr.length > 0;
    }
}
