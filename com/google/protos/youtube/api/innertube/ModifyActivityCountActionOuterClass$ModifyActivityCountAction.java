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
import defpackage.atgw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ModifyActivityCountActionOuterClass$ModifyActivityCountAction extends aonm implements aooz {
    public static final ModifyActivityCountActionOuterClass$ModifyActivityCountAction a;
    private static volatile aopf d;
    public static final aonk modifyActivityCountAction;
    public aony b = emptyProtobufList();
    public long c;
    private int e;

    static {
        ModifyActivityCountActionOuterClass$ModifyActivityCountAction modifyActivityCountActionOuterClass$ModifyActivityCountAction = new ModifyActivityCountActionOuterClass$ModifyActivityCountAction();
        a = modifyActivityCountActionOuterClass$ModifyActivityCountAction;
        aonm.registerDefaultInstance(ModifyActivityCountActionOuterClass$ModifyActivityCountAction.class, modifyActivityCountActionOuterClass$ModifyActivityCountAction);
        modifyActivityCountAction = aonm.newSingularGeneratedExtension(apxf.a, modifyActivityCountActionOuterClass$ModifyActivityCountAction, modifyActivityCountActionOuterClass$ModifyActivityCountAction, null, 143505435, aoqn.MESSAGE, ModifyActivityCountActionOuterClass$ModifyActivityCountAction.class);
    }

    private ModifyActivityCountActionOuterClass$ModifyActivityCountAction() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0001\u0000\u0001\u001b\u0004ဂ\u0000", new Object[]{"e", "b", atgw.class, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ModifyActivityCountActionOuterClass$ModifyActivityCountAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ModifyActivityCountActionOuterClass$ModifyActivityCountAction.class) {
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
