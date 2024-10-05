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
public final class DeleteVideoEndpointOuterClass$DeleteVideoEndpoint extends aonm implements aooz {
    public static final DeleteVideoEndpointOuterClass$DeleteVideoEndpoint a;
    private static volatile aopf d;
    public static final aonk deleteVideoEndpoint;
    public int b;
    public String c = "";

    static {
        DeleteVideoEndpointOuterClass$DeleteVideoEndpoint deleteVideoEndpointOuterClass$DeleteVideoEndpoint = new DeleteVideoEndpointOuterClass$DeleteVideoEndpoint();
        a = deleteVideoEndpointOuterClass$DeleteVideoEndpoint;
        aonm.registerDefaultInstance(DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.class, deleteVideoEndpointOuterClass$DeleteVideoEndpoint);
        deleteVideoEndpoint = aonm.newSingularGeneratedExtension(apxf.a, deleteVideoEndpointOuterClass$DeleteVideoEndpoint, deleteVideoEndpointOuterClass$DeleteVideoEndpoint, null, 64157372, aoqn.MESSAGE, DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.class);
    }

    private DeleteVideoEndpointOuterClass$DeleteVideoEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new DeleteVideoEndpointOuterClass$DeleteVideoEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (DeleteVideoEndpointOuterClass$DeleteVideoEndpoint.class) {
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
