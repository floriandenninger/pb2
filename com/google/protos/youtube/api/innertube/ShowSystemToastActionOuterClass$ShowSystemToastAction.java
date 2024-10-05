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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowSystemToastActionOuterClass$ShowSystemToastAction extends aonm implements aooz {
    public static final ShowSystemToastActionOuterClass$ShowSystemToastAction a;
    private static volatile aopf d;
    public static final aonk showSystemToastAction;
    public int b;
    public aqyg c;
    private byte e = 2;

    static {
        ShowSystemToastActionOuterClass$ShowSystemToastAction showSystemToastActionOuterClass$ShowSystemToastAction = new ShowSystemToastActionOuterClass$ShowSystemToastAction();
        a = showSystemToastActionOuterClass$ShowSystemToastAction;
        aonm.registerDefaultInstance(ShowSystemToastActionOuterClass$ShowSystemToastAction.class, showSystemToastActionOuterClass$ShowSystemToastAction);
        showSystemToastAction = aonm.newSingularGeneratedExtension(apxf.a, showSystemToastActionOuterClass$ShowSystemToastAction, showSystemToastActionOuterClass$ShowSystemToastAction, null, 173351111, aoqn.MESSAGE, ShowSystemToastActionOuterClass$ShowSystemToastAction.class);
    }

    private ShowSystemToastActionOuterClass$ShowSystemToastAction() {
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
                return new ShowSystemToastActionOuterClass$ShowSystemToastAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ShowSystemToastActionOuterClass$ShowSystemToastAction.class) {
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
