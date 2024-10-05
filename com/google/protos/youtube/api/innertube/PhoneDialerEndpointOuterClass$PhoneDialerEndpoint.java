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
public final class PhoneDialerEndpointOuterClass$PhoneDialerEndpoint extends aonm implements aooz {
    public static final PhoneDialerEndpointOuterClass$PhoneDialerEndpoint a;
    private static volatile aopf c;
    public static final aonk phoneDialerEndpoint;
    private int d;
    private apxf e;
    private byte f = 2;
    public String b = "";

    static {
        PhoneDialerEndpointOuterClass$PhoneDialerEndpoint phoneDialerEndpointOuterClass$PhoneDialerEndpoint = new PhoneDialerEndpointOuterClass$PhoneDialerEndpoint();
        a = phoneDialerEndpointOuterClass$PhoneDialerEndpoint;
        aonm.registerDefaultInstance(PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.class, phoneDialerEndpointOuterClass$PhoneDialerEndpoint);
        phoneDialerEndpoint = aonm.newSingularGeneratedExtension(apxf.a, phoneDialerEndpointOuterClass$PhoneDialerEndpoint, phoneDialerEndpointOuterClass$PhoneDialerEndpoint, null, 100946440, aoqn.MESSAGE, PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.class);
    }

    private PhoneDialerEndpointOuterClass$PhoneDialerEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"d", "b", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new PhoneDialerEndpointOuterClass$PhoneDialerEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (PhoneDialerEndpointOuterClass$PhoneDialerEndpoint.class) {
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
