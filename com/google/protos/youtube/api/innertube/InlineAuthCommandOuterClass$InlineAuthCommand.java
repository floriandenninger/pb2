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
public final class InlineAuthCommandOuterClass$InlineAuthCommand extends aonm implements aooz {
    public static final InlineAuthCommandOuterClass$InlineAuthCommand a;
    public static final aonk inlineAuthCommand;
    private static volatile aopf j;
    public int b;
    public apxf c;
    public apxf d;
    public apxf e;
    public apxf f;
    public aulq g;
    public apxf i;
    private byte k = 2;
    public aony h = emptyProtobufList();

    static {
        InlineAuthCommandOuterClass$InlineAuthCommand inlineAuthCommandOuterClass$InlineAuthCommand = new InlineAuthCommandOuterClass$InlineAuthCommand();
        a = inlineAuthCommandOuterClass$InlineAuthCommand;
        aonm.registerDefaultInstance(InlineAuthCommandOuterClass$InlineAuthCommand.class, inlineAuthCommandOuterClass$InlineAuthCommand);
        inlineAuthCommand = aonm.newSingularGeneratedExtension(apxf.a, inlineAuthCommandOuterClass$InlineAuthCommand, inlineAuthCommandOuterClass$InlineAuthCommand, null, 196607391, aoqn.MESSAGE, InlineAuthCommandOuterClass$InlineAuthCommand.class);
    }

    private InlineAuthCommandOuterClass$InlineAuthCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006Л\u0007ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h", aulq.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new InlineAuthCommandOuterClass$InlineAuthCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (InlineAuthCommandOuterClass$InlineAuthCommand.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
