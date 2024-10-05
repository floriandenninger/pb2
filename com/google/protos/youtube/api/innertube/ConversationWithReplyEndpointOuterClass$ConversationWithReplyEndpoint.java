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
import defpackage.aqgg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint extends aonm implements aooz {
    public static final ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint a;
    private static volatile aopf b;
    public static final aonk conversationWithReplyEndpoint;
    private int c;
    private aqgg d;
    private byte e = 2;

    static {
        ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint = new ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint();
        a = conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint;
        aonm.registerDefaultInstance(ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.class, conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint);
        conversationWithReplyEndpoint = aonm.newSingularGeneratedExtension(apxf.a, conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint, conversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint, null, 96329534, aoqn.MESSAGE, ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.class);
    }

    private ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0002", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (ConversationWithReplyEndpointOuterClass$ConversationWithReplyEndpoint.class) {
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
