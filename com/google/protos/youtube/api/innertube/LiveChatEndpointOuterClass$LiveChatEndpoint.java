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
import defpackage.apxf;
import defpackage.asrc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LiveChatEndpointOuterClass$LiveChatEndpoint extends aonm implements aooz {
    public static final LiveChatEndpointOuterClass$LiveChatEndpoint a;
    private static volatile aopf e;
    public static final aonk liveChatEndpoint;
    public int b;
    public asrc d;
    private byte f = 2;
    public aomf c = aomf.b;

    static {
        LiveChatEndpointOuterClass$LiveChatEndpoint liveChatEndpointOuterClass$LiveChatEndpoint = new LiveChatEndpointOuterClass$LiveChatEndpoint();
        a = liveChatEndpointOuterClass$LiveChatEndpoint;
        aonm.registerDefaultInstance(LiveChatEndpointOuterClass$LiveChatEndpoint.class, liveChatEndpointOuterClass$LiveChatEndpoint);
        liveChatEndpoint = aonm.newSingularGeneratedExtension(apxf.a, liveChatEndpointOuterClass$LiveChatEndpoint, liveChatEndpointOuterClass$LiveChatEndpoint, null, 132716540, aoqn.MESSAGE, LiveChatEndpointOuterClass$LiveChatEndpoint.class);
    }

    private LiveChatEndpointOuterClass$LiveChatEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ည\u0000\u0002ᐉ\u0001", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new LiveChatEndpointOuterClass$LiveChatEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (LiveChatEndpointOuterClass$LiveChatEndpoint.class) {
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
