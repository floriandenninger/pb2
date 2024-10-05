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
import defpackage.aquw;
import defpackage.aqwx;
import defpackage.aqxl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand extends aonm implements aooz {
    public static final LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand a;
    private static volatile aopf i;
    public static final aonk logFlowLoggingEventCommand;
    public int b;
    public int c;
    public int d;
    public int e;
    public aqwx f;
    public String g = "";
    public long h;

    static {
        LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand = new LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand();
        a = logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand;
        aonm.registerDefaultInstance(LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.class, logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand);
        logFlowLoggingEventCommand = aonm.newSingularGeneratedExtension(apxf.a, logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand, logFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand, null, 346644970, aoqn.MESSAGE, LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.class);
    }

    private LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဂ\u0005", new Object[]{"b", "c", "d", aquw.l, "e", aqxl.a(), "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (LogFlowLoggingEventCommandOuterClass$LogFlowLoggingEventCommand.class) {
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
