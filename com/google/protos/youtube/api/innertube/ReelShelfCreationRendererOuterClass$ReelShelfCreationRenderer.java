package com.google.protos.youtube.api.innertube;

import defpackage.aomf;
import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.aota;
import defpackage.aott;
import defpackage.apxf;
import defpackage.aqyg;
import defpackage.arfs;
import defpackage.aulq;
import defpackage.avgg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer extends aonm implements aooz {
    public static final ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer a;
    private static volatile aopf i;
    public static final aonk reelShelfCreationRenderer;
    public int b;
    public apxf c;
    public arfs d;
    public aqyg e;
    public avgg f;
    public aott g;
    private aota j;
    private byte k = 2;
    public aomf h = aomf.b;

    static {
        ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer = new ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer();
        a = reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer;
        aonm.registerDefaultInstance(ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.class, reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer);
        reelShelfCreationRenderer = aonm.newSingularGeneratedExtension(aulq.a, reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer, reelShelfCreationRendererOuterClass$ReelShelfCreationRenderer, null, 231434348, aoqn.MESSAGE, ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.class);
    }

    private ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0004\u0005ည\u0005\u0006ᐉ\u0006\u0007ᐉ\u0003", new Object[]{"b", "c", "d", "e", "g", "h", "j", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (ReelShelfCreationRendererOuterClass$ReelShelfCreationRenderer.class) {
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
