package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.aoye;
import defpackage.apxf;
import defpackage.aqze;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint extends aonm implements aooz {
    public static final FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint a;
    private static volatile aopf e;
    public static final aonk formfillPostSubmitEndpoint;
    public aoye b;
    public String c = "";
    public int d;
    private int f;

    static {
        FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint = new FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint();
        a = formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint;
        aonm.registerDefaultInstance(FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.class, formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint);
        formfillPostSubmitEndpoint = aonm.newSingularGeneratedExtension(apxf.a, formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint, formfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint, null, 160183255, aoqn.MESSAGE, FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.class);
    }

    private FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0006ဈ\u0005\u0007ဌ\u0006", new Object[]{"f", "b", "c", "d", aqze.a});
            case NEW_MUTABLE_INSTANCE:
                return new FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (FormfillPostSubmitEndpointOuterClass$FormfillPostSubmitEndpoint.class) {
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
