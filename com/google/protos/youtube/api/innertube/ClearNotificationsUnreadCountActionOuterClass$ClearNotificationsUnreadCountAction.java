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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction extends aonm implements aooz {
    public static final ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction a;
    private static volatile aopf c;
    public static final aonk clearNotificationsUnreadCountAction;
    public long b;
    private int d;

    static {
        ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction clearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction = new ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction();
        a = clearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction;
        aonm.registerDefaultInstance(ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction.class, clearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction);
        clearNotificationsUnreadCountAction = aonm.newSingularGeneratedExtension(apxf.a, clearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction, clearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction, null, 126831092, aoqn.MESSAGE, ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction.class);
    }

    private ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (ClearNotificationsUnreadCountActionOuterClass$ClearNotificationsUnreadCountAction.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
