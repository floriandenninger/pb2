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
public final class EnterVrModeCommandOuterClass$EnterVrModeCommand extends aonm implements aooz {
    public static final EnterVrModeCommandOuterClass$EnterVrModeCommand a;
    private static volatile aopf b;
    public static final aonk enterVrModeCommand;

    static {
        EnterVrModeCommandOuterClass$EnterVrModeCommand enterVrModeCommandOuterClass$EnterVrModeCommand = new EnterVrModeCommandOuterClass$EnterVrModeCommand();
        a = enterVrModeCommandOuterClass$EnterVrModeCommand;
        aonm.registerDefaultInstance(EnterVrModeCommandOuterClass$EnterVrModeCommand.class, enterVrModeCommandOuterClass$EnterVrModeCommand);
        enterVrModeCommand = aonm.newSingularGeneratedExtension(apxf.a, enterVrModeCommandOuterClass$EnterVrModeCommand, enterVrModeCommandOuterClass$EnterVrModeCommand, null, 245319097, aoqn.MESSAGE, EnterVrModeCommandOuterClass$EnterVrModeCommand.class);
    }

    private EnterVrModeCommandOuterClass$EnterVrModeCommand() {
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
                return newMessageInfo(a, "\u0001\u0000", null);
            case NEW_MUTABLE_INSTANCE:
                return new EnterVrModeCommandOuterClass$EnterVrModeCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (EnterVrModeCommandOuterClass$EnterVrModeCommand.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
