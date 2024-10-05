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
import defpackage.apyk;
import defpackage.aqyg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction extends aonm implements aooz {
    public static final UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction a;
    private static volatile aopf f;
    public static final aonk updateBackstagePollAction;
    public int b;
    public int c;
    public aqyg d;
    public int e;
    private byte g = 2;

    static {
        UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction updateBackstagePollActionOuterClass$UpdateBackstagePollAction = new UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction();
        a = updateBackstagePollActionOuterClass$UpdateBackstagePollAction;
        aonm.registerDefaultInstance(UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.class, updateBackstagePollActionOuterClass$UpdateBackstagePollAction);
        updateBackstagePollAction = aonm.newSingularGeneratedExtension(apxf.a, updateBackstagePollActionOuterClass$UpdateBackstagePollAction, updateBackstagePollActionOuterClass$UpdateBackstagePollAction, null, 139609360, aoqn.MESSAGE, UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.class);
    }

    private UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0001\u0002ᐉ\u0002\u0003င\u0003", new Object[]{"b", "c", apyk.a(), "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (UpdateBackstagePollActionOuterClass$UpdateBackstagePollAction.class) {
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
