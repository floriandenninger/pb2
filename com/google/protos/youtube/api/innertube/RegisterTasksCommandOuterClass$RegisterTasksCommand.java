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
import defpackage.aveq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RegisterTasksCommandOuterClass$RegisterTasksCommand extends aonm implements aooz {
    public static final RegisterTasksCommandOuterClass$RegisterTasksCommand a;
    private static volatile aopf c;
    public static final aonk registerTasksCommand;
    private byte d = 2;
    public aony b = emptyProtobufList();

    static {
        RegisterTasksCommandOuterClass$RegisterTasksCommand registerTasksCommandOuterClass$RegisterTasksCommand = new RegisterTasksCommandOuterClass$RegisterTasksCommand();
        a = registerTasksCommandOuterClass$RegisterTasksCommand;
        aonm.registerDefaultInstance(RegisterTasksCommandOuterClass$RegisterTasksCommand.class, registerTasksCommandOuterClass$RegisterTasksCommand);
        registerTasksCommand = aonm.newSingularGeneratedExtension(apxf.a, registerTasksCommandOuterClass$RegisterTasksCommand, registerTasksCommandOuterClass$RegisterTasksCommand, null, 377621461, aoqn.MESSAGE, RegisterTasksCommandOuterClass$RegisterTasksCommand.class);
    }

    private RegisterTasksCommandOuterClass$RegisterTasksCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.d);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", aveq.class});
            case NEW_MUTABLE_INSTANCE:
                return new RegisterTasksCommandOuterClass$RegisterTasksCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (RegisterTasksCommandOuterClass$RegisterTasksCommand.class) {
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
