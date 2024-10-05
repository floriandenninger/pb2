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
import defpackage.avcn;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint extends aonm implements aooz {
    public static final YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint a;
    private static volatile aopf d;
    public static final aonk ypcCancelSurveyEndpoint;
    public int b;
    public avcn c;
    private byte e = 2;

    static {
        YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint ypcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint = new YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint();
        a = ypcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint;
        aonm.registerDefaultInstance(YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.class, ypcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint);
        ypcCancelSurveyEndpoint = aonm.newSingularGeneratedExtension(apxf.a, ypcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint, ypcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint, null, 152893416, aoqn.MESSAGE, YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.class);
    }

    private YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (YpcCancelSurveyEndpointOuterClass$YpcCancelSurveyEndpoint.class) {
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
