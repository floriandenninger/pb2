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
public final class DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint extends aonm implements aooz {
    public static final DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint a;
    public static final aonk deletePendingUploadEndpoint;
    private static volatile aopf e;
    public int b;
    public String c = "";
    public String d = "";

    static {
        DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint = new DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint();
        a = deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint;
        aonm.registerDefaultInstance(DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.class, deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint);
        deletePendingUploadEndpoint = aonm.newSingularGeneratedExtension(apxf.a, deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint, deletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint, null, 66028866, aoqn.MESSAGE, DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.class);
    }

    private DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (DeletePendingUploadEndpointOuterClass$DeletePendingUploadEndpoint.class) {
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
