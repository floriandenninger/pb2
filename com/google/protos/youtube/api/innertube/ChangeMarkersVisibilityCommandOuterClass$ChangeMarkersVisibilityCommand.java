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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand extends aonm implements aooz {
    public static final ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand a;
    public static final aonk changeMarkersVisibilityCommand;
    private static volatile aopf e;
    public int b;
    public boolean c;
    public aony d = aonm.emptyProtobufList();

    static {
        ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand = new ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand();
        a = changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand;
        aonm.registerDefaultInstance(ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.class, changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand);
        changeMarkersVisibilityCommand = aonm.newSingularGeneratedExtension(apxf.a, changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand, changeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand, null, 384712612, aoqn.MESSAGE, ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.class);
    }

    private ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဇ\u0000\u0002\u001a", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (ChangeMarkersVisibilityCommandOuterClass$ChangeMarkersVisibilityCommand.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
