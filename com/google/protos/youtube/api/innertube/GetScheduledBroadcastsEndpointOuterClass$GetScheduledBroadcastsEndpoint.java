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
public final class GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint extends aonm implements aooz {
    public static final GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint a;
    private static volatile aopf b;
    public static final aonk getScheduledBroadcastsEndpoint;
    private byte c = 2;

    static {
        GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint getScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint = new GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint();
        a = getScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint;
        aonm.registerDefaultInstance(GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.class, getScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint);
        getScheduledBroadcastsEndpoint = aonm.newSingularGeneratedExtension(apxf.a, getScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint, getScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint, null, 147074744, aoqn.MESSAGE, GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.class);
    }

    private GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.c);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (GetScheduledBroadcastsEndpointOuterClass$GetScheduledBroadcastsEndpoint.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
