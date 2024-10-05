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
import defpackage.askp;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint extends aonm implements aooz {
    public static final AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint a;
    public static final aonk androidShareIntentEndpoint;
    private static volatile aopf g;
    public int b;
    private byte h = 2;
    public aony c = emptyProtobufList();
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint = new AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint();
        a = androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint;
        aonm.registerDefaultInstance(AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.class, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint);
        androidShareIntentEndpoint = aonm.newSingularGeneratedExtension(apxf.a, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint, androidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint, null, 106983893, aoqn.MESSAGE, AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.class);
    }

    private AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001Л\u0002ဈ\u0000\u0004ဈ\u0001\u0006ဈ\u0002", new Object[]{"b", "c", askp.class, "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (AndroidShareIntentEndpointOuterClass$AndroidShareIntentEndpoint.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
