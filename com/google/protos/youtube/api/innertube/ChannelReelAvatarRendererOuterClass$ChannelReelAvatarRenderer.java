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
import defpackage.aujj;
import defpackage.aulq;
import defpackage.avgg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer extends aonm implements aooz {
    public static final ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer a;
    public static final aonk channelReelAvatarRenderer;
    private static volatile aopf i;
    public int b;
    public avgg c;
    public apxf d;
    public int e;
    public aott f;
    public aulq g;
    private aota j;
    private byte k = 2;
    public aomf h = aomf.b;

    static {
        ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer = new ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer();
        a = channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer;
        aonm.registerDefaultInstance(ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.class, channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer);
        channelReelAvatarRenderer = aonm.newSingularGeneratedExtension(aulq.a, channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer, channelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer, null, 232603920, aoqn.MESSAGE, ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.class);
    }

    private ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဌ\u0002\u0004ᐉ\u0006\u0005ည\u0007\u0006ဉ\u0003\u0007ᐉ\u0005", new Object[]{"b", "c", "d", "e", aujj.b, "j", "h", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (ChannelReelAvatarRendererOuterClass$ChannelReelAvatarRenderer.class) {
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
