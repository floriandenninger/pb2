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
import defpackage.armv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint extends aonm implements aooz {
    public static final PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint a;
    private static volatile aopf g;
    public static final aonk phoneVerificationEndpoint;
    public int b;
    public int c;
    public apxf d;
    public apxf e;
    public apxf f;
    private apxf h;
    private byte i = 2;

    static {
        PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint = new PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint();
        a = phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint;
        aonm.registerDefaultInstance(PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.class, phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint);
        phoneVerificationEndpoint = aonm.newSingularGeneratedExtension(apxf.a, phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint, phoneVerificationEndpointOuterClass$PhoneVerificationEndpoint, null, 155595733, aoqn.MESSAGE, PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.class);
    }

    private PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0006\u0005\u0000\u0000\u0004\u0002ᐉ\u0001\u0003ဌ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"b", "h", "c", armv.p, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (PhoneVerificationEndpointOuterClass$PhoneVerificationEndpoint.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
