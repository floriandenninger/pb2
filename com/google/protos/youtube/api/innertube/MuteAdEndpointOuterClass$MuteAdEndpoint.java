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
import defpackage.atbk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MuteAdEndpointOuterClass$MuteAdEndpoint extends aonm implements aooz {
    public static final MuteAdEndpointOuterClass$MuteAdEndpoint a;
    private static volatile aopf d;
    public static final aonk muteAdEndpoint;
    public int b;
    private int e;
    private byte f = 2;
    public aony c = emptyProtobufList();

    static {
        MuteAdEndpointOuterClass$MuteAdEndpoint muteAdEndpointOuterClass$MuteAdEndpoint = new MuteAdEndpointOuterClass$MuteAdEndpoint();
        a = muteAdEndpointOuterClass$MuteAdEndpoint;
        aonm.registerDefaultInstance(MuteAdEndpointOuterClass$MuteAdEndpoint.class, muteAdEndpointOuterClass$MuteAdEndpoint);
        muteAdEndpoint = aonm.newSingularGeneratedExtension(apxf.a, muteAdEndpointOuterClass$MuteAdEndpoint, muteAdEndpointOuterClass$MuteAdEndpoint, null, 69108384, aoqn.MESSAGE, MuteAdEndpointOuterClass$MuteAdEndpoint.class);
    }

    private MuteAdEndpointOuterClass$MuteAdEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0001\u0002ဌ\u0001\u0003Л", new Object[]{"e", "b", atbk.u, "c", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new MuteAdEndpointOuterClass$MuteAdEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (MuteAdEndpointOuterClass$MuteAdEndpoint.class) {
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
