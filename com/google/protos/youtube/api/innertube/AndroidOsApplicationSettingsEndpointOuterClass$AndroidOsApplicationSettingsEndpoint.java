package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apaf;
import defpackage.apxf;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint extends aonm implements aooz {
    public static final AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint a;
    public static final aonk androidOsApplicationSettingsEndpoint;
    private static volatile aopf d;
    public int b;
    public String c = "";
    private int e;

    static {
        AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint androidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint = new AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint();
        a = androidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint;
        aonm.registerDefaultInstance(AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.class, androidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint);
        androidOsApplicationSettingsEndpoint = aonm.newSingularGeneratedExtension(apxf.a, androidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint, androidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint, null, 128828810, aoqn.MESSAGE, AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.class);
    }

    private AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဈ\u0001", new Object[]{"e", "b", apaf.r, "c"});
            case NEW_MUTABLE_INSTANCE:
                return new AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (AndroidOsApplicationSettingsEndpointOuterClass$AndroidOsApplicationSettingsEndpoint.class) {
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
