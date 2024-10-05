package com.google.protos.youtube.api.innertube;

import defpackage.aomf;
import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aony;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.aota;
import defpackage.aqyg;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FingerprintAuthRendererOuterClass$FingerprintAuthRenderer extends aonm implements aooz {
    public static final FingerprintAuthRendererOuterClass$FingerprintAuthRenderer a;
    public static final aonk fingerprintAuthRenderer;
    private static volatile aopf i;
    public int b;
    public aqyg c;
    public int e;
    public boolean f;
    public aqyg h;
    private aota j;
    private byte k = 2;
    public aony d = emptyProtobufList();
    public aomf g = aomf.b;

    static {
        FingerprintAuthRendererOuterClass$FingerprintAuthRenderer fingerprintAuthRendererOuterClass$FingerprintAuthRenderer = new FingerprintAuthRendererOuterClass$FingerprintAuthRenderer();
        a = fingerprintAuthRendererOuterClass$FingerprintAuthRenderer;
        aonm.registerDefaultInstance(FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.class, fingerprintAuthRendererOuterClass$FingerprintAuthRenderer);
        fingerprintAuthRenderer = aonm.newSingularGeneratedExtension(aulq.a, fingerprintAuthRendererOuterClass$FingerprintAuthRenderer, fingerprintAuthRendererOuterClass$FingerprintAuthRenderer, null, 196186429, aoqn.MESSAGE, FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.class);
    }

    private FingerprintAuthRendererOuterClass$FingerprintAuthRenderer() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0004\u0001ᐉ\u0000\u0002Л\u0003င\u0001\u0004ဇ\u0002\u0005ᐉ\u0003\u0006ည\u0004\u0007ᐉ\u0005", new Object[]{"b", "c", "d", aqyg.class, "e", "f", "j", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new FingerprintAuthRendererOuterClass$FingerprintAuthRenderer();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (FingerprintAuthRendererOuterClass$FingerprintAuthRenderer.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
