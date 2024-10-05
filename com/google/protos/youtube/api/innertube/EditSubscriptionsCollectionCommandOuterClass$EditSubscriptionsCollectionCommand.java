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
import defpackage.arph;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand extends aonm implements aooz {
    public static final EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand a;
    public static final aonk editSubscriptionsCollectionCommand;
    private static volatile aopf f;
    public int b;
    public arph c;
    public apxf d;
    public apxf e;
    private byte g = 2;

    static {
        EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand = new EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand();
        a = editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand;
        aonm.registerDefaultInstance(EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.class, editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand);
        editSubscriptionsCollectionCommand = aonm.newSingularGeneratedExtension(apxf.a, editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand, editSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand, null, 378557652, aoqn.MESSAGE, EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.class);
    }

    private EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand() {
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
                return new EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (EditSubscriptionsCollectionCommandOuterClass$EditSubscriptionsCollectionCommand.class) {
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
