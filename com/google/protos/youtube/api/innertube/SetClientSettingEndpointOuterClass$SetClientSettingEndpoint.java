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
import defpackage.aupi;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SetClientSettingEndpointOuterClass$SetClientSettingEndpoint extends aonm implements aooz {
    public static final SetClientSettingEndpointOuterClass$SetClientSettingEndpoint a;
    private static volatile aopf d;
    public static final aonk setClientSettingEndpoint;
    private byte e = 2;
    public aony b = emptyProtobufList();
    public aony c = emptyProtobufList();

    static {
        SetClientSettingEndpointOuterClass$SetClientSettingEndpoint setClientSettingEndpointOuterClass$SetClientSettingEndpoint = new SetClientSettingEndpointOuterClass$SetClientSettingEndpoint();
        a = setClientSettingEndpointOuterClass$SetClientSettingEndpoint;
        aonm.registerDefaultInstance(SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class, setClientSettingEndpointOuterClass$SetClientSettingEndpoint);
        setClientSettingEndpoint = aonm.newSingularGeneratedExtension(apxf.a, setClientSettingEndpointOuterClass$SetClientSettingEndpoint, setClientSettingEndpointOuterClass$SetClientSettingEndpoint, null, 81212182, aoqn.MESSAGE, SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class);
    }

    private SetClientSettingEndpointOuterClass$SetClientSettingEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001\u001b\u0002Л", new Object[]{"b", aupi.class, "c", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new SetClientSettingEndpointOuterClass$SetClientSettingEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (SetClientSettingEndpointOuterClass$SetClientSettingEndpoint.class) {
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
