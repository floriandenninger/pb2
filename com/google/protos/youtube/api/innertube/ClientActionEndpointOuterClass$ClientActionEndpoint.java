package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.aptq;
import defpackage.apxf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClientActionEndpointOuterClass$ClientActionEndpoint extends aonm implements aooz {
    public static final ClientActionEndpointOuterClass$ClientActionEndpoint a;
    public static final aonk clientActionEndpoint;
    private static volatile aopf d;
    public int b;
    public aptq c;

    static {
        ClientActionEndpointOuterClass$ClientActionEndpoint clientActionEndpointOuterClass$ClientActionEndpoint = new ClientActionEndpointOuterClass$ClientActionEndpoint();
        a = clientActionEndpointOuterClass$ClientActionEndpoint;
        aonm.registerDefaultInstance(ClientActionEndpointOuterClass$ClientActionEndpoint.class, clientActionEndpointOuterClass$ClientActionEndpoint);
        clientActionEndpoint = aonm.newSingularGeneratedExtension(apxf.a, clientActionEndpointOuterClass$ClientActionEndpoint, clientActionEndpointOuterClass$ClientActionEndpoint, null, 114390071, aoqn.MESSAGE, ClientActionEndpointOuterClass$ClientActionEndpoint.class);
    }

    private ClientActionEndpointOuterClass$ClientActionEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ClientActionEndpointOuterClass$ClientActionEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ClientActionEndpointOuterClass$ClientActionEndpoint.class) {
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
