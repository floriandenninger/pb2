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
import defpackage.aqyg;
import defpackage.avcl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction extends aonm implements aooz {
    public static final UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction a;
    private static volatile aopf f;
    public static final aonk updateToggleButtonTextAction;
    public int b;
    public aqyg c;
    public aqyg d;
    public int e;
    private byte g = 2;

    static {
        UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction = new UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction();
        a = updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction;
        aonm.registerDefaultInstance(UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.class, updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction);
        updateToggleButtonTextAction = aonm.newSingularGeneratedExtension(apxf.a, updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction, updateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction, null, 136527603, aoqn.MESSAGE, UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.class);
    }

    private UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002", new Object[]{"b", "c", "d", "e", avcl.s});
            case NEW_MUTABLE_INSTANCE:
                return new UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (UpdateToggleButtonTextActionOuterClass$UpdateToggleButtonTextAction.class) {
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
