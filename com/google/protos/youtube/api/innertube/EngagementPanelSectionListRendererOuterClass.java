package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.aqts;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class EngagementPanelSectionListRendererOuterClass {
    public static final aonk engagementPanelSectionListRenderer = aonm.newSingularGeneratedExtension(aulq.a, aqts.b, aqts.b, null, 138681066, aoqn.MESSAGE, aqts.class);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class EngagementPanelTabRenderer extends aonm implements aooz {
        public static final EngagementPanelTabRenderer a;
        private static volatile aopf e;
        public static final aonk engagementPanelTabRenderer;
        public boolean c;
        public aulq d;
        private int f;
        private byte g = 2;
        public String b = "";

        static {
            EngagementPanelTabRenderer engagementPanelTabRenderer2 = new EngagementPanelTabRenderer();
            a = engagementPanelTabRenderer2;
            aonm.registerDefaultInstance(EngagementPanelTabRenderer.class, engagementPanelTabRenderer2);
            engagementPanelTabRenderer = aonm.newSingularGeneratedExtension(aulq.a, engagementPanelTabRenderer2, engagementPanelTabRenderer2, null, 292019130, aoqn.MESSAGE, EngagementPanelTabRenderer.class);
        }

        private EngagementPanelTabRenderer() {
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.g);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.g = obj == null ? (byte) 0 : (byte) 1;
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0001\u0002ဈ\u0001\u0003ᐉ\u0003\u0004ဇ\u0002", new Object[]{"f", "b", "d", "c"});
                case NEW_MUTABLE_INSTANCE:
                    return new EngagementPanelTabRenderer();
                case NEW_BUILDER:
                    return new aone(a);
                case GET_DEFAULT_INSTANCE:
                    return a;
                case GET_PARSER:
                    aopf aopfVar = e;
                    if (aopfVar == null) {
                        synchronized (EngagementPanelTabRenderer.class) {
                            aopfVar = e;
                            if (aopfVar == null) {
                                aopfVar = new aonf(a);
                                e = aopfVar;
                            }
                        }
                    }
                    return aopfVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    private EngagementPanelSectionListRendererOuterClass() {
    }
}
