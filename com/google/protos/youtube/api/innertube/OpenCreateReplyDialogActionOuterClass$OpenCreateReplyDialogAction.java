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
import defpackage.apxl;
import defpackage.aqgt;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction extends aonm implements aooz {
    public static final OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction a;
    private static volatile aopf e;
    public static final aonk openCreateReplyDialogAction;
    public aqgt b;
    public apxl c;
    public apxl d;
    private int f;
    private byte g = 2;

    static {
        OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction = new OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction();
        a = openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction;
        aonm.registerDefaultInstance(OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.class, openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction);
        openCreateReplyDialogAction = aonm.newSingularGeneratedExtension(apxf.a, openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction, openCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction, null, 145308295, aoqn.MESSAGE, OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.class);
    }

    private OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"f", "b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (OpenCreateReplyDialogActionOuterClass$OpenCreateReplyDialogAction.class) {
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
