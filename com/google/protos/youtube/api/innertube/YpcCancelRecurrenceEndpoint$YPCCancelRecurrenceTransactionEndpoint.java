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
import defpackage.awhh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint extends aonm implements aooz {
    public static final YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint a;
    private static volatile aopf f;
    public static final aonk ypcCancelRecurrenceEndpoint;
    public awhh d;
    private int g;
    public String b = "";
    public String c = "";
    public aomf e = aomf.b;

    static {
        YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint = new YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint();
        a = ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint;
        aonm.registerDefaultInstance(YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.class, ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint);
        ypcCancelRecurrenceEndpoint = aonm.newSingularGeneratedExtension(apxf.a, ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint, ypcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint, null, 88642421, aoqn.MESSAGE, YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.class);
    }

    private YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0002\u0003ည\u0003\u0004ဈ\u0001", new Object[]{"g", "b", "d", "e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (YpcCancelRecurrenceEndpoint$YPCCancelRecurrenceTransactionEndpoint.class) {
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
