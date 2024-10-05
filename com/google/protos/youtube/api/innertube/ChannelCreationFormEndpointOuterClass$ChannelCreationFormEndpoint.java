package com.google.protos.youtube.api.innertube;

import defpackage.aomf;
import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apld;
import defpackage.apxf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint extends aonm implements aooz {
    public static final ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint a;
    public static final aonk channelCreationFormEndpoint;
    private static volatile aopf e;
    public int b;
    public aomf c = aomf.b;
    public int d;

    static {
        ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint = new ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint();
        a = channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint;
        aonm.registerDefaultInstance(ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.class, channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint);
        channelCreationFormEndpoint = aonm.newSingularGeneratedExtension(apxf.a, channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint, channelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint, null, 77125633, aoqn.MESSAGE, ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.class);
    }

    private ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ည\u0000\u0003ဌ\u0001", new Object[]{"b", "c", "d", apld.s});
            case NEW_MUTABLE_INSTANCE:
                return new ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (ChannelCreationFormEndpointOuterClass$ChannelCreationFormEndpoint.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
