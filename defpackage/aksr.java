package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aksr {
    public final Context a;
    public final shf b;
    public final aksq c;
    public final acpl d;
    public final int e;
    public final boolean f;
    public apfe g;
    private final aksp h;

    public aksr(Context context, shf shfVar, aksq aksqVar, acpl acplVar, aksp akspVar, aktq aktqVar) {
        this.a = context;
        this.b = shfVar;
        this.c = aksqVar;
        this.d = acplVar;
        this.h = akspVar;
        avdk avdkVar = aktqVar.get().i;
        avdkVar = avdkVar == null ? avdk.a : avdkVar;
        this.e = avdkVar.c;
        this.f = avdkVar.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.g = null;
        aksq aksqVar = this.c;
        if (aksqVar.a.delete() || !aksqVar.a.exists()) {
            return;
        }
        afsi.b(2, 27, "Unable to delete journal file");
    }

    public final void b(aone aoneVar, long j) {
        int i = ((apfe) aoneVar.instance).d;
        aoneVar.copyOnWrite();
        apfe apfeVar = (apfe) aoneVar.instance;
        apfeVar.b |= 2;
        apfeVar.d = (int) (i + j);
        if (this.h.c()) {
            int i2 = akso.a;
            int i3 = ((apfe) aoneVar.instance).g;
            aoneVar.copyOnWrite();
            apfe apfeVar2 = (apfe) aoneVar.instance;
            apfeVar2.b |= 16;
            apfeVar2.g = (int) (i3 + j);
        }
        if (this.h.b()) {
            int i4 = akso.a;
            int i5 = ((apfe) aoneVar.instance).h;
            aoneVar.copyOnWrite();
            apfe apfeVar3 = (apfe) aoneVar.instance;
            apfeVar3.b |= 32;
            apfeVar3.h = (int) (i5 + j);
        }
    }
}
