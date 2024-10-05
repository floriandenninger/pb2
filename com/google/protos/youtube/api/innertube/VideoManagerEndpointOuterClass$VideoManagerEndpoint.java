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
public final class VideoManagerEndpointOuterClass$VideoManagerEndpoint extends aonm implements aooz {
    public static final VideoManagerEndpointOuterClass$VideoManagerEndpoint a;
    private static volatile aopf b;
    public static final aonk videoManagerEndpoint;

    static {
        VideoManagerEndpointOuterClass$VideoManagerEndpoint videoManagerEndpointOuterClass$VideoManagerEndpoint = new VideoManagerEndpointOuterClass$VideoManagerEndpoint();
        a = videoManagerEndpointOuterClass$VideoManagerEndpoint;
        aonm.registerDefaultInstance(VideoManagerEndpointOuterClass$VideoManagerEndpoint.class, videoManagerEndpointOuterClass$VideoManagerEndpoint);
        videoManagerEndpoint = aonm.newSingularGeneratedExtension(apxf.a, videoManagerEndpointOuterClass$VideoManagerEndpoint, videoManagerEndpointOuterClass$VideoManagerEndpoint, null, 80252293, aoqn.MESSAGE, VideoManagerEndpointOuterClass$VideoManagerEndpoint.class);
    }

    private VideoManagerEndpointOuterClass$VideoManagerEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new VideoManagerEndpointOuterClass$VideoManagerEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (VideoManagerEndpointOuterClass$VideoManagerEndpoint.class) {
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
