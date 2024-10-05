package com.google.android.libraries.youtube.net.retries;

import defpackage.amkq;
import defpackage.amnv;
import defpackage.ylv;
import defpackage.yly;
import youtube.client.blocks.runtime.java.JavaRuntime;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class NetworkRetryControllerProdContainerRegistrar {
    public final amnv a;

    public NetworkRetryControllerProdContainerRegistrar(final ylv ylvVar, final ylv ylvVar2, final yly ylyVar, byte[] bArr) {
        final byte[] bArr2 = null;
        this.a = amkq.x(new amnv(ylvVar2, ylyVar, bArr2) { // from class: afwf
            public final /* synthetic */ ylv a;
            public final /* synthetic */ yly b;

            @Override // defpackage.amnv
            public final Object get() {
                final ylv ylvVar3 = ylv.this;
                final ylv ylvVar4 = this.a;
                final yly ylyVar2 = this.b;
                final byte[] bArr3 = null;
                JavaRuntime.a.b(385812507, new bary(bArr3) { // from class: ylt
                    @Override // defpackage.bary
                    public final barx a() {
                        anev anevVar = (anev) ylv.this.a.a.get();
                        anevVar.getClass();
                        return new basc(new basb(anevVar));
                    }
                });
                JavaRuntime.a.b(382814680, new bary() { // from class: ylu
                    @Override // defpackage.bary
                    public final barx a() {
                        axpg axpgVar = ((axqv) ylv.this.a.a).get();
                        axpgVar.getClass();
                        return new base(new basd(axpgVar));
                    }
                });
                JavaRuntime.a.b(366354626, new bary() { // from class: ylx
                    @Override // defpackage.bary
                    public final barx a() {
                        advq advqVar = yly.this.a;
                        anic anicVar = (anic) advqVar.b.get();
                        anicVar.getClass();
                        shf shfVar = (shf) advqVar.a.get();
                        shfVar.getClass();
                        return new basg(new basf(anicVar, shfVar));
                    }
                });
                return null;
            }
        });
    }

    private static native void registerNative();

    private static native void unregisterNative();
}
