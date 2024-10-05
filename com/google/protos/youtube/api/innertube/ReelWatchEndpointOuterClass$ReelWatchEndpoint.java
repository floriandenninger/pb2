package com.google.protos.youtube.api.innertube;

import defpackage.aomf;
import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;
import defpackage.atsn;
import defpackage.auji;
import defpackage.aujj;
import defpackage.aulq;
import defpackage.avgg;
import defpackage.awdk;
import defpackage.awdq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReelWatchEndpointOuterClass$ReelWatchEndpoint extends aonm implements aooz {
    private static volatile aopf A;
    public static final ReelWatchEndpointOuterClass$ReelWatchEndpoint a;
    public static final aonk reelWatchEndpoint;
    private apxf B;
    public int b;
    public int c;
    public int f;
    public avgg h;
    public apxf i;
    public aulq j;
    public boolean k;
    public atsn l;
    public int m;
    public aulq p;
    public auji q;
    public apxf r;
    public awdq t;
    public apxf u;
    public awdk v;
    public aulq w;
    public int x;
    public int y;
    public String z;
    private byte C = 2;
    public String d = "";
    public String e = "";
    public String g = "";
    public String n = "";
    public String o = "";
    public String s = "";

    static {
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint = new ReelWatchEndpointOuterClass$ReelWatchEndpoint();
        a = reelWatchEndpointOuterClass$ReelWatchEndpoint;
        aonm.registerDefaultInstance(ReelWatchEndpointOuterClass$ReelWatchEndpoint.class, reelWatchEndpointOuterClass$ReelWatchEndpoint);
        reelWatchEndpoint = aonm.newSingularGeneratedExtension(apxf.a, reelWatchEndpointOuterClass$ReelWatchEndpoint, reelWatchEndpointOuterClass$ReelWatchEndpoint, null, 139608561, aoqn.MESSAGE, ReelWatchEndpointOuterClass$ReelWatchEndpoint.class);
    }

    private ReelWatchEndpointOuterClass$ReelWatchEndpoint() {
        aomf aomfVar = aomf.b;
        this.z = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.C);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.C = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0019\u0000\u0001\u0001\ue8f4☔\u0019\u0000\u0000\b\u0001ဈ\u0001\u0002ဈ\u0003\u0003ဋ\u0004\u0004ဈ\u0005\u0005ᐉ\u0006\u0007ᐉ\u0007\bᐉ\b\nဇ\t\u000bဈ\u000e\fဌ\u000b\rဈ\f\u000eᐉ\u000f\u000fဌ\u0000\u0010ဉ\u0010\u0011ᐉ\u0011\u0012ဈ\u0012\u0014ဉ\u0014\u0016ᐉ\u0015\u0017ဉ\u0016\u0019ᐉ\u0018\u001aဌ\u0019\u001bင\u001a\u001cဈ\u001bϩᐉ\r\ue8f4☔ဉ\n", new Object[]{"b", "d", "e", "f", "g", "h", "i", "j", "k", "o", "m", aujj.k, "n", "p", "c", aujj.j, "q", "r", "s", "t", "u", "v", "w", "x", aujj.i, "y", "z", "B", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new ReelWatchEndpointOuterClass$ReelWatchEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = A;
                if (aopfVar == null) {
                    synchronized (ReelWatchEndpointOuterClass$ReelWatchEndpoint.class) {
                        aopfVar = A;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            A = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
