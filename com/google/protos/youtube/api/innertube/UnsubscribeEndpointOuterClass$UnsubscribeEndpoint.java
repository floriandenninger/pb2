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
import defpackage.avrv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UnsubscribeEndpointOuterClass$UnsubscribeEndpoint extends aonm implements aooz {
    public static final UnsubscribeEndpointOuterClass$UnsubscribeEndpoint a;
    private static volatile aopf f;
    public static final aonk unsubscribeEndpoint;
    public int b;
    private avrv g;
    private byte h = 2;
    public aony c = aonm.emptyProtobufList();
    public String d = "";
    public String e = "";

    static {
        UnsubscribeEndpointOuterClass$UnsubscribeEndpoint unsubscribeEndpointOuterClass$UnsubscribeEndpoint = new UnsubscribeEndpointOuterClass$UnsubscribeEndpoint();
        a = unsubscribeEndpointOuterClass$UnsubscribeEndpoint;
        aonm.registerDefaultInstance(UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.class, unsubscribeEndpointOuterClass$UnsubscribeEndpoint);
        unsubscribeEndpoint = aonm.newSingularGeneratedExtension(apxf.a, unsubscribeEndpointOuterClass$UnsubscribeEndpoint, unsubscribeEndpointOuterClass$UnsubscribeEndpoint, null, 68997401, aoqn.MESSAGE, UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.class);
    }

    private UnsubscribeEndpointOuterClass$UnsubscribeEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001\u001a\u0002ဈ\u0000\u0004ဈ\u0001\u0005ᐉ\u0002", new Object[]{"b", "c", "d", "e", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new UnsubscribeEndpointOuterClass$UnsubscribeEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (UnsubscribeEndpointOuterClass$UnsubscribeEndpoint.class) {
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
