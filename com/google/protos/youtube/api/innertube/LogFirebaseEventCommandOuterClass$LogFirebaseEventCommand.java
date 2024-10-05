package com.google.protos.youtube.api.innertube;

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
import defpackage.askp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand extends aonm implements aooz {
    public static final LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand a;
    private static volatile aopf d;
    public static final aonk logFirebaseEventCommand;
    private int e;
    private byte f = 2;
    public String b = "";
    public aony c = emptyProtobufList();

    static {
        LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand logFirebaseEventCommandOuterClass$LogFirebaseEventCommand = new LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand();
        a = logFirebaseEventCommandOuterClass$LogFirebaseEventCommand;
        aonm.registerDefaultInstance(LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.class, logFirebaseEventCommandOuterClass$LogFirebaseEventCommand);
        logFirebaseEventCommand = aonm.newSingularGeneratedExtension(apxf.a, logFirebaseEventCommandOuterClass$LogFirebaseEventCommand, logFirebaseEventCommandOuterClass$LogFirebaseEventCommand, null, 245093374, aoqn.MESSAGE, LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.class);
    }

    private LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"e", "b", "c", askp.class});
            case NEW_MUTABLE_INSTANCE:
                return new LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (LogFirebaseEventCommandOuterClass$LogFirebaseEventCommand.class) {
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
