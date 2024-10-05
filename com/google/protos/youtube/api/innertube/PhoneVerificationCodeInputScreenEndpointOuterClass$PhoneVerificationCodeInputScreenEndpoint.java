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
import defpackage.atun;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint extends aonm implements aooz {
    public static final PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint a;
    private static volatile aopf d;
    public static final aonk phoneVerificationCodeInputScreenEndpoint;
    public int b;
    public atun c;
    private byte e = 2;

    static {
        PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint phoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint = new PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint();
        a = phoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint;
        aonm.registerDefaultInstance(PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.class, phoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint);
        phoneVerificationCodeInputScreenEndpoint = aonm.newSingularGeneratedExtension(apxf.a, phoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint, phoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint, null, 132445607, aoqn.MESSAGE, PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.class);
    }

    private PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (PhoneVerificationCodeInputScreenEndpointOuterClass$PhoneVerificationCodeInputScreenEndpoint.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
