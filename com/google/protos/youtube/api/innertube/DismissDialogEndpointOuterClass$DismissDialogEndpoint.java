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
public final class DismissDialogEndpointOuterClass$DismissDialogEndpoint extends aonm implements aooz {
    public static final DismissDialogEndpointOuterClass$DismissDialogEndpoint a;
    private static volatile aopf d;
    public static final aonk dismissDialogEndpoint;
    public int b;
    public String c = "";

    static {
        DismissDialogEndpointOuterClass$DismissDialogEndpoint dismissDialogEndpointOuterClass$DismissDialogEndpoint = new DismissDialogEndpointOuterClass$DismissDialogEndpoint();
        a = dismissDialogEndpointOuterClass$DismissDialogEndpoint;
        aonm.registerDefaultInstance(DismissDialogEndpointOuterClass$DismissDialogEndpoint.class, dismissDialogEndpointOuterClass$DismissDialogEndpoint);
        dismissDialogEndpoint = aonm.newSingularGeneratedExtension(apxf.a, dismissDialogEndpointOuterClass$DismissDialogEndpoint, dismissDialogEndpointOuterClass$DismissDialogEndpoint, null, 330811011, aoqn.MESSAGE, DismissDialogEndpointOuterClass$DismissDialogEndpoint.class);
    }

    private DismissDialogEndpointOuterClass$DismissDialogEndpoint() {
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
                return new DismissDialogEndpointOuterClass$DismissDialogEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (DismissDialogEndpointOuterClass$DismissDialogEndpoint.class) {
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
