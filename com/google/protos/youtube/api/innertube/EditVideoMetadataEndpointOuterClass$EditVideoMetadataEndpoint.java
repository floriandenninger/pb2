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
public final class EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint extends aonm implements aooz {
    public static final EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint a;
    private static volatile aopf d;
    public static final aonk editVideoMetadataEndpoint;
    public int b;
    public String c = "";

    static {
        EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint = new EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint();
        a = editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint;
        aonm.registerDefaultInstance(EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.class, editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint);
        editVideoMetadataEndpoint = aonm.newSingularGeneratedExtension(apxf.a, editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint, editVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint, null, 63560970, aoqn.MESSAGE, EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.class);
    }

    private EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (EditVideoMetadataEndpointOuterClass$EditVideoMetadataEndpoint.class) {
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
