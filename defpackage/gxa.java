package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gxa {
    public final akhk a;
    public final atua b = atua.ANDROID_CAMERA;

    public gxa(akhk akhkVar) {
        this.a = akhkVar;
    }

    public final boolean a() {
        aone createBuilder = atub.a.createBuilder();
        atua atuaVar = this.b;
        createBuilder.copyOnWrite();
        atub atubVar = (atub) createBuilder.instance;
        atubVar.c = atuaVar.m;
        atubVar.b |= 1;
        return Build.VERSION.SDK_INT < 23 || this.a.c((atub) createBuilder.build());
    }
}
