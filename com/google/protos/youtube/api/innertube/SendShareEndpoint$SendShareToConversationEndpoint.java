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
import defpackage.aqfm;
import defpackage.aqyg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SendShareEndpoint$SendShareToConversationEndpoint extends aonm implements aooz {
    public static final SendShareEndpoint$SendShareToConversationEndpoint a;
    private static volatile aopf b;
    public static final aonk sendShareToConversationEndpoint;
    private int c;
    private aqfm d;
    private aqyg e;
    private byte f = 2;

    static {
        SendShareEndpoint$SendShareToConversationEndpoint sendShareEndpoint$SendShareToConversationEndpoint = new SendShareEndpoint$SendShareToConversationEndpoint();
        a = sendShareEndpoint$SendShareToConversationEndpoint;
        aonm.registerDefaultInstance(SendShareEndpoint$SendShareToConversationEndpoint.class, sendShareEndpoint$SendShareToConversationEndpoint);
        sendShareToConversationEndpoint = aonm.newSingularGeneratedExtension(apxf.a, sendShareEndpoint$SendShareToConversationEndpoint, sendShareEndpoint$SendShareToConversationEndpoint, null, 92589349, aoqn.MESSAGE, SendShareEndpoint$SendShareToConversationEndpoint.class);
    }

    private SendShareEndpoint$SendShareToConversationEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0000\u0002\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new SendShareEndpoint$SendShareToConversationEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (SendShareEndpoint$SendShareToConversationEndpoint.class) {
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
