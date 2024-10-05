package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeon implements aeof {
    public final aknq a;
    public final ysl b;
    public final ScheduledExecutorService c;
    public final afsy d;
    public final acpl e;

    public aeon(aknq aknqVar, ysl yslVar, ScheduledExecutorService scheduledExecutorService, afsy afsyVar, acpl acplVar) {
        this.a = aknqVar;
        this.b = yslVar;
        this.c = scheduledExecutorService;
        this.d = afsyVar;
        this.e = acplVar;
    }

    public static akne b(String str, afsy afsyVar) {
        if (afsyVar.t()) {
            return akne.a(afsyVar.c().d(), "medialib_", str);
        }
        return akne.b("medialib_", str);
    }

    public static void c(String str, acpl acplVar) {
        aone createBuilder = avey.a.createBuilder();
        createBuilder.copyOnWrite();
        avey aveyVar = (avey) createBuilder.instance;
        aveyVar.d = 1;
        aveyVar.b |= 2;
        createBuilder.copyOnWrite();
        avey aveyVar2 = (avey) createBuilder.instance;
        aveyVar2.c = 1;
        aveyVar2.b = 1 | aveyVar2.b;
        createBuilder.copyOnWrite();
        avey aveyVar3 = (avey) createBuilder.instance;
        str.getClass();
        aveyVar3.b |= 4;
        aveyVar3.e = str;
        avey aveyVar4 = (avey) createBuilder.build();
        arpn a = arpp.a();
        a.copyOnWrite();
        ((arpp) a.instance).dL(aveyVar4);
        acplVar.c((arpp) a.build());
    }

    @Override // defpackage.aeof
    public final void a(String str, azrh azrhVar) {
        anaf.Y(this.a.a(b(str, this.d), aeoi.a), new aeoj(this, azrhVar, str), this.c);
    }
}
