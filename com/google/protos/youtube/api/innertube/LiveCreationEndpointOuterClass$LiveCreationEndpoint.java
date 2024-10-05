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
public final class LiveCreationEndpointOuterClass$LiveCreationEndpoint extends aonm implements aooz {
    public static final LiveCreationEndpointOuterClass$LiveCreationEndpoint a;
    private static volatile aopf d;
    public static final aonk liveCreationEndpoint;
    public int b;
    public String c = "";

    static {
        LiveCreationEndpointOuterClass$LiveCreationEndpoint liveCreationEndpointOuterClass$LiveCreationEndpoint = new LiveCreationEndpointOuterClass$LiveCreationEndpoint();
        a = liveCreationEndpointOuterClass$LiveCreationEndpoint;
        aonm.registerDefaultInstance(LiveCreationEndpointOuterClass$LiveCreationEndpoint.class, liveCreationEndpointOuterClass$LiveCreationEndpoint);
        liveCreationEndpoint = aonm.newSingularGeneratedExtension(apxf.a, liveCreationEndpointOuterClass$LiveCreationEndpoint, liveCreationEndpointOuterClass$LiveCreationEndpoint, null, 122546829, aoqn.MESSAGE, LiveCreationEndpointOuterClass$LiveCreationEndpoint.class);
    }

    private LiveCreationEndpointOuterClass$LiveCreationEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new LiveCreationEndpointOuterClass$LiveCreationEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (LiveCreationEndpointOuterClass$LiveCreationEndpoint.class) {
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
