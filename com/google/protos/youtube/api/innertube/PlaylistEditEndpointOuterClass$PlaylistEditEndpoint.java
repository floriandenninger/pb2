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
import defpackage.auau;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class PlaylistEditEndpointOuterClass$PlaylistEditEndpoint extends aonm implements aooz {
    public static final PlaylistEditEndpointOuterClass$PlaylistEditEndpoint a;
    private static volatile aopf f;
    public static final aonk playlistEditEndpoint;
    private int g;
    private byte h = 2;
    public String b = "";
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();
    public String e = "";

    static {
        PlaylistEditEndpointOuterClass$PlaylistEditEndpoint playlistEditEndpointOuterClass$PlaylistEditEndpoint = new PlaylistEditEndpointOuterClass$PlaylistEditEndpoint();
        a = playlistEditEndpointOuterClass$PlaylistEditEndpoint;
        aonm.registerDefaultInstance(PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.class, playlistEditEndpointOuterClass$PlaylistEditEndpoint);
        playlistEditEndpoint = aonm.newSingularGeneratedExtension(apxf.a, playlistEditEndpointOuterClass$PlaylistEditEndpoint, playlistEditEndpointOuterClass$PlaylistEditEndpoint, null, 60666189, aoqn.MESSAGE, PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.class);
    }

    private PlaylistEditEndpointOuterClass$PlaylistEditEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0001\u0001ဈ\u0000\u0002\u001b\u0003ဈ\u0001\u0005Л", new Object[]{"g", "b", "c", auau.class, "e", "d", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new PlaylistEditEndpointOuterClass$PlaylistEditEndpoint();
            case NEW_BUILDER:
                return new aone((boolean[]) null, (char[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (PlaylistEditEndpointOuterClass$PlaylistEditEndpoint.class) {
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
