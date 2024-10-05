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
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateFlowCommandOuterClass$UpdateFlowCommand extends aonm implements aooz {
    public static final UpdateFlowCommandOuterClass$UpdateFlowCommand a;
    private static volatile aopf g;
    public static final aonk updateFlowCommand;
    public int b;
    public apxf e;
    public apxf f;
    private byte h = 2;
    public String c = "";
    public aony d = emptyProtobufList();

    static {
        UpdateFlowCommandOuterClass$UpdateFlowCommand updateFlowCommandOuterClass$UpdateFlowCommand = new UpdateFlowCommandOuterClass$UpdateFlowCommand();
        a = updateFlowCommandOuterClass$UpdateFlowCommand;
        aonm.registerDefaultInstance(UpdateFlowCommandOuterClass$UpdateFlowCommand.class, updateFlowCommandOuterClass$UpdateFlowCommand);
        updateFlowCommand = aonm.newSingularGeneratedExtension(apxf.a, updateFlowCommandOuterClass$UpdateFlowCommand, updateFlowCommandOuterClass$UpdateFlowCommand, null, 371825304, aoqn.MESSAGE, UpdateFlowCommandOuterClass$UpdateFlowCommand.class);
    }

    private UpdateFlowCommandOuterClass$UpdateFlowCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0003\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002", new Object[]{"b", "c", "d", aulq.class, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new UpdateFlowCommandOuterClass$UpdateFlowCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (UpdateFlowCommandOuterClass$UpdateFlowCommand.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
