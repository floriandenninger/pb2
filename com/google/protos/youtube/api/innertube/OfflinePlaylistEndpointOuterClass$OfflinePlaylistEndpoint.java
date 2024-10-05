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
import defpackage.atnn;
import defpackage.atom;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint extends aonm implements aooz {
    public static final OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint a;
    private static volatile aopf g;
    public static final aonk offlinePlaylistEndpoint;
    public int b;
    public int d;
    public aulq e;
    public atom f;
    private byte h = 2;
    public String c = "";

    static {
        OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = new OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint();
        a = offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
        aonm.registerDefaultInstance(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.class, offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint);
        offlinePlaylistEndpoint = aonm.newSingularGeneratedExtension(apxf.a, offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint, offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint, null, 73082583, aoqn.MESSAGE, OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.class);
    }

    private OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဌ\u0001\u0004ᐉ\u0003\u0006ဉ\u0004", new Object[]{"b", "c", "d", atnn.s, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.class) {
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
