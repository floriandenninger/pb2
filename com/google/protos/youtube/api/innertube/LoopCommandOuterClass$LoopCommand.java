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
public final class LoopCommandOuterClass$LoopCommand extends aonm implements aooz {
    public static final LoopCommandOuterClass$LoopCommand a;
    private static volatile aopf g;
    public static final aonk loopCommand;
    public int b;
    public boolean c;
    public long d;
    public long e;
    public String f = "";

    static {
        LoopCommandOuterClass$LoopCommand loopCommandOuterClass$LoopCommand = new LoopCommandOuterClass$LoopCommand();
        a = loopCommandOuterClass$LoopCommand;
        aonm.registerDefaultInstance(LoopCommandOuterClass$LoopCommand.class, loopCommandOuterClass$LoopCommand);
        loopCommand = aonm.newSingularGeneratedExtension(apxf.a, loopCommandOuterClass$LoopCommand, loopCommandOuterClass$LoopCommand, null, 250570650, aoqn.MESSAGE, LoopCommandOuterClass$LoopCommand.class);
    }

    private LoopCommandOuterClass$LoopCommand() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new LoopCommandOuterClass$LoopCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (LoopCommandOuterClass$LoopCommand.class) {
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
