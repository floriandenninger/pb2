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
import defpackage.atba;
import defpackage.atcd;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint extends aonm implements aooz {
    public static final MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint a;
    private static volatile aopf e;
    public static final aonk mdxConnectNavigationEndpoint;
    public int b;
    public atcd c;
    public atba d;

    static {
        MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint = new MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint();
        a = mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint;
        aonm.registerDefaultInstance(MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.class, mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint);
        mdxConnectNavigationEndpoint = aonm.newSingularGeneratedExtension(apxf.a, mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint, mdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint, null, 119886855, aoqn.MESSAGE, MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.class);
    }

    private MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0004\u0006\u0002\u0000\u0000\u0000\u0004ဉ\u0001\u0006ဉ\u0002", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (MdxConnectNavigationEndpointOuterClass$MdxConnectNavigationEndpoint.class) {
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
