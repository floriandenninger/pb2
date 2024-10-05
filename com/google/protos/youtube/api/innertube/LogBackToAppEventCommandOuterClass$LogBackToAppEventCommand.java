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
import defpackage.assi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand extends aonm implements aooz {
    public static final LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand a;
    private static volatile aopf c;
    public static final aonk logBackToAppEventCommand;
    public int b;
    private int d;

    static {
        LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand logBackToAppEventCommandOuterClass$LogBackToAppEventCommand = new LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand();
        a = logBackToAppEventCommandOuterClass$LogBackToAppEventCommand;
        aonm.registerDefaultInstance(LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.class, logBackToAppEventCommandOuterClass$LogBackToAppEventCommand);
        logBackToAppEventCommand = aonm.newSingularGeneratedExtension(apxf.a, logBackToAppEventCommandOuterClass$LogBackToAppEventCommand, logBackToAppEventCommandOuterClass$LogBackToAppEventCommand, null, 300210387, aoqn.MESSAGE, LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.class);
    }

    private LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"d", "b", assi.n});
            case NEW_MUTABLE_INSTANCE:
                return new LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (LogBackToAppEventCommandOuterClass$LogBackToAppEventCommand.class) {
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
