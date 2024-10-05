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
public final class SignalServiceEndpointOuterClass$SignalServiceEndpoint extends aonm implements aooz {
    public static final SignalServiceEndpointOuterClass$SignalServiceEndpoint a;
    private static volatile aopf c;
    public static final aonk signalServiceEndpoint;
    private byte d = 2;
    public aony b = emptyProtobufList();

    static {
        SignalServiceEndpointOuterClass$SignalServiceEndpoint signalServiceEndpointOuterClass$SignalServiceEndpoint = new SignalServiceEndpointOuterClass$SignalServiceEndpoint();
        a = signalServiceEndpointOuterClass$SignalServiceEndpoint;
        aonm.registerDefaultInstance(SignalServiceEndpointOuterClass$SignalServiceEndpoint.class, signalServiceEndpointOuterClass$SignalServiceEndpoint);
        signalServiceEndpoint = aonm.newSingularGeneratedExtension(apxf.a, signalServiceEndpointOuterClass$SignalServiceEndpoint, signalServiceEndpointOuterClass$SignalServiceEndpoint, null, 124290411, aoqn.MESSAGE, SignalServiceEndpointOuterClass$SignalServiceEndpoint.class);
    }

    private SignalServiceEndpointOuterClass$SignalServiceEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.d);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0001\u0002Л", new Object[]{"b", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new SignalServiceEndpointOuterClass$SignalServiceEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (SignalServiceEndpointOuterClass$SignalServiceEndpoint.class) {
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
