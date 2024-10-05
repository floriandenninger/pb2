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
import defpackage.atcd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint extends aonm implements aooz {
    public static final MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint a;
    private static volatile aopf d;
    public static final aonk mdxPlaybackEndpoint;
    public int b;
    public atcd c;

    static {
        MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint = new MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint();
        a = mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint;
        aonm.registerDefaultInstance(MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.class, mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint);
        mdxPlaybackEndpoint = aonm.newSingularGeneratedExtension(apxf.a, mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint, mdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint, null, 164988379, aoqn.MESSAGE, MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.class);
    }

    private MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint() {
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
                return new MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (MdxPlaybackEndpointOuterClass$MdxPlaybackEndpoint.class) {
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
