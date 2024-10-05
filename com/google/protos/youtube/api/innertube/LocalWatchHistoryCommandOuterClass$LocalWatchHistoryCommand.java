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
public final class LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand extends aonm implements aooz {
    public static final LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand a;
    private static volatile aopf d;
    public static final aonk localWatchHistoryCommand;
    public int b;
    public String c = "";
    private int e;

    static {
        LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand = new LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand();
        a = localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand;
        aonm.registerDefaultInstance(LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.class, localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand);
        localWatchHistoryCommand = aonm.newSingularGeneratedExtension(apxf.a, localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand, localWatchHistoryCommandOuterClass$LocalWatchHistoryCommand, null, 246157926, aoqn.MESSAGE, LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.class);
    }

    private LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"e", "b", assi.l, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (LocalWatchHistoryCommandOuterClass$LocalWatchHistoryCommand.class) {
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
