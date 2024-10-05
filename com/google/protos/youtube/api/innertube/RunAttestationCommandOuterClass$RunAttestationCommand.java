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
import defpackage.apew;
import defpackage.apge;
import defpackage.apxf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RunAttestationCommandOuterClass$RunAttestationCommand extends aonm implements aooz {
    public static final RunAttestationCommandOuterClass$RunAttestationCommand a;
    private static volatile aopf d;
    public static final aonk runAttestationCommand;
    public aony b = emptyProtobufList();
    public int c;
    private int e;

    static {
        RunAttestationCommandOuterClass$RunAttestationCommand runAttestationCommandOuterClass$RunAttestationCommand = new RunAttestationCommandOuterClass$RunAttestationCommand();
        a = runAttestationCommandOuterClass$RunAttestationCommand;
        aonm.registerDefaultInstance(RunAttestationCommandOuterClass$RunAttestationCommand.class, runAttestationCommandOuterClass$RunAttestationCommand);
        runAttestationCommand = aonm.newSingularGeneratedExtension(apxf.a, runAttestationCommandOuterClass$RunAttestationCommand, runAttestationCommandOuterClass$RunAttestationCommand, null, 272487492, aoqn.MESSAGE, RunAttestationCommandOuterClass$RunAttestationCommand.class);
    }

    private RunAttestationCommandOuterClass$RunAttestationCommand() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဌ\u0000", new Object[]{"e", "b", apge.class, "c", apew.f});
            case NEW_MUTABLE_INSTANCE:
                return new RunAttestationCommandOuterClass$RunAttestationCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (RunAttestationCommandOuterClass$RunAttestationCommand.class) {
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
