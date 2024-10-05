package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aacs {
    public final ScheduledExecutorService a;
    public final afsy b;
    public final aftp c;
    public final qtv d;
    public final aayb e;
    public final aayb f;
    private final acpk g;

    public aacs(ScheduledExecutorService scheduledExecutorService, acpk acpkVar, afsy afsyVar, aftp aftpVar, aayb aaybVar, aayb aaybVar2, qtv qtvVar, byte[] bArr, byte[] bArr2) {
        this.a = scheduledExecutorService;
        this.g = acpkVar;
        this.b = afsyVar;
        this.c = aftpVar;
        this.f = aaybVar;
        this.e = aaybVar2;
        this.d = qtvVar;
    }

    public static boolean a(zhy zhyVar, String str) {
        return zhyVar.d(str) != null;
    }

    public final void b(int i) {
        aone createBuilder = aray.a.createBuilder();
        createBuilder.copyOnWrite();
        aray arayVar = (aray) createBuilder.instance;
        arayVar.c = i - 1;
        arayVar.b |= 1;
        aray arayVar2 = (aray) createBuilder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).cD(arayVar2);
        this.g.a((arpp) a.build());
    }
}
