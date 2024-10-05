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
public final class YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand extends aonm implements aooz {
    public static final YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand a;
    private static volatile aopf d;
    public static final aonk ypcResumeSubscriptionCommand;
    public String b = "";
    public aomf c = aomf.b;
    private int e;

    static {
        YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand = new YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand();
        a = ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand;
        aonm.registerDefaultInstance(YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.class, ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand);
        ypcResumeSubscriptionCommand = aonm.newSingularGeneratedExtension(apxf.a, ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand, ypcResumeSubscriptionCommand$YPCResumeSubscriptionCommand, null, 191943580, aoqn.MESSAGE, YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.class);
    }

    private YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (YpcResumeSubscriptionCommand$YPCResumeSubscriptionCommand.class) {
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
