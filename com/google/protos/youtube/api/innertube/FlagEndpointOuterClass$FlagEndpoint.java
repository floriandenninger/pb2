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
import defpackage.aquw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FlagEndpointOuterClass$FlagEndpoint extends aonm implements aooz {
    public static final FlagEndpointOuterClass$FlagEndpoint a;
    private static volatile aopf d;
    public static final aonk flagEndpoint;
    public String b = "";
    public int c;
    private int e;

    static {
        FlagEndpointOuterClass$FlagEndpoint flagEndpointOuterClass$FlagEndpoint = new FlagEndpointOuterClass$FlagEndpoint();
        a = flagEndpointOuterClass$FlagEndpoint;
        aonm.registerDefaultInstance(FlagEndpointOuterClass$FlagEndpoint.class, flagEndpointOuterClass$FlagEndpoint);
        flagEndpoint = aonm.newSingularGeneratedExtension(apxf.a, flagEndpointOuterClass$FlagEndpoint, flagEndpointOuterClass$FlagEndpoint, null, 76638993, aoqn.MESSAGE, FlagEndpointOuterClass$FlagEndpoint.class);
    }

    private FlagEndpointOuterClass$FlagEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဌ\u0002", new Object[]{"e", "b", "c", aquw.i});
            case NEW_MUTABLE_INSTANCE:
                return new FlagEndpointOuterClass$FlagEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (FlagEndpointOuterClass$FlagEndpoint.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
