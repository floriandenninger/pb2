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
public final class ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint extends aonm implements aooz {
    public static final ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint a;
    private static volatile aopf c;
    public static final aonk clearSearchHistorySettingEndpoint;
    public String b = "";
    private int d;

    static {
        ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint clearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint = new ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint();
        a = clearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint;
        aonm.registerDefaultInstance(ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint.class, clearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint);
        clearSearchHistorySettingEndpoint = aonm.newSingularGeneratedExtension(apxf.a, clearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint, clearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint, null, 86611299, aoqn.MESSAGE, ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint.class);
    }

    private ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
            case NEW_MUTABLE_INSTANCE:
                return new ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (ClearSearchHistorySettingEndpointOuterClass$ClearSearchHistorySettingEndpoint.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
