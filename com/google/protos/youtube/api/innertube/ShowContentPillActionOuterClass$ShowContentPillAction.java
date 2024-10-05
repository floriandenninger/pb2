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
import defpackage.autr;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowContentPillActionOuterClass$ShowContentPillAction extends aonm implements aooz {
    public static final ShowContentPillActionOuterClass$ShowContentPillAction a;
    private static volatile aopf d;
    public static final aonk showContentPillAction;
    public int b;
    public autr c;
    private byte e = 2;

    static {
        ShowContentPillActionOuterClass$ShowContentPillAction showContentPillActionOuterClass$ShowContentPillAction = new ShowContentPillActionOuterClass$ShowContentPillAction();
        a = showContentPillActionOuterClass$ShowContentPillAction;
        aonm.registerDefaultInstance(ShowContentPillActionOuterClass$ShowContentPillAction.class, showContentPillActionOuterClass$ShowContentPillAction);
        showContentPillAction = aonm.newSingularGeneratedExtension(apxf.a, showContentPillActionOuterClass$ShowContentPillAction, showContentPillActionOuterClass$ShowContentPillAction, null, 135486026, aoqn.MESSAGE, ShowContentPillActionOuterClass$ShowContentPillAction.class);
    }

    private ShowContentPillActionOuterClass$ShowContentPillAction() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ShowContentPillActionOuterClass$ShowContentPillAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ShowContentPillActionOuterClass$ShowContentPillAction.class) {
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
