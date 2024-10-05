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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint extends aonm implements aooz {
    public static final LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint a;
    private static volatile aopf c;
    public static final aonk liveChatPurchaseMessageEndpoint;
    public aomf b = aomf.b;
    private int d;

    static {
        LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint liveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint = new LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint();
        a = liveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint;
        aonm.registerDefaultInstance(LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.class, liveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint);
        liveChatPurchaseMessageEndpoint = aonm.newSingularGeneratedExtension(apxf.a, liveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint, liveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint, null, 133030216, aoqn.MESSAGE, LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.class);
    }

    private LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (LiveChatPurchaseMessageEndpointOuterClass$LiveChatPurchaseMessageEndpoint.class) {
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
