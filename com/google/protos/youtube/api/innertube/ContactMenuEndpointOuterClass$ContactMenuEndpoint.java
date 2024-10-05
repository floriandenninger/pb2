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
import defpackage.aqil;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ContactMenuEndpointOuterClass$ContactMenuEndpoint extends aonm implements aooz {
    public static final ContactMenuEndpointOuterClass$ContactMenuEndpoint a;
    public static final aonk contactMenuEndpoint;
    private static volatile aopf e;
    public int b;
    public String c = "";
    public aqil d;

    static {
        ContactMenuEndpointOuterClass$ContactMenuEndpoint contactMenuEndpointOuterClass$ContactMenuEndpoint = new ContactMenuEndpointOuterClass$ContactMenuEndpoint();
        a = contactMenuEndpointOuterClass$ContactMenuEndpoint;
        aonm.registerDefaultInstance(ContactMenuEndpointOuterClass$ContactMenuEndpoint.class, contactMenuEndpointOuterClass$ContactMenuEndpoint);
        contactMenuEndpoint = aonm.newSingularGeneratedExtension(apxf.a, contactMenuEndpointOuterClass$ContactMenuEndpoint, contactMenuEndpointOuterClass$ContactMenuEndpoint, null, 98695964, aoqn.MESSAGE, ContactMenuEndpointOuterClass$ContactMenuEndpoint.class);
    }

    private ContactMenuEndpointOuterClass$ContactMenuEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new ContactMenuEndpointOuterClass$ContactMenuEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (ContactMenuEndpointOuterClass$ContactMenuEndpoint.class) {
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
