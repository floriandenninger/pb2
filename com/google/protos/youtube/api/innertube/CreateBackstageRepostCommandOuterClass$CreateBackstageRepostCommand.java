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
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand extends aonm implements aooz {
    public static final CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand a;
    private static volatile aopf c;
    public static final aonk createBackstageRepostCommand;
    public aulq b;
    private int d;
    private byte e = 2;

    static {
        CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand createBackstageRepostCommandOuterClass$CreateBackstageRepostCommand = new CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand();
        a = createBackstageRepostCommandOuterClass$CreateBackstageRepostCommand;
        aonm.registerDefaultInstance(CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand.class, createBackstageRepostCommandOuterClass$CreateBackstageRepostCommand);
        createBackstageRepostCommand = aonm.newSingularGeneratedExtension(apxf.a, createBackstageRepostCommandOuterClass$CreateBackstageRepostCommand, createBackstageRepostCommandOuterClass$CreateBackstageRepostCommand, null, 263232509, aoqn.MESSAGE, CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand.class);
    }

    private CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (CreateBackstageRepostCommandOuterClass$CreateBackstageRepostCommand.class) {
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
