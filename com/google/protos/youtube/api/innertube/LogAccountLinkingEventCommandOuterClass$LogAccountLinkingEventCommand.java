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
import defpackage.aqzz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand extends aonm implements aooz {
    public static final LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand a;
    private static volatile aopf d;
    public static final aonk logAccountLinkingEventCommand;
    public int b;
    public aqzz c;

    static {
        LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand = new LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand();
        a = logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand;
        aonm.registerDefaultInstance(LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.class, logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand);
        logAccountLinkingEventCommand = aonm.newSingularGeneratedExtension(apxf.a, logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand, logAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand, null, 316544609, aoqn.MESSAGE, LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.class);
    }

    private LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (LogAccountLinkingEventCommandOuterClass$LogAccountLinkingEventCommand.class) {
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
