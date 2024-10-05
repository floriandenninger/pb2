package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aony;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint extends aonm implements aooz {
    public static final ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint a;
    private static volatile aopf c;
    public static final aonk clearWatchHistoryEndpoint;
    private byte d = 2;
    public aony b = emptyProtobufList();

    static {
        ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint clearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint = new ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint();
        a = clearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint;
        aonm.registerDefaultInstance(ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint.class, clearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint);
        clearWatchHistoryEndpoint = aonm.newSingularGeneratedExtension(apxf.a, clearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint, clearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint, null, 63121550, aoqn.MESSAGE, ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint.class);
    }

    private ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.d);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"b", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (ClearWatchHistoryEndpointOuterClass$ClearWatchHistoryEndpoint.class) {
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
