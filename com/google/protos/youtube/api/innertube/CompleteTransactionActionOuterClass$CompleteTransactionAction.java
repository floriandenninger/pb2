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
import defpackage.asfo;
import defpackage.asgd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CompleteTransactionActionOuterClass$CompleteTransactionAction extends aonm implements aooz {
    public static final CompleteTransactionActionOuterClass$CompleteTransactionAction a;
    public static final aonk completeTransactionAction;
    private static volatile aopf g;
    public int b;
    public asfo c;
    public asgd d;
    public boolean f;
    private byte h = 2;
    public aony e = emptyProtobufList();

    static {
        CompleteTransactionActionOuterClass$CompleteTransactionAction completeTransactionActionOuterClass$CompleteTransactionAction = new CompleteTransactionActionOuterClass$CompleteTransactionAction();
        a = completeTransactionActionOuterClass$CompleteTransactionAction;
        aonm.registerDefaultInstance(CompleteTransactionActionOuterClass$CompleteTransactionAction.class, completeTransactionActionOuterClass$CompleteTransactionAction);
        completeTransactionAction = aonm.newSingularGeneratedExtension(apxf.a, completeTransactionActionOuterClass$CompleteTransactionAction, completeTransactionActionOuterClass$CompleteTransactionAction, null, 165983090, aoqn.MESSAGE, CompleteTransactionActionOuterClass$CompleteTransactionAction.class);
    }

    private CompleteTransactionActionOuterClass$CompleteTransactionAction() {
        aonm.emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003Л\u0005ဇ\u0002", new Object[]{"b", "c", "d", "e", apxf.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new CompleteTransactionActionOuterClass$CompleteTransactionAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (CompleteTransactionActionOuterClass$CompleteTransactionAction.class) {
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
