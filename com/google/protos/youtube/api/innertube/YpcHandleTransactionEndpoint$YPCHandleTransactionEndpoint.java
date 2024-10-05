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
import defpackage.avhw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint extends aonm implements aooz {
    public static final YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint a;
    private static volatile aopf i;
    public static final aonk ypcHandleTransactionEndpoint;
    public int b;
    public int f;
    public boolean g;
    public String c = "";
    public String d = "";
    public aomf e = aomf.b;
    public aony h = aonm.emptyProtobufList();

    static {
        YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint = new YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint();
        a = ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint;
        aonm.registerDefaultInstance(YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.class, ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint);
        ypcHandleTransactionEndpoint = aonm.newSingularGeneratedExtension(apxf.a, ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint, ypcHandleTransactionEndpoint$YPCHandleTransactionEndpoint, null, 165047913, aoqn.MESSAGE, YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.class);
    }

    private YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ဌ\u0003\u0006\u001a\u0007ဇ\u0005", new Object[]{"b", "c", "d", "e", "f", avhw.c, "h", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (YpcHandleTransactionEndpoint$YPCHandleTransactionEndpoint.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
