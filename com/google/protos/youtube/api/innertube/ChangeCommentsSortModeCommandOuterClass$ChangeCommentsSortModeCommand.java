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
import defpackage.argn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand extends aonm implements aooz {
    public static final ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand a;
    public static final aonk changeCommentsSortModeCommand;
    private static volatile aopf d;
    public int b;
    public int c;

    static {
        ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand = new ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand();
        a = changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand;
        aonm.registerDefaultInstance(ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand.class, changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand);
        changeCommentsSortModeCommand = aonm.newSingularGeneratedExtension(apxf.a, changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand, changeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand, null, 348085446, aoqn.MESSAGE, ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand.class);
    }

    private ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c", argn.u});
            case NEW_MUTABLE_INSTANCE:
                return new ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ChangeCommentsSortModeCommandOuterClass$ChangeCommentsSortModeCommand.class) {
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
