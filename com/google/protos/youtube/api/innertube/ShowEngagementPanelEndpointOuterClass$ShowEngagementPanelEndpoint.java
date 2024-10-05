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
import defpackage.aqtn;
import defpackage.aqto;
import defpackage.autu;
import defpackage.autv;
import defpackage.autw;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint extends aonm implements aooz {
    public static final ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint a;
    private static volatile aopf m;
    public static final aonk showEngagementPanelEndpoint;
    public int b;
    public Object d;
    public autw e;
    public boolean g;
    public aqto h;
    public boolean i;
    public apxf j;
    public autv k;
    public autu l;
    public int c = 0;
    private byte n = 2;
    public String f = "";

    static {
        ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint = new ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint();
        a = showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint;
        aonm.registerDefaultInstance(ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.class, showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint);
        showEngagementPanelEndpoint = aonm.newSingularGeneratedExtension(apxf.a, showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint, showEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint, null, 138681778, aoqn.MESSAGE, ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.class);
    }

    private ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0004\u0001ျ\u0000\u0002ᐉ\u0006\u0003ဈ\u0003\u0005ဇ\u0005\u0006ဇ\u0007\u0007ᐉ\b\bဉ\t\tᐉ\n\nြ\u0000\u000bᐉ\u0002", new Object[]{"d", "c", "b", "h", "f", "g", "i", "j", "k", "l", aqtn.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (ShowEngagementPanelEndpointOuterClass$ShowEngagementPanelEndpoint.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
