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
import defpackage.avsc;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction extends aonm implements aooz {
    public static final UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction a;
    private static volatile aopf e;
    public static final aonk updateHorizontalCardListAction;
    public Object c;
    public avsc d;
    private int f;
    public int b = 0;
    private byte g = 2;

    static {
        UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction = new UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction();
        a = updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction;
        aonm.registerDefaultInstance(UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.class, updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction);
        updateHorizontalCardListAction = aonm.newSingularGeneratedExtension(apxf.a, updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction, updateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction, null, 139828682, aoqn.MESSAGE, UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.class);
    }

    private UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction() {
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
                return newMessageInfo(a, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ျ\u0000\u0002ᐉ\u0002\u0003ျ\u0000", new Object[]{"c", "b", "f", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (UpdateHorizontalCardListActionOuterClass$UpdateHorizontalCardListAction.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
