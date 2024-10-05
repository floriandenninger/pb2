package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer extends aonm implements aooz {
    public static final MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer a;
    public static final aonk companionStateRenderer;
    private static volatile aopf f;
    public int b;
    public aulq d;
    public boolean e;
    private apxf g;
    private byte h = 2;
    public String c = "";

    static {
        MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer multiStateCompanionAdRendererOuterClass$CompanionStateRenderer = new MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer();
        a = multiStateCompanionAdRendererOuterClass$CompanionStateRenderer;
        aonm.registerDefaultInstance(MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.class, multiStateCompanionAdRendererOuterClass$CompanionStateRenderer);
        companionStateRenderer = aonm.newSingularGeneratedExtension(aulq.a, multiStateCompanionAdRendererOuterClass$CompanionStateRenderer, multiStateCompanionAdRendererOuterClass$CompanionStateRenderer, null, 166494362, aoqn.MESSAGE, MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.class);
    }

    private MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ဇ\u0003", new Object[]{"b", "c", "d", "g", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (MultiStateCompanionAdRendererOuterClass$CompanionStateRenderer.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
