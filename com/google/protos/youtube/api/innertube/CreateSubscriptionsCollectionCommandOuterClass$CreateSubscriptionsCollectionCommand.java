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
import defpackage.arnv;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand extends aonm implements aooz {
    public static final CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand a;
    public static final aonk createSubscriptionsCollectionCommand;
    private static volatile aopf f;
    public int b;
    public arnv c;
    public apxf d;
    public apxf e;
    private byte g = 2;

    static {
        CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand = new CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand();
        a = createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand;
        aonm.registerDefaultInstance(CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand.class, createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand);
        createSubscriptionsCollectionCommand = aonm.newSingularGeneratedExtension(apxf.a, createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand, createSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand, null, 378557648, aoqn.MESSAGE, CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand.class);
    }

    private CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (CreateSubscriptionsCollectionCommandOuterClass$CreateSubscriptionsCollectionCommand.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
