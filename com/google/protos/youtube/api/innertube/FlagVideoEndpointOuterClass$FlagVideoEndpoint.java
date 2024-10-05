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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FlagVideoEndpointOuterClass$FlagVideoEndpoint extends aonm implements aooz {
    public static final FlagVideoEndpointOuterClass$FlagVideoEndpoint a;
    private static volatile aopf c;
    public static final aonk flagVideoEndpoint;
    public String b = "";
    private int d;

    static {
        FlagVideoEndpointOuterClass$FlagVideoEndpoint flagVideoEndpointOuterClass$FlagVideoEndpoint = new FlagVideoEndpointOuterClass$FlagVideoEndpoint();
        a = flagVideoEndpointOuterClass$FlagVideoEndpoint;
        aonm.registerDefaultInstance(FlagVideoEndpointOuterClass$FlagVideoEndpoint.class, flagVideoEndpointOuterClass$FlagVideoEndpoint);
        flagVideoEndpoint = aonm.newSingularGeneratedExtension(apxf.a, flagVideoEndpointOuterClass$FlagVideoEndpoint, flagVideoEndpointOuterClass$FlagVideoEndpoint, null, 74232392, aoqn.MESSAGE, FlagVideoEndpointOuterClass$FlagVideoEndpoint.class);
    }

    private FlagVideoEndpointOuterClass$FlagVideoEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new FlagVideoEndpointOuterClass$FlagVideoEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (FlagVideoEndpointOuterClass$FlagVideoEndpoint.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
