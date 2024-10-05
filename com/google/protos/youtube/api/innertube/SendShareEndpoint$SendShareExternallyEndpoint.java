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
import defpackage.arle;
import defpackage.arlf;
import defpackage.arlh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SendShareEndpoint$SendShareExternallyEndpoint extends aonm implements aooz {
    public static final SendShareEndpoint$SendShareExternallyEndpoint a;
    private static volatile aopf f;
    public static final aonk sendShareExternallyEndpoint;
    public int b;
    public arlh c;
    public arlf d;
    public arle e;
    private byte g = 2;

    static {
        SendShareEndpoint$SendShareExternallyEndpoint sendShareEndpoint$SendShareExternallyEndpoint = new SendShareEndpoint$SendShareExternallyEndpoint();
        a = sendShareEndpoint$SendShareExternallyEndpoint;
        aonm.registerDefaultInstance(SendShareEndpoint$SendShareExternallyEndpoint.class, sendShareEndpoint$SendShareExternallyEndpoint);
        sendShareExternallyEndpoint = aonm.newSingularGeneratedExtension(apxf.a, sendShareEndpoint$SendShareExternallyEndpoint, sendShareEndpoint$SendShareExternallyEndpoint, null, 92310068, aoqn.MESSAGE, SendShareEndpoint$SendShareExternallyEndpoint.class);
    }

    private SendShareEndpoint$SendShareExternallyEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0004ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new SendShareEndpoint$SendShareExternallyEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (SendShareEndpoint$SendShareExternallyEndpoint.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
