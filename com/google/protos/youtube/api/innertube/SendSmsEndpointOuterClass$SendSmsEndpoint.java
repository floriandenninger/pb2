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
public final class SendSmsEndpointOuterClass$SendSmsEndpoint extends aonm implements aooz {
    public static final SendSmsEndpointOuterClass$SendSmsEndpoint a;
    private static volatile aopf e;
    public static final aonk sendSmsEndpoint;
    public aony b = aonm.emptyProtobufList();
    public String c = "";
    public String d = "";
    private int f;

    static {
        SendSmsEndpointOuterClass$SendSmsEndpoint sendSmsEndpointOuterClass$SendSmsEndpoint = new SendSmsEndpointOuterClass$SendSmsEndpoint();
        a = sendSmsEndpointOuterClass$SendSmsEndpoint;
        aonm.registerDefaultInstance(SendSmsEndpointOuterClass$SendSmsEndpoint.class, sendSmsEndpointOuterClass$SendSmsEndpoint);
        sendSmsEndpoint = aonm.newSingularGeneratedExtension(apxf.a, sendSmsEndpointOuterClass$SendSmsEndpoint, sendSmsEndpointOuterClass$SendSmsEndpoint, null, 75581109, aoqn.MESSAGE, SendSmsEndpointOuterClass$SendSmsEndpoint.class);
    }

    private SendSmsEndpointOuterClass$SendSmsEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000\u0003ဈ\u0001", new Object[]{"f", "b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new SendSmsEndpointOuterClass$SendSmsEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (SendSmsEndpointOuterClass$SendSmsEndpoint.class) {
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
