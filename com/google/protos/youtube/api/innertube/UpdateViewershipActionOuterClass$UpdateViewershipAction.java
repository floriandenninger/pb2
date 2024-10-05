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
import defpackage.avyq;
import defpackage.avzk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UpdateViewershipActionOuterClass$UpdateViewershipAction extends aonm implements aooz {
    public static final UpdateViewershipActionOuterClass$UpdateViewershipAction a;
    private static volatile aopf d;
    public static final aonk updateViewershipAction;
    public avyq b;
    public boolean c;
    private int e;
    private avzk f;
    private byte g = 2;

    static {
        UpdateViewershipActionOuterClass$UpdateViewershipAction updateViewershipActionOuterClass$UpdateViewershipAction = new UpdateViewershipActionOuterClass$UpdateViewershipAction();
        a = updateViewershipActionOuterClass$UpdateViewershipAction;
        aonm.registerDefaultInstance(UpdateViewershipActionOuterClass$UpdateViewershipAction.class, updateViewershipActionOuterClass$UpdateViewershipAction);
        updateViewershipAction = aonm.newSingularGeneratedExtension(apxf.a, updateViewershipActionOuterClass$UpdateViewershipAction, updateViewershipActionOuterClass$UpdateViewershipAction, null, 104886333, aoqn.MESSAGE, UpdateViewershipActionOuterClass$UpdateViewershipAction.class);
    }

    private UpdateViewershipActionOuterClass$UpdateViewershipAction() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဇ\u0002\u0003ᐉ\u0001", new Object[]{"e", "b", "c", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new UpdateViewershipActionOuterClass$UpdateViewershipAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (UpdateViewershipActionOuterClass$UpdateViewershipAction.class) {
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
