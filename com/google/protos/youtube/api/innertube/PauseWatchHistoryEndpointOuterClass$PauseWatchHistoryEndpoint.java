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
public final class PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint extends aonm implements aooz {
    public static final PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint a;
    private static volatile aopf b;
    public static final aonk pauseWatchHistoryEndpoint;
    private byte c = 2;

    static {
        PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint pauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint = new PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint();
        a = pauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint;
        aonm.registerDefaultInstance(PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.class, pauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint);
        pauseWatchHistoryEndpoint = aonm.newSingularGeneratedExtension(apxf.a, pauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint, pauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint, null, 63121553, aoqn.MESSAGE, PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.class);
    }

    private PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint() {
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
                return new PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (PauseWatchHistoryEndpointOuterClass$PauseWatchHistoryEndpoint.class) {
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
