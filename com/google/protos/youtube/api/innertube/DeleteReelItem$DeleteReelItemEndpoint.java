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
public final class DeleteReelItem$DeleteReelItemEndpoint extends aonm implements aooz {
    public static final DeleteReelItem$DeleteReelItemEndpoint a;
    private static volatile aopf d;
    public static final aonk deleteReelItemEndpoint;
    public String b = "";
    public String c = "";
    private int e;

    static {
        DeleteReelItem$DeleteReelItemEndpoint deleteReelItem$DeleteReelItemEndpoint = new DeleteReelItem$DeleteReelItemEndpoint();
        a = deleteReelItem$DeleteReelItemEndpoint;
        aonm.registerDefaultInstance(DeleteReelItem$DeleteReelItemEndpoint.class, deleteReelItem$DeleteReelItemEndpoint);
        deleteReelItemEndpoint = aonm.newSingularGeneratedExtension(apxf.a, deleteReelItem$DeleteReelItemEndpoint, deleteReelItem$DeleteReelItemEndpoint, null, 152328454, aoqn.MESSAGE, DeleteReelItem$DeleteReelItemEndpoint.class);
    }

    private DeleteReelItem$DeleteReelItemEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new DeleteReelItem$DeleteReelItemEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (DeleteReelItem$DeleteReelItemEndpoint.class) {
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
