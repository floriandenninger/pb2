package defpackage;

import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arex extends aonm implements aooz {
    public static final arex a;
    private static volatile aopf v;
    public int b;
    public apbx c;
    public appg d;
    public aqbh e;
    public atgz f;
    public auaq g;
    public aufa h;
    public aufd i;
    public aukx j;
    public auoa k;
    public avwg l;
    public ReelItemRendererOuterClass$ReelItemRenderer m;
    public arbu n;
    public aqsx o;
    public aqzr p;
    public arhm q;
    public asvo r;
    public aqrf s;
    public ardf t;
    public aukw u;
    private byte w = 2;

    static {
        arex arexVar = new arex();
        a = arexVar;
        aonm.registerDefaultInstance(arex.class, arexVar);
    }

    private arex() {
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001啕\u1cc9\uf166銚\u0013\u0000\u0000\u0013啕\u1cc9ᐉ\u0011\ueabc⩬ᐉ\bﻶ㥌ᐉ\tﱋ㥩ᐉ\u0000ﲺ㨷ᐉ\u0003\ue69e㩒ᐉ\u0012\ue8dc㩦ᐉ\u0007\ue7a9㬞ᐉ\u0004\uf255㵣ᐉ\u0001\uf103䅟ᐉ\u0002\ue0bf䕚ᐉ\u000b\uf37f䖯ᐉ\u0006\uf492䤳ᐉ\u0010\ue656䦔ᐉ\u0005\ue156䯃ᐉ\n\ue362倦ᐉ\f\uec2c岒ᐉ\r\uedff谟ᐉ\u000e\uf166銚ᐉ\u000f", new Object[]{"b", "t", "k", "l", "c", "f", "u", "j", "g", "d", "e", "n", "i", "s", "h", "m", "o", "p", "q", "r"});
            case NEW_MUTABLE_INSTANCE:
                return new arex();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = v;
                if (aopfVar == null) {
                    synchronized (arex.class) {
                        aopfVar = v;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            v = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
