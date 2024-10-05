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
import defpackage.auqy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint extends aonm implements aooz {
    public static final ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint a;
    private static volatile aopf d;
    public static final aonk shoppingDrawerEndpoint;
    public int b;
    public int c;
    private int e;

    static {
        ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint = new ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint();
        a = shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint;
        aonm.registerDefaultInstance(ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.class, shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint);
        shoppingDrawerEndpoint = aonm.newSingularGeneratedExtension(apxf.a, shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint, shoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint, null, 154446441, aoqn.MESSAGE, ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.class);
    }

    private ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"e", "b", auqy.h, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (ShoppingDrawerEndpointOuterClass$ShoppingDrawerEndpoint.class) {
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
