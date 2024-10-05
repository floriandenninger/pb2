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
public final class GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand extends aonm implements aooz {
    public static final GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand a;
    private static volatile aopf c;
    public static final aonk getPdgBuyFlowCommand;
    public aomf b = aomf.b;
    private int d;

    static {
        GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand getPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand = new GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand();
        a = getPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand;
        aonm.registerDefaultInstance(GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.class, getPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand);
        getPdgBuyFlowCommand = aonm.newSingularGeneratedExtension(apxf.a, getPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand, getPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand, null, 257016449, aoqn.MESSAGE, GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.class);
    }

    private GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ည\u0001", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (GetPdgBuyFlowCommandOuterClass$GetPdgBuyFlowCommand.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
