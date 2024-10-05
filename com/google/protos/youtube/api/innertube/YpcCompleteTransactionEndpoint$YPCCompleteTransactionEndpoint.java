package com.google.protos.youtube.api.innertube;

import defpackage.aomf;
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
public final class YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint extends aonm implements aooz {
    public static final YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint a;
    private static volatile aopf d;
    public static final aonk ypcCompleteTransactionEndpoint;
    public aomf c;
    private int e;
    private byte f = 2;
    public String b = "";

    static {
        YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint = new YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint();
        a = ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint;
        aonm.registerDefaultInstance(YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.class, ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint);
        ypcCompleteTransactionEndpoint = aonm.newSingularGeneratedExtension(apxf.a, ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint, ypcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint, null, 137730199, aoqn.MESSAGE, YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.class);
    }

    private YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint() {
        emptyProtobufList();
        this.c = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ည\u0002", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (YpcCompleteTransactionEndpoint$YPCCompleteTransactionEndpoint.class) {
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
