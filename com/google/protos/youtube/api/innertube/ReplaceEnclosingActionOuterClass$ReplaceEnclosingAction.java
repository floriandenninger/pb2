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
import defpackage.aulz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction extends aonm implements aooz {
    public static final ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction a;
    private static volatile aopf d;
    public static final aonk replaceEnclosingAction;
    public int b;
    public aulz c;
    private byte e = 2;

    static {
        ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction replaceEnclosingActionOuterClass$ReplaceEnclosingAction = new ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction();
        a = replaceEnclosingActionOuterClass$ReplaceEnclosingAction;
        aonm.registerDefaultInstance(ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.class, replaceEnclosingActionOuterClass$ReplaceEnclosingAction);
        replaceEnclosingAction = aonm.newSingularGeneratedExtension(apxf.a, replaceEnclosingActionOuterClass$ReplaceEnclosingAction, replaceEnclosingActionOuterClass$ReplaceEnclosingAction, null, 77297283, aoqn.MESSAGE, ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.class);
    }

    private ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction() {
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
                return new ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ReplaceEnclosingActionOuterClass$ReplaceEnclosingAction.class) {
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
