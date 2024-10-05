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
public final class AutoconnectEndpointOuterClass$AutoconnectEndpoint extends aonm implements aooz {
    public static final AutoconnectEndpointOuterClass$AutoconnectEndpoint a;
    public static final aonk autoconnectEndpoint;
    private static volatile aopf d;
    public int b;
    public String c = "";

    static {
        AutoconnectEndpointOuterClass$AutoconnectEndpoint autoconnectEndpointOuterClass$AutoconnectEndpoint = new AutoconnectEndpointOuterClass$AutoconnectEndpoint();
        a = autoconnectEndpointOuterClass$AutoconnectEndpoint;
        aonm.registerDefaultInstance(AutoconnectEndpointOuterClass$AutoconnectEndpoint.class, autoconnectEndpointOuterClass$AutoconnectEndpoint);
        autoconnectEndpoint = aonm.newSingularGeneratedExtension(apxf.a, autoconnectEndpointOuterClass$AutoconnectEndpoint, autoconnectEndpointOuterClass$AutoconnectEndpoint, null, 354181190, aoqn.MESSAGE, AutoconnectEndpointOuterClass$AutoconnectEndpoint.class);
    }

    private AutoconnectEndpointOuterClass$AutoconnectEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new AutoconnectEndpointOuterClass$AutoconnectEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (AutoconnectEndpointOuterClass$AutoconnectEndpoint.class) {
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
