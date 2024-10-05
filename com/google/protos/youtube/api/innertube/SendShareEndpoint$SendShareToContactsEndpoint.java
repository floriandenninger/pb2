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
import defpackage.arlg;
import defpackage.arlh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SendShareEndpoint$SendShareToContactsEndpoint extends aonm implements aooz {
    public static final SendShareEndpoint$SendShareToContactsEndpoint a;
    private static volatile aopf e;
    public static final aonk sendShareToContactsEndpoint;
    public int b;
    public arlh c;
    public arlg d;
    private aqfm f;
    private apxf g;
    private byte h = 2;

    static {
        SendShareEndpoint$SendShareToContactsEndpoint sendShareEndpoint$SendShareToContactsEndpoint = new SendShareEndpoint$SendShareToContactsEndpoint();
        a = sendShareEndpoint$SendShareToContactsEndpoint;
        aonm.registerDefaultInstance(SendShareEndpoint$SendShareToContactsEndpoint.class, sendShareEndpoint$SendShareToContactsEndpoint);
        sendShareToContactsEndpoint = aonm.newSingularGeneratedExtension(apxf.a, sendShareEndpoint$SendShareToContactsEndpoint, sendShareEndpoint$SendShareToContactsEndpoint, null, 92775415, aoqn.MESSAGE, SendShareEndpoint$SendShareToContactsEndpoint.class);
    }

    private SendShareEndpoint$SendShareToContactsEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003", new Object[]{"b", "c", "d", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new SendShareEndpoint$SendShareToContactsEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (SendShareEndpoint$SendShareToContactsEndpoint.class) {
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
