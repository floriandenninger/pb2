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
public final class AddContactsEndpointOuterClass$AddContactsEndpoint extends aonm implements aooz {
    public static final AddContactsEndpointOuterClass$AddContactsEndpoint a;
    public static final aonk addContactsEndpoint;
    private static volatile aopf c;
    public String b = "";
    private int d;

    static {
        AddContactsEndpointOuterClass$AddContactsEndpoint addContactsEndpointOuterClass$AddContactsEndpoint = new AddContactsEndpointOuterClass$AddContactsEndpoint();
        a = addContactsEndpointOuterClass$AddContactsEndpoint;
        aonm.registerDefaultInstance(AddContactsEndpointOuterClass$AddContactsEndpoint.class, addContactsEndpointOuterClass$AddContactsEndpoint);
        addContactsEndpoint = aonm.newSingularGeneratedExtension(apxf.a, addContactsEndpointOuterClass$AddContactsEndpoint, addContactsEndpointOuterClass$AddContactsEndpoint, null, 126354119, aoqn.MESSAGE, AddContactsEndpointOuterClass$AddContactsEndpoint.class);
    }

    private AddContactsEndpointOuterClass$AddContactsEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new AddContactsEndpointOuterClass$AddContactsEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (AddContactsEndpointOuterClass$AddContactsEndpoint.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
