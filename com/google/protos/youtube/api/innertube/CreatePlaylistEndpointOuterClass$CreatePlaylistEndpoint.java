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
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint extends aonm implements aooz {
    public static final CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint a;
    public static final aonk createPlaylistEndpoint;
    private static volatile aopf i;
    public int b;
    public Object d;
    public int c = 0;
    private byte j = 2;
    public aony e = aonm.emptyProtobufList();
    public String f = "";
    public String g = "";
    public String h = "";

    static {
        CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint createPlaylistEndpointOuterClass$CreatePlaylistEndpoint = new CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint();
        a = createPlaylistEndpointOuterClass$CreatePlaylistEndpoint;
        aonm.registerDefaultInstance(CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.class, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint);
        createPlaylistEndpoint = aonm.newSingularGeneratedExtension(apxf.a, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, createPlaylistEndpointOuterClass$CreatePlaylistEndpoint, null, 85650004, aoqn.MESSAGE, CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.class);
    }

    private CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\t\u0005\u0000\u0001\u0001\u0001\u001a\u0002ဈ\u0000\u0007ဈ\u0002\bဈ\u0003\tᐼ\u0000", new Object[]{"d", "c", "b", "e", "f", "g", "h", aulq.class});
            case NEW_MUTABLE_INSTANCE:
                return new CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (CreatePlaylistEndpointOuterClass$CreatePlaylistEndpoint.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
