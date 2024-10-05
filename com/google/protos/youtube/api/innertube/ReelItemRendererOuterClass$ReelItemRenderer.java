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
import defpackage.aota;
import defpackage.aott;
import defpackage.apxf;
import defpackage.aqyg;
import defpackage.atdf;
import defpackage.aujj;
import defpackage.aujt;
import defpackage.aulq;
import defpackage.avgg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ReelItemRendererOuterClass$ReelItemRenderer extends aonm implements aooz {
    public static final ReelItemRendererOuterClass$ReelItemRenderer a;
    public static final aonk reelItemRenderer;
    private static volatile aopf t;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public avgg f;
    public avgg g;
    public aqyg h;
    public aqyg i;
    public aqyg j;
    public aqyg k;
    public int l;
    public apxf m;
    public atdf n;
    public int o;
    public aott q;
    public int r;
    public aujt s;
    private aqyg u;
    private aota v;
    private byte w = 2;
    public aomf p = aomf.b;

    static {
        ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = new ReelItemRendererOuterClass$ReelItemRenderer();
        a = reelItemRendererOuterClass$ReelItemRenderer;
        aonm.registerDefaultInstance(ReelItemRendererOuterClass$ReelItemRenderer.class, reelItemRendererOuterClass$ReelItemRenderer);
        reelItemRenderer = aonm.newSingularGeneratedExtension(aulq.a, reelItemRendererOuterClass$ReelItemRenderer, reelItemRendererOuterClass$ReelItemRenderer, null, 158884182, aoqn.MESSAGE, ReelItemRendererOuterClass$ReelItemRenderer.class);
    }

    private ReelItemRendererOuterClass$ReelItemRenderer() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.w);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.w = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0002\u0016\u0013\u0000\u0000\r\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\b\bᐉ\f\tᐉ\r\u000bᐉ\u0010\fည\u0011\rဉ\u0012\u000eဌ\u0013\u000fᐉ\u0007\u0010ဌ\u000e\u0012ᐉ\u0001\u0013ဉ\u0015\u0014ᐉ\t\u0015ᐉ\n\u0016ဌ\u000b", new Object[]{"b", "d", "e", "f", "g", "h", "i", "m", "n", "v", "p", "q", "r", aujj.a, "u", "o", aujj.b, "c", "s", "j", "k", "l", aujj.t});
            case NEW_MUTABLE_INSTANCE:
                return new ReelItemRendererOuterClass$ReelItemRenderer();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = t;
                if (aopfVar == null) {
                    synchronized (ReelItemRendererOuterClass$ReelItemRenderer.class) {
                        aopfVar = t;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            t = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
