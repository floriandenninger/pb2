package com.google.protos.youtube.api.innertube;

import defpackage.aomf;
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
public final class SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint extends aonm implements aooz {
    public static final SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint a;
    private static volatile aopf e;
    public static final aonk sendLiveChatMessageEndpoint;
    private int f;
    private byte g = 2;
    public aomf b = aomf.b;
    public aony c = emptyProtobufList();
    public String d = "";

    static {
        SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint = new SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint();
        a = sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint;
        aonm.registerDefaultInstance(SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.class, sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint);
        sendLiveChatMessageEndpoint = aonm.newSingularGeneratedExtension(apxf.a, sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint, sendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint, null, 120929770, aoqn.MESSAGE, SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.class);
    }

    private SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001ည\u0000\u0002Л\u0003ဈ\u0001", new Object[]{"f", "b", "c", apxf.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.class) {
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
