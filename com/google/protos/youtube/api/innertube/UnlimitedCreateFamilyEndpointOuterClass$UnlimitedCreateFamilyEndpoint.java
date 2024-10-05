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
import defpackage.avnk;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint extends aonm implements aooz {
    public static final UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint a;
    private static volatile aopf i;
    public static final aonk unlimitedCreateFamilyEndpoint;
    public int b;
    public avnk d;
    public apxf e;
    public apxf f;
    private avnk j;
    private byte k = 2;
    public String c = "";
    public String g = "";
    public aomf h = aomf.b;

    static {
        UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint = new UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint();
        a = unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint;
        aonm.registerDefaultInstance(UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.class, unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint);
        unlimitedCreateFamilyEndpoint = aonm.newSingularGeneratedExtension(apxf.a, unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint, unlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint, null, 128069078, aoqn.MESSAGE, UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.class);
    }

    private UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0004\u0001ဈ\u0000\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ဈ\u0006\bည\u0007", new Object[]{"b", "c", "d", "j", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (UnlimitedCreateFamilyEndpointOuterClass$UnlimitedCreateFamilyEndpoint.class) {
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
