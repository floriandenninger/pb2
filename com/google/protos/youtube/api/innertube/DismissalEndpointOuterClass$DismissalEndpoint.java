package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aony;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DismissalEndpointOuterClass$DismissalEndpoint extends aonm implements aooz {
    public static final DismissalEndpointOuterClass$DismissalEndpoint a;
    private static volatile aopf d;
    public static final aonk dismissalEndpoint;
    private int e;
    private byte f = 2;
    public String b = "";
    public aony c = emptyProtobufList();

    static {
        DismissalEndpointOuterClass$DismissalEndpoint dismissalEndpointOuterClass$DismissalEndpoint = new DismissalEndpointOuterClass$DismissalEndpoint();
        a = dismissalEndpointOuterClass$DismissalEndpoint;
        aonm.registerDefaultInstance(DismissalEndpointOuterClass$DismissalEndpoint.class, dismissalEndpointOuterClass$DismissalEndpoint);
        dismissalEndpoint = aonm.newSingularGeneratedExtension(apxf.a, dismissalEndpointOuterClass$DismissalEndpoint, dismissalEndpointOuterClass$DismissalEndpoint, null, 63120728, aoqn.MESSAGE, DismissalEndpointOuterClass$DismissalEndpoint.class);
    }

    private DismissalEndpointOuterClass$DismissalEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0000\u0002Л", new Object[]{"e", "b", "c", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new DismissalEndpointOuterClass$DismissalEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (DismissalEndpointOuterClass$DismissalEndpoint.class) {
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
