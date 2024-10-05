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
public final class YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand extends aonm implements aooz {
    public static final YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand a;
    private static volatile aopf f;
    public static final aonk ypcPauseSubscriptionCommand;
    public int b;
    public String c = "";
    public aomf d = aomf.b;
    public long e;

    static {
        YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand = new YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand();
        a = ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand;
        aonm.registerDefaultInstance(YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.class, ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand);
        ypcPauseSubscriptionCommand = aonm.newSingularGeneratedExtension(apxf.a, ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand, ypcPauseSubscriptionCommand$YPCPauseSubscriptionCommand, null, 191762785, aoqn.MESSAGE, YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.class);
    }

    private YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဂ\u0002", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (YpcPauseSubscriptionCommand$YPCPauseSubscriptionCommand.class) {
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
