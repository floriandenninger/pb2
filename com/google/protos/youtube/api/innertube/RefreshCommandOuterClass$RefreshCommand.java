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
import defpackage.aukz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class RefreshCommandOuterClass$RefreshCommand extends aonm implements aooz {
    public static final RefreshCommandOuterClass$RefreshCommand a;
    private static volatile aopf d;
    public static final aonk refreshCommand;
    public int b;
    public int c;

    static {
        RefreshCommandOuterClass$RefreshCommand refreshCommandOuterClass$RefreshCommand = new RefreshCommandOuterClass$RefreshCommand();
        a = refreshCommandOuterClass$RefreshCommand;
        aonm.registerDefaultInstance(RefreshCommandOuterClass$RefreshCommand.class, refreshCommandOuterClass$RefreshCommand);
        refreshCommand = aonm.newSingularGeneratedExtension(apxf.a, refreshCommandOuterClass$RefreshCommand, refreshCommandOuterClass$RefreshCommand, null, 177327295, aoqn.MESSAGE, RefreshCommandOuterClass$RefreshCommand.class);
    }

    private RefreshCommandOuterClass$RefreshCommand() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"b", "c", aukz.a});
            case NEW_MUTABLE_INSTANCE:
                return new RefreshCommandOuterClass$RefreshCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (RefreshCommandOuterClass$RefreshCommand.class) {
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
