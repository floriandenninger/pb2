package com.google.protos.youtube.api.innertube;

import defpackage.aomf;
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
public final class UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint extends aonm implements aooz {
    public static final UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint a;
    private static volatile aopf e;
    public static final aonk unlimitedManageFamilyEndpoint;
    public int b;
    public String c = "";
    public aomf d = aomf.b;

    static {
        UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint = new UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint();
        a = unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint;
        aonm.registerDefaultInstance(UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.class, unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint);
        unlimitedManageFamilyEndpoint = aonm.newSingularGeneratedExtension(apxf.a, unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint, unlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint, null, 129506414, aoqn.MESSAGE, UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.class);
    }

    private UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0001\u0003ည\u0002", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (UnlimitedManageFamilyEndpointOuterClass$UnlimitedManageFamilyEndpoint.class) {
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
