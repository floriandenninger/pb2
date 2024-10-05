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
public final class FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint extends aonm implements aooz {
    public static final FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint a;
    private static volatile aopf f;
    public static final aonk fetchTopicPickerEndpoint;
    public int b;
    public String c = "";
    public String d = "";
    public aony e = aonm.emptyProtobufList();

    static {
        FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint = new FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint();
        a = fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint;
        aonm.registerDefaultInstance(FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.class, fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint);
        fetchTopicPickerEndpoint = aonm.newSingularGeneratedExtension(apxf.a, fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint, fetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint, null, 168068692, aoqn.MESSAGE, FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.class);
    }

    private FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (FetchTopicPickerEndpointOuterClass$FetchTopicPickerEndpoint.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
