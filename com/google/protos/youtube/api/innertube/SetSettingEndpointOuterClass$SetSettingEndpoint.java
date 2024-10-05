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
public final class SetSettingEndpointOuterClass$SetSettingEndpoint extends aonm implements aooz {
    public static final SetSettingEndpointOuterClass$SetSettingEndpoint a;
    private static volatile aopf g;
    public static final aonk setSettingEndpoint;
    public int b;
    public Object d;
    public int c = 0;
    private byte h = 2;
    public String e = "";
    public aony f = emptyProtobufList();

    static {
        SetSettingEndpointOuterClass$SetSettingEndpoint setSettingEndpointOuterClass$SetSettingEndpoint = new SetSettingEndpointOuterClass$SetSettingEndpoint();
        a = setSettingEndpointOuterClass$SetSettingEndpoint;
        aonm.registerDefaultInstance(SetSettingEndpointOuterClass$SetSettingEndpoint.class, setSettingEndpointOuterClass$SetSettingEndpoint);
        setSettingEndpoint = aonm.newSingularGeneratedExtension(apxf.a, setSettingEndpointOuterClass$SetSettingEndpoint, setSettingEndpointOuterClass$SetSettingEndpoint, null, 77872990, aoqn.MESSAGE, SetSettingEndpointOuterClass$SetSettingEndpoint.class);
    }

    private SetSettingEndpointOuterClass$SetSettingEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဈ\u0000\u0002ျ\u0000\u0003်\u0000\u0004ဵ\u0000\u0005Л", new Object[]{"d", "c", "b", "e", "f", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new SetSettingEndpointOuterClass$SetSettingEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (SetSettingEndpointOuterClass$SetSettingEndpoint.class) {
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
