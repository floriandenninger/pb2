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
public final class PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint extends aonm implements aooz {
    public static final PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint a;
    private static volatile aopf c;
    public static final aonk prefetchSharePanelEndpoint;
    public String b = "";
    private int d;

    static {
        PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint prefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint = new PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint();
        a = prefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint;
        aonm.registerDefaultInstance(PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.class, prefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint);
        prefetchSharePanelEndpoint = aonm.newSingularGeneratedExtension(apxf.a, prefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint, prefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint, null, 116980193, aoqn.MESSAGE, PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.class);
    }

    private PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint() {
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
                return new PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (PrefetchSharePanelEndpointOuterClass$PrefetchSharePanelEndpoint.class) {
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
