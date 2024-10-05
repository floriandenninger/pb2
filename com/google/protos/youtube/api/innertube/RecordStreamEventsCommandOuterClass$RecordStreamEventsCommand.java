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
public final class RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand extends aonm implements aooz {
    public static final RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand a;
    private static volatile aopf d;
    public static final aonk recordStreamEventsCommand;
    public long b;
    public int c;
    private int e;

    static {
        RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand recordStreamEventsCommandOuterClass$RecordStreamEventsCommand = new RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand();
        a = recordStreamEventsCommandOuterClass$RecordStreamEventsCommand;
        aonm.registerDefaultInstance(RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand.class, recordStreamEventsCommandOuterClass$RecordStreamEventsCommand);
        recordStreamEventsCommand = aonm.newSingularGeneratedExtension(apxf.a, recordStreamEventsCommandOuterClass$RecordStreamEventsCommand, recordStreamEventsCommandOuterClass$RecordStreamEventsCommand, null, 191776071, aoqn.MESSAGE, RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand.class);
    }

    private RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0003င\u0002", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand.class) {
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
