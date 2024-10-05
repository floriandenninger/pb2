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
public final class ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction extends aonm implements aooz {
    public static final ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction a;
    public static final aonk clearPersistentCacheAction;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction clearPersistentCacheActionOuterClass$ClearPersistentCacheAction = new ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction();
        a = clearPersistentCacheActionOuterClass$ClearPersistentCacheAction;
        aonm.registerDefaultInstance(ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction.class, clearPersistentCacheActionOuterClass$ClearPersistentCacheAction);
        clearPersistentCacheAction = aonm.newSingularGeneratedExtension(apxf.a, clearPersistentCacheActionOuterClass$ClearPersistentCacheAction, clearPersistentCacheActionOuterClass$ClearPersistentCacheAction, null, 166864056, aoqn.MESSAGE, ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction.class);
    }

    private ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction() {
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
                return newMessageInfo(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002်\u0000", new Object[]{"c", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ClearPersistentCacheActionOuterClass$ClearPersistentCacheAction.class) {
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
