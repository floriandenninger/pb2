package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apl {
    public final aom a;
    private final Handler b = new Handler();
    private apk c;

    public apl(aok aokVar) {
        this.a = new aom(aokVar);
    }

    public final void a(aod aodVar) {
        apk apkVar = this.c;
        if (apkVar != null) {
            apkVar.run();
        }
        apk apkVar2 = new apk(this.a, aodVar);
        this.c = apkVar2;
        this.b.postAtFrontOfQueue(apkVar2);
    }
}
