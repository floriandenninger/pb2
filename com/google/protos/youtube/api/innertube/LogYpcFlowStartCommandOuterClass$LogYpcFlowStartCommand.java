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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand extends aonm implements aooz {
    public static final LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand a;
    private static volatile aopf d;
    public static final aonk logYpcFlowStartCommand;
    public int b = 0;
    public Object c;

    static {
        LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand = new LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand();
        a = logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand;
        aonm.registerDefaultInstance(LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.class, logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand);
        logYpcFlowStartCommand = aonm.newSingularGeneratedExtension(apxf.a, logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand, logYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand, null, 191342865, aoqn.MESSAGE, LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.class);
    }

    private LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand() {
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
                return newMessageInfo(a, "\u0001\u0007\u0001\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001ွ\u0000\u0002ွ\u0000\u0003ွ\u0000\u0004ွ\u0000\u0005ွ\u0000\u0006ွ\u0000\bွ\u0000", new Object[]{"c", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (LogYpcFlowStartCommandOuterClass$LogYpcFlowStartCommand.class) {
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
