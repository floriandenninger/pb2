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
public final class ToggleConversationActionOuterClass$ToggleConversationAction extends aonm implements aooz {
    public static final ToggleConversationActionOuterClass$ToggleConversationAction a;
    private static volatile aopf d;
    public static final aonk toggleConversationAction;
    public int b;
    public boolean c;

    static {
        ToggleConversationActionOuterClass$ToggleConversationAction toggleConversationActionOuterClass$ToggleConversationAction = new ToggleConversationActionOuterClass$ToggleConversationAction();
        a = toggleConversationActionOuterClass$ToggleConversationAction;
        aonm.registerDefaultInstance(ToggleConversationActionOuterClass$ToggleConversationAction.class, toggleConversationActionOuterClass$ToggleConversationAction);
        toggleConversationAction = aonm.newSingularGeneratedExtension(apxf.a, toggleConversationActionOuterClass$ToggleConversationAction, toggleConversationActionOuterClass$ToggleConversationAction, null, 130528991, aoqn.MESSAGE, ToggleConversationActionOuterClass$ToggleConversationAction.class);
    }

    private ToggleConversationActionOuterClass$ToggleConversationAction() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ToggleConversationActionOuterClass$ToggleConversationAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ToggleConversationActionOuterClass$ToggleConversationAction.class) {
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
