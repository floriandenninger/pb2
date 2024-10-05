package defpackage;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pvy {
    public static final pvy a = new pvy();
    public final Random b;
    private final qbg c;
    private final pvw d;
    private final VersionInfoParcel e;

    protected pvy() {
        qbg qbgVar = new qbg();
        pvn pvnVar = new pvn();
        pvm pvmVar = new pvm();
        new pxu();
        new pzn();
        new qau();
        new pzo();
        pvw pvwVar = new pvw(pvnVar, pvmVar);
        qbg.d();
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(0);
        Random random = new Random();
        this.c = qbgVar;
        this.d = pvwVar;
        this.e = versionInfoParcel;
        this.b = random;
    }

    public static pvw a() {
        return a.d;
    }

    public static VersionInfoParcel b() {
        return a.e;
    }

    public static void c() {
        qbg qbgVar = a.c;
    }
}
